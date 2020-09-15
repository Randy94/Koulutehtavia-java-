

package halkohomma;

/**
* @author Amir Dahina
*/

public class Halonhakkaaja extends Thread{
	
	 Halkovarasto halkovarasto;
	 int halko;
	 int pölkky;
	 
	 public Halonhakkaaja(Halkovarasto halkovarasto, int pölkky) {
		 this.halkovarasto = halkovarasto;
		 this.pölkky = pölkky;
		 
	 }
	 
	 
	 public void run() {
		 for(int i = 0; i < pölkky; i++) {
			 halko = (int) ((Math.random() * (10 - 1 + 1)) + 1);
			try {
				halkovarasto.lisääHalkoVarastoon(halko);
			} catch (InterruptedException e) {
				System.out.println("Virhe tapahtunut");
				e.printStackTrace();
			}
		 }
		 
		 
	 }
	 
	 
}
