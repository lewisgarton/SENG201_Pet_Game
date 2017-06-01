package petGameAssignment;

import petGameAssignment.Pet.Mood;

/**
 * GuineaPig subclass of Pet class
 * 
 * @author Mihaela
 *
 */
public class GuineaPig extends Pet {

	/**
	 * Class constructor: constructs a guinea pig pet and initialises the values
	 * for the pet's species, appetite, weight,relief level,it's favourite toy
	 * value, it's favourite food value and its mood
	 */
	public GuineaPig() {
		species = "guinea pig";
		appetite = 15;
		weight = 0.2;
		sleepiness = 45;
		playfulness = 30;
		favouriteToy = "paper bag";
		favouriteFood = "lettuce";
		mood = Mood.CONTENT;
	}

	/**
	 * Class constructor. Constructs a GuineaPig type of pet with name and its
	 * species
	 * 
	 * @param name
	 * @param species
	 */
	public GuineaPig(String name) {
		this.name = name;
	}

	/**
	 * String representation of a guinea pig
	 */
	@Override
	public String toString() {
		return "Your pet is a : " + species;
	}
}