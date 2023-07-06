package com.bilgeadam.lesson003;

import java.util.Scanner;

/*
 * Bir sayının faktroielini hesaplayalım
 */
public class Question13 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen birsayı giriniz");
		
		int factoriel= 1;
		int sayi = input.nextInt();
		int i = 1;
		while (sayi >= i) {
			factoriel *= sayi;
			sayi--;
			
		}
		System.out.println("faktoriyel= " + factoriel);
		
		factoriel = 1;
		
		for (int j = 1; j <= sayi; j++) {
			factoriel *= j;
			
		}
		System.out.println("faktoriyel= "+ factoriel);
		
		
factoriel = 1;
		
		for (int j = sayi; j >= 1; j--) {
			factoriel *= j;
			
		}
		System.out.println("faktoriyel= "+ factoriel);
		
	}

}
