
public class testMethod extends Person {

	public static void main(String[] args) {
		
	//Testing some methods for my school assignment. I find it easier to make seperate classes and mimic the task
	// to see if my solutions function as intended.
		
		// table with name, and statusnum
		Person[] tab = new Person[6];
		tab[0] = new Person("Ty", 0);
		tab[1] = new Person("Chris", 0);
		tab[2] = new Person("Linda", 0);
		tab[3] = new Person("Lisa", 0);
		tab[4] = new Person("Siri", 0);
		tab[5] = new Person("Spencer", 0);
		
		// Finds a partner for a person and gives eachother the index of the partner.
		String name = "Linda";
		for (int i = 0; i < tab.length; i++) {
			if (name.equals(tab[i].getName())) {
				Person current = tab[i];
				Person second = tab[i + 1];
				if (current.getPartnerStatus() == 0 && second.getPartnerStatus() == 0) {
					current.setPartnerStatus(i + 1);
					second.setPartnerStatus(i);
					System.out.println("Orignial name: " + current.getName());
					System.out.println("Partner name: " + second.getName());
					System.out.println("Original partner updated status: " + current.getPartnerStatus());
					System.out.println("New partner updated status: " + second.getPartnerStatus());
					break;
				}
			}
		}
		// resets the indexes if you no longer would like them to be partnered.
		System.out.println("##################################");
		for(int i = 0; i < tab.length; i++) {
			if(tab[i].getName().equals(name)) {
				Person target = tab[i];
				target.setPartnerStatus(-1);
				Person targetPartner = tab[i+1];
				targetPartner.setPartnerStatus(-1);
				System.out.println(target.getPartnerStatus());
				System.out.println(targetPartner.getPartnerStatus());
				System.out.println("Members are no longer linked...");
				System.out.println("### ALL DONE ###");
			}
		}

	}

}
