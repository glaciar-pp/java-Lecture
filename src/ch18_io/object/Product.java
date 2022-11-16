package ch18_io.object;

import java.io.Serializable;

public class Product implements Serializable{
	private static final long serialVersionUID = 3642253744691504915L;
	private String name;
	private int price;

	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ex10_Product [name=" + name + ", price=" + price + "]";
	}

}
