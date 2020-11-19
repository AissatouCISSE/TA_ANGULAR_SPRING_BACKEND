package sn.simplon.transfert_argent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.simplon.transfert_argent.model.Envoie;

@Repository
public interface EnvoieRepository extends JpaRepository<Envoie, Integer>{

}
