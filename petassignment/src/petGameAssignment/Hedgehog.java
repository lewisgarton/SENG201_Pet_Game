package petGameAssignment;



import petGameAssignment.Pet;
import petGameAssignment.Pet.Mood;

/**
 * Hedgehog subclass of Pet class
 * @author Mihaela
 *
 */
public class Hedgehog extends Pet {
	
	/**
	 * Class constructor: constructs a hedgehog pet and initialises the values
	 * for the pet's species, appetite, weight, relief level ,it's favourite toy value,it's favourite food value and its mood
	 */
	public Hedgehog() {
		species = "hedgehog";
		appetite = 20;
		weight = 2.0;
		sleepiness = 25;
		playfulness = 35;
		favouriteToy = "snuggleSack";
		favouriteFood = "nut";
		mood = Mood.CONTENT;
	}

	
	/**
	 * Class constructor. Constructs a hedgehog type of pet with name and its species
	 * @param name
	 * @param species
	 */	
	public Hedgehog(String name) {
		this.name = name;
	}
	
	/**
	 * String representation of a hedgehog
	 */	
	@Override
	public String toString(){
			return  "Your pet is a : " +  species ;
		}

}