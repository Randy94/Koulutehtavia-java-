package saikeet;

/**
* @author Amir Dahina
*/

public class LuuppaavaSaie extends Thread {

	// Pakkaustason näkyvyys
    int pyydetytKierrokset;
    int kierretytKierrokset;

	// Kirjoita parametrillinen konstruktori, joka asettaa pyydetyt kierrokset
	public LuuppaavaSaie(int pyydetytKierrokset) {
		this.pyydetytKierrokset = pyydetytKierrokset;
	}
	// Kirjoita getteri kierretyille kierroksille

	public int getKierretytKierrokset() {
		return kierretytKierrokset;
	}

	public void setKierretytKierrokset(int kierretytKierrokset) {
		this.kierretytKierrokset = kierretytKierrokset;
	}
	
	// Kirjoita metodi run(), jossa säie kiertää toistossa pyydetyt kierrokset 
	public void run() {
		while(kierretytKierrokset != pyydetytKierrokset) {
			kierretytKierrokset++;
			System.out.println( kierretytKierrokset);
		}
		
	}
	// kertaa siten, että kierrettyjen kierrosten loppuarvoksi jää toiston päätyttyä 
	// kierretyt kierrokset. Sen tulee olla lopuksi siis sama kuin pyydetyt kierrokset. 
	// Tulosta jokaisella kierroksella kierroksen numero. 
}
