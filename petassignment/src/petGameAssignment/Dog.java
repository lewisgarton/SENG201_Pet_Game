package petGameAssignment;
import petGameAssignment.Pet;
import petGameAssignment.Pet.Mood;



public class Dog extends Pet {
	public Dog() {
		species = "dog";
		appetite = 44;
		weight = 11.0;
		sleepiness = 25;
		playfulness = 30;
		favouriteToy = "throwing stick";
		favouriteFood = "bone";
		mood = Mood.HAPPY;		
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
