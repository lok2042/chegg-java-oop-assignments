  public class Main {

	public static void main(String[] args) {
		   
		Employee [] e = new Employee[3];
		
		e[0] = new SalaryEmployee("Meg Manager", 50000);
		e[1] = new CommissionEmployee("Sal Salesman", 0.15, 3400);
		e[2] = new HourlyEmployee("Timmy Temp", 10.5, 25);
		
		for(int i = 0; i < e.length; i++) {
			System.out.println(e[i]);
			System.out.println("Paycheck: $" + String.format("%.2f", e[i].getPayment()) + "\n");
		}
	
	}
}
