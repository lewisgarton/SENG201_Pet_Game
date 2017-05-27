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
		this.price = 5;
		this.durability = 2;
		this.rigor = 5;
		this.damage = 4;
		type = "Cardboard Box";
		happyness = 4;
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

