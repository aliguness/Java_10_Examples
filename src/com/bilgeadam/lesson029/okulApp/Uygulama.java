package com.bilgeadam.lesson029.okulApp;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * ogrenci sınıfımızda
 * isim notort durumu==> (geçti veya kaldı),dogumtarihi 
 * ögretmen sınımıfımız olsun==>
 * bir ismi olsun birde notlarını okudugu ogrencileri tutsun 
 * 
 * Fİle manager
 * 1- dosyadan verileri okuyalaım  ve bize bir ogrenci listesi donsun 
 * ---> gelen her degerden bir ogrenci yaratıp listeye ekleyecegiz 
 * -->en sonunda da listeyi geri doncegiz 
 * 
 *2-ogretmen dosyası olustur ==> ogretmen ismi ile bir dosya olusturp gelen 
 *listeyi bu dosyaya yazdıralım
 *
 *3-ogrencileriGetir diye bir metot yazalım dosyadan ogrencileri 
 *okuyup bir liste donsun(hangi dosyadan okuyuacagını belirtmemeiz lazım) 
 * 
 * 
 */
public class Uygulama {

	public static void main(String[] args) {

		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(FileManager.path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Ogretmen ogretmen1 = new Ogretmen("Berkin", bufferedReader);
		Ogretmen ogretmen2 = new Ogretmen("Mustafa", bufferedReader);
		Ogretmen ogretmen3 = new Ogretmen("Barıs", bufferedReader);
		ogretmen1.start();
//		try {
//			Thread.sleep(500);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		ogretmen2.start();
		ogretmen3.start();
		try {

			ogretmen1.join();
			// ogretmen2.join();
			// ogretmen2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

//		for (int i = 0; i < 15; i++) {
//			System.out.println(System.nanoTime());
//			System.out.println(i);
//		}

		System.out.println(ogretmen1.getIsim() + "= " + ogretmen1.getOgrenciler().size());
		System.out.println(ogretmen2.getIsim() + "= " + ogretmen2.getOgrenciler().size());
		System.out.println(ogretmen3.getIsim() + "= " + ogretmen3.getOgrenciler().size());
		System.out.println(ogretmen1.getIsim() + "==> " + ogretmen1.getOgrenciler());

		System.out.println(ogretmen2.getIsim() + "==> " + ogretmen2.getOgrenciler());

		ogretmen1.dosyaOlustur();
		ogretmen2.dosyaOlustur();

		// ogretmen.notlariOku();
		// ogretmen.getOgrenciler().forEach(System.out::println);
		// ogretmen.dosyaOlustur();

//		ogretmen.dosyadanOgrencileriGetir().forEach(System.out::println);
//
//		List<Ogrenci> list = ogretmen.getOgrenciler().stream().map(x -> {
//			x.setOrt(x.getOrt() + 5);
//			x.durumBelirle(x.getOrt());
//			return x;
//		}).collect(Collectors.toList());
//		ogretmen.setOgrenciler(list);
//		ogretmen.getOgrenciler().forEach(System.out::println);
//		ogretmen.dosyaOlustur();
//		ogretmen.dosyadanOgrencileriGetir().forEach(System.out::println);
		// dosyadanVeriOku("Mustafa").forEach(System.out::println);

	}

}