package com.bilgeadam.lesson016.polimorfiz;

import java.util.Arrays;

public class Kullanici implements IDatabase {

	private String ad;
	private Pokemon[] pokemonlar;

	public Kullanici(String ad) {
		this.ad = ad;
	}

	public Kullanici(String ad, Pokemon[] pokemonlar) {
		super();
		this.ad = ad;
		this.pokemonlar = pokemonlar;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public Pokemon[] getPokemonlar() {
		return pokemonlar;
	}

	public void setPokemonlar(Pokemon[] pokemonlar) {
		this.pokemonlar = pokemonlar;
	}

	@Override
	public String toString() {
		return "Kullanici [ad=" + ad + ", pokemonlar=" + Arrays.toString(pokemonlar) + "]";
	}

	@Override
	public void save() {
		System.out.println(ad + " databse e kayıt edildi");

	}

}
