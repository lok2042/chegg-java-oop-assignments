public class Person {
	
	private String firstname;
	private String lastname;
	private Address home;
	
	public Person(String firstname, String lastname, Address home) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.home = home;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public Address getHome() {
		return home;
	}
	
	public void setHome(Address home) {
		this.home = home;
	}
	
	public String toString() {
		return "Person[name: " + firstname + " " + lastname + ", " + home + "]";
	}
	
}
