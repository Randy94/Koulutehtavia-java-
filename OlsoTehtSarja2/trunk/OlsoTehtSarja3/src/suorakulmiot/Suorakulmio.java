
package suorakulmiot;
/**
 *
 * @author Amir Dahina
 */
 
// Kirjoita tähän yleiskommentit

public class Suorakulmio implements Kuvio{

//instanssimuuttujat
	

	int korkeus,leveys,pintala;
	
//kaksiparametrinen konstruktori 
	
	  Suorakulmio(int leveys,int korkeus) {
		this.leveys = leveys;
		this.korkeus = korkeus;
		
	}
	
	public Suorakulmio() {
		
	}
	
	public int getLeveys() {
		return leveys;
	}
	public int getKorkeus() {
		return korkeus;
	}
	public void setLeveys(int leveys) {
		this.leveys = leveys;
	}
	public void setKorkeus(int korkeus) {
		this.korkeus = korkeus;
		
	}
	
	
	
	public int ala() {
		pintala = leveys * korkeus;
		return pintala;
		
	}
	
	
	public String toString() {
		
		return "leveys=" + this.leveys + ", korkeus=" + this.korkeus;
		
	}
	
	
	
	
	
	
}
