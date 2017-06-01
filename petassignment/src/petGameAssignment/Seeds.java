package petGameAssignment;
import petGameAssignment.Food.MealSize;


	/**
	 * Seeds subclass of Food superclass
	 * 
	 */
	public class Seeds extends Food {
		/**
		 * Class constructor: constructs a seeds food and initialises the values
		 * 
		 */
		public Seeds() {
			price = 6;
			nutrition = 43;
			tastiness = 25;
			mealSize = MealSize.LARGE;
			type = "Seeds";				
		}
		
				
		/**
		 * Constructs a seeds object with given price
		 * @param price
		 */
		public Seeds(double price) {
			this.price = price;
		}
		
		/**
		 * Returns a string representation of the object
		 */
		 public String toString() {
				
			 return ("Seeds: " + price + " dollars");
		 }    

}