package petGameAssignment;
import petGameAssignment.Food.MealSize;
/**
 * Seeds subclass of Food superclass
 * 
 */
public class Bone extends Food {
	
	/**
	 * Class constructor: constructs a banana food and initialises the values
	 * 
	 */
	public Bone() {
		price = 5;
		nutrition = 40;
		tastiness = 33;
		mealSize = MealSize.LARGE;
		type = "Bone";
				
		
	}
	
	
	/**
	 * Constructs a banana object with given price
	 * @param price
	 */
	public Bone(double price) {
		this.price = price;
	}
	
	
	/**
	 * Returns a string representation of the object
	 */
	 public String toString() {
			
		 return ("Bone: " + price + " dollars");
	 }    

}
