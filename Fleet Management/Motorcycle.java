public class Motorcycle extends Vehicle {

	public Motorcycle(Engine engine, String licensePlate, String make, String model) {
		super(engine, licensePlate, make, model);
	}
	
	public boolean equals(Motorcycle other) {
		return (this.licensePlate == other.licensePlate);
	}

	@Override
	public String toString() {
		return "Motorcycle[engine: " + engine + 
				   ", licence plate: " + licensePlate + 
				   ", make: " + make + 
				   ", model: " + model + 
				   ", currentSpeed: " + currentSpeed + " units]";
	}

}
