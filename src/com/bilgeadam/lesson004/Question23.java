package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * 
 * Dışarıdan girilen bir sayının asal olup olmadığını bulalım
 * 
 * asal ise asaldır çıktısı
 * değil ise asal değildir çıktısı verelim
 * 
 */

public class Question23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = scanner.nextInt();
		int i;
		
		for ( i = 2; i<= sayi / 2; i++) {
			
			if ( sayi % i == 0) {
				break;
			}
		}
		if (i > sayi / 2) {
			System.out.println("Asal sayıdır");
		}else{
			System.out.println("Asal sayı değildir");
		}
		
		
			
		
	}

}
