public class HourlyEmployee extends Employee {

	private double hourlyRate;
	private double hoursWorked;
	
	public HourlyEmployee(String name, double rate, double hours) {
		super(name);
		this.hourlyRate = rate;
		this.hoursWorked = hours;
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
	
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public double getHourseWorked() {
		return hoursWorked;
	}
	
	public void setHourseWorked(double hourseWorked) {
		this.hoursWorked = hourseWorked;
	}
	
	@Override
	public double getPayment() {
		return hourlyRate * hoursWorked;
	}
	
	public String toString() {
		return "HourlyEmployee[name: " + this.getName() + ", hourly rate: $" + hourlyRate + " per hour, hours worked: " + hoursWorked + " hours]";
	}
	
}
