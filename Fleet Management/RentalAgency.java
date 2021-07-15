public class RentalAgency {
	
	private String companyName;
	private int currentCarFleetSize;
	private Car [] fleet;
	private int currentMotorFleetSize;
	private Motorcycle [] fleet1;
	
	public RentalAgency(String name, int maxSize) {
		this.companyName = name;
		this.currentCarFleetSize = 0;
		this.fleet = new Car[maxSize];
		this.currentMotorFleetSize = 0;
		this.fleet1 = new Motorcycle[maxSize];
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public int getCurrentFleetSize() {
		return currentCarFleetSize;
	}
	
	public Car [] getFleet() {
		return fleet;
	}
	
	public int getCurrentMotorFleetSize() {
		return currentMotorFleetSize;
	}

	public Motorcycle [] getFleet1() {
		return fleet1;
	}

	public boolean addCar(Car car) {
		if(currentCarFleetSize == fleet.length) {
			return false;
		}
		else {
			fleet[currentCarFleetSize] = car;
			currentCarFleetSize++;
			return true;
		}
	}

	public boolean addMotorcycle(Motorcycle motorcycle) {
		if(currentMotorFleetSize == fleet1.length) {
			return false;
		}
		else {
			fleet1[currentMotorFleetSize] = motorcycle;
			currentMotorFleetSize++;
			return true;
		}
	}
	
	public boolean removeCar(Car car) {
		if(currentCarFleetSize == 0) {
			return false;
		}
		else {
			boolean found = false;
			
			for(int i = 0; i < currentCarFleetSize; i++) {
				if(fleet[i].equals(car)) {
					found = true;
					for(int j = i; j < currentCarFleetSize; j++) {
						fleet[j] = fleet[j + 1];
					}
					currentCarFleetSize--;
				}
			}
			
			return found;
		}
	}
	
	public boolean removeMotorcycle(Motorcycle motorcycle) {
		if(currentMotorFleetSize == 0) {
			return false;
		}
		else {
			boolean found = false;
			
			for(int i = 0; i < currentMotorFleetSize; i++) {
				if(fleet1[i].equals(motorcycle)) {
					found = true;
					for(int j = i; j < currentMotorFleetSize; j++) {
						fleet1[j] = fleet1[j + 1];
					}
					currentMotorFleetSize--;
				}
			}
			
			return found;
		}
	}
	
	public void displayCarFleet() {
		System.out.println("Cars currently avalaible at " + companyName);
		if(currentCarFleetSize == 0) {
			System.out.println("No Available Cars");
		}
		else {
			for(int i = 0; i < currentCarFleetSize; i++) {
				System.out.println((i + 1) + ". " + fleet[i]);
			}
		}
		System.out.println();
	}
	
	public void displayMotorcycleFleet() {
		System.out.println("Motorcycles currently avalaible at " + companyName);
		if(currentMotorFleetSize == 0) {
			System.out.println("No Available Motorcyles");
		}
		else {
			for(int i = 0; i < currentMotorFleetSize; i++) {
				System.out.println((i + 1) + ". " + fleet1[i]);
			}
		}
		System.out.println();
	}
}
