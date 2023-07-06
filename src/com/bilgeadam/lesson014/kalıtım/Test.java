package com.bilgeadam.lesson014.kalıtım;

public class Test {

	public static void main(String[] args) {

//		Pokemon pokemon1 = new Pokemon();
//		pokemon1.setAd("charizard");
//		pokemon1.setGuc(5000);
//		pokemon1.setCan(350);
//		pokemon1.setSeviye(3);
//		pokemon1.setTur("Ateş");
//
//		pokemon1.saldir();
//		pokemon1.kacinma();
//		pokemon1.pokedex();
//
//		Pokemon pokemon2 = new Pokemon();
//		pokemon2.setAd("pikachu");
//		pokemon2.setGuc(1000);
//		pokemon2.setCan(250);
//		pokemon2.setSeviye(1);
//		pokemon2.setTur("Elektrik");

//		pokemon2.saldir();
//		pokemon2.kacinma();
//		pokemon2.pokedex();

//		ElektrikPokemonu pokemon3 = new ElektrikPokemonu();
//		pokemon3.setAd("rayichu");
//		pokemon3.setGuc(2000);
//		pokemon3.setCan(250);
//		pokemon3.setSeviye(2);
//		pokemon3.setTur("Elektrik");

		AtesPokemonu pokemon4 = new AtesPokemonu(1, "charizard", 1500, 300, 3, 5630);
		pokemon4.saldir();
		pokemon4.pokedex();

		SuPokemonu suPokemonu = new SuPokemonu(2, "squirtle", 500, 100, 2, 250, 368);
		suPokemonu.saldir();
		suPokemonu.pokedex();

	}
}
