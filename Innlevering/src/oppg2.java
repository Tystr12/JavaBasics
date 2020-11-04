import javax.swing.JOptionPane;

public class oppg2 {

	public static void main(String[] args) {
		String nedreGrense = JOptionPane.showInputDialog("Skriv inn nedre grense: ");
		String øvreGrense = JOptionPane.showInputDialog("Skriv inn øvre grense: ");
		int nedreGrenseInteger = Integer.parseInt(nedreGrense);
		System.out.println(nedreGrenseInteger);
		int øvreGrenseInteger = Integer.parseInt(øvreGrense);
		System.out.println(øvreGrenseInteger);
		
		int nå = nedreGrenseInteger;
		
		while ( nå < øvreGrenseInteger) {
			if (nå % 2 != 0) {
				System.out.println("Resultat: " + nå);
			}
			nå++;
		}
		
		}
		
	}



