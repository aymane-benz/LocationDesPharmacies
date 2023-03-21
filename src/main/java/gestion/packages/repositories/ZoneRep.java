package gestion.packages.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gestion.packages.entities.Zone;

public interface ZoneRep extends JpaRepository<Zone, Integer> {
	Zone findById(int id);
}
