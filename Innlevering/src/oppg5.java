import java.util.Scanner;

public class oppg5 {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Skriv inn tre tall: ");
		 int a = scan.nextInt();
		 int b = scan.nextInt();
		 int c = scan.nextInt();
		 
		 int lowest1 = Math.min(a, b);
		 int lowestReal = Math.min(lowest1, c);
				 System.out.println(lowestReal);
				 
		 int highest = Math.max(a, b);
		 int highestReal = Math.max(highest, c);
		 		
		 		
		 if (a<highestReal && a>lowestReal) {
			 System.out.println(a);
		 } if (b<highestReal && b>lowestReal) {
			 System.out.println(b);
		 } if (c<highestReal && c>lowestReal) {
			 System.out.println(c);
		 } 
		 System.out.println(highestReal);
		 
		 
		 } 
	}


