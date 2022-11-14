package practice_221104;
/**부모, 자식 클래스 간 상속
 * extends, 생성자, Getter&Setter 등 다양한 클래스 기능 사용
 * 
 *
 */

public class Q07_TVMain {

	public static void main(String[] args) {
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
		IPTV iptv= new IPTV("192.1.1.2", 32, 1024);
		iptv.printProperty();
	}

}

class Q07_TV {
	private int size;

	Q07_TV(int size) {
		this.size = size;
	}

	protected int getSize() {
		return size;
	}

}

class ColorTV extends Q07_TV {
	private int resolution;

	public ColorTV(int size, int resolution) {
		super(size);
		this.resolution = resolution;
	}

	protected void printProperty() {
		System.out.println(getSize() + "인치" + resolution + "컬러");
	}

}
class IPTV extends ColorTV{
	private String addr;
	public IPTV(String addr, int size, int resolution) {
		super(size, resolution);
		this.addr = addr;
	}
	@Override
	protected void printProperty() {
		System.out.print("나의 IPTV는 " +addr+"주소의");
		super.printProperty();
	}
}
