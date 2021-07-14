public class CommissionEmployee extends Employee {
	
	private double commissionRate;
	private double totalSales;
	
	public CommissionEmployee(String name, double rate, double sales) {
		super(name);
		this.commissionRate = rate;
		this.totalSales = sales;
	}
	
	public double getCommissionRate() {
		return commissionRate;
	}

	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}
	
	public double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(double totalSales) {
		this.totalSales = totalSales;
	}

	@Override
	public double getPayment() {
		return totalSales * commissionRate;
	}
	
	public String toString() {
		return "CommissionEmployee[name: " + this.getName() + ", rate: " + (commissionRate * 100) + "%, sales: $" + totalSales + "]";
	}
}
