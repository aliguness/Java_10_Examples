package com.bilgeadam.lesson024;

import java.util.Scanner;

/*
 * 1-Bir metot yazacagız dısarıdan bir ındex alacak sonra o indexdeki degeri yazdıracagız
 * hata varsada hatayı yakalayıp hata mseajını yazdıralım 
 * 
 * 2-array uzerinde gezelim gezerken toplayabildiğimiz değerleri toplam değişkinene ekleyerek 
 * bir toplam sonucu bulalım ve bir sayac ile de hata sayısını tutalım dongu sonundada 
 * toplamı ve hata sayısını yazdıralım 
 * 
 */
public class TryCatchOrnek2 {

	public static void main(String[] args) {
		String[] array = { null, "30", "a", "20", "ab", null, "50" };

		// indexdekiDegeriYazdir(array);
		toplamDegeriniVeHataSayisiniBul2(array);
		System.out.println("Program devam ediyor");

	}

	public static void indexdekiDegeriYazdir(String[] array) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Lütfen bir index değeri giriniz");
			int index = scanner.nextInt();
			System.out.println(array[index]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString() + " Arrayin boyutu= " + array.length + " lütfen 0 ile  " + array.length
					+ " arasında bir sayı giriniz");
			e.printStackTrace();

		}
	}

	public static void toplamDegeriniVeHataSayisiniBul(String[] array) {
		int sayac = 0;
		int toplam = 0;
		for (String string : array) {

			try {
				string.charAt(0);
				toplam += Integer.parseInt(string);

			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				sayac++;
			} catch (Exception e) {
				System.out.println("başka bir hata " + e.toString());
				sayac++;
			}
		}

		System.out.println("toplam " + toplam);
		System.out.println("hata sayısı  " + sayac);
	}

	public static void toplamDegeriniVeHataSayisiniBul2(String[] array) {
		int sayac = 0;
		int toplam = 0;
		for (String string : array) {

			try {
				nullKontolu(string);
				toplam += Integer.parseInt(string);

			} catch (NumberFormatException e) {
				System.out.println(e.toString());
				sayac++;
			} catch (Exception e) {
				System.out.println(e.toString());
				sayac++;
			}
		}

		System.out.println("toplam " + toplam);
		System.out.println("hata sayısı  " + sayac);
	}

	public static String nullKontolu(String string) {// unchecked exception
		if (string == null) {
			throw new NullPointerException("Null hatası!!!!!");
		}
		return string;
	}

	public static String nullKontolu2(String string) throws Exception {// checked exception
		if (string == null) {
			throw new NullPointerException("Null hatası!!!!!");
		}
		return string;
	}
}