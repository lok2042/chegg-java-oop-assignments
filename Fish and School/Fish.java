public class Fish {
	
	private String name;
	private String species;
	private double weight;
	
	public Fish(String name, String species, double weight) {
		this.name = name;
		this.species = species;
		this.weight = (weight > 0) ? weight : 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = (weight > 0) ? weight : 1;
	}
	
	public void setFish(String name, String species, double weight) {
		this.setName(name);
		this.setSpecies(species);
		this.setWeight((weight > 0) ? weight : 1);
	}
	
	public String toString() {
		return "Fish[name: " + name + ", species: " + species + ", weight: " + String.format("%.1f", weight) + "]";
	}
}
