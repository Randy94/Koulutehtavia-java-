
package sharedXY;

/**
* @author Amir Dahina
*/

public class SharedXY {
	private int x;
	private int y;

	// Kirjoita konstruktori, joka asettaa muuttujille alkuarvot
	public SharedXY(int x, int y) {
		this.x = 4;
		this.y = 6;
		
	}
	// Kirjoita metodi swap(), joka vaihtaa arvot keskenään
	 public void swap() {
		 x = y + -x + (y = x);	 
		 System.out.println("x arvo on:" + x + " y arvo on:" + y);
		 
		 
		 
	 }
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
}

