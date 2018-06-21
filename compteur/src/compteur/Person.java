package compteur;

public class Person {
	//instance fields

	private String prenom;
	//methods
	
	public void ajouter(Person p) {			
	}

	//constructors
		
	public Person(String prenom) {
		this.prenom=prenom;
	}
		
	public Person() {
	}
			
	//accessors
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
