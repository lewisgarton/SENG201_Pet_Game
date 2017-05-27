package petGameAssignment;



public class Item {
	private double price;
	
	public Item() {
		
	}
	public Item(double price){
		this.price = price;
	}
	public  double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return "The price of item: " + price;
	}
}