import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
// a counter that stops when it reaches a certain number
// in this case we want the counter to end when it is no longer
// less than 10, when it reaches ten the loop will be terminated
// this resembles a for loop, but there are situations where a do while loop is much better
		int a = 0;
		
//		while(a < 10) {
//			System.out.println("a is less than 10: " + a);
//			a++;
//		}
		
//do will always run first no matter if the while statement is true	
		
//		do {
//			System.out.println("a");
//			
//		} while(a == 0);
// doesnt work because a is not equal to 1 so nothing is printed
		
//		while(a == 1) {
//			System.out.println("a");
//		}

// real world example of using a while loop in java to scan a sentence and pick out each word and put it into an array
// we can then print out the new String array we made to prove that it extracted the words from our String sentence variable
		
		String sentence = "flapjacks are awesome!";
		Scanner scan = new Scanner(sentence);
		ArrayList<String> words = new ArrayList<String>();
		
		while (scan.hasNext()) {
			words.add(scan.next());
		}
		
		System.out.println(words);
		
	}
}
