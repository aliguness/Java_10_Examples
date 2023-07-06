package com.bilgeadam.lesson010;

/*
 * 
 * bir metot yazalım bu metot çift bıyutlu dizimizdeki tek sayıları başka 
 * bir tek boyutlu diziye atsın  daha sonra bu diziyi yazdıralım 
 * 
 * 
 */
public class Question51 {

	public static void main(String[] args) {
		int[][] matris = { { 56, 23, 678, 231, 5 }, { 234, 21, 78, 26, 6 }, { 654, 33, 32, 67, 2 },
				{ 189, 35, 56, 89, 8 } };

		// arrayYazdir(tekSayilariAta(matris));

		// arrayYazdir(tekSayilariAta(matris, tekSayilariBul(matris)));

		// çift boyutlu array foreach yazdırımı
		for (int[] array : matris) {

			for (int sayi : array) {
				System.out.println(sayi);
			}
		}

	}

	public static int tekSayilariBul(int[][] matris) {
		int sayac = 0;
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 != 0) {
					sayac++;
				}
			}

		}
		return sayac;
	}

	public static int[] tekSayilariAta(int[][] matris) {
		int boyut = tekSayilariBul(matris);
		int[] teksayilar = new int[boyut];
		int sayac = 0;

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 != 0) {
					teksayilar[sayac] = matris[i][j];
					sayac++;
				}
			}

		}
		return teksayilar;
	}

	public static int[] tekSayilariAta(int[][] matris, int boyut) {

		int[] teksayilar = new int[boyut];
		int sayac = 0;

		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				if (matris[i][j] % 2 != 0) {
					teksayilar[sayac] = matris[i][j];
					sayac++;
				}
			}

		}
		return teksayilar;
	}

	public static void arrayYazdir(int[] dizi) {

		for (int sayi : dizi) {
			System.out.println(sayi);
		}
	}

}