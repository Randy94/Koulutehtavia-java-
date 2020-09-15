package suorakulmiot;

public class Testi2 {
	
	public static void main(String[] args) {
	   

	    	Kuvio kulmio = new NaytonSuorakulmio(225,120,800,30);
	    	System.out.println(kulmio.toString());
	    	((NaytonSuorakulmio) kulmio).mahtuu(1024,768);
	    	Suorakulmio tokakulmio = new Suorakulmio(80,40);
	    	System.out.println(tokakulmio.toString() + ",  Pinta-Ala:" + tokakulmio.ala());
	    	

}
	}
