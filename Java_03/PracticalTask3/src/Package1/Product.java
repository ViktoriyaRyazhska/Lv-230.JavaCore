package Package1;

public class Product {
	String name;
	double price;
	int quality;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public Product(String name, double price, int quality) {
		super();
		this.name = name;
		this.price = price;
		this.quality = quality;
	}
	@Override
	public String toString() {
		return name +  ", quality=" + quality ;
	}
	
	

}
