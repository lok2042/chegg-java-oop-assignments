package practiceProblems;

public class Grocery extends StockItem {
	
	private int productionYear;
	private double weight;
	
	public Grocery(String brand, double price, int quantity, double discount, int productionYear, double weight) {
		super(brand, price, quantity, discount);
		this.productionYear = productionYear;
		this.weight = weight;
	}

	public int getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(int productionYear) {
		this.productionYear = productionYear;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String toString() {
		return super.toString() + ", prod = " + productionYear + " (" + weight + "Kg)";
	}
}
