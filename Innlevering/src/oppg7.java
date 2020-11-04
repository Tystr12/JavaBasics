import java.util.Scanner;

public class oppg7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int poeng;
		System.out.println("Skriv inn poengsum: ");

		for (int i = 0; i < 10; i++) {
			{

				poeng = scan.nextInt();
				if (poeng < 0 || poeng > 100) {
					System.out.println("ikke gyldig verdi skriv inn på nytt!");
					poeng = scan.nextInt();
				}

				if (poeng <= 100 && poeng >= 90) {
					System.out.println("A");

				}

			}
			if (poeng <= 89 && poeng >= 80) {
				System.out.println("B");

			}
			if (poeng <= 79 && poeng >= 60) {
				System.out.println("C");

			}
			if (poeng <= 59 && poeng >= 50) {
				System.out.println("D");

			}
			if (poeng <= 49 && poeng >= 40) {
				System.out.println("E");

			}
			if (poeng <= 40 && poeng >= 0) {
				System.out.println("F");

			}

		}
		scan.close();
	}

}
