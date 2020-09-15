 // author Amir Dahina 
import java.util.Scanner;

import model.*;

public class TekstiMain {
	static ValuuttaAccessObject valuuttaDAO = new ValuuttaAccessObject();
	static Scanner skanneri = new Scanner(System.in);
	private static Valuutta valuutta;
	private static Valuutta[] valuutat;

	public static void listaaValuutat() {
		valuutat = valuuttaDAO.readValuutat();
		
		for(Valuutta v : valuutat) {
			System.out.println(v.getTunnus() + ", " + v.getVaihtokurssi() + ", " + v.getNimi());
		}

	}

	public static void lisääValuutta() {
	System.out.println("Anna valuutan tunnus:");	
	String tunnus = skanneri.nextLine();
	
	System.out.println("Anna vaihtokurssi:");
	double vaihtokurssi = Double.parseDouble(skanneri.nextLine());
	
	
	System.out.println("Anna valuutta:");
	String nimi = skanneri.nextLine();
	
	valuutta = new Valuutta(tunnus, vaihtokurssi , nimi);
	
	if(valuuttaDAO.createValuutta(valuutta)) {
		System.out.println("Valuutta lisätty onnistuneesti tietokantaan!");
	}else {
		System.out.println("Valuutan lisääminen epäonnistui");
		
	}
	
}
	
   
	

	public static void päivitäValuutta() {
		System.out.println("Anna päivitettävän valuutan tunnus");
		String tunnus = skanneri.nextLine().toUpperCase();
		
		valuutta = valuuttaDAO.readValuutta(tunnus);
		
		System.out.println("Mitä haluat muuttaa valuutasta " + valuutta.getNimi()  +  "nimen, vaihtokurssin, vai molemmat? (n/v/m)");
		char vastaus = skanneri.nextLine().toLowerCase().charAt(0);	
	
	
	switch (vastaus) {
	case 'n':
		System.out.println("Syötä uusi nimi:");
		valuutta.setNimi(skanneri.nextLine());
		break;
	case 'v':
		System.out.println("Syötä uusi vaihtokurssi:");
		try {
			valuutta.setVaihtokurssi(Double.parseDouble(skanneri.nextLine()));
		} catch (NumberFormatException nfe) {
			System.err.println("Syötä vain numeroita.");
		}
		break;
	case 'm':
		System.out.println("Syötä uusi nimi:");
		valuutta.setNimi(skanneri.nextLine());

		System.out.println("Syötä uusi vaihtokurssi:");
		try {
			valuutta.setVaihtokurssi(Double.parseDouble(skanneri.nextLine()));
		} catch (NumberFormatException nfe) {
			System.err.println("Syötä vain numeroita.");
		}
		break;
		
		default:
				System.out.println("Jotain meni pieleen,yritä uudestaan");
	}
	if(valuuttaDAO.updateValuutta(valuutta)) {
		System.out.println("Päivitetty!");
	}else {
		System.out.println("Datan poistaminen ei onnistunut.");
	
	}
	
}
	
	public static void poistaValuutta() {
		
		System.out.println("Anna poistettavan valuutan tunnus");
		String tunnus = skanneri.nextLine().toUpperCase();
		
		if(valuuttaDAO.deleteValuutta(tunnus)) {
			System.out.println("Data poistettu onnistuneesti!");
		}else {
			System.out.println("Datan poistaminen epäonnistui");
		}
	}

	

	public static void main(String[] args) {
		char valinta;
		final char CREATE = 'C', READ = 'R', UPDATE = 'U', DELETE = 'D', QUIT = 'Q';

		do {
			System.out.println("Lisää uusi valuutta tietokantaan. \n" 
					+ "R: Listaa tietokannassa olevien valuuttojen tiedot. \n"
					+ "U: Päivitä valuutan vaihtokurssi tietokantaan.\n"
					+ "D: Poista valuutta tietokannasta. \n"
					+ "Q: Lopetus.");
	
			
			valinta = (skanneri.nextLine().toUpperCase()).charAt(0);
			switch (valinta) {
			case CREATE:
				lisääValuutta();
				break;
			
			case READ:
				listaaValuutat();
				break;
				
			case UPDATE:
				päivitäValuutta();
				break;
				
			case DELETE:
				poistaValuutta();
				break;
			}
		} while (valinta != QUIT);
	}
}

