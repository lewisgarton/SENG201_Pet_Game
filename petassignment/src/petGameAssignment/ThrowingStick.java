package petGameAssignment;
/**
 *  A throwing stick toy with a price
 */

public class ThrowingStick extends Toy {	
		
	// Constructors
	/**
	 * Class constructor: creates a throwing stick toy and initialises 
	 * properties values
	 */
	public ThrowingStick(){ 
		price = 10;
		durability = 45;
		effort = 5;
		type = "Throwing stick";
		happyness = 35;
	}
	
	/**
	 * Class constructor: creates a throwing stick with a specified price	
	 */	
	
	public ThrowingStick(double price) {
		this.price = price;
	}

		
@Override
	public String toString(){
	return ("Throwing stick: " + price + " dollars");
	}
	   
}