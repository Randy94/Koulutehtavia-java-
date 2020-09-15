
package suorakulmiot;
/**
 *
 * @author Amir Dahina
 */

// Kirjoita tähän yleiskommentit

public class Testi {

    public static void main(String[] args) {

    // Kirjoita tähän testaamisessa tarvitsemasi lauseet

    	NaytonSuorakulmio kulmio = new NaytonSuorakulmio(225,120,800,30);
    	System.out.println(kulmio.toString());
    	kulmio.mahtuu(1024,768);
    	Suorakulmio tokakulmio = new Suorakulmio(80,40);
    	System.out.println(tokakulmio.toString() + ",  Pinta-Ala:" + tokakulmio.ala());
    	
    }
}
