package practiceProblems;

public class Car extends Vehicle {
	
	public Car(Engine engine, String licensePlate, String make, String model) {
		super(engine, licensePlate, make, model);
	}

	public boolean equals(Car other) {
		return (this.licensePlate == other.licensePlate);
	}
	
	@Override
	public String toString() {
		return "Car[engine: " + engine + 
			   ", licence plate: " + licensePlate + 
			   ", make: " + make + 
			   ", model: " + model + 
			   ", currentSpeed: " + currentSpeed + " units]";
	}
	
}
