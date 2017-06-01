package petGameAssignment;



import petGameAssignment.Pet.Mood;

/**
 * Class that represents a toy.
 * Superclass for CardboardBox, CottonRope,
 * LaserPointer, PaperBag, SnuggleSack and ThrowingStick subclasses
 * @author lewis
 *
 */ 
public class Toy extends Item{
	protected String type;
	protected double price;
	protected int durability;
	protected int damage = 0;
	protected boolean isBroken;
	protected String favouriteToy;
	protected int effort;
	protected int happyness;

		
	// Constructors 
	
	/**
	 * Constructs a toy with no initial values
	 */
	
	public Toy() {  // default constructor
		
	}
	
	/**
	 * Constructs a toy with given values
	 * @param price The price of the toy.
	 */
	
	public Toy(double price){
		this.price = price;	
	}
	
	/**
	 * Constructs a toy with given value for durability
	 * @param durability The durability of the toy.
	 */
	public Toy(int durability){
		this.durability = durability;	
	}
			
	/**
	 * Constructs a toy with given values:price and durability
	 * @param price The price of the toy.
	 * @param durability The durability of the toy.
	 */
	public Toy(double price, int durability){
		this.price = price;
		this.durability = durability;		
	}
	
	// methods
	
	public int getEffort(){
		return effort;
	}
	
	
	
	/**
	 * Checks to see if the toy is broken, a toy is broken if its damage exceeds its durability
	 * @return true if broken, false if not broken
	 */
	
	public boolean checkBroken(){
		if(this.damage >= this.durability){
			this.isBroken = true;
		}
		return this.isBroken;
	}
	
	
	// Getters and setters
	
	/**
	 * Sets the price of the toy.
	 * @param price. Price to be set.
	 */
	
	public void setPrice(double price){
		this.price = price;
	}
		
	/**
	 * Retrieves the price of the toy.
	 * @return price. Price of toy.
	 */
	
	public double getPrice(){
		return this.price;
	}
	
	/**
	 * Sets the durability value of the toy
	 * @param duribility.Durability value of toy
	 */
	
	public void setDurability(int durability){
		this.durability = durability;
	}
	
	/**
	 * Retrieves the durability of the toy
	 * @return durability Durability value of the toy
	 */
	
	public int getDurability(){
		return this.durability;
	}
	
	/**
	 * Sets the damage value of the toy
	 * @param damage. Damage value of the toy
	 */
	public void setDamage(int damage){
		this.damage = damage;
	}
	
	/**
	 * Retrieves the damage of the toy
	 * @return damage. Damage value of the toy
	 */
	
	public int getDamage(){
		return this.damage;
	}
	
	
	/**
	 * Returns a string representation of a toy
	 */
	@Override
	public String toString() {
		return "The price for this toy is " + price;
	}
	
	public String getInfo(){		 
		 String formatted = "";
			formatted += "==========="+ type +"=========== \n";
			formatted += "Price     :\t" + price + "\n";
			formatted += "Happyness :\t" + happyness + "\n";
			formatted += "Durability :\t" + durability + "\n";
			formatted += "============================\n";
			return formatted;
		 }

	public void addDamage(int amount){
		damage += amount;
		if(damage > durability){
			isBroken = true;
		}
	}
	
}




