package gestion.packages.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gestion.packages.entities.Pharmacie;

public interface PharmacieRep extends JpaRepository<Pharmacie, Integer> {
	Pharmacie findById(int id);
}
