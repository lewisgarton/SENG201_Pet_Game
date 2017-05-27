package petGameAssignment;



import petGameAssignment.Pet;
import petGameAssignment.Pet.Mood;

public class Dog extends Pet {
	public Dog() {
		super();
		this.species = "dog";
		this.appetite = 0;
		this.weight = 11.0;
		this.relief = 2;
		this.sleepiness = 5;
		this.favouriteToy = "throwing stick";
		this.favouriteFood = "bone";
		this.mood = Mood.HAPPY;
		this.trait = "hyperactive";
		
	}
	/**
	 * Class constructor. Constructs a Dog type of pet with name and its species
	 * @param name
	 * @param species
	 */
	
	public Dog(String name) {
		this.name = name;
	}
	
	/**
	 * String representation of a dog
	 */
	@Override
	public String toString(){
			return  "Your pet is a : " +  species ;
		}
}
