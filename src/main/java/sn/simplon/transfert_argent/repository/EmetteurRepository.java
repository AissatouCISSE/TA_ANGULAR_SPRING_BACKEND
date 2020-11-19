package sn.simplon.transfert_argent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.simplon.transfert_argent.model.Emetteur;

@Repository
public interface EmetteurRepository extends JpaRepository<Emetteur, Integer> {

}
