package saikeet;



/**
* @author Amir Dahina
*/

public class Kilpajuoksija extends Thread {
	private int numero; 				// juoksijan numero
	public static int seuraavaNumero=1;	// luokkamuuttuja juoksijoiden numeroimiseksi
	int max = 9;
	int min = 7;
	private final int MATKA = 400; 		// juostava matka, tässä vakio
	private double aika; 				// sekunteina

	
	 public Kilpajuoksija(){
		this.numero = seuraavaNumero;
		seuraavaNumero++;
	}
	
	
	@Override
	public void run(){
		int juoksumatka = 0;
		
				do {				
			try{
				
				double juoksuaika = (Math.random() * (max - min + 1)) + min;
				
				double result = 10/juoksuaika;
				
				
			    Thread.sleep((int)result);
			    aika += result;
			    juoksumatka += 10;
			     
			    		    
			    if(juoksumatka % 50 == 0) {
			    	System.out.println("Juoksijan numero on:" + numero + " Juostu matka on:" + juoksumatka + " metriä " + aika + " sekunnissa");
			    }
			 }catch(Exception e){
					System.out.println("Virhe");}
			
				}while(juoksumatka <= MATKA); 
						    
			}
			

	// Ohjelmoi toisto, jossa
	// - käytät satunnaislukugenerattoria 10 metrin juoksuajan saamiseksi
	// - odotat ko. ajan
	// - tulostat väliaikatieto 50 metrin välein	
	

	public double getAika(){
		return aika; 
	}
}
