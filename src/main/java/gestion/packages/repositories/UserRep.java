package gestion.packages.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import gestion.packages.entities.User;

public interface UserRep extends JpaRepository<User, Integer> {
	User findById(int id);
}
