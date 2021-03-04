
public class eks {
	
	public static void main(String[] args) {
		
		// log will equal 5 becuase of the do while loop. if it was a while loop, the outcome would be 4.
		int log = 0;
		int tall = 1;
		do {
			tall = 2 * tall;
			log++;
		} while (tall < 21);
		
		System.out.println(log);
		// nested loop in java. The outer loop length dictates when the inner loop is finished running.
		// so here the outer loop can be run two times because of i = 1 and i <=2
		// when it is run once, the inner loop performs until it is finished.
		// So on the first run of the nested loop we get this outcome - 1315.
		// since the second loop isnt done, we go again this time the outcome is 2325
		// the inner loop gets run again because the outer loop dictates when the loop is done.
		
		for(int i = 1; i <= 2; i++) {
			for (int j = 3; j < 7; j = j + 2) {
				System.out.print(i);
				System.out.print(j);
			}
		}
		
		System.out.println("-------------------------------------------");
		
		// Normal for loops
		String[] listOfNames = {"Ty", "Linda", "Chris", "Spencer", "Siri"};
		
		for (int i = 0; i < listOfNames.length; i++) {
			System.out.println(listOfNames[i]);
		}
		
		System.out.println("-------------------------------------------");
		
		// Enhanced for loop. Simpler to write and easier to read.
		for(String name : listOfNames) {
			System.out.println(name);
		}
		
	}
}
