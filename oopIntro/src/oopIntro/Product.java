package oopIntro;

//PascalCase
public class Product {
	// fields
	// cemalCase
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl;
	private int unitsInStock;
	private double unitPriceAfterDiscount;

	// constructor - yapıcı
	public Product() {
		System.out.println("I worked.");
	}

	public Product(String name, double unitPrice, double discount, String imageUrl, int unitsInStock) {
		this();
		this.name = name;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.imageUrl = imageUrl;
		this.unitsInStock = unitsInStock;
	}

	public double getUnitPriceAfterDiscount() {
		
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		discount += 5;
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		if (unitsInStock < 0) {
			this.unitsInStock = 0;
			return;
		}
		this.unitsInStock = unitsInStock;
	}

}
