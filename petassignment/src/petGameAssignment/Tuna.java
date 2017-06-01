package petGameAssignment;
import petGameAssignment.Food.MealSize;

/**
 * Tuna subclass of Food superclass
 * 
 */
public class Tuna extends Food {
	/**
	 * Class constructor: constructs a tuna food and initialises the values
	 * 
	 */
	public Tuna() {
		super();
		this.price = 7;
		this.nutrition = 41;
		this.tastiness = 28;
		this.mealSize = MealSize.SMALL;
		type = "tuna";		
	}
	
	
	/**
	 * Constructs a tuna object with given price
	 * @param price
	 */
	public Tuna(double price) {
		this.price = price;
	}
	
	
	/**
	 * Returns a string representation of the object
	 */
	 public String toString() {
			
		 return ("Tuna: " + price + " dollars");
	 }    

}

