package ch15_Collection_Q07_10;

public class Q07_Board {
	private String title;
	private String content;

	public Q07_Board(String title, String content) {
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}
 
	public String getContent() {
		return content;
	}

}
//사실상 Board가 DTO(Data Transfer Object) 역할을 하는 것