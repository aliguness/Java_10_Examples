package com.bilgeadam.lesson010;

/*
 * 1 metot yazacagız bu metot bize bu arayde 1 ve 4 un kackere gectiğni soyleyecek
 * ayrıca 1 sayısının adeti 4 den buyuk ise true değil ise false donsun 
 * 
 * 
 * 
 */
public class Question48 {

	public static void main(String[] args) {

		int[] sayilar = { 1, 4, 5, 6, 1, 1, 4, 8 };

		System.out.println(dortVeBirFreankansi(sayilar));

	}

	public static boolean dortVeBirFreankansi(int[] dizi) {

		int birSayiAdedi = 0;
		int dortSayiAdedi = 0;
		boolean kontrol = true;

		for (int i = 0; i < dizi.length; i++) {

			if (dizi[i] == 1) {
				birSayiAdedi++;
			} else if (dizi[i] == 4) {
				dortSayiAdedi++;
			}

		}
		System.out.println("1 leri adeti===> " + birSayiAdedi);
		System.out.println("4 leri adeti===> " + dortSayiAdedi);

//		if (birSayiAdedi > dortSayiAdedi) {
//			System.out.println(kontrol);

//		} else {
//			kontrol = false;
//			System.out.println(kontrol);
//		}

		kontrol = birSayiAdedi > dortSayiAdedi;
		return kontrol;

	}

}
