package com.bilgeadam.lesson008;

/*
 * bir dizide arda arda gelen 2 indexdeki degerde 2 rakamı ise bize true donen 
 * bir metot yazınız 
 * 
 * 
 */
public class Question44 {

	public static void main(String[] args) {
		int[] sayilar = { 2, 4, 5, 8, 3, 2 };
		boolean kontol = false;
		System.out.println(ikiKontrolu(sayilar));
		System.out.println(ikiKontrolu(sayilar, kontol));
		String deger = "merhaba";
		deger.substring(0);

	}

	public static boolean ikiKontrolu(int[] dizi) {
		for (int i = 1; i < dizi.length; i++) {
			if (dizi[i] == 2 && dizi[i - 1] == 2) {
				return true;
			}
		}
		return false;
	}

	// method overloading aşırı yukleme

	public static boolean ikiKontrolu(int[] dizi, boolean kontrol) {

		for (int i = 1; i < dizi.length; i++) {
			if (dizi[i] == 2 && dizi[i - 1] == 2) {
				kontrol = true;
				break;
			} else {
				kontrol = false;
			}
		}

		return kontrol;
	}

}