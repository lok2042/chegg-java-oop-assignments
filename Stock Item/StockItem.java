public class StockItem {
	
	protected String brand;
	protected double price;
	protected int quantity;
	protected double discount;
	
	public StockItem(String brand, double price, int quantity, double discount) {
		this.brand = brand;
		this.price = price;
		this.quantity = quantity;
		this.discount = discount;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public double getDiscount() {
		return discount;
	}
	
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	public String toString() {
		if(quantity > 0 && discount > 0) {
			return brand + " ($" + String.format("%.2f", price) + ") qty = " + quantity + ", discount = " + (discount * 100) + "%";
		} 
		else if(quantity > 0 && discount == 0) {
			return brand + " ($" + String.format("%.2f", price) + ") qty = " + quantity;
		}
		else {
			return "Out of stock: " + brand + " ($" + price + ")";
		}
	}
	
	public boolean equals(StockItem x) {
		return (brand == x.brand);
	}
	
    public boolean equals(String brand, double price, int quantity, double discount){
        return this.brand == brand && this.price == price && this.quantity == quantity && this.discount == discount;
    }
}
