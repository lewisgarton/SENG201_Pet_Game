package petGameAssignment;
import petGameAssignment.Toy;

/**
 * @author Mihaela
 *  A paper cotton rope with a price
 */
public class LaserPointer extends Toy {
	

/**
 * Class constructor: constructs a cotton rope toy	
 */
	public LaserPointer() {
		price = 30;
		durability = 40;
		effort = 16;
		type = "Laser pointer";
		happyness = 44;
		
	}
	
/**
* Class constructor: creates a cotton rope toy with a specified price	
*/		
	public LaserPointer(double price) {
		this.price = price;
	}

/**
 * Returns the String representation of a cotton rope object
 */
	
	public String toString(){
		return "Cotton Rope: " + price +" dollars";
	}
    
}
