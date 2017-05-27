package petGameAssignment;



import petGameAssignment.Pet.Mood;

/**
 * Cat subclass of Pet class
 * @author Mihaela
 *
 */

public class Cat extends Pet {
	
	/**
	 * Class constructor: constructs a cat pet and initialises the values
	 * for the pet's species, appetite, weight,relief level, it's favourite toy value,it's favourite food value and its mood
	 */

	public Cat() {
		super();
		this.species = "cat";
		this.appetite = 0;
		this.weight = 8.0;
		this.relief = 1;
		this.sleepiness = 6;
		this.playfulness = 4;
		this.favouriteToy = "laser pointer";
		this.favouriteFood = "tuna";
		this.mood = Mood.HAPPY;
		this.trait = "bully";
		
	}
	
	/**
	 * Class constructor. Constructs a cat type of pet with name and its species
	 * @param name
	 * @param species
	 */
	
	public Cat(String name) {
		this.name = name;
	}
	
	/**
	 * String representation of a cat
	 */
	
	@Override
	public String toString(){
		return  "Your pet is a : " +  species ;
	}
	
	
	public static void main(String[] args){
		Cat cat = new Cat();
		System.out.println(cat.getTrait());
	}
	
	
}
	