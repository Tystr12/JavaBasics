
public class ForLoops {

	public static void main(String[] args) {
// repeat a certain code over and over again
		for(int i = 0; i<4; i++) {
			System.out.println("I love cats!");
		}
//repeat code with special variable i
		for(int i = 0; i < 15; i++) {
			System.out.println(i);
		}
// repeat code to print out the contents of an Array
		int[] grades = {98,100,83,90,93};
		
		for(int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		
	}

}
