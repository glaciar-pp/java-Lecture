package ch14_lambda.sec07_andThen_compose;

public class Member {
	private String name;
	private String id;
	private Address Address;

	Member(String name, String id, ch14_lambda.sec07_andThen_compose.Address address) {
		super();
		this.name = name;
		this.id = id;
		Address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", Address=" + Address + "]";
	}

}
