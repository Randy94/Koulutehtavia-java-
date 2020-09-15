package controller;

import model.Valuuttakone;
import view.ValuuttakoneenGUI;

public class ValuuttakoneenOhjain implements IValuuttakoneenOhjain {
	
	Valuuttakone valuuttakone;
	ValuuttakoneenGUI gui;
	
	
	
	public ValuuttakoneenOhjain(Valuuttakone valuuttakone, ValuuttakoneenGUI gui) {
		this.valuuttakone = valuuttakone;
		this.gui = gui;
		
	}
	
	

	@Override
	public void muunnos() {
		// TODO Auto-generated method stub
		int lahtoindeksi = gui.getLähtöIndeksi();
		int kohdeindeksi = gui.getKohdeIndeksi();
		double maara = gui.getMäärä();
		double muunto = valuuttakone.muunna(lahtoindeksi, kohdeindeksi, maara);
		gui.setTulos(muunto);
		
	}

	@Override
	public String[] getValuutat() {
		// TODO Auto-generated method stub
		String[] valuutat = valuuttakone.getVaihtoehdot();
		return valuutat;
	}

}
