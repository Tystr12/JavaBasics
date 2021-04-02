import java.util.Random;
import java.util.Scanner;

public class NumberStringTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		/*
		 * int x = rand.nextInt(10);
		 * 
		 * int guess = 0;
		 * 
		 * while (guess != x) { guess = scan.nextInt(); if(guess < x) {
		 * System.out.println("too low"); }else if(guess > x) {
		 * System.out.println("too high"); } }
		 * 
		 * System.out.println("Correct number " + guess);
		 */
		System.out.println("Input a number from 1 to 10");
		int num = scan.nextInt();
		int guess = rand.nextInt(20);
		while(guess != num) {
			System.out.println("The computer guesses: " + guess);
			String userInput = scan.next();
			if(userInput.equals("l")) {
				guess++;
				System.out.println(guess);
			} else if(userInput.equals("h")) {
				guess--;
				System.out.println(guess);
			}
		}
		
		System.out.println("The computer guessed correctly. it is " + num);
		
	}

}
