package petGameAssignment;



import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import petGameAssignment.Toy;
import petGameAssignment.Food;



import java.util.Collections;
import java.util.List;


/**
 * Class Player, the owner of Pets
 * @author Mihaela
 *
 */
public class Player {
	
	String name; // player's name
	
	private double accountBalance; // player's account balance of how much money they have to spend at the store
	ArrayList<Pet> pets = new ArrayList<Pet>();  //list of pets available to the player
	public ArrayList<Food> petFood = new ArrayList<Food>();  // list pf food available to the player
	public ArrayList<Toy> petToys = new ArrayList<Toy>();    // list of toys available to the player
	private ArrayList<Player> players = new ArrayList<Player>();
	private ArrayList<Food> food  = new ArrayList<Food>();
	private boolean sickPet = false;
	private boolean missbehavingPet = false;
	//private ArrayList<Item> itemList = new ArrayList<Item>();
	//private ArrayList<Pet> pet = new ArrayList<Pet>();
	Scanner input = new Scanner(System.in);
	int choice;
	private int numberOfPets;
	private double price;
	private double money;
	//String choice= Scanner.nextLine();
	
	
	
	
	
	
	public void setNumberOfPets(int numPets){
		numberOfPets = numPets;		
	}
	
	
	
	
	/**
	 * Constructs a player with initialised account
	 */
	public Player() {
		accountBalance = 1000;
	}
	
	/**
	 * Constructs a player with a name
	 */
	public Player(String name) {
		this.name = name;
	}
	
	/**
	 * @return the missbehavingPet
	 */
	public boolean isMissbehavingPet() {
		return missbehavingPet;
	}

	/**
	 * @param missbehavingPet the missbehavingPet to set
	 */
	public void setMissbehavingPet(boolean missbehavingPet) {
		this.missbehavingPet = missbehavingPet;
	}

	/**
	 * @return the sickPet
	 */
	public boolean isSickPet() {
		return sickPet;
	}

	/**
	 * @param sickPet the sickPet to set
	 */
	public void setSickPet(boolean sickPet) {
		this.sickPet = sickPet;
	}

	/**
	 * Retrieves the amount of money in the account
	 */
	public double getAccountBalance() {
		return accountBalance;
	}
	
	/**
	 * Gets the name of the player
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name of the player
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the pets from the player's list of pets
	 * @return
	 */
	public ArrayList<Pet> getPets() {
		return pets;
	}
	
	/**
	 * Retrieves the items from the player's list of toys
	 * 
	 * @return
	 */
	public ArrayList<Toy> getToys() {
		return petToys;
	}
	public void setToys(ArrayList<Toy> toys) {
		this.petToys = toys;
	}
	/**
	 * Retrieves the number of pets from the player's list of pets
	 * @return
	 */
	public int getNumberOfPets() {
		 return numberOfPets;
	}
	
	
	/**
	 * Adds a pet to the players list of pets, increments the number of pets by 1.
	 * @param pet pet to be added.
	 */
	public void addPet(Pet pet) {
		numberOfPets += 1;
		pets.add(pet);
		
	}

	/**
	 * Sets the amount of money in th eplayer's account
	 * @param accountBalance
	 */
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	/**
	 * Retrieves the items in the list of food
	 * @return
	 */
	/*
	public ArrayList<Food> getFood() {
		return petFood;
	}
*/	
	/**
	 * Adds food to the player's list of Food
	 * @param food
	 */
	public void addFood(Food food) {
		petFood.add(food);
	}
	
	
	/**
	 * Adds toys to the player's list of Food
	 * @param toy
	 */
	public void addToys(Toy toy) {
		petToys.add(toy);
	}

	
	/**
	 * Removes food from the player's list of food
	 * @param food
	 */
	public void removeFood(Food food) {
		petFood.remove(food);
		
	}
	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * Adds toys to the player's list of Food
	 * @param toy
	 */
	public void addPlayer(Player player) {
		players.add(player);
	}
	
	/**
	 * Removes food from the player's list of food
	 * @param food
	 */
	public void removePlayer(Player player) {
		players.remove(player);
		
	}
	
	
	
	/**
	 * Removes toys from the player's list of food
	 * @param toy
	 */
	public void removeToys(Toy toy) {
		petToys.remove(toy);
		
	}
	
	public ArrayList<Player> getPlayers() {
		return players;
	}

	public void setPlayers(ArrayList<Player> players) {
		this.players = players;
	}
	public String toString(){
		return "player's name: " + name;
	}
	
	public boolean affordItem(Item item){

		Player player = new Player();
		money = player.getAccountBalance();   //stores the money balance of the player
		price = item.getPrice();      // stores the price of the item
		if (money >= price) {
		accountBalance -=item.getPrice();
		return true;
		}
		else if (money < price) {
		System.out.println("You haven't got enough money");}
		return false;
		}
		public ArrayList<Food> getFood() {
		return petFood;
		}

		/**
		* Food Store. The player can view a list of food items available and buy several items at a time
		* @param item
		* @return
		*/
		public ArrayList<Food>  purchaseFood(Item item) {
		Player player = new Player();

		while(player.getAccountBalance() <0 ){

		System.out.println("Updated balance account: " + getAccountBalance());}
		if (affordItem(item) == true) {
		if (item instanceof Food) {
		petFood.add((Food) item);

		}}
		System.out.println("Food inventory: " );
		System.out.println("================================");
		for (Item food : petFood) {
		System.out.println( food );
		}
		System.out.println("Updated balance account: " + getAccountBalance());

		return petFood;
		}
		
		public boolean  purchaseFoodcheck(Item item) {
			Player player = new Player();

			while(player.getAccountBalance() <0 ){

			System.out.println("Updated balance account: " + getAccountBalance());}
			if (affordItem(item) == true) {
			if (item instanceof Food) {
			petFood.add((Food) item);

			}}
			System.out.println("Food inventory: " );
			System.out.println("================================");
			for (Item food : petFood) {
			System.out.println( food );
			}
			System.out.println("Updated balance account: " + getAccountBalance());

			return true;
			}
		public void showFood( ArrayList<Food> petFood){
			Item item = new Item();
			petFood = purchaseFood(item);
			System.out.println("Food inventory: " + petFood);
		}
		/**
		* Toys Store. The player can view a list of toys items available and buy several items at a time
		* @param item
		* @return
		*/
		public ArrayList<Toy> purchaseToys(Item items)	{
		Player playerOne = new Player();

		while(playerOne.getAccountBalance() <0 ){
		System.out.println("Updated balance account: " + getAccountBalance());}
		if (affordItem(items) == true) {
		if (items instanceof Toy) {
		petToys.add((Toy) items);

		}}
		System.out.println("Toys inventory: " );
		System.out.println("================================");
		for (Item toys :petToys) {
		System.out.println(toys);
		}

		System.out.println("Updated balance account: " + getAccountBalance());


		return petToys;
		}

		/**
		* Creates the store with food and toys items available to buy by
		* creating instances of Food and Toy subclasses to be used in the store
		*/
		public void  selectFood()

		{
		System.out.println("              ====== Food store ======            ");


		do {
		System.out.println("1. Banana");
		System.out.println("2. Bone");
		System.out.println("3. Lettuce");
		System.out.println("4. Seeds");
		System.out.println("5. Nut");
		System.out.println("6. Tuna");
		System.out.println(" ");
		System.out.println("             ====== Toys Store ======");
		System.out.println("7. Cardboard Box");
		System.out.println("8. Cotton Rope");
		System.out.println("9. Laser Pointer");
		System.out.println("10. Paper Bag");
		System.out.println("11. Seeds");
		System.out.println("12. Snuggle Sack");
		System.out.println(" ");
		System.out.println("Select an item to purchase: ");
		choice = input.nextInt();



		switch (choice)  {

		case 1:
		Banana banana =new Banana();
		purchaseFood(banana);
		banana.getPrice();
		break;
		case 2:
		Bone bone = new Bone();
		purchaseFood(bone);
		break;
		case 3:
		Lettuce lettuce = new Lettuce();
		purchaseFood(lettuce);
		break;
		case 4:
		Seeds seeds = new Seeds();
		purchaseFood(seeds);
		break;
		case 5:
		Nut nut =new Nut();
		purchaseFood(nut);
		break;
		case 6:
		Tuna tuna = new Tuna();
		purchaseFood(tuna);;
		break;
		case 7:
		CardboardBox cardboardBox = new CardboardBox();
		purchaseToys(cardboardBox);
		break;
		case 8:
		CottonRope cottonRope = new CottonRope();
		purchaseToys(cottonRope);
		break;
		case 9:
		LaserPointer  laserPointer = new  LaserPointer();
		purchaseToys(laserPointer);
		break;
		case 10:
		PaperBag  paperBag = new  PaperBag();
		purchaseToys(paperBag);
		break;
		case 11:
		SnuggleSack  snuggleSack = new  SnuggleSack();
		purchaseToys(snuggleSack);
		break;
		case 12:
		ThrowingStick  throwingStick = new  ThrowingStick();
		purchaseToys(throwingStick);
		break;
		default:
		System.out.println("Done");
		break;
		}  }

		while (choice != 0);

		input.close();

		}


	
		
	public void setNoOfPets(int noOfPets) {
		this.numberOfPets = noOfPets;
		
	}

	
	/**
	 * Triggers a random event, uses a random number to decide if a pet becomes sick or starts misbehaving
	 * Only one event can effect a pet at a time, and only two pets can be affected at any one time.
	 */
	public void triggerRandomEvent(){
		int randomNumber = ThreadLocalRandom.current().nextInt(0, 100);
		
		// decide if sick
		if(randomNumber > 80){
			while(!sickPet){
				randomNumber = ThreadLocalRandom.current().nextInt(0, numberOfPets-1);
				if((!pets.get(randomNumber).isSick()) && (!pets.get(randomNumber).getIsMissbehaving())){
					pets.get(randomNumber).setSick(true);
					sickPet = true;
				}
			}
		}
		
		randomNumber = ThreadLocalRandom.current().nextInt(0, 100);
		if(randomNumber < 20){
			while(!missbehavingPet){
				randomNumber = ThreadLocalRandom.current().nextInt(0, numberOfPets-1);
				if((!pets.get(randomNumber).getIsMissbehaving()) && (!pets.get(randomNumber).isSick())){
					pets.get(randomNumber).setMissbehaving(true);
					missbehavingPet = true;
				}
			}			
		}		
	}
	
	
	
	public String showInventory(){
		String inventory = "======Your food=======\n";
		for(int j = 0; j < petFood.size(); j++){
			Food food = petFood.get(j);
			inventory += food.type + "\n";
			System.out.println(inventory);
		}
		
		inventory += "======Your Toys=======\n";
		for(int j = 0; j < petToys.size(); j++){
			Toy toy = petToys.get(j);
			inventory += toy.type + "\n";
		}
		
		return inventory;
		
		
		
}	
	public static void main(String[] args) {
		Player player = new Player();
		Nut nut = new Nut();
		Banana banana = new Banana();
		player.showInventory();
		//player.selectFood() ;
		
	

	}

}
