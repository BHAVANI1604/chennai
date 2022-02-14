package lms;

public class Q1 {
	String brand;
	String model;
	int price;
	public Q1(String brand, String model, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Q1 [brand=" + brand + ", model=" + model + ", price=" + price + "]";
	}
	

}
