import java.util.Scanner;

public class Leksehjelp {	
	
	// First number values
	static int value1;
	static int valuePowerOf;
	static double newValue;
	static String question;
	
	//Multiplication variables
	static int multbase;
	static int multpower;
	static double multeq;
	static double multFinalResult;
	
	// Addition variables
	static int addbase;
	static int addpower;
	static double addeq;
	static double addFinalResult;
	
	// Division variables
	static int divbase;
	static int divpower;
	static double diveq;
	static double divFinalResult;
	
	// Subtraction variables
	static int subbase;
	static int subpower;
	static double subeq;
	static double subFinalResult;
	
	static int thirdbase;
	static int thirdpower;
	static double thirdeq;
	static double completeResult;
	
	static String secondquestion;
	
	public static void multOp() {
		
		completeResult = multFinalResult * thirdeq;
		
		System.out.println(completeResult);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Please type in the base number.");
		value1 = scan.nextInt();
		
		System.out.println("Please enter the power to or potens for your base number.");
		valuePowerOf = scan.nextInt();
		
		newValue = Math.pow(value1, valuePowerOf);
		
		System.out.println("The result is: ");
		System.out.println(newValue);
		
		System.out.println("*******************************");
		System.out.println("What would you like to do next? \n"
				+ "(Add,Mult,Div,Sub) must be written exactly as seen on screen.");
		question = scan.next();
		
		if (question.equals("Mult")) {
			
			System.out.println("What would you like to multiply this with? \n"
					+ "Choose your second base number.");
			multbase = scan.nextInt();
			
			System.out.println("Choose your second base number's power to (potens).");
			multpower = scan.nextInt();
			
			multeq = Math.pow(multbase, multpower);
			
			multFinalResult = multeq * newValue;
			System.out.println("The result is: " + multFinalResult);
			
			
			
		} else if (question.equals("Add")) {
			
			System.out.println("What would you like to add this with? \n"
					+ "Choose your second base number.");
			addbase = scan.nextInt();
			
			System.out.println("Choose your second base number's power to (potens).");
			addpower = scan.nextInt();
			
			addeq = Math.pow(addbase, addpower);
			
			addFinalResult = addeq + newValue;
			System.out.println("The result is: " + addFinalResult);
			
			
			
		} else if (question.equals("Div")) {
			
			System.out.println("What would you like to add this with? \n"
					+ "Choose your second base number.");
			divbase = scan.nextInt();
			
			System.out.println("Choose your second base number's power to (potens).");
			divpower = scan.nextInt();
			
			diveq = Math.pow(divbase, divpower);
			
			divFinalResult = newValue / diveq;
			System.out.println("The result is: " + divFinalResult);
			
			
			
		} else if (question.equals("Sub")) {
			
			System.out.println("What would you like to add this with? \n"
					+ "Choose your second base number.");
			subbase = scan.nextInt();
			
			System.out.println("Choose your second base number's power to (potens).");
			subpower = scan.nextInt();
			
			subeq = Math.pow(subbase, subpower);
			
			subFinalResult = newValue - subeq;
			System.out.println("The result is: " + subFinalResult);
			
			
			
		} else {
			
			System.out.println("invalid input please try again.");
			
		}
		
		
		System.out.println("---------------------------------------");
		
		
		System.out.println("What is the base number of your last potens?");
		thirdbase = scan.nextInt();
		
		System.out.println("What is the potens number of your last potens?");
		thirdpower = scan.nextInt();
		
		thirdeq = Math.pow(thirdbase, thirdpower);
		
		System.out.println("Would you like to do more operations with this number? (yes/no)");
				
			
		secondquestion = scan.next();
		
		if (secondquestion.equals("Yes") || secondquestion.equals("yes"))  {
			System.out.println("what would you like to do? \n"
					+ "(A,M,D,S)");
			multOp();
			
		}
	
	}
}
