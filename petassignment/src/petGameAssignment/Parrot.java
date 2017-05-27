package petGameAssignment;



import petGameAssignment.Pet.Mood;

/**
 * Parrot class, subclass of Pet
 * @author Mihaela
 *
 */
public class Parrot extends Pet {
	
	/**
	 * Class constructor: constructs a parrot pet and initialises the values
	 * for the pet's species, appetite, weight,it's favourite toy value and it's favourite food value
	 */
	
	public Parrot() {
		super();
		this.species = "parrot";
		this.appetite = 2;
		this.weight = 3.0;
		this.relief = 1;
		this.sleepiness = 2;
		this.favouriteToy = "cotton rope";
		this.favouriteFood = "seeds";
		this.mood = Mood.HAPPY;
		this.trait = "chatty";
		
	}
	
	/**
	 * Class constructor. Constructs a Cat type of pet with name and its species
	 * @param name
	 * @param species
	 */
	
	public Parrot(String name) {
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

