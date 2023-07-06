package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * 1 den girdiğimiz sayıya kadar olan çift sayıların toplamı
 * 
 */


public class Question11 {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		
		int sayi = scanner.nextInt();
		int toplam=0;
		
		for(int i=2; i<=sayi; i+=2) {
			toplam+=i;
			
		}
		System.out.println("toplam= "+toplam);
		
		// farklı çözüm
		toplam=0;
		for(int i=1; i<=sayi; i++) {
			
			int a=i%2==0? i:0;
			toplam+=a;
		}
		System.out.println("toplam= "+toplam);
	}
	
	

}
