package petGameAssignment;
import petGameAssignment.Food.MealSize;


/**
 * Seeds subclass of Food superclass
 * 
 */
public class Banana extends Food {
	/**
	 * Class constructor: constructs a banana food and initialises the values
	 * 
	 */
	public Banana() {
		price = 3;
		nutrition = 35;
		tastiness = 25;
		mealSize = MealSize.LARGE;
		type = "Banana";
				
		
	}
	
	
	/**
	 * Constructs a banana object with given price
	 * @param price
	 */
	public Banana(double price) {
		this.price = price;
	}
	
	
	
	/**
	 * Returns a string representation of the object
	 */
	 public String toString() {
			
		 return ("Banana: " + price + " dollars");
	 }    

}
