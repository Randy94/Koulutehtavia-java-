package pokerikadet;
/**
*
* @author Amir Dahina 17.1.2020
*/
public class Testi {

    public static void main(String[] args) {

    	// Luo pakka
        Pakka munPakka = new Pakka();
        
    	// Sekoita pakka
        
        munPakka.sekoita();
    	// Jaa käsi
        
        Käsi munKäsi = new Käsi(munPakka);
    	// Näytä (tulosta) käsi
        
        munKäsi.toString();
    	// Tarkasta onko väri
        if(munKäsi.annaArvo() == 2) {
        System.out.print("Sait Värin");
        }
        int kierros = 0;
        
        while(true) {
           munPakka.sekoita();
           Käsi väri = new Käsi(munPakka);
           kierros++;
           
           if(väri.annaArvo()== 2) {
        	   
        	   System.out.print("Sait värin kierroksella:" + kierros);
        	   break;
           }
           
        	
        }
        
    }
}
