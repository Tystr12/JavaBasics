import javax.swing.JOptionPane;

public class oppg2 {

	public static void main(String[] args) {
		String nedreGrense = JOptionPane.showInputDialog("Skriv inn nedre grense: ");
		String �vreGrense = JOptionPane.showInputDialog("Skriv inn �vre grense: ");
		int nedreGrenseInteger = Integer.parseInt(nedreGrense);
		System.out.println(nedreGrenseInteger);
		int �vreGrenseInteger = Integer.parseInt(�vreGrense);
		System.out.println(�vreGrenseInteger);
		
		int n� = nedreGrenseInteger;
		
		while ( n� < �vreGrenseInteger) {
			if (n� % 2 != 0) {
				System.out.println("Resultat: " + n�);
			}
			n�++;
		}
		
		}
		
	}



