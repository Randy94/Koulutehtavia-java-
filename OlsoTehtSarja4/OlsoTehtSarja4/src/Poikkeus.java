
import java.util.Scanner;

/**
* @author Amir Dahina 30.1.2020
*/

public class Poikkeus {

	public static void main(String[] args) {

	    System.out.println("Tehtävä 1: Poikkeuksen testaaminen");
	    	
		// Esittele tarvittavat muuttujat
	    String stringikä;
	    int ikä;
	    Scanner lukija = new Scanner(System.in);
	    boolean testaus = false;
	    
	    
		do {
	    // Ohjelmoi try-catch-lohko 	    
		try{
		    // Kysy ikä ja lue se merkkijonomuuttujaan
			System.out.println("Minkä ikäinen olet?");
			stringikä = lukija.nextLine();		
		    // Tee muunnos  
			ikä = Integer.parseInt(stringikä);
			ikä += 1;
			// - jos muunnos onnistuu, näytä tulos ja lopeta
			System.out.println("Vuoden päästä olet jo " + ikä+ "-vuotias.");
		    testaus = true;
		
		}catch(Exception e) {
			// - jos syntyy poikkeus, anna virheilmoitus
			System.out.println("Jotain meni pieleen.");
		}
		

		}while (!testaus);
		// Poikkeustilanteessa ikää on kysyttävä vielä uudelleen, 
		// joten tarvitset kaiken ympärille vielä toistorakenteen
		lukija.close();
	}
}

