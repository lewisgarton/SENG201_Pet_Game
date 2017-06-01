package petGameAssignment;


/**
 * 
 *  A snuggle sack toy with a price
 */

public class SnuggleSack extends Toy {

	

/**
 * Class constructor: constructs a snuggle sack toy	and initialises the values
 * for price, durability and damage
 */
	public SnuggleSack() {
		price = 15;
		durability = 45;
		effort = 24;
		type = "Cardboard Box";
		happyness = 40;
	}
	
/**
* Class constructor: creates a snuggle sack toy with a specified price	
*/	
	
	public SnuggleSack(double price) {
		this.price = price;
	}
	


/**
 * Returns the String representation of a snuggle sack object
 */
	
	public String toString(){
		return "Snuggle Sack: " + price +" dollars";
	}
	  
}
