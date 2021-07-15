public class Subscription {
	
	private String name;
	private String address;
	private int contact;
	private Newspaper newspaper;
	private boolean printVersion;
	private float ratePerMonth;
	
	public Subscription(String name, String address, int contact, Newspaper newspaper, boolean printVersion) {
		this.name = name;
		this.address = address;
		this.contact = contact;
		this.newspaper = newspaper;
		this.printVersion = printVersion;
		
		if(this.printVersion) {
			ratePerMonth = this.newspaper.getRatePerMonthPrint();
		}
		else {
			ratePerMonth = this.newspaper.getRatePerMonthOnline();
		}
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getContact() {
		return contact;
	}
	
	public void setContact(int contact) {
		this.contact = contact;
	}
	
	public Newspaper getNewspaper() {
		return newspaper;
	}
	
	public boolean isPrintVersion() {
		return printVersion;
	}
	
	public float getRatePerMonth() {
		return ratePerMonth;
	}
	
	public String newspaperName() {
		return newspaper.getName();
	}
	
	public void changeVersion() {
		if(printVersion) {
			printVersion = false;
			ratePerMonth = newspaper.getRatePerMonthOnline();
		}
		else {
			printVersion = true;
			ratePerMonth = newspaper.getRatePerMonthPrint();
		}
	}
	
	public String toString() {
		return name + " @ " + address + ", Print Version: " + ((printVersion) ? "Yes" : "No") + 
			   ", Subscription Rate: $" + ratePerMonth + "\n" + newspaper;
	}
	
}
