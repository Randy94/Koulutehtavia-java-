

package sharedXY;

/**
* @author Amir Dahina
*/

public class Swappaaja {
	SharedXY sharedxy; 
	int x = 0; int y = 0;
	// Kirjoita konstruktori
	 public Swappaaja(SharedXY sharedxy) {
		 this.sharedxy = sharedxy;
		 
	 }
	 
	// Kirjoita metodi run()
	 public void run() {		
		 do {
		 x = sharedxy.getX();
		 y = sharedxy.getY();
		sharedxy.swap(); 
		 
		 }while(x != y); 
			 System.out.println("x arvo on:" + x + " y arvo on:" + y);
			 System.exit(0);		 
	 
		 
	 
}
}

