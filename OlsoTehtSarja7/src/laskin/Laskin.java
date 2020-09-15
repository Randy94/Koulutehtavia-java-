package laskin;

public class Laskin {

    private double tulos;  	// Muuttuja tulokselle

    public void nollaa() {  // Nollaa tulosmuuttuja
        tulos = 0;
    }

    public double annaTulos() {
        return tulos;
    }

    public void lisaa(int n) {
        tulos = tulos + n;
    }

    public void vahenna(int n) {
        tulos = tulos - n;
    }

    public void kerro(int n) {
        tulos = tulos * n;
    }

    public void jaa(int n) {
    	if (n==0) throw new ArithmeticException("Nollalla ei voi jakaa");
        tulos = tulos / n;
    }

    public void nelio(double d) {
        tulos = d * d;
    }

    public void neliojuuri(int n) {
    	if (n < 0 ) throw new ArithmeticException("Negatiivisesta luvusta ei voi ottaa neli�juurta");
    	tulos = (int) Math.sqrt(n);
    }
    public void virtaON() {
        // T�h�n voisi laittaa muutkin alkutoimet
        tulos = 0;
    }

    public void virtaOFF() {
       // t�h�n voisi laittaa lopputoimet
    }

}

