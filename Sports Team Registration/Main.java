import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
  	Scanner input = new Scanner(System.in);
		
	Team basketball = new Team("Ballers", 2, 18, 21);
	Team volleyball = new Team("Volleys", 3, 17, 19);
	
	boolean exit = false;
	int choice, age;
	String name;
	do {
		System.out.println("Select Team");
		System.out.println("--------------");
		System.out.println("[1] Basketball");
		System.out.println("[2] Volleyball");
		System.out.println("[3] Exit");
		System.out.println("--------------");
		System.out.print("Choice (1 or 2) : ");
		choice = input.nextInt();
		input.nextLine();
		System.out.println();
			
		if(choice == 1 || choice == 2) {
			System.out.print("Enter name\t: ");
			name = input.nextLine();
				
			System.out.print("Enter age\t: ");
			age = input.nextInt();
				
			Member m = new Member(name, age);
				
			if(choice == 1) {
				basketball.addMember(m);
			}
			else {
				volleyball.addMember(m);
			}
		}
		else {
			basketball.displayTeamDetails();
			System.out.println();
			volleyball.displayTeamDetails();
			exit = true;
		}
			
		System.out.println();
			
	} while(!exit);
		
	input.close();
    
  }
}
