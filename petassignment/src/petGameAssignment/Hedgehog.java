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
		super();
		this.species = "hedgehog";
		this.appetite = 5;
		this.weight = 2.0;
		this.relief = 0;
		this.sleepiness = 2;
		this.favouriteToy = "snuggleSack";
		this.favouriteFood = "nut";
		this.mood = Mood.CONTENT;
		this.trait = "friendly";
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