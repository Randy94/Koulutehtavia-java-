
import saikeet.Kilpajuoksija;

/**
* @author Amir Dahina
*/

public class KilpailuMain {

	public static void main(String[] args) {
		// Luo taulukko
		Kilpajuoksija Kilpajuoksija;
		Thread[] taulukko = new Thread[10];
		// Luo juoksijasäikeet
		for(int i = 0; i<= 8; i++) {
			Kilpajuoksija = new Kilpajuoksija();
			taulukko[i] = Kilpajuoksija;
			
		}
		// Pistä poppoo juoksemaan
		for(int i = 0; i<= taulukko.length; i++) {
			taulukko[i].start();
			
		}
		// Odota, että kaikki juoksijasäikeet lopettavat
		for(int i = 0; i<= taulukko.length; i++) {
			try {
				taulukko[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		System.out.println("Kilpailu on ohi, onnea voittajalle.");
	}
}
