package com.bilgeadam.lesson015;

public class Test {

	public static void main(String[] args) {

		Ram ram = new Ram();
		Islemci islemci = new Islemci();
		Anakart anakart = new Anakart();
		Mouse mouse = new Mouse();
		Klavye klavye = new Klavye();

		Laptop laptop = new Laptop();
//		laptop.setAnaKart(anakart);
//		laptop.setIslemci(islemci);
//		laptop.setKlavye(klavye);
//		laptop.setMouse(mouse);
//		laptop.setRam(ram);

		DahiliDonanim[] dahiliDonanimlar = { ram, islemci };
		HariciDonanim[] hariciDonanimlar = { klavye, mouse };
		anakart.setDahiliDonanimlar(dahiliDonanimlar);

		laptop.setAd("my pc");
		laptop.setAnakart(anakart);
		laptop.setHariciDonanimlar(hariciDonanimlar);

		System.out.println(laptop);
		System.out.println(laptop.getAnakart().getDahiliDonanimlar()[0]);
		System.out.println(laptop.getAnakart().getDahiliDonanimlar()[1]);
	}
}
