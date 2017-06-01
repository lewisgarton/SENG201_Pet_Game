package petGameAssignment;
import petGameAssignment.Pet.Mood;

/**
 * Monkey subclass of Pet class
 * @author Mihaela
 *
 */
public class Monkey extends Pet {
	
	/**
	 * Class constructor: constructs a monkey pet and initialises the values
	 * for the pet's species, appetite, weight,relief level,it's favourite toy value, it's favourite food value and its mood
	 */	
	public Monkey() {
		this.species = "monkey";
		this.appetite = 30;
		this.weight = 10.0;
		this.sleepiness = 35;
		playfulness = 50;
		this.favouriteToy = "cardboard box";
		this.favouriteFood = "banana";
		this.mood = Mood.HAPPY;
	}

	/**
	 * Class constructor. Constructs a monkey type of pet with name and its species
	 * @param name
	 * @param species
	 */	
	public Monkey(String name) {
		this.name = name;
	}
	
	/**
	 * String representation of a monkey
	 */	
	@Override
	public String toString(){
			return  "Your pet is a : " +  species ;
		}
}
