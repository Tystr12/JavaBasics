import java.util.Random;
import java.util.Scanner;

public class arrayListTest {

	public static void main(String[] args) {
		// System objects
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		
		// Game variables
		String[] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
		int maxEnemyHealth = 75;
		int enemyAttackDamage = 25;
		
		// Player variables
		int health = 75;
		int attackDamage = 50;
		int numHealthPotions = 3;
		int healthPotionHealAmount = 30;
		int healthPotionDropChance = 50; //Percentage
		
		// Declare a variable running that we can use to signify when the game is running in our while loop
		boolean running = true;
		
		// Welcome the player to the game
		System.out.println("Welcome to the Dungeon!");
		
		// Declare that this while loop is called "GAME" so that we can break out and restart loop later in the program
		GAME:
		while(running) {
			System.out.println("-----------------------------------------------------------------------------");
			// Declare an integer variable that gives a random value of enemy HP upper limit at "maxEnemyHealth" that we declared earlier
			int enemyHealth = rand.nextInt(maxEnemyHealth);
			// Choose an enemy at random out of our enemies string array using the .length feature and random variable we created
			String enemy = enemies[rand.nextInt(enemies.length)];
			// Print out to the user which enemy was chosen
			System.out.println("\t# " + enemy + " has appereared! #\n");
			// While loop to engage in combat! (While the enemy is still alive: do this) 
			// First print to the player these useful statistics and give three actions the player can choose
			while (enemyHealth > 0) {
				System.out.println("\tYour HP: " + health);
				System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
				System.out.println("\n\tWhat would you like to do?");
				System.out.println("\t1.Attack");
				System.out.println("\t2.Drink health potion");
				System.out.println("\t3.Run!");
				
				// To get the user input we use the scanner tool, and multiple if statements to perform the action chosen
				String input = in.nextLine();
				if(input.equals("1")) {
					int damageDealt = rand.nextInt(attackDamage);
					int damageTaken = rand.nextInt(enemyAttackDamage);
					
					enemyHealth -= damageDealt;
					health -= damageTaken;
					
					System.out.println("\t> You strike the " + enemy + " for " + damageDealt + "damage.");
					System.out.println("\t> You recieve " + damageTaken + " in retaliation");
					
					// If the players help drops to zero, it is game over, we break the loop and start the game over again
					if(health<1) {
						System.out.println("\t> You have taken too much damage, you cannot go on!");
						break;
					}
				}
				else if(input.equals("2")) {
					if (numHealthPotions > 0) {
						health += healthPotionHealAmount;
						numHealthPotions--;
						System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + "."
								+ "\n\t> You now have " + health + "HP."
								+ "\n\t> You have " + numHealthPotions + " health potions left. \n");
						
					}
					// if the player tries to use a health pot but is empty, print this message and let them choose again
					else {
						System.out.println("\t> You have no health potions left! Defeat enemies for a chance to get one!\n");
					}
				}
				//When you run away from the enemy close this combat instance, and start at the top of the loop again aka new instance
				else if(input.equals("3")) {
					System.out.println("\tYou run away from the " + enemy + "!");
					continue GAME;
				} 
				// If the player types an invalid response
				else {
					System.out.println("\tInvalid command!");
				}
			}
			if(health<1) {
				System.out.println("You limp out the dungeon, weak from battle");
				break;
			}
			// Giving the player statistics after the battle is won
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println(" # " + enemy + " was defeated! #");
			System.out.println(" # You have " + health + "HP left. #" );
			if(rand.nextInt(100) < healthPotionDropChance) {
				numHealthPotions++;
				System.out.println(" # The " + enemy + " dropped a health potion! #");
				System.out.println(" # You now have " + numHealthPotions + "health potion(s). #");
			} 
			else {
				System.out.println(" # The " + enemy + " did not drop a health potion...");
				System.out.println(" # You have " + numHealthPotions + " health potion(s) left.");
			}
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("What would you like to do now?");
			System.out.println("1. Continue Fighting");
			System.out.println("2. Exit dungeon");
			
			String input = in.nextLine();
			
			while (!input.equals("1") && !input.equals("2")) {
				System.out.println("Invalid command!");
				input = in.nextLine();
			}
			// Player choice: continue playing, or quit now
			if (input.equals("1")) {
				System.out.println("You continue on your adventure!");
			}
			else if (input.equals("2")) {
				System.out.println("You exit the dungeon, successful from your adventures!");
				break;
			}
		}
		// print game over message and thank player for participating
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("#######################");
		System.out.println("# THANKS FOR PLAYING! #");
		System.out.println("#######################");
		
		
		}
		
}
