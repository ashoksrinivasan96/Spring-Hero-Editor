package com.capgemini.Heroes.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.Heroes.bean.SuperHero;

@Repository
public interface SuperHeroRepo extends CrudRepository<SuperHero, Long> {

}
