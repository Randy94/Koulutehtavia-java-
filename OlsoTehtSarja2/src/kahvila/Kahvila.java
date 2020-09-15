package kahvila;

import java.util.ArrayList;

/**
 *
 * @author Oma Nimesi
 */
public class Kahvila {

    // Esittele instanssimuuttuja valikoiman ja tilausten tallettamiseksi (ArrayList)
	ArrayList<Tilaus> tilaukset = new ArrayList<>();
	Valikoima valikoima;
    // Ohjelmoi yhden parametrin konstruktori
	public Kahvila(Valikoima valikoima) {
		this.valikoima = valikoima;
	}
    // Ohjelmoi lisääTilaus()
	public void lisääTilaus(Tilaus tilaus) {
		tilaukset.add(tilaus);
	}
    // Ohjelmoi tulostaTilaukset()
	public void tulostaTilaukset() {
		for(Tilaus t: tilaukset) {
			t.tulostaRivit();
		}
	}
}
