package com.capgemini.Heroes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.capgemini.Heroes.bean.SuperHero;

public interface SuperHeroService {

	public SuperHero addHero(SuperHero superHero);

	public List<SuperHero> displayHeroes();

	public SuperHero displayHeroById(long id);

	public void deleteSuperHeroById(long id);

	public SuperHero updateSuperHero(SuperHero superH, long id);

}
