package com.bilgeadam.lesson010;

/*
 * Bir başlangıç ve bitiş değeri arasında ki sıralı sayılardan eğer sayı 3'ün katı
 * ise bilge 5'in ise adam hem3 ve hem 5 in katı ise bilgeadam yazdıralım int start=2; int
 * end=22; çıktı [2,bilge,4,adam,bilge,7.......14,bilgeadam......bilge,22]
 * 
 * 
 */
public class Question49 {

	public static void main(String[] args) {

		int start = 2;
		int end = 22;

//		String [] dizi=arrayOlustur(start, end);
//		arrayYazdir(dizi);

		arrayYazdir(arrayOlustur(start, end));

	}

	public static String[] arrayOlustur(int start, int end) {
		String[] array = new String[end - start + 1];
		for (int i = 0; i < array.length; i++) {
			int eleman = start + i;

			if (eleman % 15 == 0) {
				array[i] = "bilgeadam";
			} else if (eleman % 5 == 0) {
				array[i] = "adam";
			} else if (eleman % 3 == 0) {
				array[i] = "bilge";
			} else {
				array[i] = Integer.toString(eleman);
				// array[i] = eleman + "";
				// array[i]=String.valueOf(eleman);
			}
		}
		return array;
	}

	public static void arrayYazdir(String[] dizi) {

		System.out.print("[");
		for (String deger : dizi) {
			System.out.print(deger + ",");
		}
		System.out.print("]");

	}
}