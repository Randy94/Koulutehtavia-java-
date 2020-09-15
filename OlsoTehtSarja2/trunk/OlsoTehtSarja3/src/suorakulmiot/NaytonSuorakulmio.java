
package suorakulmiot;
/**
 *
 * @author Amir Dahina
 */

// Kirjoita tähän yleiskommentit

public class NaytonSuorakulmio extends Suorakulmio {

private int xcoord,ycoord;

	NaytonSuorakulmio(int xcoord, int ycoord,int leveys , int korkeus){
	
		this.xcoord = xcoord;
		this.ycoord = ycoord;	
		super.setLeveys(leveys);
		super.setKorkeus(korkeus);
					
}	
	public boolean mahtuu(int leveys, int korkeus) {
		if((xcoord + super.getLeveys()) <= leveys  && (ycoord + super.getKorkeus() ) <= korkeus ) {
			return true;
			
		}
		 return false;
		
		
	}
	
	@Override
		public String toString() {
			
			return "x=" + xcoord + ", y=" + ycoord + ", " + super.toString();
		}
	
	
}
