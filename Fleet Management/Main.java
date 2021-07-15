
public class Main {

  public static void main(String[] args) {
		Engine teslaEngine = new Engine(25);
		System.out.println(teslaEngine + "\n");
		
		Car car1 = new Car(teslaEngine, "STR1234", "2021", "Tesla Model X");
		Car car2 = new Car(teslaEngine, "ABC1234", "2020", "Tesla Model S");
		Car car3 = new Car(teslaEngine, "YUW4567", "2019", "Tesla Model 3");
		Car car4 = new Car(teslaEngine, "JKL9090", "2021", "Tesla Model Y");
		
		RentalAgency sa = new RentalAgency("Sunshine Autos", 10);

		System.out.println(sa.addCar(car1));
		System.out.println(sa.addCar(car2));
		System.out.println(sa.addCar(car3));
		System.out.println(sa.addCar(car4) + "\n");
		
		sa.displayCarFleet();
		
		System.out.println(sa.removeCar(car3) + "\n");
		
		sa.displayCarFleet();
		
		Engine bmwEngine = new Engine(30);
		System.out.println(bmwEngine + "\n");
		
		Motorcycle motor1 = new Motorcycle(bmwEngine, "JK101", "2004", "BMW A 2000");
		Motorcycle motor2 = new Motorcycle(bmwEngine, "KL209", "2007", "BMW K 1200R");
		Motorcycle motor3 = new Motorcycle(bmwEngine, "MK420", "2016", "BMW S 1000 XR");
		
		sa.addMotorcycle(motor1);
		sa.addMotorcycle(motor2);
		sa.addMotorcycle(motor3);
		
		sa.displayMotorcycleFleet();
  }
}
