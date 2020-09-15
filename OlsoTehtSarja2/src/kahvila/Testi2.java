package kahvila;

import java.util.Scanner;

public class Testi2 {

	
	public static void main(String[] args) {
		
		Valikoima valikoima = new Valikoima();
		
		Kahvila Pizzarax = new Kahvila(valikoima);
		
		Scanner kysely = new Scanner(System.in);
		
		int decision;
		
		boolean lopetus = true;
		
		Tuote pizza = new Tuote("Pizza",2);
		
		Tuote kahvi = new Tuote("Kahvi",1.20);
		
		Tuote Kokis = new Tuote("Kokis",1.40);
		
		valikoima.lisääTuoteValikoimaan(pizza);
		valikoima.lisääTuoteValikoimaan(kahvi);
		valikoima.lisääTuoteValikoimaan(Kokis);
		
		System.out.println("1. Lisää tuote valikoimaan");
		System.out.println("2. Tulosta valikoima");
		System.out.println("3. Poista tuote");
		System.out.println("4. Kirjaa tilaus");
		System.out.println("5. Tulosta kaikki");
		System.out.println("0. Lopetus");
		
		while(lopetus) {
			System.out.println("Mitä tahdot tehdä?");
			decision = kysely.nextInt();			
			switch(decision) {
				
				case 1:
					
					System.out.println("Valitse tuote jonka haluat lisätä");
					String nimi = kysely.next();
					
					System.out.println("Paljonko tuote maksaa?");
					double hinta = kysely.nextDouble();
					
					Tuote tuote = new Tuote(nimi,hinta);
					valikoima.lisääTuoteValikoimaan(tuote);
					break;
					
				case 2:
					
					valikoima.tulostaTuotteet();
					break;
					
				case 3:
					
					System.out.println("Anna poistettavan tuotteen tuotenumero");
					int i = kysely.nextInt();
					valikoima.poistaTuoteValikoimasta(i);
					break;
				
				case 4:
					
					System.out.println("Anna tilaamasi tuotteen tuotenumero");
					int x = kysely.nextInt();
					
					System.out.println("Anna tilauksen tuotteiden määrä");
					int y = kysely.nextInt();
					Tilaus tilaus = new Tilaus();
					Tilausrivi tilausrivi = new Tilausrivi(valikoima, x, y);
					tilaus.lisääRiviTilaukseen(tilausrivi);
					Pizzarax.lisääTilaus(tilaus);
					break;
					
				case 5: 
					
					Pizzarax.tulostaTilaukset();
					
					break;
					
				case 0:
					
					lopetus = false;
					break;
					
				default: 
					
					System.out.println("Valintasi aiheutti virheen, yritä uudelleen!");
					break;
				}
			}
		}		
	}	

