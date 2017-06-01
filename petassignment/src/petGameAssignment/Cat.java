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
		species = "cat";
		appetite = 32;
		weight = 8.0;
		sleepiness = 45;
		playfulness = 30;
		favouriteToy = "laser pointer";
		favouriteFood = "tuna";
		mood = Mood.HAPPY;		
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
	
}
	