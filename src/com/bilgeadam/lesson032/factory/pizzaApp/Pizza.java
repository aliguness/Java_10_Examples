package com.bilgeadam.lesson032.factory.pizzaApp;

/*
 * Hamurtipi
 * Boyutu
 * türü
 * fiyati
 * 
 * 2 tanede alt sınıf olusturalım VeganPizza KlasikPizza
 * 
 * 

 */
public abstract class Pizza {

	private double fiyat;
	private ETur tur;
	private EHamurTipi hamurTipi;
	private EBoyut boyut;

	public Pizza(double fiyat, ETur tur, EHamurTipi hamurTipi, EBoyut boyut) {
		super();
		this.fiyat = fiyat;
		this.tur = tur;
		this.hamurTipi = hamurTipi;
		this.boyut = boyut;
	}

	public Pizza(ETur tur, EHamurTipi hamurTipi, EBoyut boyut) {
		super();
		this.tur = tur;
		this.hamurTipi = hamurTipi;
		this.boyut = boyut;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public ETur getTur() {
		return tur;
	}

	public void setTur(ETur tur) {
		this.tur = tur;
	}

	public EHamurTipi getHamurTipi() {
		return hamurTipi;
	}

	public void setHamurTipi(EHamurTipi hamurTipi) {
		this.hamurTipi = hamurTipi;
	}

	public EBoyut getBoyut() {
		return boyut;
	}

	public void setBoyut(EBoyut boyut) {
		this.boyut = boyut;
	}

}