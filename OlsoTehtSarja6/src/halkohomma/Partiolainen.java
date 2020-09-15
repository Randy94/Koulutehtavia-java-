


package halkohomma;

/**
* @author Amir Dahina
*/

public class Partiolainen extends Thread{
	Halkovarasto halkovarasto;
	 int halko;
	 
	 public Partiolainen(Halkovarasto halkovarasto, int halko) {
		 this.halko = halko;
		 this.halkovarasto = halkovarasto;
		 
		 
	 }
	 
	 
	 public void run() {		 		 
			 halko = (int) ((Math.random() * (10 - 1 + 1)) + 1);
			try {
				halkovarasto.otaHalkoja(halko);
			} catch (InterruptedException e) {
				System.out.println("Virhe tapahtunut");
				e.printStackTrace();
			
		 }
		 
		 
	 }
	 
}
