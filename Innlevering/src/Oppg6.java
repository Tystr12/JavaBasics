import java.math.BigDecimal;
import java.util.Scanner;

public class Oppg6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double skatt1 = 0.0093;
		double skatt2 = 0.0241;
		double skatt3 = 0.1152;
		double skatt4 = 0.1452;
		
		System.out.println("Skriv inn bruttoinntekt: ");
		double bruttoinntekt = scan.nextDouble();
		
		if (bruttoinntekt <= 164100) {
			System.out.println("Ingen trekk");
		} if (bruttoinntekt >= 164100 && bruttoinntekt <= 230950) {
			double etterskatt = bruttoinntekt * skatt1;
			System.out.println(etterskatt + "Trinn 2");
			
			
		} if (bruttoinntekt >= 230951 && bruttoinntekt <= 580650) {
			double etterskatt2 = bruttoinntekt * skatt2;
			System.out.println(etterskatt2 + " " + "Trinn 2");
			
			
		} if (bruttoinntekt >= 580651 && bruttoinntekt <= 934050) {
			double etterskatt3 = bruttoinntekt * skatt3;
			System.out.println(etterskatt3 + " " + "Trinn 3");
		} if (bruttoinntekt >= 934051) {
			double etterskatt4 = bruttoinntekt * skatt4;
			System.out.println(etterskatt4 + " " + "Trinn 4 ");

		}
		
	}

}
