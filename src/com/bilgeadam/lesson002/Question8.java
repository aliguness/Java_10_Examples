package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * Dışarıdan vize ve final bilgisi girilsin
 * daha sonra öğrenci ismi girilsin
 * 
 * çıktı olarak eğer ortalama 60ın üzerinde ise Mustafa adlı ogrenci geçti çıktısı
 * altında ise mustafa adlı ogrenci kaldı çıktısını verelim
 * 
 * ortvizenin yüzde 40, finalin yüzde 60 alınsın
 */

public class Question8 {

	public static void main(String[] args) {

		double vize, finalNotu, ortalama;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen vize notunu giriniz");
		vize = scanner.nextDouble();
		System.out.println("Lütfen final notunu giriniz");
		finalNotu = scanner.nextDouble();
		ortalama = (vize * 0.4) + (finalNotu * 0.6);
		System.out.println("Lütfen ogrenci ismini giriniz");
		scanner.nextLine();
		String isim = scanner.nextLine();

		System.out.println(isim + " adlı Ogrenci ");
		System.out.println(ortalama > 60 ? "Gecti" : "Kaldı");

		System.out.println();
		String durum = ortalama > 60 ? "Gecti" : "Kaldı";

		System.out.println(isim + " adlı ögrenci " + durum + "ort: " + ortalama);

	}

}
