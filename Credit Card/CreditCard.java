package practiceProblems;

public class CreditCard {
	
	private Money balance;
	private Money creditLimit;
	private Person owner;
	
	public CreditCard(Person newCardHolder, Money limit) {
		balance = new Money(0);
		creditLimit = limit;
		owner = newCardHolder;
	}
	
	public Money getBalance() {
		return balance;
	}
	
	public void setBalance(Money balance) {
		this.balance = balance;
	}
	
	public Money getCreditLimit() {
		return creditLimit;
	}
	
	public void setCreditLimit(Money creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	public Person getOwner() {
		return owner;
	}
	
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	
	public String getPersonals() {
		String str = "Owner\t\t: " + owner + "\n";
		str += "Balance\t\t: " + balance + "\n";
		str += "Credit Limit\t: " + creditLimit;
		return str;
	}
	
	public void charge(Money amount) {
		System.out.println("Attempting to charge " + amount + "...");
		if(creditLimit.compareTo(amount) == -1) {
			System.out.println("Transaction Failed! Amount exceeds credit limit");
		}
		else {
			balance = balance.add(amount);
			System.out.println("Charge\t: " + amount);
			System.out.println("Transaction Successful!");
		}
		System.out.println("Balance\t: " + balance + "\n");
	}
	
	public void payment(Money amount) {
		System.out.println("Attempting to pay " + amount + "...");
		if(balance.compareTo(amount) == -1) {
			System.out.println("Transaction Failed! Amount exceeds balance");
		}
		else {
			balance = balance.subtract(amount);
			System.out.println("Payment\t: " + amount);
			System.out.println("Transaction Successful!");
		}
		System.out.println("Balance\t: " + balance + "\n");
	}
	
}
