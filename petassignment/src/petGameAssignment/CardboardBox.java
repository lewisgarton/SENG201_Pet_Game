package petGameAssignment;


/**
 * @author Mihaela
 *  A cardboard box toy with a price
 */
public class CardboardBox extends Toy {

/**
 * Class constructor: constructs a cardboard box toy	
 */
	public CardboardBox() {
		price = 10;
		durability = 25;
		effort = 5;
		type = "Cardboard Box";
		happyness = 35;
	}	
	
/**
* Class constructor: creates a cardboard box toy with a specified price	
*/		
	public CardboardBox(double price) {
		this.price = price;
	}
	
/**
 * Returns the String representation of a cardboard box object
 */	
	public String toString(){
		return "Cardboard Box: " + price +" dollars";
	}
	   
  
    
}

