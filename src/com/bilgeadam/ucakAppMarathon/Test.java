package com.bilgeadam.ucakAppMarathon;

public class Test {

	public static void main(String[] args) {

		Yolcu yolcu = new BusinessYolcu(1, "Mustafa", "Ozturk", false);
		Yolcu yolcu2 = new EkonomikYolcu(2, "Burhan", "Unlu");
		Yolcu yolcu3 = new BusinessYolcu(3, "Damla", "Gurel", true);

		System.out.println("Bussiness  Vip yolcu ");
		yolcu3.biletAl(EFirma.ADJ);
		yolcu3.biletAl(EFirma.THY);
		System.out.println("*****");
		yolcu3.uçağaBin();
		yolcu3.uçağaBin();
		yolcu3.checkInYap();
		yolcu3.checkInYap();
		yolcu3.uçağaBin();

		yolcu3.yolcuBilgileriniGetir();

		System.out.println("*****Ekonomi Yolcu*******");

		yolcu2.biletAl(EFirma.ADJ);

		yolcu2.biletAl(EFirma.THY);

		yolcu2.biletAl(EFirma.THY);

		yolcu2.biletAl(EFirma.THY);

		System.out.println("*****");

		yolcu2.uçağaBin();

		yolcu2.uçağaBin();

		yolcu2.checkInYap();

		yolcu2.checkInYap();

		yolcu2.uçağaBin();

		yolcu2.yolcuBilgileriniGetir();

	}
}