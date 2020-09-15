package saikeet;

/**
* @author Amir Dahina
*/

public class Juoksija extends Thread {
	volatile boolean jatkuu = true;
	long kierrokset = 0;

	// Kirjoita kierrokset-muuttujan getteri
	public long getKierrokset() {
		return kierrokset;
	}

	
	@Override
	public void run(){
		
	while(jatkuu = true) {
	kierrokset++;
	System.out.println(kierrokset);
		
	}
}



	// Kun juokseminen halutaan lopettaa, joku toinen säie kutsuu 
	// lopeta()-metodia.
	public void lopeta(){
		 jatkuu = false;
	}
}
