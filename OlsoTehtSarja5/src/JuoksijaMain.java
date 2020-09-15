import saikeet.Juoksija;

/**
* @author Amir Dahina
*/

public class JuoksijaMain {
	public static void main(String[] args) {

	// Luo ja käynnistä Juoksija-säie
	Juoksija saieyks = new Juoksija();
	saieyks.start();
	// Odota jonkun aikaa: Thread.sleep()
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	// Pysäytä säie
	saieyks.lopeta();
	// Hae ja tulosta juostujen kerrosten määrä
	saieyks.getKierrokset();
	}
}
