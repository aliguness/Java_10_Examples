package com.bilgeadam.lesson032.factory.pizzaApp;

public class KlasikPizza extends Pizza {

	public KlasikPizza(ETur tur, EHamurTipi hamurTipi, EBoyut boyut) {
		super(tur, hamurTipi, boyut);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "KlasikPizza [getFiyat()=" + getFiyat() + ", getTur()=" + getTur() + ", getHamurTipi()=" + getHamurTipi()
				+ ", getBoyut()=" + getBoyut() + "]";
	}

}