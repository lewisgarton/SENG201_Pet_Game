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
		price = 5;
		durability = 45;
		effort = 15;
		type = "Paper bag";
		happyness = 45;
	}
	
	/**
	 * Class constructor: creates a throwing stick with a specified price	
	 */	
	
	public PaperBag(double price) {
		this.price = price;
	}
	
		
@Override
	public String toString(){
	return ("Paper Bag: " + price + " dollars");
	}
	   
}
