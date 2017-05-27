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
		super();
		price = 25; 
		durability = 1;
		damage = 5;
		type = "Snuggle Sack";
		happyness = 4;
	}
	
/**
* Class constructor: creates a snuggle sack toy with a specified price	
*/	
	
	public SnuggleSack(double price) {
		this.price = price;
	}
	
/**
 * Retrieves the price for this snuggle sack toy
 */
	public double getPrice() {
		return price;
	}
	
/**
 * Sets the value of the price of this snuggle sack toy
 */
	
	public void setPrice(double price) {
		this.price = price;
		
	}
/**
 * Returns the String representation of a snuggle sack object
 */
	
	public String toString(){
		return "Snuggle Sack: " + price +" dollars";
	}
	  
}
