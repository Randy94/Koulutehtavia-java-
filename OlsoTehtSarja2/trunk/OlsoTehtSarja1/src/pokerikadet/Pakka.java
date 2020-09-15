package pokerikadet;
/**
*
* @author Amir Dahina 17.1.2020
*/
public class Pakka  {

    final static int KORTTILKM = 52;
    
	// Näiden näkyvyys: pakkauksen sisällä (ei private, ei public)
    // Viittaus muista luokista Luokka.tunnus, esim. Pakka.KORTTILKM
       
    // Esittele instanssimuuttujat
    	Kortti[] taulukko;
    	int vuorossa;
    // Kirjoita konstruktori, joka alustaa pakan Kortti-olioilla
       Pakka() {
    	this.taulukko = new Kortti[53];
    	int kohta = 1;
    	for (int maa = 0; maa<=3; maa++) {
    		for(int arvo = 1; arvo<=13; arvo++) {
    		Kortti kortti1 = new Kortti(maa,arvo);
    		taulukko[kohta] = kortti1;
    		kohta++;
    		}
    		
    	}
    			   
       }

    // Kirjoita metodi sekoita()
       public void sekoita() {
    	   for(int i = 0; i < 100; i++) {
    		int vaihda = (int)(Math.random()*52)+1;
    		int vaihto = (int)(Math.random()*52)+1;
    		
    		Kortti Toinenpakka = taulukko[vaihda];
    		taulukko[vaihda] = taulukko[vaihto];
            taulukko[vaihto] = Toinenpakka; 		
    	   }
    	   
       }
    // Kirjoita metodi annaKortti()
       public Kortti annaKortti() {
    	   if(vuorossa == KORTTILKM) {
    		   this.vuorossa = 0;
    		   
    	   }
    	   vuorossa++;
    	   return taulukko[vuorossa];
       }
}
