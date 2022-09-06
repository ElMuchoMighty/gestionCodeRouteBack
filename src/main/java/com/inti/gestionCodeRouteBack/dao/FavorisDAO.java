package com.inti.gestionCodeRouteBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.gestionCodeRouteBack.entities.Favoris;

@Repository
public interface FavorisDAO extends JpaRepository<Favoris, Long>{

}
