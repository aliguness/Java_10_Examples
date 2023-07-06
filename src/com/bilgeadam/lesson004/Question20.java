package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
* 
* telefon kod mail kod başlangıc değerlerini biz kendimiz atayacağız (int)
* 
* daha sonra dışarıdan birtane telefon kodu alacağız bir tanede mail için koda
* alacağız
* 
* eğer telefon kodu hatalı ise tel kodu hatalı çıktısı verelim
* 
* eğer mail kodu hatalı ise mail kodu hatalı çıktısını verelim
* 
*/

public class Question20 {
	public static void main(String[] args) {
		
		int mKod;
		int tKod;
		Scanner scanner = new Scanner(System.in);
		int telefonKodu = 10;
		int mailKodu = 20;
		System.out.println("Lütfen bir Telefon Kodu giriniz. ");
		 tKod = scanner.nextInt();
		
		System.out.println("Lütfen bir mail kodu giriniz");
		 mKod = scanner.nextInt();
		 
		if(telefonKodu == tKod) {
			System.out.println("Telefon Kodu Doğrudur");
		}else {
			System.out.println("Telefon kodu hatalıdır!!!");
		}
		if(mailKodu== mKod) {
			System.out.println("Mail kodu Doğrudur");
		}else {
			System.out.println("Mail kodu hatalıdır");
		}
		
		/////////
		if (telefonKodu !=tKod) {
			System.out.println("Telefon kodu hatalıdır!!!!");
		}
		if(mailKodu != mKod) {
			System.out.println("Mail hatalıdır");
		}
		
	}

}
