package gestion.packages.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gestion.packages.entities.Role;

public interface RoleRep extends JpaRepository<Role, Integer> {
	Role findById(int id);
}
