package com.bilgeadam.lesson007;

import java.util.Scanner;

/*
 * 1 metot yazalım  dışarıdan bir ülke ismi alalım 
 * bu ülke ismi dizimizde geçiyormu onu kontrol edelim 
 * ve geçiyorsa console a Girdiğiniz ülke bulundu 
 * eğer yoksa Girdiğiniz ülke Bulunamadı!!! çıktısını verelim 
 * 
 * 
 * 
 */
public class Question41 {

	public static void main(String[] args) {

		String[] dizi = { "Türkiye", "Moğolistan", "Japonya", "Fransa", "Danimarka" };

		ulkeBul2(dizi);

	}

	public static void ulkeBul(String[] dizi) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir ülke giriniz");
		String ulke = scanner.nextLine();
		boolean kontrol = false;
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equals(ulke)) {
				kontrol = true;
				break;
			}
		}

		if (kontrol) {
			System.out.println(ulke + " ülke bulundu");
		} else {
			System.out.println(ulke + " ülke Bulunamadı!!!");
		}

	}

	public static void ulkeBul2(String[] dizi) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir ülke giriniz");
		String ulke = scanner.nextLine();
		String result = ulke + " Ülke Bulunamadı";
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i].equals(ulke)) {
				result = ulke + "===> Ülke bulundu";
				break;
			}
		}
		System.out.println(result);

	}
}