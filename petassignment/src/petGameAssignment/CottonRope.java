package petGameAssignment;
import petGameAssignment.Toy;

/**
 * @author Mihaela
 *  A paper cotton rope with a price
 */
public class CottonRope extends Toy {
	

/**
 * Class constructor: constructs a cotton rope toy	
 */
	public CottonRope() {
		price = 20;
		durability = 35;
		effort = 10;
		type = "Cotton rope";
		happyness = 20;
		
	}
	
/**
* Class constructor: creates a cotton rope toy with a specified price	
*/	
	
	public CottonRope(double price) {
		this.price = price;
	}
	
	
/**
 * Returns the String representation of a cotton rope object
 */
	
	public String toString(){
		return "Cotton Rope: " + price +" dollars";
	}
    
}