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
		super();
		this.price = 15;
		this.nutrition = 8;
		this.tastiness = 6;
		this.mealSize = MealSize.LARGE;
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

	public static void main(String[] args) {
		
	}

}
