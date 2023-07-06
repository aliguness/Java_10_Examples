package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question18 {
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		int toplam = 0;
		double ort =0;
		int sayac=0;
		
		
		while (true) {
			System.out.println("Lütfen bir sayı giriniz");
			int sayi = scanner.nextInt();
			if (sayi==0)
				break;
			toplam += sayi;
			sayac++;
			ort = (double) toplam / sayac;
			
		}
		System.out.println("toplam: " + toplam);
		System.out.println("ortalama: "+ ort);
		
		toplam = 0;
		ort = 0;
		
		System.out.println("Lütfen bir sayi giriniz");
		int num = scanner.nextInt();
		
		while (num != 0) {
			toplam +=num;
			ort = toplam / (double) sayac;
			sayac++;
			System.out.println("Lütfen bir sayını giriniz.");
			num = scanner.nextInt();
			
		}
		System.out.println("toplam: " + toplam);
		System.out.println("ortalama: "+ ort);
	}

}
