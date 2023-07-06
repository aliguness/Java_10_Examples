package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * 
 * iki tane sayı değişkenimiz olsun
 * 
 * dışarıdan bir işlem seçeceğiz (toplama bölme çıkarma çarpma (+, /, -, *) )
 * dışarıdan seçtiğimiz işleme göre bize o işlemi yapıp sonucu bulsun ;
 * ve en sonunda da sonucu yazdıralım.
 * 
 * 
 */
public class Question26 {
	public static void main(String[] args) {
		
		int sayi1 = 58;
		int sayi2 = 94;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir işlem seçiniz (+,/, -, *) ");
		String islem= scanner.nextLine();
		double sonuc;
		
		
		switch (islem) {
		case "+":
			sonuc = sayi1 + sayi2;
			System.out.println("toplama işleminin sonucu" + sonuc);
			break;
		case "-":
			sonuc = sayi1 - sayi2;
			System.out.println("Lçıkarma işleminin sonucu " + sonuc);
			break;
		case "/":
			sonuc = (double) sayi1 / sayi2;
			break;
		case "*":
			sonuc = sayi1 * sayi2;
			break;
		default:
			break;
		}
	}
	

}
