package com.inti.gestionCodeRouteBack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.gestionCodeRouteBack.entities.Favoris;
import com.inti.gestionCodeRouteBack.service.impl.FavorisService;

@RestController
@CrossOrigin
public class FavorisController {
	
	@Autowired
	FavorisService favorisService;
	
	@GetMapping("/favoris")
	public List<Favoris> findAll() {
		return favorisService.findAll();
	}
	
	@GetMapping("/favoris/{idFavoris}") 
	public Favoris findOne(@PathVariable("idFavoris") Long id) {
		return favorisService.findOne(id);
	}
	
	@PostMapping("/favoris") 
	public Favoris saveFavoris(@RequestBody Favoris favoris) { 
		return favorisService.save(favoris); }
	 

	@DeleteMapping("/favoris/{idFavoris}") 
	public void deleteFavoris(@PathVariable("idFavoris") Long id) {
		favorisService.delete(id);
	}

}
