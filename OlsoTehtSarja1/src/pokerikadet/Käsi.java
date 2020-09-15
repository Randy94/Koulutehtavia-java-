package pokerikadet;
/**
*
* @author Amir Dahina 17.1.2020
*/
import java.util.Arrays;

public class Käsi {
	
    final static int EIVÄRI = 0, EISUORA = 0, SUORA = 1, VÄRI = 2, VÄRISUORA = 3;
    // Näiden näkyvyys: pakkauksen sisällä (ei private, ei public)
    // Viittaus muista luokista muodossa Luokka.tunnus esim. Käsi.SUORA
     
    // Esittele instanssimuuttujat
       private Kortti[] kädessä;
       
       
    // Kirjoita konstruktori, joka saa parametrina Pakka-olion
    public Käsi(Pakka pakka){
	 	kädessä = new Kortti[5];
	 	for(int i = 0; i< 5; i++) {
		 kädessä[i] =  pakka.annaKortti();
		 		 
	 }
	
}
    // Kirjoita toteutus metodille annaArvo()
        int annaArvo() { 
        int laskuri = 0;	
        int ekaKortti = kädessä[0].getMaa();
    	for(int i = 0; i < 5; i++) {    	
    		if(kädessä[i].getMaa() == ekaKortti) {
    			laskuri++;
    		}
    		
    	}
    	if(laskuri == 5) {
    		return 2;
    		
    	}
      	return 0;
    }
    // Kirjoita toString()
    @Override
    public String toString() {
    	String Korttisailio = "";
    	for(int x = 0; x < 5; x++) {
    		Korttisailio = kädessä[x].toString();
    		
    	}
    	return Korttisailio;
    }
}
