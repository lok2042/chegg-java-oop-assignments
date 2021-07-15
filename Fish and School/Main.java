public class Main {

	public static void main(String[] args) {
    Fish fish1 = new Fish("Nemo", "clownfish", 0.2);
		Fish fish2 = new Fish("Marlin", "clownfish", 0.3);
		Fish fish3 = new Fish("Peach", "starfish", 0.5);
		Fish fish4 = new Fish("Bruce 01", "shark", 6.5);
		Fish fish5 = new Fish("Bruce 02", "shark", 6.9);
		Fish fish6 = new Fish("Sheldon", "seahorse", 1.5);
		Fish fish7 = new Fish("Coral", "clownfish", 0.25);
		
		School school = new School();
		school.addFish(fish1);
		school.addFish(fish2);
		school.addFish(fish3);
		school.addFish(fish4);
		school.addFish(fish5);
		school.addFish(fish6);
		school.addFish(fish7);
		
		System.out.println("Number of fish: " + school.getNumFish());
		System.out.println("Array capacity: " + school.getCapacity());
		System.out.println(school);
		
		System.out.println("Fish at index 0: " + school.getFish(0));
		System.out.println("Fish at index 5: " + school.getFish(5));
		
		System.out.println("All clownfish: " + Arrays.toString(school.getFish("clownfish")));
		System.out.println("All shark: " + Arrays.toString(school.getFish("shark")));
		
		System.out.println("Biggest fish is " + school.getBiggestFish());
		
		System.out.println("Total weight is " + school.getWeight());
		
		System.out.println(school.removeFish(3) + " is removed!");
		System.out.println(school.removeFish(5) + " is removed!");
		
		System.out.println("Number of fish: " + school.getNumFish());
		System.out.println("Array capacity: " + school.getCapacity());
		System.out.println(school); 
  }
}
