import java.io.Console;
import java.io.Reader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
	// creating new scanner and format methods for the calculator
	Scanner scan = new Scanner(System.in);
	DecimalFormat format = new DecimalFormat("#.000");
	Console con = System.console();
	// declaring variables of the calculator, variable of numbers i can use to make a calculator
	// adding variables
	public static double addnum1;
	public static double addnum2;
	public static double addResult;
	// subtraction variables
	public static double subnum1;
	public static double subnum2;
	public static double subResult;
	// multiplication variables
	public static double multinum1;
	public static double multinum2;
	public static double multiResult;
	// division variables
	public static double divnum1;
	public static double divnum2;
	public static double divResult;
	public static String divResultShort;
	public static String shorten;
	
	public static Reader contains;
	
	// Creating an add method where it takes input from the console and prints result of the operation.
	public void add() {
		System.out.println("**Addition**");
		
		System.out.println("Enter your first value below:");
		addnum1 = scan.nextInt();
		
		System.out.println("Enter your second value below:");
		addnum2 = scan.nextInt();
		
		addResult = addnum1 + addnum2;
		
		System.out.println("The result of the addition is: " + addnum1 + " " + "+" + " " + addnum2 + " " + "=" + " " + addResult);
		
	}
	
	// Subtraction method that subtracts two input variables from the user/console and prints the result.
	public void subtract() {
		System.out.println("**Subtraction**");
		
		System.out.println("Enter your first value below:");
		subnum1 = scan.nextInt();
		
		System.out.println("Enter your first value below:");
		subnum2 = scan.nextInt();
		
		subResult = subnum1 - subnum2;
		
		System.out.println("The result of the subtraction is: " + subnum1 + " " + "-" + " " + subnum2 + " " + "=" + " " + subResult);
	}
	
	// Multiplication method that multiplies two input values from user/console and prints the result.
	public void multiply() {
		System.out.println("**Multiplication**");
		
		System.out.println("Enter your first value below:");
		multinum1 = scan.nextInt();
		
		System.out.println("Enter your second value below:");
		multinum2 = scan.nextInt();
		
		multiResult = multinum1 * multinum2;
		
		System.out.println("The result of the multiplication is: " + multinum1 + " " + "x" + " " + multinum2 + " " + "=" + " " + multiResult);
	}
	
	// Division method that divides two input variables from user/console and prints the result.
	public void divide() {
		System.out.println("**Division**");
		
		System.out.println("Enter your first value below:");
		divnum1 = scan.nextInt();
		
		System.out.println("Enter your second value below:");
		divnum2 = scan.nextInt();
		
		divResult = divnum1 / divnum2;
	
		System.out.println("The result of the division is: " + divnum1 + " " + "/" + " " + divnum2 + " " + "=" + " " + divResult);
	}

	// Ask user if they want to shorten their division answer to three decimal points...
	// Future plans:: Make a scanner that reads the console to determine which method is being used and then ask to shorten that answer.
	// If not I have to make a a shorten and askshorten method for every other operation which is a lot of unnecessary code.
	public void askDivShorten() {
		System.out.println("^^Would you like to shorten the answer to three decimal points? (yes/no)^^");
		
		shorten = scan.next();
		
		if (shorten.equals("no")) {
			System.out.println("^^Did not shorten answer...^^");
			
		}else if (shorten.equals("yes")) {
			String divshorter = format.format(divResult);
			System.out.println("The shortened answer is. " +divshorter);
		}else {
			System.out.println("Invalid input...");
		}
	}
	
	public void askMultiShorten() {
		System.out.println("^^Would you like to shorten the answer to three decimal points? (yes/no)^^");
		
		shorten = scan.next();
		
		if (shorten.equals("no")) {
			System.out.println("^^Did not shorten answer...^^");
			
		}else if (shorten.equals("yes")) {
			String multiShorten = format.format(multiResult);
			System.out.println("The shortened answer is: " + multiShorten);
		}else {
			System.out.println("Invalid input...");
		}
	}
	
	public void askAddShorten() {
		System.out.println("^^Would you like to shorten the answer to three decimal points? (yes/no)^^");
		
		shorten = scan.next();
		
		if (shorten.equals("no")) {
			System.out.println("^^Did not shorten answer...^^");
			
		}else if (shorten.equals("yes")) {
			String addShorten = format.format(addResult);
			System.out.println("The shortened answer is: " + addShorten);
		}else {
			System.out.println("Invalid input...");
		}
	}
	
	public void askSubShorten() {
		System.out.println("^^Would you like to shorten the answer to three decimal points? (yes/no)^^");
		
		shorten = scan.next();
		
		if (shorten.equals("no")) {
			System.out.println("^^Did not shorten answer...^^");
			
		}else if (shorten.equals("yes")) {
			String subShorten = format.format(subResult);
			System.out.println("The shortened answer is: " + subShorten);
		}else {
			System.out.println("Invalid input...");
		}
	}

	// Main method used so we can execute one of the methods above.
	public static void main(String[] args) {
		
		// Creating a new instance of the object. Starting a new "Calculator" we can use.
		Calculator a = new Calculator();
		
		// Mess around with whatever methods you want below: 
		a.divide();
		a.askDivShorten();
		// Considering a redesign to JOptionPane, so that i can just have the user confirm what operation it is so i can shorten...
		System.out.println("**End of calculator operations**");
	}

}
