package petGameAssignment;




import petGameAssignment.Pet.Mood;

/**
 * GuineaPig subclass of Pet class
 * @author Mihaela
 *
 */

public class GuineaPig extends Pet {
	
	/**
	 * Class constructor: constructs a guinea pig pet and initialises the values
	 * for the pet's species, appetite, weight,relief level,it's favourite toy value, it's favourite food value and its mood
	 */
	
	public GuineaPig() {
		super();
		this.species = "guinea pig";
		this.appetite = 6;
		this.weight = 3.5;
		this.relief = 0;
		this.sleepiness = 3;
		this.favouriteToy = "paper bag";
		this.favouriteFood = "lettuce";
		this.mood = Mood.CONTENT;
		this.trait = "playful";
	}
	/**
	 * Class constructor. Constructs a GuineaPig type of pet with name and its species
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
	public String toString(){
			return  "Your pet is a : " +  species ;
		}
}