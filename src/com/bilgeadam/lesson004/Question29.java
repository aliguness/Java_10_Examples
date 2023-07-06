package com.bilgeadam.lesson004;

import java.util.Scanner;

public class Question29 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int toplam = 0;
		System.out.println("Lütfen bir sayı giriniz");
		int sayi = scanner.nextInt();
		
		for (int i = 1; i <= sayi / 2; i++) {
			if(sayi % i == 00) {
				toplam+=i;
			} 
			
		}if(sayi== toplam) {
				System.out.println(sayi +" Mükemmel bir sayidir");
			}else {
				System.out.println(sayi +" Mükemmel bir sayı değildir.");
			}
	}

}
