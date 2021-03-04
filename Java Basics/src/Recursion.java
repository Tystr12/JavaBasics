
public class Recursion {
	// Practicing recursion! Always set a basecase for your recursion or else it will crash the program.
	// Use if else statement inside of the function for control flow and to set the basecase.

	public static void main(String[] args) {
		
		countBackwards(14);
		
	}
	
	public static void sayHi(int n) {
		if (n == 0) {
			System.out.println("Done!");
		} else {
			System.out.println("hi");
			n--;
			sayHi(n);
		}
	}
	
	//Need a base case 
	
	public static void countBackwards(int num) {
		if (num == 0) {
			System.out.println("Done!");
		} else {
			System.out.println(num);
			num--;
			countBackwards(num);
			
		}
	}
	
}
