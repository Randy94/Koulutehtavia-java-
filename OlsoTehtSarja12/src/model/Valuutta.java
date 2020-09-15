package model;

import javax.persistence.*;



/**
 * @author Amir Dahina
 */
@Entity
@Table(name="valuutta")
public class Valuutta {
	
	@Id
	@Column(name ="Id")
	private String Id;
	
	@Column(name ="vaihtokurssi")
	private double vaihtokurssi;
	
	@Column(name ="nimi")
	private String nimi;
	
	public Valuutta() {
		super();
	}
	
	public Valuutta(String tunnus,double vaihtokurssi,String nimi) {
		
		
		this.Id = tunnus;
		this.vaihtokurssi = vaihtokurssi;
		this.nimi = nimi;	
	}

	public String getTunnus() {
		return Id;
	}

	public void setTunnus(String tunnus) {
		this.Id = tunnus;
	}

	public double getVaihtokurssi() {
		return vaihtokurssi;
	}

	public void setVaihtokurssi(double vaihtokurssi) {
		this.vaihtokurssi = vaihtokurssi;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	} 
	
	
	
	
	
}
