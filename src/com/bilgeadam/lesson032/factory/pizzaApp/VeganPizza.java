package com.bilgeadam.lesson032.factory.pizzaApp;

public class VeganPizza extends Pizza {

	public VeganPizza(ETur tur, EHamurTipi hamurTipi, EBoyut boyut) {
		super(tur, hamurTipi, boyut);

	}

	@Override
	public String toString() {
		return "VeganPizza [getFiyat()=" + getFiyat() + ", getTur()=" + getTur() + ", getHamurTipi()=" + getHamurTipi()
				+ ", getBoyut()=" + getBoyut() + "]";
	}

}