public class Main {

	public static void main(String[] args) {
		
    		Money m1 = new Money(1000);
		System.out.println(m1 + "\n");
		
		Address a1 = new Address("237J Harvey Hall", "Menomonie", "Wisconsin", "54751");
		System.out.println(a1 + "\n");
		
		Person p1 = new Person("Diane", "Christie", a1);
		System.out.println(p1 + "\n");
		
		CreditCard c1 = new CreditCard(p1, m1);
		System.out.println(c1.getPersonals() + "\n");
		
		c1.charge(new Money(200));
		c1.charge(new Money(10.02));
		c1.payment(new Money(25));
		c1.charge(new Money(9000));
		c1.charge(new Money(990));
		c1.payment(new Money(9000));
		
		System.out.println(c1.getPersonals() + "\n");
 	}
}
