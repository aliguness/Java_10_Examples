package com.bilgeadam.lesson023.trycatch;

import java.util.Scanner;

/*
 * 
 * bolme işlemi için metot yazalım dışarıdan  1. ve 2. sayıyı alalaım 
 * 
 * bolme işlemi sonucu bulmaya çalışalım  eğer hata var ise  2. sayıyı tekrar alalım 
 * 
 * 
 * 
 */
public class Test {

	public static void main(String[] args) {

//		int sayi1 = 10;
//		int sayi2 = 20;
//		Integer sayi3 = null;
//		int sonuc = 0;
//		try {
//			sonuc = sayi2 / sayi1;
//			System.out.println("başarılı kod");
//			sonuc = sayi2 / sayi3;
//			System.out.println("başarılı kod");
//		} catch (ArithmeticException e) {
//			System.out.println(e.toString());
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//			System.out.println("Hata yakalandıı bir sayı  0 a bolünemezz");
//
//		} catch (NullPointerException ex) {
//			System.out.println("Genel exception");
//			ex.printStackTrace();
//		} catch (Exception e) {
//			System.out.println("başka bir hata");
//			e.printStackTrace();
//		}
//
//		System.out.println("sonuc " + sonuc);

		System.out.println("sonuc==> " + bolme());

	}

	public static double bolme() {
		Scanner scanner = new Scanner(System.in);
		double sonuc = 0;
		boolean kontrol = false;
		do {
			try {
				System.out.println("Lütfen 1. sayi giriniz");
				int sayi1 = scanner.nextInt();
				System.out.println("Lütfen 2.sayi giriniz");
				int sayi2 = scanner.nextInt();
				sonuc = sayi1 / sayi2;
				kontrol = false;
				// break;
			} catch (Exception e) {
				System.out.println("hata olustu :" + e.toString());
				kontrol = true;
			}

		} while (kontrol);

		return sonuc;
	}

}