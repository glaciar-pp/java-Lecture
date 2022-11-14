package ch14_lambda;

/**
 * 
 * No Args, No Return value
 */
public class Ex01_NoArgsNoReturnMain {

	public static void main(String[] args) {
		Ex01_MyfunctionalInterface fi;

		fi = () -> {
			String str = "method call";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("method call");};
		fi.method();
		
		fi = () -> System.out.println("method call");
		fi.method();
		
		Runnable r = () -> System.out.println("method call");
		r.run();
	}

}

class MyfunctionalInterface implements Ex01_MyfunctionalInterface{ 
	//람다가 생각나지 않을때 한번 써보고 정리해나가는 것도 좋음

	@Override
	public void method() {
		String str = "method call";
		System.out.println(str);
	}
	
}
