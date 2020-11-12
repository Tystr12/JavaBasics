import java.util.Scanner;

import javax.swing.JOptionPane;

public class AccountDetails {
	String firstName;
	String lastName;
	int age;
	String location;
	boolean inRelationship;
	boolean hasPets;
	String occupation;
	
	// Point of this class is to mess around with get and set methods in preparation for exams
	
	// This points to the variables in the AccountDetails class, tells the get set methods exactly which variables to set/get
	
	// Without this keyword the compiler does not recognize exactly which variable you are refering to...

	public String getFirstName() {
		System.out.println(firstName);
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println(lastName);
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		System.out.println(age);
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		System.out.println(location);
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isInRelationship() {
		System.out.println(inRelationship);
		return inRelationship;
	}

	public void setInRelationship(boolean inRelationship) {
		this.inRelationship = inRelationship;
	}

	public boolean isHasPets() {
		System.out.println(hasPets);
		return hasPets;
	}

	public void setHasPets(boolean hasPets) {
		this.hasPets = hasPets;
	}

	public String getOccupation() {
		System.out.println(occupation);
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public static void main(String[] args) {
		// Create a new test instance of AccountDetails class
		AccountDetails accountA = new AccountDetails();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("**************************************************");
		System.out.println("NEW ACCOUNT REGISTRATION FORUM");
		System.out.println("**************************************************");
		
		// pass a user dialog window to gather and output info form user using showinputdialog
		accountA.setFirstName(JOptionPane.showInputDialog("What is your first name?"));
		
		//return this value from the setter to the console
		accountA.getFirstName();
		
		accountA.setLastName(JOptionPane.showInputDialog("What is your last name?"));
		
		accountA.getLastName();
		System.out.println("What is your age?");
		accountA.setAge(scan.nextInt());
		
		accountA.getAge();
		System.out.println("Are you in a relationship? (true/false)");
		accountA.setInRelationship(scan.nextBoolean());
		
		accountA.isInRelationship();
		System.out.println("Do you have any pets? (true/false)");
		accountA.setHasPets(scan.hasNextBoolean());
		
		accountA.isHasPets();
		
		accountA.setLocation(JOptionPane.showInputDialog("Where are you located?"));
		
		accountA.getLocation();
		
		accountA.setOccupation(JOptionPane.showInputDialog("What is your occupation?"));
		
		accountA.getOccupation();
		
		System.out.println("**************************************************");
		System.out.println("THANKS FOR REGISTERING WITH US! ENJOY OUR SERVICES.");
		System.out.println("**************************************************");
		
		
		
	}

}
