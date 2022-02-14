package test;

public class Tv {
	private String brand;
	private int size;
	private int price;
	@Override
	public String toString() {
		return "Tv [brand=" + brand + ", size=" + size + ", price=" + price + "]";
	}
	public Tv(String brand, int size, int price) {
		super();
		this.brand = brand;
		this.size = size;
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
