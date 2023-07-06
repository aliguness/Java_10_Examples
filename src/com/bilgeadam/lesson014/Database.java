package com.bilgeadam.lesson014;

/*
 * 
 * kullanıcılarımızı databsede tutalım 
 * 
 * 
 * 
 */
public class Database {

	public static Kullanici[] kullanicilar = new Kullanici[6];
	public static int index;

	public static void baslangicVerisiEkle() {
		Kullanici kullanici1 = new Kullanici(index + 1, "musty", "123", "Mustafa");
		kullanicilar[index] = kullanici1;
		index++;
		Kullanici kullanici2 = new Kullanici(index + 1, "tuba", "123", "Tuba");
		kullanicilar[index] = kullanici2;
		index++;
		Kullanici kullanici3 = new Kullanici(index + 1, "mert", "123", "Mert");
		kullanicilar[index] = kullanici3;
		index++;
	}

	public static void kullaniciEkle(Kullanici kullanici) {
		System.out.println(kullanicilar.length);
		System.out.println(kullanicilar[kullanicilar.length - 1]);

		if (kullanicilar[kullanicilar.length - 1] != null) {
			arrayBoyutArttırma();
		}
		kullanicilar[index] = kullanici;
		index++;
	}

	public static void arrayBoyutArttırma() {
		Kullanici[] temp = new Kullanici[kullanicilar.length + 5];

		for (int i = 0; i < kullanicilar.length; i++) {
			temp[i] = kullanicilar[i];
		}
		kullanicilar = temp;

	}

	public static Kullanici kullaniciVarmi(String username, String sifre) {
		for (Kullanici kullanici : kullanicilar) {

			if (kullanici != null) {
				if (kullanici.getUsername().equals(username) && kullanici.getSifre().equals(sifre)) {
					return kullanici;
				}
			}

		}
		return null;
	}

}