package petGameAssignment;
import petGameAssignment.Food.MealSize;


/**
 * Lettuce subclass of Food superclass
 * 
 */
public class Lettuce extends Food {
	
	
	/**
	 * Class constructor: constructs a ettuce food and initialises the values
	 * 
	 */
	public Lettuce() {
		price = 4;
		nutrition = 45;
		tastiness = 20;
		mealSize = MealSize.SMALL;
		type = "Lettuce";
	}
	
	
	/**
	 * Constructs a lettuce object with given price
	 * @param price
	 */
	public Lettuce(double price) {
		this.price = price;
	}
	
	
	/**
	 * Returns a string representation of the object
	 */
	 public String toString() {
			
		 return ("Lettuce: " + price + " dollars");
	 }    
}
