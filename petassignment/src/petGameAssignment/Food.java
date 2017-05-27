package petGameAssignment;



import petGameAssignment.Pet.Mood;

/**
 * Class that represents the food superclass. 
 * Subclasses: Tuna,Bone,Seeds,Banana,Nut,Lettuce.
 * 
 */
public class Food extends Item{
	///////////////////////////////////////////
	protected String type;
	protected double price; 
	protected int nutrition;
	protected int tastiness;
	protected MealSize mealSize;
	///////////////////////////////////////////
	
	
	
	
	
	
	
	
	
	
	protected String meal;
	protected boolean isHungry;
	protected int appetite;
	protected String favouriteFood;
	protected int relief;
	
	 
	/**
	 * Class constructor: constructs food with no initial value
	 */
	public Food() {
		
	}
	//Getters and setters.
	
	/**
	 * Constructs a Food object with given price
	 * @param price
	 */
	public Food(double price) {
		this.price = price;
	}
	
	/**
	 * Retrieves the price of the food.
	 * @return Foods price.
	 */
	public  double getPrice(){
		return this.price;
	}
	
	/**
	 * Returns the food items price.
	 * @param price Price of food.
	 */
	
	public void setPrice(double price){
		this.price = price;
	}
	
	/**
	 * Sets the nutrition value of the food.
	 * @param nutrition nutrition value
	 */
	public void setNutrition(int nutrition){
		this.nutrition = nutrition;
	}
	
	/**
	 * Returns the nutrition value of the food
	 * @return nutrition value
	 */
	public int getNutrition(){
		return this.nutrition;
	}
	
	/**
	 * Sets the tastiness value of the food.
	 * @param tastiness tastiness value
	 */
	
	public void setTastiness(int tastiness){
		this.tastiness = tastiness;
	}
	
	/**
	 * Returns the type value of the food.
	 * @return type value
	 */
	
	public int getTastiness(){
		return this.tastiness;
	}
	
	/**
	 * Determines the size of a meal: small or large
	 * @author Mihaela
	 *
	 */
	public enum MealSize {
	    	SMALL, LARGE;
		@Override
	    public String toString() {
	        return name().toLowerCase();
	    }
		}	
	 
	 /**
		 * Sets the meal size of the food.
		 * @param large The size of the meal
		 */
		
	public void setMealSize( MealSize mealSize) {
		this.mealSize = mealSize;
	}	
		
	/**
	* Returns the meal size value of the food.
	* @return meal size value
	*/
		
	public MealSize getMealSize(){
		return this.mealSize;
	}
	 
	/**
	 * Find the nutrition value depending on the food
	 * @param food
	 */
	public int nutritionValue(String food) {
	
		if (food == favouriteFood) {
			nutrition +=2;
			appetite -= nutrition;
		}
		else nutrition +=1;
			appetite -= nutrition;
		
		return appetite;
	}
	
	/**
	 * Find the tastiness value depending on the food
	 * @param food
	 * @return
	 */
	/*
	public int tastyFood(String food) {
		if (food == favouriteFood) {
			tastiness += 2;
			
			}
		else tastiness +=1;
		return tastiness;
	}
	
*/	
	
	/**
	 * Finds the tastiness value depending on the type of food.
	 * If the food is the pet's favourite food the tastiness value will be greater 
	 * than otherwise.
	 * @param food
	 * @return
	 */
	
	public int tastinessValue(String food) {
		
		if (food == favouriteFood){
			tastiness+=2;
		} else tastiness +=1;
		return tastiness;
	}

	/**
	 * Retrieves the relief level of the pet
	 */
	
	public int getRelief() {
		return relief;
	}
		
	/**
	 * Sets the relief level of the pet
	 * @param appetite
	 */
	
	public void setRelief(int relief) {
		this.relief = relief;
	}
	 /**
	 * Sets the meal value
	 * @param meal 
	 */

	public void setMeal( String meal) {
		this.meal = meal;
	}	
	
	
	/**
	 * Returns the meal value 
	 * @return meal value
	 */
	
	public String getMeal(){
		return this.meal;
	}

	/**
	 * Returns the String representation of a meal size object
	 */

	 public String toString() {
		
		 return ("This is food ");
	 }    
	 public static void main(String[] args) {
		 Food lettuce = new Food();
		 Cat cat =new Cat();
		 Tuna tuna = new Tuna();
		 Pet pet = new Pet();
		 
		
		 System.out.println(tuna.nutritionValue("tuna"));
		 //System.out.println(cat.toiletNeed(MealSize.LARGE));
		
		
	 }
	 
	 public String getInfo(){		 
	 String formatted = "";
		formatted += "==========="+ type +"=========== \n";
		formatted += "Price        	  :\t" + price + "\n";
		formatted += "Nutrition value :\t" + nutrition + "\n";
		formatted += "Meal size  	  :\t" + mealSize + "\n";
		formatted += "Tastiness		  :\t" + tastiness + "\n";		
		formatted += "============================\n";
		return formatted;
	 }
}
