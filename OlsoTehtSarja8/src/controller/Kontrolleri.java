package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import model.Noppa;
// Amir Dahina 12.2.2020
public class Kontrolleri {
 
    Noppa noppa;
 
    int[] luku = new int[5];
    int summa = 0;
    int heittojenlkm;
    int tulos;
 
    private Label text;
 
    public Kontrolleri(Label text, Noppa noppa) {
 
        this.text = text;
        this.noppa = noppa;
    }
 
    public String heitÃ¤ViisiNoppaa(int[] luku, int summa) {
        int i;
        for (i = 0; i < 5; i++) {
            luku[i] = noppa.heitanoppaa();
            summa += luku[i];
        }
        return luku[0] + ", " + luku[1] + ", " + luku[2] + ", " + luku[3] + ", " + luku[4]
                + ". Summa on " + summa;
    }
 
    public int getViidenNopanHeittojenLkm(int heittojenlkm) {
        return heittojenlkm = noppa.getHeittojenLkm() / 5;
    }
 
    public String getKruunaKlaava() {
        tulos = noppa.heitakolikko();
        if (tulos == 1) {
            return "Kruuna";
        } else {
            return "Klaava";
        }
 
    }
 
    public void heitetty1(ActionEvent e) {
 
        text.setText("Tulos: " + heitÃ¤ViisiNoppaa(luku, summa) + "  Heitto kertoja: "
                + getViidenNopanHeittojenLkm(heittojenlkm));
    }
 
    public void heitetty2(ActionEvent e) {
 
        text.setText("Tulos: " + noppa.heitakolikko() + " Heitto kertoja: " + noppa.getHeittojenLkm());
    }
 
    public void kolikonheitto(ActionEvent e) {
 
        text.setText(getKruunaKlaava());
    }
}
