package valtiot;

/**
* @author lAmir Dahina 29.1.2020
*/

import java.util.HashMap;
import java.util.Scanner;

public class Valtiotesti {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		// Valtioiden käsittelyssä tarvittavat muuttujat ja
		// HashMap-olio Valtio-olioiden tallentamiseksi
		Valtio valtio;
		String nimi = null;
		String pääkaupunki = null;
		int asukasluku = 0;
		HashMap<String, Valtio> valtiot = new HashMap<>();
		final String TIEDOSTONIMI = "valtiot.dat";
		boolean onnistui = false;
		Scanner näppis = new Scanner(System.in);
		

		/*
		 * Jos tiedosto on olemassa, lue HashMap sieltä valtiot =
		 * TiedostonKäsittely.lueTiedosto(TIEDOSTONIMI); if (valtiot == null) { valtiot
		 * = new HashMap<>(); }
		 */
		//String nimi;
		// Lisää valtioita HashMapiin, kunnes syötteenä annetaan tyhjä
		do {
			valtiot = TiedostonKäsittely.lueTiedosto(TIEDOSTONIMI);
			if (valtiot == null) {
				valtiot = new HashMap<>();
			}
			valtiot.put(nimi, new Valtio(nimi, pääkaupunki, asukasluku));

		} while (nimi.length() != 0);

		// Tulosta HashMapin sisältö, käytä for-each- rakennetta
		System.out.println("HashMapissa nyt seuraavat valtiot:");
		for (String va : valtiot.keySet()) {
			try {
				System.out.println(valtiot.get(va));
			} catch (Exception e) {
				System.out.println("Jotain meni pieleen.");
				System.out.println(e);
			}

			// Kirjoita HashMap tiedostoon
			TiedostonKäsittely.kirjoitaTiedosto(TIEDOSTONIMI, valtiot);

		}
		näppis.close();
	}
}
