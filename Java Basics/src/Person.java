
public class Person {
	String name;
	int partnerStatus= -1;
	
	public Person() {
		
	}
	
	public Person(String name, int partnerStatus) {
		this.name = name; 
		this.partnerStatus = partnerStatus;
	}
	
	public void setName(String n) {
		this.name = n;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPartnerStatus(int i) {
		this.partnerStatus = i;
	}
	
	public int getPartnerStatus() {
		return partnerStatus;
	}
}
