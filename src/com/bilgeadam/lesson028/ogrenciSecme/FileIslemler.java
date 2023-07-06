package com.bilgeadam.lesson028.ogrenciSecme;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Sabitlerimizi tuttugmuz bir sınıfımız olsun 
 * menudeki her bir işlem için bir metot yazalım 
 * System.out.println("1-Dosya yarat");
		System.out.println("2-Dosya sil");
		System.out.println("3-Dosya ya veri ekle");
		System.out.println("4-Dosya dan veri oku");
		System.out.println("5-Dosya da ki bir harfi değiştir");
		
	1-eger dosya daha once yaratılmamıssa dosya ismi ile beraber basarılı bir şekilde 
	olustuldugu cıktısını verelim eger daha once olusturulmussa bu dosaya daha once
	 olusturulmustr cıktısı verelim 	
 * 
 * 2- dosya sil metodu dha once bu dosya varsa silecek ve dosya basarı ile silinmiştir diyecek
 * eger dosya yoksa boyle bir dosya bulunumadı diye bir çıktı verecek
 * 3-  scanner ile alınan veriyi dosyaya yazdıralım 
 * 4- dosyadan okudugumuz veriyi bir stringe ekleyin 
 * ve strinde tutalım ve bu stringi geri donelim
 * 5-bir harf belirleyecğiz bu harf dosyamızda varsa 
 * ikinci belirlediğimiz harf ile değiştireceğiz
 *	dosyadada verinin değişmesini sağlayacagız
 */

public class FileIslemler {
	File file = new File(FileSabitler2.PATH);

	public void menu() {
		System.out.println("====DOSYA İŞLEMLERİ====");
		System.out.println("1-Dosya yarat");
		System.out.println("2-Dosya sil");
		System.out.println("3-Dosya ya veri ekle");
		System.out.println("4-Dosya dan veri oku");
		System.out.println("5-Dosya da ki bir harfi değiştir");
		System.out.println("0-Cıkıs");
	}

	public void uygulama() {
		int secim = 0;
		do {
			menu();
			secim = Utility.intDegerAlma("Lütfen bir işlem seciniz");
			switch (secim) {
			case 1:
				dosyaYarat();
				break;
			case 2:
				dosyaSil();
				break;
			case 3:
				dosyayaVeriEkle();
				break;
			case 4:
				dosyadanVeriOku();
				break;
			case 5:
				harfDegistir();

				break;
			case 0:
				System.out.println("Sistemden çıkılıyor");

				break;

			default:
				break;
			}

		} while (secim != 0);

	}

	public String dosyadanVeriOku() {
		String metin = "";
		String satır = "";
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
			while ((satır = bufferedReader.readLine()) != null) {

				if (metin.equals("")) {
					metin += satır;
				} else {
					metin += "\n" + satır;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println(metin);
		return metin;
	}

	public void harfDegistir() {
		String eskiHarf = Utility.stringDegerAlma("Lütfen eski harfi giriniz");
		String yeniHarf = Utility.stringDegerAlma("Lütfen yeni harfi giriniz");
		String metin = dosyadanVeriOku();
		metin = metin.replace(eskiHarf, yeniHarf);

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
			bufferedWriter.write(metin);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void dosyayaVeriEkle() {
		String veri = Utility.stringDegerAlma("lütfen eklencek veri giriniz");

		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
			if (file.length() != 0) {
				// bufferedWriter.newLine();
				veri = "\n" + veri;
			}
			bufferedWriter.write(veri);
			System.out.println(file.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void dosyaSil() {

		try {
			if (file.delete()) {
				System.out.println(file.getName() + " başarılı bir şekilde silindi");
			} else {
				System.out.println(file.getName() + " isimli dosya bulunumamıstır!!!!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void dosyaYarat() {

		try {
			if (file.createNewFile()) {
				System.out.println(file.getName() + " başarılı bir şekilde olusturuldu");
			} else {
				System.out.println(file.getName() + " dosyası daha once olusturulmustur");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}