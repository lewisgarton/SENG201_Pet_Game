package petGameAssignment;


import petGameAssignment.Food;
import petGameAssignment.Food.MealSize;
import petGameAssignment.Pet.Mood;
/**
 * @author Mihaela
 * Superclass Pet that stores common properties such as
 * name and owner of a specific pet(cat, dog, etc).
 * 
 */

public class Pet {
	
	// private instance variables
	protected Player owner;           // stores the owner of the pet 
	protected String name;            // stores the name of the pet
	protected String species;         // stores the type/species of pet
	protected String favouriteToy;    // stores the pet's favourite toy value
	protected String favouriteFood;   // stores the pet's favourite food value
	protected String food;       // stores the food's value
	protected String toy;        //stores the toy's value
	protected double weight;     // stores the weight value of the pet
	protected int appetite;      // stores the pet's appetite value
	protected int sleepiness;    //stores how much sleep a pat requires
	protected int playfulness;   // stores how playful a pet is
	protected Mood mood;         // stores the pet's mood value 
	protected int tastiness;     // stores the food's tastiness value
    protected int nutrition;     // stores the food's nutrition value
    protected int relief;        // stores the bathroom use/need relief amount 
    protected int roughness;     // stores the level of a pet's boredom
    protected String petMood;    // determines the pet's type of mood
    protected int durability;
    protected int damage;
    protected String trait;
    protected boolean beenRevived = false; // determines if a pet has been revived before.
    protected int actionsToday = 0; // keeps track of how many actions the pet has performed
	
    
	protected boolean needsBathroom ; // determines whether a pet needs the bathroom or not
	protected boolean isPlayful;      // determines whether a pet is playful or not
	protected boolean isTired;        // determines whether a pet is tired or not
	protected boolean isHungry;       // determines whether a pet is hungry or not
	protected boolean isHealthy ;     // determines whether a pet is healthy or not
	protected boolean isAlive;        // determines whether a pet is alive or dead
	protected boolean isMissbehaving = false; // determines whether a pet is missbehaving or not
	private boolean isSick = false; // determines if the pet is sick
	
	
	//Status variables
	protected int eatLevel = 100;
	protected int sleepLevel = 100;
	protected int playLevel = 100;
	protected int toiletLevel = 100;
	
///////////////////////////////////////////////////////////////////////////	
	public int getEatLevel(){
		return eatLevel;
	}
	
	public void setEatLevel(int value){
		eatLevel = value;
	}
	
	public int getSleepLevel(){
		return sleepLevel;
	}
	
	public void setSleepLevel(int value){
		sleepLevel = value;
	}
	
	public int getplayLevel(){
		return playLevel;
	}
	
	public void setPlayLevel(int value){
		playLevel = value;
	}
	
	public int getToiletLevel(){
		return toiletLevel;
	}
	
	public void setToiletLevel(int value){
		toiletLevel = value;
	}

//////////////////////////////////////////////////////////////////////////////	
	//Constructors
	/*
	public void correctBehavior{
		int answer;
		System.out.println("This pet is currently missbehaving! \n" + "Would you like to punish the pet?");
		// ask user for a yes or no answer
		if(answer == 1){
			// change missbehaving to false
			// change pets mood to sad
			// print response
		} 
		else {
			//print warning
		}
	}
	*/
	
	
	/*
	public void heal(){
		int answer;
		double healAmmount = 10;
		System.out.println("This pet is currently sick! \n Would you like to heal your pet for: " + healAmmount);
		// ask user for yes or no answer
		if(answer == 1){
			//Check balance of player
			// if player has enough funds
				//deduct ammount
				//set pet to healthy
				// make pet happy
			// else
				// tell the player they do not have enough funds
		}
		else{
			//print warning
		}
		
	}
	
	*/
	
	
	/*
	public void checkStatus(){
		return;
		// Check stats, if past threshold call killpet.
	}
	
	
	
	public void killPet(){
		int answer;
		isAlive = false;
		System.out.println("One of this pets stats has fallen too low and has died");
		if(beenRevived = false;){
			// Ask user if they would like to revive the pet
			if(answer == 1){
				isAlive = true;
				System.out.println("Your pet has been revived!");
			}
			else {
				System.out.println("Your pet will now remain dead for the rest of the game!");
			}
			beenRevived = true;
		}
		else {
			System.out.println("Sorry this pet has been revived once before, you can only revive a pet once.");
		}
	}
	
	*/
	
	
	////////////////////////////////////////////////
	public void incrementAction(){
		actionsToday += 1;		
	}
	
	public int getActionCount(){
		return actionsToday;
	}
	
	public void resetActions(){
		actionsToday = 0;
	}
	
	/**
	 * @return the isSick
	 */
	public boolean isSick() {
		return isSick;
	}
	//////////////////////////////////////////////////
	/**
	 * @param isSick the isSick to set
	 */
	public void setSick(boolean isSick) {
		this.isSick = isSick;
	}

	public String getTrait() {
		return trait;
	}

	public void setTrait(String trait) {
		this.trait = trait;
	}

	/**
	 * the default constructors for the class. empty constructor for
	 *  where no parameters are known in advance.
     */
	
	public Pet() {
	}
	
	/**
	 * Pet constructor which initialises the pet's name
	 * @param name
	 */
	
    public Pet(String name) {
    	this.name = name;
    }
    
    /** 
	 * Pet constructor which initialises the pet's name and the pet's species.
	 * @param name
	 * @param species
	 */
	public Pet(String name, String species) {
		this.name = name;
		this.species = species;
	}
	
	/**
	 * Pet constructor which initialises the pet's name, the pet's species, appetite,its relief level,
	 *  weight, favouriteToy,favouriteFood and its mood
	 * @param name
	 * @param species
	 * @param appetite
	 * @param weight
	 * @param relief
	 * @param favouriteToy
	 * @param favouriteFood
	 * @param mood
	 */
	
	public Pet(String name, String species,int appetite, double weight, int relief,String favouriteToy, String favouriteFood, Mood mood) {
		this.name = name;
		
		this.species = species;
		this.appetite = appetite;
		this.weight = weight;
		this.relief = relief;
		this.favouriteToy = favouriteToy;
		this.favouriteFood = favouriteFood;
		this.mood = mood;
		
	}
	
	// setters and getters
	
	/**
	 * Retrieves the owner of the pet
	 */
	
	public Player getOwner() {
		return owner;
	}
	
	/**
	 * Retrieves the name of the pet 
	 */
	
	public String getName() {
		return name;
	}

	/**
	 * Sets the name of the pet
	 * @param name
	 */
	
	public String setName(String name) {
		return this.name = name;
	}
	
	/**
	 * Retrieves the species of the pet    
	 */    
	
	public String getSpecies() {
		return species;
	}
	
	/**
	 * Sets the species of the pet
	 * @param species
	 */
	
	public void setSpecies(String species) {
		this.species = species;
	}

	/**
	 * Retrieves the weight of the pet
	 */
	
	public double getWeight() {
		return weight;
	}
		
	/**
	 * Sets the weight of the pet
	 * @param weight
	 */
	
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * Retrieves the toilet need of the pet
	 */
	
	public boolean getToiletNeed() {
		return needsBathroom;
	}
	
	/**
	 * Sets the bathroom need of the pet
	 * @param needsBathroom
	 */

	public void setToiletNeed(boolean needsBathroom) {
		this.needsBathroom = needsBathroom;
	}

	/**
	 * Retrieves the pet's favourite toy
	 */
	
	public String getFavouriteToy() {
		return favouriteToy;
	}
	
	/**
	 * Sets the favourite toy of the pet
	 * @param favouriteToy
	 */
	
	public void setFavouriteToy(String favouriteToy) {
		this.favouriteToy = favouriteToy;
	}


	/**
	 * Retrieves the pet's favourite food
	 */
	
	public String getFavouriteFood() {
		return favouriteFood;
	}
	/**
	 * Sets the favourite toy of the pet
	 * @param favouriteToy
	 */
	
	public void setFavouriteFood(String favouriteFood) {
		this.favouriteFood = favouriteFood;
	}

	/**
	 * Retrieves whether the pet is alive or not 
	 */
	
	
	public boolean getIsAlive() {
		return isAlive;
	}
	
	/**
	 * Sets the appetite level of the pet
	 * @param appetite
	 */
	public void setAppetite(int appetite) {
		this.appetite = appetite;
	}
	
	/**
	 * Retrieves the appetite level of the pet
	 */
	
	public int getAppetite() {
		return appetite;
	}
	
	/**
	 * Sets the sleepiness level of the pet
	 * @param sleepiness
	 */
	public void setSleepiness(int sleepiness) {
		this.sleepiness = sleepiness;
	}
	
	/**
	 * Retrieves the sleepiness level of the pet
	 */
	
	public int getSleepiness() {
		return sleepiness;
	}
	
	/**
	 * Sets the playfulness level of the pet
	 * @param playfulness
	 */
	public void setPlayfulness(int playfulness) {
		
		this.playfulness = playfulness;
	}
	
	/**
	 * Retrieves the playfulness level of the pet
	 */
	
	public int getPlayfulness() {
		return playfulness;
	}
	/**
	 * Sets the status of the pet (alive or not)
	 * @param isAlive
	 */
	
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}


	/**
	 * Retrieves the health status of the pet
	 */
	public boolean getIsHealthy() {
		return isHealthy;
	}
	
	/**
	 * Sets the status of the pet (alive or not)
	 * @param isHealthy
	 */
	
	public void setIsHealthy(boolean isHealthy) {
		this.isHealthy = isHealthy;
	}
	
	/**
	 * Retrieves whether the pet is missbehaving or not
	 */
	
	public boolean getIsMissbehaving() {
		return isMissbehaving;
	}

	/**
	 * Sets the status of the pet (the pet is missbehaving or not)
	 * @param isMissbehaving
	 */
	
	public void setMissbehaving(boolean isMissbehaving) {
		this.isMissbehaving = isMissbehaving;
	}
	
	/**
	 * Retrieves whether the pet is playful or not
	 */
	
	public boolean getPlayful(int playfulness){
		if (playfulness > 0) {
			setPlayful(true);
		}
		return isPlayful;
		}
	
	/**
	 * Sets the status of the pet (playful or not)
	 * @param isPlayful
	 */
	public void setPlayful(boolean isPlayful) {
		this.isPlayful = isPlayful;
	}

	public boolean getHungry() {
		if (appetite > 0) {
			setHungry(true);
		}
		//System.out.println("Feed your pet");
		return isHungry;
	}

	/**
	 * Sets the status of the pet (hungry or not)
	 * @param isHungry
	 */
	
	public void setHungry(boolean isHungry) {
		this.isHungry = isHungry;
	}
	
	/**
	 * Retrieves whether the pet is tired or not
	 */
	
	public boolean getTired(){
		return isAlive;
	}
	
	/**
	 * Sets the status of the pet (tired or not)
	 * @param isHungry
	 */
	public void setIsTired(boolean isTired) {
		this.isTired = isTired;
	}
	
	
	
	// helper functions
	/**
	 * Define an enumeration called MOOD which reflects a pet's mood at a 
	 * certain time, with 3 elements, referred to as:
	 * happy, content, sad
	 * 
	 */

	public enum Mood {
		HAPPY, CONTENT, SAD;
		@Override
	    public String toString() {
	        return name().toLowerCase();
	    }
	}	             
    
	/**
	 * Determines a pet's mood: happy, content or sad.
	 */
	
	public String findMood(Mood mood){
		String petMood = null;
    	if (mood == Mood.HAPPY) {
    		petMood = "happy"; 
    	}  
    	if (mood == Mood.CONTENT ) {
    		petMood = "content"; 
    	}  
    	if (mood == Mood.SAD) {
    		petMood = "sad";
    	}
		return petMood;
    }
  
	public void setMood(Mood happy) {
		this.mood = happy;
	}
	
	/**
	 * Retrieves the mood of the pet
	 */
	
	public Mood getMood(){
		return mood;
	}
	/**
	 * sets the mood of a pet depending on the food.Favourite food will make the 
	 * pet very happy
	 * @param food
	 * @return
	 */
	public String petMood(String food){
	if (food.toString() == getFavouriteFood()) {
		setMood(Mood.HAPPY);	
	} else 
		setMood(Mood.CONTENT);
	return mood.toString();
	}	
	
	/**
	 * sets the mood of a pet depending on the toy.Favourite
	 * toy will make the pet very happy
	 * @param food
	 * @return
	 */
	public boolean toyForPet(Toy toy) {
		Toy laserPointer = new LaserPointer();
		if (playfulness > 0) {
			setPlayful(true);
		}
		
		if(toy.toString() == getFavouriteToy()) {
			System.out.println(getFavouriteToy());
			setMood(Mood.HAPPY);	
		} else 
			setMood(Mood.CONTENT);
		
		return isPlayful;
		}	
		
	/**
	 * Find the toilet need depending on the meal size
	 * @param mealSize
	 */
	
	public int toiletNeed(MealSize mealSize) {
		if (mealSize == MealSize.SMALL) {
			 relief +=1;
			 weight += 1;
			 System.out.println("Your pet will need to use the toilet shorlty");
		} else if (mealSize == MealSize.LARGE) {
			 relief +=2;
			 weight += 2;
			 System.out.println("Your pet needs to use the toilet urgently");
		} if (relief > 0){
			setToiletNeed(true);
			
		}
		return relief;
	}
	/**
	 * Feed the pet 
	 * @param food
	 * @return
	 */
	public boolean feed(String food){
		Tuna petFood = new Tuna();
		Cat cat = new Cat();
		Pet pet = new Pet();

		 petFood.nutritionValue(food);
		 
		 cat.toiletNeed(MealSize.SMALL);
		 if (appetite >0) {
				System.out.println("Your pet is still hungry");
			} else 
				System.out.println("Your pet is full up");
		 
		 System.out.println(cat.petMood("lettuce"));
		 return isHungry;
	}	 
		
public boolean useToilet() {
		
		if (needsBathroom == true) {	
		relief += relief; 
		weight--;
		}
		if (relief <= 0){ 
			setToiletNeed(false);	
		}
		return needsBathroom;
		}
/*		
	public boolean useToilet() {
		toiletLevel += 50;
		if(toiletLevel > 100) toiletLevel = 100;
	}
*/	 
		
			//if (isHungry == true)
		/*	
			int nutritionValue = petFood.nutritionValue(food);
			nutrition += nutritionValue;
			//petMood(petFood);
			String petMood = petMood(petFood);
			System.out.println(petFood.getNutrition());
			if (appetite >0) {
				System.out.println("Your pet is still hungry");
			} else 
				System.out.println("Your pet is full up");
			int toiletNeed = cat.toiletNeed(petFood.getMealSize());
			relief += toiletNeed;
			int tasty = petFood.tastinessValue(food);
			tastiness += tasty;
		
			System.out.println("tastiness:" + petFood.getTastiness());
			
			System.out.println(getMood());
			weight += 2;
			if (appetite > 0){
				setHungry(true);
			}
			*/
		
	
	
	
	public boolean play(String toy){
		SnuggleSack snuggleSack = new SnuggleSack();
		Hedgehog hedgehog = new Hedgehog();
		
		if(toy == favouriteToy) {
			hedgehog.setMood(Mood.HAPPY);
			appetite += 2;
			sleepiness +=2;
			durability +=2;
			damage +=4;
		} else
			hedgehog.setMood(Mood.CONTENT);
			appetite +=2;
			sleepiness +=2;
			durability +=1;
			damage +=3;
			snuggleSack.checkBroken();
			if (snuggleSack.checkBroken() == true) {
				System.out.println("Your pet need a new toy.Your pet's toy is broken");
			}
			if (sleepiness >0) {
				hedgehog.setIsTired(true);
				System.out.println("Your pet needs to sleep");
			}
		return isPlayful;
		
	}
	public void sleep(){
		sleepiness += 100;
		if(sleepiness > 100) sleepiness = 100;
	}
	/**
	 * String representation of a pet
	 */ 
	public String toString(){
		return  "Your pet's name is: " +  name ;
	}
	
	/**
	 * Returns the main attributes of the pet
	 * @return Formatted attribute list
	 */
	public String getAttributes(){
		String formatted = "";
		formatted += "========ATTRIBUTES========\n";
		formatted += "Spiecies :\t" + species + "\n";
		formatted += "Sleepyness :\t" + sleepiness + "\n";
		formatted += "Appetite :\t" + appetite + "\n";
		formatted += "Playfulness :\t" + playfulness + "\n";
		formatted += "Favorite Food: \t" + favouriteToy + "\n";
		formatted += "Favorite Toy: \t" + favouriteFood + "\n";
		formatted += "==========================\n\n";
		return formatted;
		
	}
	
	
	public String getStats(){
		String formatted = "";
		formatted += name + "the " + species;
		formatted += "===========STATUS=========== \n";
		formatted += "Food  level  :\t" + eatLevel + "\n";
		formatted += "Sleep level  :\t" + sleepLevel + "\n";
		formatted += "Play  level  :\t" + playLevel + "\n";
		formatted += "Toilet level :\t" + toiletLevel + "\n";
		formatted += "Mood 		   :\t" + mood + "\n";
		
		formatted += "============================\n";
		return formatted;
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat();
		Tuna tuna = new Tuna();
		Pet pet = new Cat();
		Lettuce lettuce = new Lettuce();        
		
		//System.out.println(pet.play("laser pointer"));
		
		//System.out.println(pet.getFavouriteFood());
		//System.out.println(cat.useToilet());
		//System.out.println(toiletNeed( MealSize.LARGE));
		//System.out.println(pet.toiletNeed(MealSize.SMALL));
		//System.out.println(pet.getMood());
		//pet.feed("tuna");
		//pet.setMood(Mood.SAD);
		//System.out.println(pet.play("snuggleSack"));
		System.out.println(cat.petMood("tuna"));
	}
}
