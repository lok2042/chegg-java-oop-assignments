package practiceProblems;

public abstract class Vehicle {
	
	protected Engine engine;
	protected String licensePlate;
	protected String make;
	protected String model;
	protected int currentSpeed;
	
	public Vehicle(Engine engine, String licensePlate, String make, String model) {
		this.engine = engine;
		this.licensePlate = licensePlate;
		this.make = make;
		this.model = model;
		this.currentSpeed = 0;
	}
	
	public Engine getEngine() {
		return engine;
	}
	
	public void changeEngine(Engine engine) {
		this.engine = engine;
	}
	
	public String getLicensePlate() {
		return licensePlate;
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	
	public int getCurrentSpeed() {
		return currentSpeed;
	}
	
	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	public int accelerate() {
		currentSpeed += engine.accelerate();
		
		return currentSpeed;
	}
	
	public int reduceSpeed() {
		if(currentSpeed - 2 < 0) {
			currentSpeed = 0;
		}
		else {
			currentSpeed -= 2;
		}
		return currentSpeed;
	}
	
	public abstract String toString();
	
}
