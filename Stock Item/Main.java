import java.util.Scanner;

public class Main {
  
    public static void main(String[] args) {
      
        StockItem object[] = new StockItem[10];
        object[0] = new Grocery("A",50,2,10.5,2000,25);
        object[1] = new Grocery("B",50,2,0,2018,25);
        object[2] = new Grocery("C",0,2,10.5,2007,25);
        object[3] = new Grocery("D",50,4,10.5,2010,25);
        object[4] = new Grocery("E",50,0,10.5,2021,25);
        object[5] = new Electronics("F",50,2,10.5,"In Home Appliance",3500);
        object[6] = new Electronics("G",50,0,10.5,"In Home Appliance",2500); // Out of stock
        object[7] = new Electronics("H",50,2,10.5,"In Home Appliance",3000);
        object[8] = new Electronics("I",50,0,10.5,"In Home Appliance",1200); // Out of stock
        object[9] = new Electronics("J",50,2,10.5,"In Home Appliance",2200);
        
        for(int i = 0; i < 5; i++) {
        	if(((Grocery) object[i]).getProductionYear() < 2019) {
        		System.out.println(object[i]); // toString can be invoked just using the object name
        	}
        }
      
        int count = 0;
        System.out.println("Electronics out of stock: ");
        for(int i = 5; i < 10; i++) {
        	if((object[i]).getQuantity() == 0) {
        		System.out.println(object[i]);
        		count++;
        	}
        }
        System.out.println("Total : " + count);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter all information about a Grocery item");
        System.out.print("Brand :");
        String brand = input.nextLine();
        System.out.print("Price :");
        double price = input.nextDouble();
        System.out.print("Quantity :");
        int quantity = input.nextInt();
        System.out.print("Discount :");
        
        for(int i = 0; i < 5; i++) {
            if (object[i].equals(brand, price, quantity, discount)) {
                System.out.println("Item Exist");
            }
        }

    }
}
