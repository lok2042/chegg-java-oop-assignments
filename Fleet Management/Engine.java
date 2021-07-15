public class Engine {
	
	private int accelerateAmount;
	
	public Engine(int accelerateAmount) {
		setAccelerateAmount(accelerateAmount);
	}
	
	public void setAccelerateAmount(int accelerateAmount) {
		if(accelerateAmount > 0) {
			this.accelerateAmount = accelerateAmount;
		}
		else {
			System.out.println("Error: Negative accelerate amount not allowed");
			System.exit(0);
		}
	}

	public int accelerate() {
		return accelerateAmount;
	}
	
	public boolean equals(Engine other) {
		return (this.accelerateAmount == other.accelerateAmount);
	}
	
	public Engine copy() {
		return this;
	}
	
	public String toString() {
		return "Engine[accelerate: " + accelerateAmount + " units/s]";
	}
}
