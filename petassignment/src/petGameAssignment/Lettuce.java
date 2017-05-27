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
		super();
		this.price = 10;
		this.nutrition = 6;
		this.tastiness = 2;
		this.mealSize = MealSize.SMALL;
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
