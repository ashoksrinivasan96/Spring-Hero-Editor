package com.capgemini.Heroes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.Heroes.bean.SuperHero;
import com.capgemini.Heroes.repo.SuperHeroRepo;

@Service
public class SuperHeroServiceImpl implements SuperHeroService {

	@Autowired
	SuperHeroRepo repo;

	@Override
	public SuperHero addHero(SuperHero superHero) {

		return repo.save(superHero);
	}

	@Override
	public List<SuperHero> displayHeroes() {

		return (List<SuperHero>) repo.findAll();
	}

	@Override
	public SuperHero displayHeroById(long id) {

		Optional<SuperHero> superHero = repo.findById(id);
		return superHero.get();

	}

	@Override
	public void deleteSuperHeroById(long id) {

		repo.deleteById(id);
	}

	@Override
	public SuperHero updateSuperHero(SuperHero superH, long id) {

		Optional<SuperHero> sup = repo.findById(id);
		if (sup.isPresent())
			superH.setId(id);
		return repo.save(superH);
	}

}
