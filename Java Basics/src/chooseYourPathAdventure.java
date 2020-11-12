import java.util.Random;
import java.util.Scanner;

public class chooseYourPathAdventure {
	
	Scanner stringReader = new Scanner(System.in);
	Scanner numberReader = new Scanner(System.in);

	public chooseYourPathAdventure() {
	System.out.println("Let us begin!\n"
		+ "You are walking through a dark forest, with only the moonlight to guide you. \n"
		+ "You need to go north, how do you know where north is? (tree moss/guess)");
	
	String choice = stringReader.nextLine();
	
	if(choice.equals("tree moss")) {
		treeMossStory();
	}
	
	if(choice.equals("guess")) {
		guessStory();

	}
	
	}
	
	public void treeMossStory() {
		System.out.println("Your background in foraging and hunting pay off, you know where north is. \n"			
				+ "While on route north, you hear faint sounds coming far off in the distance. \n"
				+ "What would you like to do? (investigate/ignore)");
		String treeMossChoice = stringReader.nextLine();
		if(treeMossChoice.equals("investigate")) {
			System.out.println("As you approach you hear something whispering and even like growling, \n"
					+ "You feel sharp teeth cling to your arm, cutting deep into your flesh. \n"
					+ "You scream out in pain, as the last thing you hear is the sound of an arrow wizzing through the air as it hits you. \n"
					+ "The huntsman who killed you stands over your body with his pet companion by his side. 'poor bastard' he mutters....");
		}
		if(treeMossChoice.equals("ignore")) {
			System.out.println("'Whatever that was, it is not my problem anyways...'\n"
					+ "You continue down your path ahead of you. \n");
		}
		
		
	}
	
	public void guessStory() {
		System.out.println("Very well... \n"
			    + "You wander in the direction you belive is north, when you notice something. \n"
		        + "You see a face, carved expertly into a tree trunk. The sight is very eerie. \n"
		        + "What would you like to do? (touch the face/keep on moving)");
		
		String guessStoryChoice = stringReader.nextLine();
		
		if(guessStoryChoice.equals("touch the face")) {
			System.out.println("Hesitantly, you reach out to touch the face. It is hard to make out but you realize the face has even been painted. \n"
					+ "Red lips, blue eyes, a full smile filled with blinding white teeth. Even in the dark of night these colors glowed bright. \n"
					+ "Suddenly you feel a sharp agonizing pain shoot through your hand and up to your shoulder. \n"
					+ "The face in the tree twists and contorts before your eyes! A crooked smile and nose, the faces blue eyes turn glowing red. \n"
					+ "You begin to hear faint voices in your head before you collapse on the ground and lose consciousness........");
		}
		if(guessStoryChoice.equals("keep on moving")) {
			System.out.println("You get struck by a dark mysterious force as you hear a chuckle from behind you. \n"
					+ "Right where the tree was standing......");
		}
	}
	
	
	
	public static void main(String[] args) {
	 new chooseYourPathAdventure();
	}

}
