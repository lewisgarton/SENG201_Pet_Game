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
		species = "parrot";
		appetite = 15;
		weight = 3.0;
		sleepiness = 40;
		playfulness = 45;
		favouriteToy = "cotton rope";
		favouriteFood = "seeds";
		mood = Mood.HAPPY;
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

