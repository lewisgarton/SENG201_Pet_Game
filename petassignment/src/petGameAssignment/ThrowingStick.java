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
		super();
		price = 8;
		durability = 4;
		damage = 4;
		type = "Throwing Stick";
		happyness = 4;
	}
	
	/**
	 * Class constructor: creates a throwing stick with a specified price	
	 */	
	
	public ThrowingStick(double price) {
		this.price = price;
	}
	
	/**
	* Class constructor: creates a throwing stick with a specified durability	
	*/	
		
		public ThrowingStick(int durability) {
			this.durability = durability;
		}
		
@Override
	public String toString(){
	return ("Throwing stick: " + price + " dollars");
	}
	   
}