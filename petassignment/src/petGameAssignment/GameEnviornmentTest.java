package petGameAssignment;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GameEnviornmentTest extends GameEnviornment {
	public GameEnviornment game = new GameEnviornment();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void test() {
		testIsNameUnique();
		testCreators();
	}
	
	
	@Test 
	public void testIsNameUnique() {
		assertEquals(true , game.isNameUnique("Lewis"));
		assertEquals(false , game.isNameUnique("Lewis"));
		assertEquals(false , game.isNameUnique("lewis"));
		assertEquals(false , game.isNameUnique("lewIs"));
		assertEquals(true , game.isNameUnique("0111"));
		assertEquals(false , game.isNameUnique("0111"));
		assertEquals(true , game.isNameUnique("John"));
		assertEquals(true , game.isNameUnique("pete"));
		
	}
	
	@Test
	public void testCreators(){
		game.createFood();
		game.createPets();
		game.createToys();
		
		assertEquals(6, game.getListOfFood().size());
		assertEquals(6, game.getListOfPets().size());
		assertEquals(6, game.getListOfToys().size());
		
	}

}
