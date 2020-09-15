package kahvila;
import java.util.ArrayList;
/**
 *
 * @author Amir Dahina
 */
public class Valikoima{

    // Esittele ArrayList tuotteiden tallettamiseksi
       ArrayList<Tuote> tuotteet = new ArrayList<Tuote>();

       // Ohjelmoi getTuote()
       public Tuote getTuote(int tuotenumero) {
		for(Tuote t: tuotteet ) {
			if(t.getTuotenumero() == tuotenumero ) {
				return t;
			}
			
		}
			return null;				
	}
             
    // Ohjelmoi lisääTuoteValikoimaan()
       public void lisääTuoteValikoimaan(Tuote tuote) {
       tuotteet.add(tuote);
       
       }
       
    // Ohjelmoi poistaTuoteValikoimasta()
    // Poistettava Tuote-olio pitää etsiä listasta tuotenumerolla,
    // koska poistojen jälkeen tuotenumero != listan indeksi!
       public void poistaTuoteValikoimasta(int tuotenumero) { 
       for(Tuote t: tuotteet){
    	   if(t.getTuotenumero() == tuotenumero) {
    		   tuotteet.remove(t);        
    	   }
    	   
    	 }
       
       }

    // Ohjelmoi tulostaTuotteet()
      public void tulostaTuotteet() {
	  for(Tuote t: tuotteet) {
		  System.out.println(t.toString());
		  
	  	}
	  
     }
      
  }