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
		price = 15;
		durability = 10;
		damage = 1;
		type = "Laser Pointer";
		happyness = 4;
		
	}
	
/**
* Class constructor: creates a cotton rope toy with a specified price	
*/	
	
	public LaserPointer(double price) {
		this.price = price;
	}
	
/**
 * Retrieves the price for this cotton rope toy
 */
	public double getPrice() {
		return price;
	}
	
/**
 * Sets the value of the price of this cotton rope toy
 */
	
	public void setPrice(double price) {
		this.price = price;
		
	}
/**
 * Returns the String representation of a cotton rope object
 */
	
	public String toString(){
		return "Cotton Rope: " + price +" dollars";
	}
    
}
