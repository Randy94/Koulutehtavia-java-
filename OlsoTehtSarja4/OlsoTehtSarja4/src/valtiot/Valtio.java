package valtiot;

/**
* @author Amir Dahina 29.1.2020
*/

public class Valtio implements java.io.Serializable {
	
	private static final long serialVersionUID = 1L;
	// Selvitä itsellesi www-haulla mikä on ylläolevan merkitys/tarve
		
	private String nimi;
	private String pääkaupunki;
	private int asukasluku;
	
	Valtio(String nimi,String pääkaupunki,int asukasluku){
		this.nimi = nimi;
		this.pääkaupunki = pääkaupunki;
		this.asukasluku = asukasluku;
		
	}
	// Lisää getterit ja setterit
	public void setNimi(String nimi) {
		this.nimi = nimi;
	}
	public String getNimi() {
		return nimi;
	}
	public void setPääkaupunki(String pääkaupunki) {
		this.pääkaupunki = pääkaupunki;
	}
	public String getPääkaupunki() {
		return pääkaupunki;
	}
	public void setAsukasluku(int asukasluku) {
		this.asukasluku = asukasluku;
	}
	public int getAsukasluku() {
		return asukasluku;
	}
	// Lisää toString()
	@Override
	public String toString() {
		return String.format("%-10s %-10s %-10d", nimi, pääkaupunki, asukasluku);
	}
	// Saat tiedot sarakkeittain String-luokan staattisella format-metodilla
	// esim. String.format("%-10s %-10s %-10d", nimi, pääkaupunki, asukasluku);
	
}
