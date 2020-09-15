import saikeet.OmaSaie;

/**
 * @author Amir Dahina
 */

public class OmaSaieMain {

	// Säiettä testaava pääohjelma
	public static void main(String[] args) throws InterruptedException {
		OmaSaie saie;
		System.out.println("Säiepääohjelma");

		// Luo OmaSaie alkuarvolla 15
		OmaSaie saieyks = new OmaSaie(15);
		// Tulosta alkuarvot
		
		System.out.println("Alkuarvot ovat " + saieyks.getLuku() + ", " + OmaSaie.getYhteisetAjokerrat());
		
		// Käynnistä säie
		saieyks.start();
		// Odota säikeen päättymistä
		saieyks.join();
		// Tulosta uudet arvot
		System.out.println("Uudet arvot ovat " + saieyks.getLuku() + ", " + OmaSaie.getYhteisetAjokerrat());

		// Luo uusi OmaSaie alkuarvolla 2017
		OmaSaie saiekaks = new OmaSaie(2017);
		// Tulosta alkuarvot
		System.out.println("Alkuarvot ovat " + saiekaks.getLuku() + ", " + OmaSaie.getYhteisetAjokerrat());

		// Käynnistä säie
		saiekaks.start();
		// Odota säikeen päättymistä
		saiekaks.join();
		// Tulosta uudet arvot
		System.out.println("Uudet arvot ovat " + saiekaks.getLuku() + ", " + OmaSaie.getYhteisetAjokerrat());

	}

}
