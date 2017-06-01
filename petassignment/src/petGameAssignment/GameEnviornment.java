package petGameAssignment;
import java.util.concurrent.ThreadLocalRandom;

/// test
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
	private final int MAX_PLAYERS = 3;
	private final int MIN_PLAYERS = 1;
	private final int MAX_PETS = 3;
	private final int MIN_PETS = 1;
	private final int MAX_DAYS = 100;
	private final int MIN_DAYS = 1;
	private final double DAILY_INCOME = 50.0;
	private String question;
	private int noOfDays = 0;     
	private int noOfPlayers = 0;
	private Scanner user = new Scanner(System.in);
	private ArrayList<Player> listOfPlayers = new ArrayList<Player>();
	private ArrayList<Food> listOfFood = new ArrayList<Food>();
	private ArrayList<Toy> listOfToys =  new ArrayList<Toy>();
	private ArrayList<Pet> listOfPets = new ArrayList<Pet>();
	private ArrayList<String> listOfNames = new ArrayList<String>();
	private ArrayList <Item> item = new ArrayList<Item>();
	private Player activePlayer;
	private Pet activePet;
	
	
	//		START GETTERS AND SETTERS 
	
	/**
	 * Gets the list of initial pet objects
	 * @return array list of pet objects
	 */
	public ArrayList<Pet> getListOfPets(){
		return listOfPets;
	}
	
	
	/**
	 * Gets the list of initial food objects
	 * @return array list of food objects
	 */
	public ArrayList<Food> getListOfFood(){
		return listOfFood;
	}
	
	
	/**
	 * Gets the list of initial toy objects
	 * @return array list of toy objects
	 */
	public ArrayList<Toy> getListOfToys(){
		return listOfToys;
	}
	
	
	
	
	//		END GETTERS AND SETTERS
	
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
	
	
	
	/**
	 * Checks if a name has already been used, if it hasn't, it gets added to the list of names used.
	 * @param name name to be checked
	 * @return True if unique, False otherwise
	 */
	public boolean isNameUnique(String name){
		String lowerName = name.toLowerCase();
		
		if(listOfNames.contains(lowerName)){
			return false;
		}
		else{
			listOfNames.add(lowerName);
			return true;
		}
	}
	
	
	/**
	 * Sets the number of players that are playing in the current game.
	 */
	public void setNumberOfPlayers(){
		String question = "How many players are there? Please"
				+ " enter a number between " + MIN_PLAYERS + " and " + MAX_PLAYERS;
		
		noOfPlayers = askForInt(question, MIN_PLAYERS, MAX_PLAYERS);
		
	}
	
	
	/**
	 * Sets the number of days the days the game should be played for.
	 */
	public void setNumberOfDays(){
		question = "How many days do you wish to play for? Please"
				+ " enter a number between " + MIN_DAYS + " and " + MAX_DAYS;
		
		noOfDays = askForInt(question, MIN_DAYS, MAX_DAYS);
	}
	
	
	
	/**
	 * Asks user for players name, constructs a new player.
	 * Player is then added to the list of players, and set to the active player.
	 * @param playerNumber sequential number of the player
	 */
	public void createPlayer(int playerNumber){
		String name;
		while(true){
			name = askForString("What is the name of player " + playerNumber, 3, 10);
			if(isNameUnique(name)){
				break;
			}
			System.out.println("That name has already been used, please try again");
		}
		Player currentPlayer = new Player(name);	
		listOfPlayers.add(currentPlayer);
		activePlayer = currentPlayer;
		
	}	
	
	
	
	
	/**
	 * Allows the user to view attributes and create a pet, the pet is then added to the players list of pets. 
	 */
	public void createPet(){
		String petQuestion = new String("");
		Pet pet = new Pet();
		int selected = 0;
		String name;		
		
		petQuestion += "Please choose a pet to view their attributes" + "\n" ;
				
		
		for(int i = 0; i < listOfPets.size(); i++){
			int j = i + 1;
			petQuestion += "Press " + j + " for : " + listOfPets.get(i).getSpecies() + "\n";
			
		}
		
		while(true){
			selected = askForInt(petQuestion, 1, 6);
			
			switch(selected){
			case 1: pet = new Cat();
					break;
			case 2: pet = new Dog();
			        break;
			case 3: pet = new GuineaPig();
			        break;
			case 4: pet = new Hedgehog();
					break;
			case 5: pet = new Monkey();
					break;
			case 6: pet = new Parrot();
					break;
			}
			System.out.print(pet.getAttributes());
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
				
		pet.setName(name);
		activePlayer.addPet(pet);	
	}
	
	
	
	/**
	 * Creates the players, and pets to be used in the game.
	 */
	public void setUpPlayers(){
		int noOfPets;
		for(int i = 1; i <= noOfPlayers; i++){
			createPlayer(i);			
			
			question = "How many pets do you want to play with? "
					+ "Choose a number between " + MIN_PETS + " and " + MAX_PETS;
			noOfPets = askForInt(question, MIN_PETS, MAX_PETS);
			for(int j = 0; j < noOfPets; j++){
				createPet();
			}
		}
	}
	public void killPet(){
		int choice;
		System.out.println(activePet.name + " the " + activePet.species + " has died!");
		if(!activePet.isRevived()){
			choice = askForInt("Would you like to revive this pet?, if not your pet will remain dead.\nPress 1 for yes or 0 for no.", 0, 1);
			if(choice > 0){
				activePet.setRevived(true);	
				System.out.println("Your pet has been revived.");
				activePet.resetStats();
				return;
			}
			else{
				System.out.println("Your pet has been removed from the game.");
				activePlayer.pets.remove(activePet);
				return;
			}
		}
		else{
			System.out.println("Your pet has been revived before, it has been removed from the game");
			activePlayer.pets.remove(activePet);
		}
	}
	
	/**
	 * Starts the game loop, allowing the players to play the game.
	 */
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
			for(int p = 0; p < activePlayer.pets.size(); p++){
				activePet = activePlayer.pets.get(p);
				activePet.statDecrease();
				if(!activePet.isAlive){
					killPet();
				}
			}
			//////random event
			
			boolean flag = true;
			if(activePlayer.pets.size() < 1){
				System.out.println("You dont have any live pets, game over");flag = false; day = 99;}
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
					interact();
					break;
				case 4: // Skip to next day
					resetPetActions();
					activePlayer.deposit(DAILY_INCOME);
					flag = false;
					break;
				}
			}
			}
			System.out.println("Your turn is over, your score is: " + activePlayer.getScore());
			while(true){
				int cont = askForInt("PRESS 1 TO START THE NEXT PLAYERS GAME", 1, 1);
				break;
			}
			
	}
		
	}
	
	
	/**
	 * Resets the pets action counter.
	 */
	public void resetPetActions(){
		for(int i=0; i < activePlayer.pets.size(); i++){
			activePlayer.pets.get(i).resetActions();
		}
	}
	
	
	/**
	 * Prints out the chosen players current game stats.
	 * @param player the player chosen.
	 */
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
			question += "1 View Your current balance\n";
			question += "2 View your inventory\n";
			question += "3 View food for sale\n";
			question += "4 View toys for sale\n";
			question += "5 Go Back\n";
			
			
			choice = askForInt(question, 1, 5);
			
			switch(choice){
			case 1:{
				System.out.println("Your current balance is " + activePlayer.getAccountBalance());				
				break;
			}
			case 2:{
				System.out.print(activePlayer.showInventory());
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
					if(activePlayer.purchaseFood(chosenFood)){
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
		
	// Decrease 
	public void statDecrease(){
		for(int i = 0; i < activePlayer.pets.size(); i++){
			activePet = activePlayer.pets.get(i);
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
		activePet = activePlayer.pets.get(choice);
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
				activePlayer.pets.get(choice).goToSleep();
				activePlayer.pets.get(choice).incrementAction();
				System.out.println("Your pet has had a sleep \n");
				break;
			case 2:
				activePlayer.pets.get(choice).goToilet();
				activePlayer.pets.get(choice).incrementAction();
				System.out.println("Your pet has been to the toilet \n");				
			case 3:
				if(activePlayer.petToys.size() < 1){System.out.println("You have no Toys");}
				else{
					activePet.play(getToy());
					activePlayer.pets.get(choice).incrementAction();
				}
			case 4:{flag = false;}
	
			}
		}
	}
	
	
	public Food getFood(){
		int i;
		String question = "";
		question += "What food would you like to feed your pet?\n";
		for(i = 0; i < activePlayer.petFood.size(); i++){
			question += "press " + i + " for " + activePlayer.petFood.get(i).type + "\n";			
		}
		int choice = askForInt(question, 0, activePlayer.petFood.size()+1);
		return activePlayer.petFood.remove(choice);
		
		
	}
	
	public Toy getToy(){
		int i;
		String question = "";
		question += "What Toy would you like your pet to play with?\n";
		for(i = 0; i < activePlayer.petToys.size(); i++){
			question += "press " + i + " for " + activePlayer.petToys.get(i).type + "\n";			
		}
		int choice = askForInt(question, 0, activePlayer.petToys.size()+1);
		return activePlayer.petToys.get(choice);
	
	}
	
	public void interact(){
		while(true){
			String question = "";
			question += "Which pet would you like to interact with?\n";
			int i;
			for(i = 0; i < activePlayer.pets.size(); i++){
				Pet pet = activePlayer.pets.get(i);
				question += "Press " + i + " for " + pet.name + " the " + pet.species + "\n";						
			}
			i++;
			question += "Press " + i + " to go back";
			int index = askForInt(question, 0, (activePlayer.pets.size()+1));
			if(index > activePlayer.pets.size()){
				return;
			}
			activePet = activePlayer.pets.get(index);
			
			boolean flag = true;
			while(flag){
				if(activePet.getActions() > 1){
					System.out.println("You have now used up this pets 2 actions for today.");
					flag = false;
					break;
				}
				question = "What would you like to do with your pet?\n"
						+ "1 Feed pet\n"
						+ "2 Take pet to the toilet\n"
						+ "3 Play with the pet\n"
						+ "4 Put the pet to sleep\n"
						+ "5 Go back";
				int choice = askForInt(question, 1, 5);
			
				switch(choice){
				case 1:{
					if(!activePlayer.petFood.isEmpty()){
						activePet.feed(getFood());
						System.out.println("You pet ate the food");
						activePet.incrementActions();
					}
					else{
						System.out.println("You do not currently have any food.");
					}
					break;
				}
				case 2:{
					activePet.goToilet();
					System.out.println("Your pet went to the toilet");
					activePet.incrementAction();
					break;
				}
				case 3: {
					if(activePlayer.petToys.size() > 0){
						Toy toy = getToy();
						activePet.play(toy);
						activePet.incrementActions();
						System.out.println("You pet played with the toy");
						if(toy.isBroken){
							activePlayer.removeToys(toy);
							System.out.println("The toy has broken, and has been removed from your inventory");
						}
					}
					else{
						System.out.println("You do not currently have any toys.");
					}
					break;
				}
				case 4:{
					activePet.goToSleep();
					activePet.incrementActions();
					break;
				}
				case 5:
					flag = false;
					break;
				}
				}
				}
		
			}	
	
	public void randomEvent(){
		for(int i = 0; i < activePlayer.pets.size(); i++){
			int randomNum = ThreadLocalRandom.current().nextInt(0, 100);
			
			
		}
	}


}



	
	
