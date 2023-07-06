package com.bilgeadam.lesson017;

public class Kamyon extends Arac implements IKaraTasiti, IYuk {

	int kasaUzunlugu;

	@Override
	public void sur() {
		System.out.println("Harekete geçildi");

	}

	@Override
	public void yukAl() {
		System.out.println(getClass().getSimpleName() + " yük alıyor ");

	}

	@Override
	public void yukBosalt() {
		System.out.println(getClass().getSimpleName() + " yük boşaltıyor ");

	}

	@Override
	public void hizlanma() {
		System.out.println(getClass().getSimpleName() + " hizlaniyor");
		hiz += 5;
		hizGoster();

	}

	@Override
	public void yavaslama() {
		System.out.println(getClass().getSimpleName() + " yavaslıyor");
		if (hiz > 0) {
			hiz -= 10;
			hizGoster();
		}

	}

}
