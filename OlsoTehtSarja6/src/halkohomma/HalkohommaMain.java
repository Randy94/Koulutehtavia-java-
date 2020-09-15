package halkohomma;

/**
* @author Amir Dahina
*/

public class HalkohommaMain { 
	public static void main(String args[]) {
	
	// Luo Halkovarasto
		Halkovarasto varasto1 = new Halkovarasto(50);
	// Luo useita Halonhakkaaja-säikeitä
		for(int i = 0; i < 5; i++) {
			Halonhakkaaja metsuri = new Halonhakkaaja(varasto1,50);
			metsuri.start();
		}
	// Luo useita Partiolainen säikeitä
		for(int i = 0; i < 5; i++) {
			Partiolainen Pekka = new Partiolainen(varasto1,30);
			 Pekka.start();
		}

	}
}