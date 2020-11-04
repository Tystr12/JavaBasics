import javax.swing.JOptionPane;

public class Log {

	public static void main(String[] args) {
				
				String brukernavn = JOptionPane.showInputDialog("Brukernavn :");

				String passord = JOptionPane.showInputDialog("Passord :");
				
				String korrektB = "Ty";
				String korrektP = "ja";

				System.out.println(brukernavn);
				System.out.println(passord);
				
				if (brukernavn.equals(korrektB) && (passord.equals(korrektP))) {
					System.out.println("korrekt info");
				} else {
					System.out.println("ikke korrekt");
				}
				
			}

		}


