package sn.simplon.transfert_argent.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Emetteur implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_emetteur;
	private String  nom_emetteur;
	private String prenom_emetteur;
	private int tel_emetteur;
	private int cin;
	
	@OneToMany(mappedBy = "emetteur")
	private List<Envoie> emetteurs = new ArrayList<Envoie>();
	@OneToMany(mappedBy = "recepteur")
	private List<Envoie> recepteurs = new ArrayList<Envoie>();
	
	public Emetteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Emetteur(int id_emetteur, String nom_emetteur, String prenom_emetteur, int tel_emetteur, int cin) {
		super();
		this.id_emetteur = id_emetteur;
		this.nom_emetteur = nom_emetteur;
		this.prenom_emetteur = prenom_emetteur;
		this.tel_emetteur = tel_emetteur;
		this.cin = cin;
	}


	public int getId_emetteur() {
		return id_emetteur;
	}
	public void setId_emetteur(int id_emetteur) {
		this.id_emetteur = id_emetteur;
	}
	public String getNom_emetteur() {
		return nom_emetteur;
	}
	public void setNom_emetteur(String nom_emetteur) {
		this.nom_emetteur = nom_emetteur;
	}
	public String getPrenom_emetteur() {
		return prenom_emetteur;
	}
	public void setPrenom_emetteur(String prenom_emetteur) {
		this.prenom_emetteur = prenom_emetteur;
	}
	public int getTel_emetteur() {
		return tel_emetteur;
	}
	public void setTel_emetteur(int tel_emetteur) {
		this.tel_emetteur = tel_emetteur;
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
	}
	
}
