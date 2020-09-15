package kahvila;

/**
 *
 * @author Oma Nimesi
 */
public class Testi {

    public static void main(String[] args) {

    // Esittele tarvittavat muuttujat.
    Valikoima ruoka = new Valikoima();
    Kahvila neste = new Kahvila(ruoka);  
    // Luo kolme tuotetta.
    Tuote tuote = new Tuote("munkki", 2);
    Tuote toinentuote = new Tuote("Redbull",3);
    Tuote kolmastuote = new Tuote("lasagne",7);	
    // Lisää ne valikoimaa
    ruoka.lisääTuoteValikoimaan(tuote);
    ruoka.lisääTuoteValikoimaan(toinentuote);
    ruoka.lisääTuoteValikoimaan(kolmastuote);
    // Tulosta valikoima.
    ruoka.tulostaTuotteet();
    // Poista siitä yksi tuote.
    ruoka.poistaTuoteValikoimasta(2);
    // Tulosta muuttunut valikoima.
    ruoka.tulostaTuotteet();
    // Luo tilaus.
    Tilaus tilausyks = new Tilaus();
    // Luo kaksi tilausriviä.
    Tilausrivi riviyks = new Tilausrivi(ruoka,1,3);
    Tilausrivi rivikaks = new Tilausrivi(ruoka,3,2);
    // Lisää tilausrivit tilaukseen.
    tilausyks.lisääRiviTilaukseen(riviyks);
    tilausyks.lisääRiviTilaukseen(rivikaks);
    // Lisää tilaus kahvilan tilauslistaan.
    neste.lisääTilaus(tilausyks);
    // Luo toinenkin tilaus tilausriveineen.
    
    // Tulosta kaikki kahvilan tilaukset.
    neste.tulostaTilaukset();
    }
}
