package sn.simplon.transfert_argent.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import sn.simplon.transfert_argent.model.Emetteur;
import sn.simplon.transfert_argent.model.Envoie;
import sn.simplon.transfert_argent.model.Recepteur;
import sn.simplon.transfert_argent.repository.EmetteurRepository;
import sn.simplon.transfert_argent.repository.EnvoieRepository;
import sn.simplon.transfert_argent.repository.RecepteurRepository;


@RestController
@RequestMapping("/api/transfert")
public class ClientController {
	
	@Autowired
	private EmetteurRepository emetteurRepository;
	@Autowired
	private RecepteurRepository recepteurRepository;
	@Autowired
	private EnvoieRepository envoieRepository;
	
	
	//envoyer
		
		public void envoyer(Emetteur  emetteur, Recepteur  recepteur, Envoie envoie) {
			
			envoie.setEmetteur(emetteurRepository.save(emetteur));
			envoie.setRecepteur(recepteurRepository.save(recepteur));
			envoieRepository.save(envoie);
}
		@PostMapping("/envoyer")
		public void encapsulatrion( String nom_emetteur, String prenom_emetteur, int  tel_emetteur, int cin, 
				String nom_recepteur, String prenom_recepteur, int tel_recepteur, String date, int montant) {
			Emetteur emetteur=new Emetteur(); 
			emetteur.setNom_emetteur(nom_emetteur);
			emetteur.setPrenom_emetteur(prenom_emetteur);
			emetteur.setTel_emetteur(tel_emetteur);
			emetteur.setCin(cin);
			
			Recepteur recepteur=new Recepteur();
			recepteur.setNom_recepteur(nom_recepteur);
			recepteur.setPrenom_recepteur(prenom_recepteur);
			recepteur.setTel_recepteur(tel_recepteur);
			
			Envoie envoie=new Envoie();
			envoie.setDate(date);
			envoie.setMontant(montant);
			envoyer(emetteur, recepteur, envoie);
		}
}
