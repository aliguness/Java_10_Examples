package com.bilgeadam.lesson014;
import java.util.Scanner;

/*
 * 1 Kullanıcı sınıfımız olacak 
 * -kullanıcılarımız  username ve şifre ile uygulamaya giriş yapsın ,id si olsun 
 * -daha sonra sepetlerine urun ekleye bilsinler
 * 2- kullanıcılarımızı databsede tutatlım 
 * -databsede başlangıcta 3 tane default kullanıcı olsun 
 * -uygulam içinde kayıt ol seceneği ile burdaki databaseimize kullanıcı ekleyelim
 * 3-sepet-->sepetimizde eklediğimiz urunleri tutan bir yapı 
 * olsun her kullanıcı kendi sepetine urun ekleyebilecek 
 * 4- urunlermizde enum yapalım 
 *CIPS, KOLA, SEKER, YAG, UN, EKMEK, ÇAY, YUMURTA, YOGURT, SUT
 * 
 * 
 */
public class Uygulama {

	Scanner scanner = new Scanner(System.in);

//	public Uygulama() {
//		Database.baslangicVerisiEkle();
//	}

	public void menu() {
		System.out.println("1-Kayıt ol");
		System.out.println("2-Griş yap");
		System.out.println("3-Kullanıcıları Göster");
		System.out.println("4-Çıkıs yap");
	}

	public int secimYap() {
		System.out.println("Lütfen bir işlem seiciniz");
		String secim = scanner.nextLine();
		return Integer.parseInt(secim);
	}

	public void uygulamayiBaslat() {
		Database.baslangicVerisiEkle();
		int kontrol = 4;

		do {
			menu();
			kontrol = secimYap();
			switch (kontrol) {
			case 1:
				kayitOl();
				break;

			case 2:
				girisYap();
				break;

			case 3:
				kullanicilariGoster();
				break;

			case 4:

				break;

			default:
				break;
			}

		} while (kontrol != 4);

	}

	public void girisYap() {
		System.out.println("Lütfen kullanıcı isminizi giriniz");
		String username = scanner.nextLine();
		System.out.println("Lütfen şifreinizi giriniz");
		String sifre = scanner.nextLine();
		Kullanici kullanici = Database.kullaniciVarmi(username, sifre);

		if (kullanici != null) {
			System.out.println("Giriş başarılı");
			kullaniciMenusu(kullanici);
		} else {
			System.out.println("Kullancı adı veya şifre hatalı!!!!");
		}
	}

	public void kullaniciMenusu(Kullanici kullanici) {
		String kontrol = "3";
		do {
			System.out.println("====" + kullanici.getUsername() + " Hoşgeldiniz=====");
			System.out.println("1-Sepeti Goster");
			System.out.println("2-Urun ekle");
			System.out.println("3-Çıkış");
			System.out.println("Lütfen seçim Yapınız");
			kontrol = scanner.nextLine();
			switch (kontrol) {
			case "1":
				sepetiGoster(kullanici);
				break;
			case "2":
				urunEkle(kullanici);
				break;
			case "3":
				break;
			default:
				System.out.println("default");
				break;

			}

		} while (!kontrol.equals("3"));

	}

	public void urunEkle(Kullanici kullanici) {
		for (EUrun urun : EUrun.values()) {
			System.out.println((urun.ordinal() + 1) + "-" + urun.toString());
		}
		System.out.println("Lütfen bir urun seçiniz");// 1---> 0.index
		int index = scanner.nextInt() - 1;
		scanner.nextLine();
		kullanici.getSepet().getUrunler()[Sepet.index] = EUrun.values()[index];
		Sepet.index++;
		System.out.println(EUrun.values()[index] + " adlı urun spete eklendi");
	}

	public void sepetiGoster(Kullanici kullanici) {
		System.out.println(kullanici.getSepet());
	}

	public void kullanicilariGoster() {
		System.out.println("===Kullanıcılar===");

		for (Kullanici kullanici : Database.kullanicilar) {

			if (kullanici != null) {
				System.out.println(kullanici);
			}
		}

	}

	public void kayitOl() {
		System.out.println("Lütfen kullanıcı isminizi giriniz");
		String username = scanner.nextLine();
		System.out.println("Lütfen şifreinizi giriniz");
		String sifre = scanner.nextLine();
		System.out.println("Lütfen  isminizi giriniz");
		String isim = scanner.nextLine();
		Kullanici kullanici = new Kullanici(Database.index + 1, username, sifre, isim);
		Database.kullaniciEkle(kullanici);

	}

}
