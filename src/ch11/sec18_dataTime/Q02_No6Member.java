package ch11.sec18_dataTime;

public class Q02_No6Member {
	private String id;
	private String name;

	Q02_No6Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Q02_No6Member [id=" + id + ", name=" + name + "]";
	}

}
