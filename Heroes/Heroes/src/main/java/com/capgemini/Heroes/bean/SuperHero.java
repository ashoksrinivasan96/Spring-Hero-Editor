package com.capgemini.Heroes.bean;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SuperHero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String heroName;
	private String superPowers;
	private String sideKickName;
	private String weapons;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getSuperPowers() {
		return superPowers;
	}
	public void setSuperPowers(String superPowers) {
		this.superPowers = superPowers;
	}
	public String getSideKickName() {
		return sideKickName;
	}
	public void setSideKickName(String sideKickName) {
		this.sideKickName = sideKickName;
	}
	public String getWeapons() {
		return weapons;
	}
	public void setWeapons(String weapons) {
		this.weapons = weapons;
	}
	public SuperHero(long id, String heroName, String superPowers, String sideKickName, String weapons) {
		super();
		this.id = id;
		this.heroName = heroName;
		this.superPowers = superPowers;
		this.sideKickName = sideKickName;
		this.weapons = weapons;
	}
	
	
	public SuperHero() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SuperHero [id=" + id + ", heroName=" + heroName + ", superPowers=" + superPowers + ", sideKickName="
				+ sideKickName + ", weapons=" + weapons + "]";
	}
	
	
}
