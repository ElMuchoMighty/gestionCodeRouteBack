package com.inti.gestionCodeRouteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.gestionCodeRouteBack.entities.Role;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long>{
	@Query(value = "SELECT COUNT(*) FROM `profils` WHERE id_role = 1;", nativeQuery = true)
	int nbrAdmin();
	@Query(value = "SELECT COUNT(*) FROM `profils` WHERE id_role = 2;", nativeQuery = true)
	int nbrCandidat();

}
