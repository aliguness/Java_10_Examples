package com.bilgeadam.lesson017;

public abstract class Ucak extends Arac implements IHavaTasiti {

	int kanatUzunlugu;

	@Override
	public void kalkisYap() {
		System.out.println("Kalkış yapılıyor");

	}

	@Override
	public void inisYap() {
		System.out.println("İniş yapılıyor");

	}

	@Override
	public void hizlanma() {
		System.out.println(getClass().getSimpleName() + " hizlaniyor");
		hiz += 50;
		hizGoster();

	}

	@Override
	public void yavaslama() {
		System.out.println(getClass().getSimpleName() + " yavaslıyor");
		if (hiz > 0) {
			hiz -= 50;
			hizGoster();
		}

	}

}
