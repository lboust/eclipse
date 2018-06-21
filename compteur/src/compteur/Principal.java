package compteur;

public class Principal {

	public static void main(String[] args) {

		int compteur = 0;
		
		for(;;) {
			if (compteur==1000) {
				compteur=0;
			} else {
				compteur++;
			}
			System.out.println(compteur);
		}

	}

}
