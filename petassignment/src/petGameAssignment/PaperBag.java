package petGameAssignment;


/**
 *  A throwing stick toy with a price
 */

public class PaperBag extends Toy {
	
	
		
	// Constructors
	/**
	 * Class constructor: creates a throwing stick toy and initialises 
	 * properties values
	 */
	public PaperBag(){ 
		super();
		price = 8;
		durability = 4;
		damage = 4;
		type = "Paper Bag";
		happyness = 4;
	}
	
	/**
	 * Class constructor: creates a throwing stick with a specified price	
	 */	
	
	public PaperBag(double price) {
		this.price = price;
	}
	
	/**
	* Class constructor: creates a throwing stick with a specified durability	
	*/	
		
		public PaperBag(int durability) {
			this.durability = durability;
		}
		
@Override
	public String toString(){
	return ("Paper Bag: " + price + " dollars");
	}
	   
}
