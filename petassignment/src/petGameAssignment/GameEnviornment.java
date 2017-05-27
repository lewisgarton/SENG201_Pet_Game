package petGameAssignment;


import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import petGameAssignment.Food;
//import petGameAssignment.Banana;

public class GameEnviornment {
	private int noOfDays = 0;     
	private int noOfPlayers = 0;
	private Scanner user = new Scanner(System.in);
	private ArrayList<Player> listOfPlayers = new ArrayList<Player>();
	//private ArrayList<String> listOfNames;
	private ArrayList<Food> listOfFood = new ArrayList<Food>();
	private ArrayList<Toy> listOfToys =  new ArrayList<Toy>();
	private ArrayList<Pet> listOfPets = new ArrayList<Pet>();
	private ArrayList<String> listOfNames = new ArrayList<String>();
	private ArrayList <Item> item = new ArrayList<Item>();
	private Player activePlayer;
	
	// stters and getters
	
	/**
	 * Returns the listOfPets
	 * @return listOfPets array list
	 */
	public ArrayList<Pet> getPetList(){
		return listOfPets;
	}
	
	
	
	/**
	 * Returns the listOfFood
	 * @return listOfFood array list
	 */
	public ArrayList<Food> getFoodList(){
		return listOfFood;
	}
	
	
	
	/**
	 * Returns the listOfToys
	 * @return listOfToys array list
	 */
	public ArrayList<Toy> getToyList(){
		return listOfToys;
	}
	
	
// pet settings	
	
	/**
	 * Fills the listOfPets ArrayList with initial pet objects
	 */
	public void createPets(){
		// Create Objects
		Cat cat = new Cat();
		Dog dog = new Dog();
		Hedgehog hedgehog = new Hedgehog();
		GuineaPig guineaPig = new GuineaPig();
		Monkey monkey = new Monkey();
		Parrot parrot = new Parrot();
		
		// Append objects to array list
		listOfPets.add(cat);		
		listOfPets.add(dog);		
		listOfPets.add(guineaPig);
		listOfPets.add(hedgehog);		
		listOfPets.add(monkey);
		listOfPets.add(parrot);		
	}
	
	
// food settings	
	/**
	 * Fills the listOfFood ArrayList with initial Food objects
	 */
	public void createFood(){
		// Create food objects
		Banana banana = new Banana();
		Lettuce lettuce = new Lettuce();
		Seeds seeds = new Seeds();
		Nut nut = new Nut();
		Tuna tuna = new Tuna();
		Bone bone = new Bone();
		
		// append objects to array list		
		listOfFood.add(banana);		
		listOfFood.add(lettuce);		
		listOfFood.add(seeds);		
		listOfFood.add(nut);		
		listOfFood.add(tuna);
		listOfFood.add(bone);
	}
	
	
// toy settings	
	/**
	 * Fills the listOfToys ArrayList with initial toy objects
	 */
	public void createToys(){
		
		// Create toy objects
		CardboardBox cardboardBox = new CardboardBox();
		CottonRope cottonRope = new CottonRope();
		LaserPointer laserPointer = new LaserPointer();
		PaperBag paperBag = new PaperBag();
		SnuggleSack snuggleSack = new SnuggleSack();
		ThrowingStick throwingStick = new ThrowingStick();
		
		// Append objects to array list
		listOfToys.add(cardboardBox);
		listOfToys.add(cottonRope);
		listOfToys.add(laserPointer);
		listOfToys.add(paperBag);
		listOfToys.add(snuggleSack);
		listOfToys.add(throwingStick);
	}
	
	
	
	
// player settings	
	
	/**
	 * Creates a Player and their initial pets.
	 * @param playerNumber The number of the current player
	 * @return Player created
	 */
	public Player createPlayer(int playerNumber){
		String name;
		int noOfPets;
		
		// get players name, and check it is unique
		while(true){
			name = askForString("What is the name of player " + playerNumber, 3, 10);
			if(!listOfNames.contains(name.toLowerCase())){listOfNames.add(name.toLowerCase()); 
			break;}
			System.out.println("That name has already been used, please try again");
		}
		
		// create player
		Player currentPlayer = new Player(name);		
		noOfPets = askForInt("How many pets do you want to play with? Choose a number between 1 and 3", 1, 3);
		for(int i = 0; i < noOfPets; i++){
			currentPlayer.addPet(choosePet());
		}		
		return currentPlayer;
	}
	
	
	/**
	 * Allows the user to view pet attributes choose a pet and a name.
	 * @return Chosen Pet
	 */
	public Pet choosePet(){
		String petString = new String("");
		Pet choice = new Pet();
		int selected = 0;
		String name;		
		
		petString += "Please choose a pet to view their attributes" + "\n" ;
				
		
		for(int i = 0; i < listOfPets.size(); i++){
			int j = i + 1;
			petString += "Press " + j + " for : " + listOfPets.get(i).getSpecies() + "\n";
			
		}
		
		while(true){
			selected = askForInt(petString, 1, 6);
			
			switch(selected){
			case 1: choice = new Cat();
					break;
			case 2: choice = new Dog();
			        break;
			case 3: choice = new GuineaPig();
			        break;
			case 4: choice = new Hedgehog();
					break;
			case 5: choice = new Monkey();
					break;
			case 6: choice = new Parrot();
					break;
			}
			System.out.print(choice.getAttributes());
			int x = askForInt("Would you like to choose this pet? \n Enter 0 for NO or 1 for YES", 0, 1);
			if(x == 1){
				break;
			}
		}			
		
		while(true){
			name = askForString("What would you like to call your pet? ", 3, 10);
			if(!listOfNames.contains(name.toLowerCase())){
				listOfNames.add(name.toLowerCase());
				break;
			}
			System.out.println("That name has already been used, please try again");
		}
				
		choice.setName(name);
		return choice;
		
	}
	

	
	/**
	 * Asks the user a question that requires an integer answer within set boundaries
	 * @param question The question you wish to be displayed to the user.
	 * @param min The minimum value
	 * @param max The maximum value
	 * @return The integer answer.
	 */
	public int askForInt(String question, int min, int max){
		int givenInt = 0;
		while(true)
		{
			System.out.println(question);
			try
			{
				givenInt = user.nextInt();
				user.nextLine(); // consume remaining tokens
				if(givenInt >= min && givenInt <= max) break;
				System.out.println("Sorry you can only choose between " + min + " and " + max + " please try again.");
			}
			catch(Exception e) {
				System.out.println("Incorrect input: Please type a number.");
				user.nextLine();
				
			}
		}
		return givenInt;
	}
	
	
	
	/**
	 * Asks the user a question, for a string answer of a given length range.
	 * @param question Question to be asked
	 * @param minLength minimum length of the answer
	 * @param maxLength maximum length of the answer
	 * @return String answer to the question
	 */
	public String askForString(String question, int minLength, int maxLength){
		String name;
		while(true)
		{
			System.out.println(question);
			try
			{
				name = user.next();
				user.nextLine(); // consume remaining tokens
				if((name.length() >= minLength) && (name.length() <= maxLength)) break;
				System.out.println("Must be at least " + minLength + " and a maximum of " + maxLength + " Long pleast try again");
			} 
			catch(Exception e){
				System.out.println("Incorect input please try again.");
				user.nextLine();				
			}			
		}
		return name;		
	}
	
	
	
	// game setup
	
	public void setUp(){
		createPets();
		createFood();
		createToys();
		noOfPlayers = askForInt("How many players are there? Please enter a number between 1 and 3 ", 1, 3);
		noOfDays = askForInt("How many days do you wish to play for?", 1, 100);
		
		
		for(int i = 1; i <= noOfPlayers; i++){
			listOfPlayers.add(createPlayer(i));
		}		
	}
	
	
	
	public void playGame(){
		String optionQuestion = "What would you like to do? \n"
				+ "Press 1: View pet stats. \n"
				+ "Press 2: Visit the store. \n"
				+ "Press 3: Interact with a Pet \n"
				+ "Press 4: Skip to next day.";
		
		
		for(int i = 0; i < listOfPlayers.size(); i++){ 		//for each player
			activePlayer = listOfPlayers.get(i);
					
			for(int day = 1; day <= noOfDays; day++){  		//for each day
			int choice;
			boolean flag = true;
			while(flag){
				System.out.println("Player: " + activePlayer.getName() + "\n" + "Day: " + day); //print player and days
				// players turn
				choice = askForInt(optionQuestion, 1, 4);
								
				switch(choice){
				case 1: //view pet stats
					displayStats(activePlayer);
					break;
				case 2: // Visit the store
					viewStore();
					break;
				case 3: // interact with pet
					break;
				case 4: // Skip day
					flag = false;
					break;
				}
			}
			}
	}
	}
	///////
	public void displayStats(Player player){
		String petQuestion = "Choose a pet to view their status. \n";		
		
		
		for(int pet = 0; pet < player.pets.size(); pet++){
			Pet currentPet = player.pets.get(pet);  
			petQuestion += "Press " + pet + " for " + currentPet.getName() + " the " + currentPet.getSpecies() + "\n";
		}		
		
		while(true){
			int choice = askForInt(petQuestion, 0, player.getNumberOfPets());
			Pet chosenPet = player.pets.get(choice);
			System.out.println(chosenPet.getStats());
			choice = askForInt("Press 0: to view another pets stats \nPress 1: to go back", 0, 1);
			if(choice > 0) break;
			
		}
	}
	
	/**
	 * Shows what objects the player currently owns , their amounts, and the 
	 * amount of money the player has	
	 */
	public void playerStats(){
		Player player = new Player();
		player.getFood();
		System.out.println();
	}
	public void viewStore(){
		while(true){
			int choice;
			String question = "This is the store. Please select a choice: \n";
			question += "1 View food for sale\n";
			question += "2 View toys for sale\n";
			question += "3 View player stats\n";
			question += "4 View price of items for sale \n";
			question += "5 Purchase food\n";
			question += "6 Purchase toys\n";
			
			
			choice = askForInt(question, 1, 5);
			
			switch(choice){
			case 1:{
				//System.out.println("Your current balance is " + activePlayer.getAccountBalance());
				chooseFood();
				showFood();
				
				break;
			}
			case 2:{
				System.out.print(activePlayer.showInventory());
				//showToys();
				break;
			}
			case 3:{
				chooseFood();
			
				break;
			}
			case 4:{
				chooseToy();
				break;
				
			}
			case 5:
				return;
				
			}
		}
	}
	/**
	 * Displays a list of food objects for sale and their price
	 */
	public void showFood(){
		Banana banana = new Banana();
		System.out.println(banana);
		Bone bone = new Bone();
		System.out.println( bone);
		Lettuce lettuce = new Lettuce();
		System.out.println( lettuce);
		Nut nut = new Nut();
		System.out.println( nut);
		Seeds seeds = new Seeds();
		System.out.println( seeds);
		Tuna tuna = new Tuna();
		System.out.println( tuna);
	}
	/**
	 * Displays a list of toys objects and their price
	 */
	public void showToys(){
		CardboardBox cardboardBox = new CardboardBox();
		System.out.println(cardboardBox);
		CottonRope cottonRope = new CottonRope();
		System.out.println( cottonRope);
		LaserPointer laserPointer = new LaserPointer();
		System.out.println( laserPointer);
		PaperBag paperBag = new PaperBag();
		System.out.println( paperBag);
		SnuggleSack snuggleSack = new SnuggleSack();
		System.out.println( snuggleSack);
		ThrowingStick throwingStick = new ThrowingStick();
		System.out.println( throwingStick);
	}
	public void chooseFood(){
		
		boolean flag = true;
		
		
		// Create question to ask user
		String foodQuestion = "=======FOOD FOR SALE======\n";		
		for(int i = 0; i < listOfFood.size(); i++){
			Food currentFood = listOfFood.get(i);
			foodQuestion += "Press " + i + " to view: \t" + currentFood.type + "\n"; 
		}
		foodQuestion += "Press " + listOfFood.size() + " to go back\n";
		
	 			
		while(flag){
			
			Integer choice = askForInt(foodQuestion, 0, listOfFood.size());
			if(choice.equals(listOfFood.size())){return;}
			Food chosenFood = listOfFood.get(choice);
			System.out.print(chosenFood.getInfo());
			choice = askForInt("Press: 1 to purchace this item \nPress: 0 to go back", 0, 1);
			if(choice > 0)
				{
					if(activePlayer.purchaseFoodcheck(chosenFood)){
						System.out.println("Food has been purchased and added to your inventory");
					}
					else{
						System.out.println("Sorry you have insufficent funds to purchace this item");
					}
				}
	}
	}
	
	
public void chooseToy(){
		
		boolean flag = true;
		
		
		// Create question to ask user
		String ToyQuestion = "=======TOYS FOR SALE======\n";		
		for(int i = 0; i < listOfToys.size(); i++){
			Toy currentToy = listOfToys.get(i);
			ToyQuestion += "Press " + i + " to view: \t" + currentToy.type + "\n"; 
		}
		ToyQuestion += "Press " + listOfToys.size() + " to go back\n";
		
				
		while(flag){
			
			Integer choice = askForInt(ToyQuestion, 0, listOfToys.size());
			if(choice.equals(listOfToys.size())){return;}
			Toy chosenToy = listOfToys.get(choice);
			System.out.print(chosenToy.getInfo());
			choice = askForInt("Press: 1 to purchace this item \nPress: 0 to go back", 0, 1);
			if(choice > 0)
				{
					
					if(activePlayer.purchaseToy(chosenToy)){
						System.out.println("Food has been purchased and added to your inventory");
					}
					else{
						System.out.println("Sorry you have insufficent funds to purchace this item");
					}
				}
	}
	}
		
	
	
	
	
	public void printStat(Player one){
		for(int j = 0; j < one.pets.size(); j++){
			System.out.println(one.pets.get(j).getSpecies());
			System.out.println("is sick: " + one.pets.get(j).isSick());
			System.out.println("is missbehaving: : " + one.pets.get(j).getIsMissbehaving());
			System.out.println();
		}
		
	}
	
	
	public void selectPet(){
		String question = "Which pet would you like to interact with?";
		int i;
		for(i = 0; i < activePlayer.pets.size();i++){
		Pet pet = activePlayer.pets.get(i);	
			question += "Press " + i + "for " + pet.name + " the " + pet.species + "\n";
		}
		i ++;
		question += "Press " + i + " to go back.";
		
		
		int choice = askForInt(question, 0, i);
		if(choice > activePlayer.pets.size()){return;}
		question = "What would you like to do with your pet?\n "
				+ "Press 0: to feed\n"
				+ "Press 1: to sleep"
				+ "Press 2: to toilet"
				+ "Press 3: to Play"
				+ "Press 4: to go back";
		
		int action = askForInt(question, 0, 4);
		boolean flag = true;
		while(flag){
			
			switch(action){
			case 0:{
				if(activePlayer.petFood.size() < 1){System.out.println("You have no food");}
				else{
					
					activePlayer.pets.get(choice).feed(food);
					activePlayer.pets.get(choice).incrementAction();
				}
				break;
			}
			case 1: 
				activePlayer.pets.get(choice).sleep();
				activePlayer.pets.get(choice).incrementAction();
				System.out.println("Your pet has had a sleep \n");
			case 2:
				activePlayer.pets.get(choice).useToilet();
				activePlayer.pets.get(choice).incrementAction();
				System.out.println("Your pet has been to the toilet \n");				
			case 3:
				if(activePlayer.petToys.size() < 1){System.out.println("You have no Toys");}
				else{
					// choose and play with toy
				}
			case 4:{flag = false;}
	
			}
		}
	}
	
	public static void main(String[] args){
		GameEnviornment newGame = new GameEnviornment();
		//newGame.createToys();
		//newGame.createFood();
		//newGame.activePlayer = new Player();
		//newGame.activePlayer.setAccountBalance(1000);
		//newGame.viewStore();
		//newGame.choosePet();
		//newGame.showFood();
	    //newGame.playGame();
		//newGame.chooseFood();
		//newGame.displayStats(player);
		//newGame.selectPet();
		//newGame.chooseFood();
		newGame.setUp();
		newGame.playGame();
		
		}
	}
	
	
