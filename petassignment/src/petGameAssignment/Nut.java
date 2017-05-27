package petGameAssignment;



import petGameAssignment.Food.MealSize;
/**
 * Nut subclass of Food superclass
 * 
 */

public class Nut extends Food {
	/**
	 * Class constructor: constructs a nut food and initialises the values
	 * 
	 */
	public Nut() {
		super();
		this.price = 7;
		this.nutrition = 2;
		this.tastiness = 3;
		this.mealSize = MealSize.SMALL;
		type = "Nut";
				
		
	}
	/**
	 * Constructs a nut object with given price
	 * @param price
	 */
	public Nut(double price) {
		this.price = price;
	}
	/**
	 * Returns a string representation of the object
	 */
	@Override
	 public String toString() {
			
		 return ("Nut: " + price + " dollars");
	 }    

}
