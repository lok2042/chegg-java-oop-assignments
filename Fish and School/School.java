
public class School {
	
	private Fish [] fishArray;
	private int numFish;
	private final static int DEFAULT_CAPACITY = 3;
	
	public School() {
		this(DEFAULT_CAPACITY);
	}
	
	public School(int capacity) {
		capacity = (capacity > 0) ? capacity : DEFAULT_CAPACITY;
		this.fishArray = new Fish[capacity];
		this.numFish = 0;
	}
	
	public int getNumFish() {
		return numFish;
	}
	
	public int getCapacity() {
		return fishArray.length;
	}
	
	public void doubleCapacity() {
		Fish [] doubleFishArray = new Fish[fishArray.length * 2];
		
		for(int i = 0; i < fishArray.length; i++) {
			doubleFishArray[i] = fishArray[i];
		}
		
		fishArray = doubleFishArray;
	}
	
	public void addFish(Fish fish) {
		if(numFish == fishArray.length) {
			doubleCapacity();
		}
		fishArray[numFish] = fish;
		numFish++;
	}
	
	public Fish removeFish(int index) {
		if(index < 0 || index > numFish) {
			System.out.println("Invalid Index!");
			return null;
		}
		Fish fishRemoved = fishArray[index];
			
		for(int i = index; i < numFish; i++) {
			fishArray[i] = fishArray[i + 1];
		}
		numFish--;
			
		return fishRemoved;
	}
	
	public Fish getFish(int index) {
		if(index < 0 || index > numFish) {
			System.out.println("Invalid Index!");
			return null;
		}
		return fishArray[index];
	}
	
	public Fish [] getFish(String species) {
		Fish [] specificFish = new Fish[numFish];
		
		int index = 0; // index for specificFish
		for(int i = 0; i < numFish; i++) {
			if(fishArray[i].getSpecies() == species) {
				specificFish[index] = fishArray[i];
				index++;
			}
		}
		
		return specificFish;
	}
	
	public Fish getBiggestFish() {
		if(numFish == 0) {
			return null;
		}
		
		double biggestWeight = fishArray[0].getWeight();
		int index = 0;
		
		for(int i = 1; i < numFish; i++) {
			if(fishArray[i].getWeight() > biggestWeight) {
				biggestWeight = fishArray[i].getWeight();
				index = i;
			}
		}
		
		return fishArray[index];
	}
	
	public double getWeight() {
		double sum = 0;
		for(int i = 0; i < numFish; i++) {
			sum += fishArray[i].getWeight();
		}
		return sum;
	}
	
	public String toString() {
		String str = "School[\n";
		for(int i = 0; i < numFish; i++) {
			str += ("\t" + fishArray[i].toString() + "\n");
		}
		str += "]";
		return str;
	}
	
}
