
package halkohomma;

/**
* @author Amir Dahina
*/

public class Halkovarasto {
	static int Varastokapasiteetti = 0,vapaatila,varasto;
	
	
	public Halkovarasto(int Varastokapasiteetti) {
		Halkovarasto.Varastokapasiteetti = Varastokapasiteetti;
		vapaatila = Varastokapasiteetti;
		varasto = 0;
	}


	public synchronized void lisääHalkoVarastoon(int halot) throws InterruptedException {
		
		while(vapaatila < halot || varasto + halot >= Varastokapasiteetti){wait();}
			varasto += halot;
			vapaatila -= halot;
			notifyAll();			
			System.out.println("Varastoon lisättiin:" + halot + " halkoa" + " varastossa on yhteensä " + varasto  +  " halkoa");
			
	}
	
	public synchronized void otaHalkoja(int halot) throws InterruptedException {
	while(varasto < halot) {wait();}	
		varasto -= halot;
		vapaatila += halot;
		notifyAll();
		System.out.println("Varastosta on otettu:" + halot + " halkoa" + " varastossa on yhteensä " + varasto  +  " halkoa");
	}
	 
}
