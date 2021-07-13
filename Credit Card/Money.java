package practiceProblems;

public class Money {
	
	private long dollars;
	private long cents;
	
	public Money(double amount) {
		if(amount < 0) {
			System.out.println("Error: Negative amounts of money are not allowed");
			System.exit(0);
		}
		else {
			long allCents = Math.round(amount * 100);
			this.dollars = allCents / 100;
			this.cents = allCents % 100;
		}
	}
	
	public Money(Money otherObject) {
		this.dollars = otherObject.dollars;
		this.cents = otherObject.cents;
	}
	
	public long getDollars() {
		return dollars;
	}
	
	public void setDollars(long dollars) {
		this.dollars = dollars;
	}
	
	public long getCents() {
		return cents;
	}
	
	public void setCents(long cents) {
		this.cents = cents;
	}
	
	public Money add(Money otherAmount) {
		Money newAmount = new Money(0);
		
		newAmount.dollars = this.dollars + otherAmount.dollars;
		
		if(this.cents + otherAmount.cents >= 100) {
			newAmount.dollars++;
			newAmount.cents = (this.cents + otherAmount.cents) - 100;
		}
		else {
			newAmount.cents = this.cents + otherAmount.cents;
		}
			
		return newAmount;
	}
	
	public Money subtract(Money otherAmount) {
		Money newAmount = new Money(0);
		
		long thisAllCents = (this.dollars * 100) + this.cents;
		long otherAmountAllCents = (otherAmount.dollars * 100) + otherAmount.cents;
		
		if(thisAllCents < otherAmountAllCents) {
			System.out.println("Error: Current instance amount must be more than parameter amount");
		}
		else {
			long difference = thisAllCents - otherAmountAllCents;
			
			newAmount.dollars = difference / 100;
			newAmount.cents = difference % 100;	
		}
		
		return newAmount;
	}
	
	public int compareTo(Money otherObject) {
		if(this.dollars > otherObject.dollars) {
			return 1;
		}
		else if(this.dollars < otherObject.dollars) {
			return -1;
		}
		else if(this.cents > otherObject.cents) {
			return 1;
		}
		else if(this.cents < otherObject.cents) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public boolean equals(Money otherObject) {
		return (this.dollars == otherObject.dollars && this.cents == otherObject.cents);
	}
	
	public String toString() {
		return "$" + dollars + "." + String.format("%02d", cents);
	}
	
}
