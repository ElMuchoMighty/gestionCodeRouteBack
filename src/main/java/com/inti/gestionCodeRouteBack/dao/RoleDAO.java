package com.inti.gestionCodeRouteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.gestionCodeRouteBack.entities.Role;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long>{

}
