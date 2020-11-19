package sn.simplon.transfert_argent.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Recepteur implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_recepteur;
	private String  nom_recepteur;
	private String prenom_recepteur;
	private int tel_recepteur;
	public int getId_recepteur() {
		return id_recepteur;
	}
	public void setId_recepteur(int id_recepteur) {
		this.id_recepteur = id_recepteur;
	}
	public String getNom_recepteur() {
		return nom_recepteur;
	}
	public void setNom_recepteur(String nom_recepteur) {
		this.nom_recepteur = nom_recepteur;
	}
	public String getPrenom_recepteur() {
		return prenom_recepteur;
	}
	public void setPrenom_recepteur(String prenom_recepteur) {
		this.prenom_recepteur = prenom_recepteur;
	}
	public int getTel_recepteur() {
		return tel_recepteur;
	}
	public void setTel_recepteur(int tel_recepteur) {
		this.tel_recepteur = tel_recepteur;
	}
	public Recepteur() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recepteur(int id_recepteur, String nom_recepteur, String prenom_recepteur, int tel_recepteur) {
		super();
		this.id_recepteur = id_recepteur;
		this.nom_recepteur = nom_recepteur;
		this.prenom_recepteur = prenom_recepteur;
		this.tel_recepteur = tel_recepteur;
	}
	
	
}
