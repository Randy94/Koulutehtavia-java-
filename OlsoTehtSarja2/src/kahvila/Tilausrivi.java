package kahvila;

/**
 *
 * @author Oma Nimesi
 */
public class Tilausrivi  {

    // Esittele instanssimuuttujat
       private int kappalemäärä;
       private Tuote tuote;
    // Ohjelmoi kolmen parametrin konstruktori 
       public Tilausrivi(Valikoima valikoima,int tuotenumero , int määrä) {
    	   this.tuote = valikoima.getTuote(tuotenumero); 
    	   this.kappalemäärä = määrä;
       }
    // Ohjelmoi tulosta()
       public void tulosta() {        	
        	System.out.println(tuote.toString());
        }  
    // Ohjelmoi annaSumma() 
       public double annaSumma() {
       return this.tuote.getHinta() * this.kappalemäärä;            
       }
	}    
