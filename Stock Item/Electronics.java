public class Electronics extends StockItem {
	
	private String type;
	private double power;
	
	public Electronics(String brand, double price, int quantity, double discount, String type, double power) {
		super(brand, price, quantity, discount);
		this.type = type;
		this.power = power;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPower() {
		return power;
	}
	public void setPower(double power) {
		this.power = power;
	}
	
	public String toString() {
		return super.toString() + " (in " + type + ") " + power + " Watt";
	}
}
