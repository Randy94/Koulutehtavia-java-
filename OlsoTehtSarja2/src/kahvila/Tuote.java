package kahvila;

/**
 *
 * @author Oma Nimesi
 */
public class Tuote {

    // Esittele instanssimuuttujat
	int tuotenumero;
	String nimi;
	double hinta;
    // Esittele staattinen muuttuja seuraavan vapaan tuotenumeron ylläpitämiseksi
	static int seuraavaVapaaTuotenumero = 1;
    
    
    // Ohjelmoi kahden parametrin konstruktori
    public Tuote( String nimi , double hinta){    	
    	this.nimi = nimi;
    	this.hinta = hinta;
    	this.tuotenumero = seuraavaVapaaTuotenumero;
    	seuraavaVapaaTuotenumero++;
    }
    // Ohjelmoi getHinta()
    public double getHinta() {
    	return hinta;
    	
    }  
    // Ohjelmoi getTuotenumero()
    public int getTuotenumero() {
    	return tuotenumero;
    	
    }
    // Ohjelmoi tosString()
    public String toString() {
    	return this.tuotenumero +  " " + this.nimi  +  ", " + this.hinta +" €";
    	
    }
    // Ohjelmoi staattinen metodi alustaSeuraavaVapaaTuotenumero()
    public static void alustaSeuraavaVapaaTuotenumero() {
    	seuraavaVapaaTuotenumero = 1;	
    	
    }
}
