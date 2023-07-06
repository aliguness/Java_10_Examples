package com.bilgeadam.lesson016.polimorfiz;

import java.util.Random;

/*
 * 1- abstract  kalıtım yoluyla(extends) aktarılan bir sınıf ve java tek bir sınıftan kalıtıma izin veriyor
 * 1-interface implements edilerek metotların alt sınıflara aktarılması birden fazla interface implemente edilebiilr
 * (kalıtım yoluyla olusturamadıgımız ortak davranısları abstrac yerine interfaceler uzerinden implemnete ederiz )
 * 2-abstract sınıflar içerisinde govdeli govdesiz metotlar ve özellikler tutabilir
 * 2-interface içerisnde genelde govdesiz metotlar tutar 
 * 
 * 
 * 
 * 
 * 
 */

public class Runner {

	public static void main(String[] args) {

		Kullanici kullanici = new Kullanici("Mustafa");
		Pokemon atesPokemonu = new AtesPokemonu(1, "charizard", 2000, 300, 3, 1500);
		Pokemon suPokemonu = new SuPokemonu(2, "squirtle", 500, 100, 2, 250, 368);
		ElektrikPokemonu elektrikPokemonu = new ElektrikPokemonu(3, "pikhachu", 180, 200, 2, 1280);

		// System.out.println(((AtesPokemonu) atesPokemonu).getYakicilikGucu());

		Pokemon[] pokemonlar = { atesPokemonu, suPokemonu, elektrikPokemonu };
		kullanici.setPokemonlar(pokemonlar);

		System.out.println(kullanici);
		Pokemon pokemon = pokemonSec(pokemonlar);
		saldır(pokemon);

		Pokemon pokemon2 = new AtesPokemonu(0, null, 0, 0, 0, 0);

	}

	public static void saldır(Pokemon pokemon) {
		pokemon.saldir();
		;
	}

	public static void saldir2(Pokemon pokemon) {

		if (pokemon instanceof AtesPokemonu) {
			System.out.println(pokemon.getAd() + " ates saldırsı yapıyor");
		} else if (pokemon instanceof SuPokemonu) {
			System.out.println(pokemon.getAd() + " su saldırsı yapıyor");
		} else {
			System.out.println(pokemon.getAd() + " elektrik saldırsı yapıyor");
		}

	}

	public static Pokemon pokemonSec(Pokemon[] pokemonlar) {
		Random random = new Random();
		int index = random.nextInt(pokemonlar.length);
		return pokemonlar[index];
	}

}
