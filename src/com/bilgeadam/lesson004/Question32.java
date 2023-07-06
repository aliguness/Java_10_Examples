package com.bilgeadam.lesson004;

import java.util.Scanner;

/*
 * dışarıdan bir kelime girelim
 * bu kelime içerisinde kuçuk a kaç defa geçiyor bize söylesin
 * 
 * 
 */

public class Question32 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen kelime giriniz");
		
		String kelime = scanner.nextLine();
		int sayac = 0;
		
		for (int i = 0; i < kelime.length(); i++) {
			if (kelime.charAt(i)== 'a') {
				sayac++;				
			}								
		}
		System.out.println(sayac+" tane  a harfi vardır");		
	}
}