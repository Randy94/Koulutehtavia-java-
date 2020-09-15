
package sharedXY;

/**
* @author Amir Dahina
*/

public class SwappaajaMain {
	 public static void main(String args[]) {
		// Luo yhteiskäyttöinen tietorakenneolio
		SharedXY tietorakenne = new SharedXY(4,5);
		// Luo useita Swappaaja-säikeitä
		Swappaaja saieyks = new Swappaaja(tietorakenne);
		Swappaaja saiekaks = new Swappaaja(tietorakenne);
		Swappaaja saiekolme = new Swappaaja(tietorakenne);
		
		saieyks.run();
		saiekaks.run();
		saiekolme.run();
	 }
}