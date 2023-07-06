package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question30 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sayi;
		int max =Integer.MIN_VALUE; // -1
		int min = Integer.MAX_VALUE; //101
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Lütfen" + (i + 1) + ".bir sayı giriniz");
			sayi = scanner.nextInt();
			if (sayi <= 100 && sayi >= 0) {
				
				if ( sayi > max) {
					max = sayi; //12-24-""-""-36
					
				}
				if( sayi < min) {
					min = sayi;//12-""-10-5-""
					
				}
				
			}else {
				i--;
				System.out.println("Lütfen belirtilen aralıkta bir sayi giriniz ");
				
			}
		}
		System.out.println("max= " + max);
		System.out.println("min= " + min);
		
		System.out.println("-----------------");
		
		
		int sayac=0;
		while (sayac<5) {
			System.out.println("Lütfen" + (sayac + 1) + ".bir sayı giriniz");
			sayi = scanner.nextInt();
			if (sayi <= 100 && sayi >= 0) {
				
				if ( sayi > max) {
					max = sayi; //12-24-""-""-36
					
				}
				if( sayi < min) {
					min = sayi;//12-""-10-5-""
			
		}
				sayac++;
		}else {
			System.out.println("Lütfen belirtilen bir aralıkta sayı giriniz ");
		}
			}
		System.out.println("max= " + max);
		System.out.println("min= " + min);
	}

}





























//
//Scanner scanner = new Scanner(System.in);
//System.out.println("5 adet sayı yazınız");
//int maks=0;
//int min=0;
//
//for(int i=1; i<=5; i++) {
//	System.out.println(i+". sayiyi giriniz: ");
//	int sayi = scanner.nextInt();
//	
//	if (i==1) {
//		maks=sayi;
//		min=sayi;
//	}
//	if (sayi>maks) {
//		maks=sayi;
//	}
//}
//System.out.println("En büyük sayı: "+maks);
//System.out.println("En kuçuk sayı: "+min);
