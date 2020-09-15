package valtiot;



/**
* @author Amir Dahina 29.1.2020
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.io.File;

public class TiedostonKäsittely {
 
	// Kirjoittaa tiedostoon yhden HashMap-olio, jossa Valtio-olioita
	public static void kirjoitaTiedosto(String tiedostoNimi, HashMap<String, Valtio> valtiot) {
		
		try {
			// Avaa FileOutputStream-tulostusvirta tiedostoon ja
			// Luo objektivirta tiedostoon kirjoittamista varten
			File tiedosto = new File(tiedostoNimi);
			FileOutputStream virta = new FileOutputStream(tiedosto);
			ObjectOutputStream valtioTiedosto = new ObjectOutputStream(virta);

			// Kirjoita HashMap objektivirtaan  
			valtioTiedosto.writeObject(valtiot);
			
			// Sulje tietovirta
			valtioTiedosto.close();
			
			System.out.println("Tiedot tallennettu (HashMap) tiedostoon " + tiedostoNimi);
		} catch (Exception ex) {
			System.out.println(tiedostoNimi + "-tiedostoon tallentaminen ei onnistunut");
		}
	}

	/* Lukee tiedostosta HashMap-olion, jossa Valtio-olioita
     * Palauttaa HashMapin null, jos listaa ei pystytä muodostamaan
	 */
	
	@SuppressWarnings("unchecked")
	public static HashMap<String, Valtio> lueTiedosto(String tiedostoNimi) {
		HashMap<String, Valtio> valtiot = new HashMap<String, Valtio>();

		try {
			// Avaa FileInputStream-lukuvirta tiedostoon ja
			// Luo objektivirta tiedostosta lukemista varten
			File file = new File(tiedostoNimi);
			FileInputStream virta = new FileInputStream(file);
			ObjectInputStream valtioTiedosto = new ObjectInputStream(virta);

			// Lue tiedoston sisältö
			valtiot = (HashMap<String, Valtio>) valtioTiedosto.readObject();
				
			// Sulje tietovirta
			valtioTiedosto.close();
			
			System.out.println("Tiedot haettu tiedostosta " + tiedostoNimi);

		} catch (FileNotFoundException ex) {
			System.out.println("Tiedostoa " + tiedostoNimi + " ei ole olemassa.");
		} catch (Exception ex) {
			System.out.println(tiedostoNimi + "-tiedostosta (HashMap) lukeminen ei onnistunut.");
		}

		return valtiot;
	}

}



