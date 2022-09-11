package com.test.komutel.model;

import java.util.Date;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String nom;
	private String adress;
	private String ville;
	private String pays;
	private String telephone;
//	@Temporal(TemporalType.DATE)
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy")
	private Date debut_contrat;
	public Contact() {
		// TODO Auto-generated constructor stub
	}
	public Contact(String nom, String adress, String ville, String pays, String telephone,
			Date debut_contrat) {
		super();
		this.id = id;
		this.nom = nom;
		this.adress = adress;
		this.ville = ville;
		this.pays = pays;
		this.telephone = telephone;
		this.debut_contrat = debut_contrat;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Date getDebut_contrat() {
		return debut_contrat;
	}
	public void setDebut_contrat(Date debut_contrat) {
		this.debut_contrat = debut_contrat;
	}

}
