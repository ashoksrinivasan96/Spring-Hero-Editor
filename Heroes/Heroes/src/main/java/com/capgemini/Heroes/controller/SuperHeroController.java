package com.capgemini.Heroes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Heroes.bean.SuperHero;
import com.capgemini.Heroes.service.SuperHeroService;

@RestController
public class SuperHeroController {
	@Autowired
	SuperHeroService service;

	@PostMapping(value = "/addHero")
	public SuperHero addHero(@RequestBody SuperHero superHero) {
		return service.addHero(superHero);
	}

	@GetMapping(value = "/displayHeroes")
	public List<SuperHero> displayHeroes() {

		return service.displayHeroes();
	}

	@GetMapping(value = "/displayHero/{id}")
	public SuperHero displayHeroById(@PathVariable long id) {

		return service.displayHeroById(id);
	}

	@DeleteMapping(value = "/deleteHero/{id}")
	public void deleteSuperHeroById(@PathVariable long id) {

		service.deleteSuperHeroById(id);
	}

	@PutMapping(value = "/updateHero/{id}")
	public SuperHero updateSuperHero(@RequestBody SuperHero superH, @PathVariable long id) {

		return service.updateSuperHero(superH, id);

	}
}
