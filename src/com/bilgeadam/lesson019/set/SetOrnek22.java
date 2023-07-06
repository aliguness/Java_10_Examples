package com.bilgeadam.lesson019.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * 
 * dışarıdan bir kelime girelim her harfini bir sete atmak istiyoruz
 * tekrar edenleri bir sete tekrar etmeyenleri başka bir sete atalım.
 * Sonra tekrar eden ve etmeyen setlerini yazdıralım.
 * 
 * 
 */
public class SetOrnek22 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz.");
		String kelime= scanner.nextLine();
		
		Set<Character> tumHarfler = new HashSet<>();
		Set<Character> tekrarEdenHarfler= new HashSet<>();
		Set<Character> tekrarEtmeyenHarfler = new HashSet<>();
		
		for (char harf : kelime.toCharArray()) {
			if (!tumHarfler.add(harf)) {
				tekrarEdenHarfler.add(harf);
			}else {
				tekrarEtmeyenHarfler.add(harf);
			}
		}
		
		System.out.println("Tekrar eden harfler: "+ tekrarEdenHarfler);
		System.out.println("Tekrar etmeyen harfler: "+ tekrarEtmeyenHarfler);
		System.out.println("Tüm harfler"+ tumHarfler);
	}

}
