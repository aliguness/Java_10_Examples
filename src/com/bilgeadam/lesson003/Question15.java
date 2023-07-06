package com.bilgeadam.lesson003;
/*
 * 
 * girilen sayının basamakları toplamını, ekrana yazdıralım ve
 * kaç basamaklı olduğunuda yazdılaralım.
 * 
 */

import java.util.Scanner;

public class Question15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int basamakDegeri;
		int sayi = scanner.nextInt();
		int sayac= 0;
		int toplam = 0;
		do {
			basamakDegeri = sayi % 10; //0
			toplam += basamakDegeri; //0
			sayi /= 10; //10
			sayac++; // 1-2-3
			
		} while (sayi != 0); //sayi>0 veya sayi >=1
		
		System.out.println("toplam= " + toplam);
		System.out.println("basamak sayısı= " + sayac);
		
		
		// while ile çözümü
		
		
//		int sayi = scanner.nextInt();
//		int sayac= 0;
//		int toplam = 0;
			
		while (sayi>0) {
			
			basamakDegeri=sayi%10;
			toplam += basamakDegeri;
			sayi /= 10;
			sayac++;
			
			
		}
		System.out.println("toplam= " + toplam);
		System.out.println("basamak sayısı= " + sayac);
			
		sayac=0;
		toplam=0;
		for(int sayi2 =scanner.nextInt(); sayi2> 0;){
			
			
		}
		}
		
		
		
		
			 
		 
		
	

}
