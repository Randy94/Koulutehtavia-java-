package kahvila;

import java.util.ArrayList;

/**
 *
 * @author Oma Nimesi
 */
public class Tilaus {

    // Esittele ArrayList tilausrivien tallettamiseksi
	ArrayList<Tilausrivi> tilausrivit = new ArrayList<Tilausrivi>();
    // Ohjelmoi lisääRiviTilaukseen()
    public void lisääRiviTilaukseen(Tilausrivi tilausrivi) {
    tilausrivit.add(tilausrivi);
    }	
    	
    
    // Ohjelmoi tulostaRivit()
    public void tulostaRivit() {    	
     	 for(Tilausrivi t: tilausrivit)  {
     		t.tulosta();
     	 } 
     }
    	
    
    // Ohjelmoi annaLoppusumma()
    public double annaLoppusumma() {
    double summa = 0;
    for(Tilausrivi t: tilausrivit) {
     	 summa += t.annaSumma();
    }
	return summa;	
    	
    }
}
