package com.bilgeadam.lesson019.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetOrnek2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz.");
		String kelime= scanner.nextLine();
		
		Set<Character> tekrarEdenHarfler= new HashSet<>();
		Set<Character> tekrarEtmeyenHarfler = new HashSet<>();
		
		for (int i = 0; i < kelime.length(); i++) {
			
			if (!tekrarEdenHarfler.contains(kelime.charAt(i)) && !tekrarEtmeyenHarfler.add(kelime.charAt(i)) ) {
				tekrarEdenHarfler.add(kelime.charAt(i));
				tekrarEtmeyenHarfler.remove(kelime.charAt(i));
			}
			
		}
		System.out.println("Tekrar eden");
		System.out.println(tekrarEdenHarfler);
		
		System.out.println("Tekrar etmeyen");
		System.out.println(tekrarEtmeyenHarfler);
		
	}
	
	

}
