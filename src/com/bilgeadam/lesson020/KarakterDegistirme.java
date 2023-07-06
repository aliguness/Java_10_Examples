package com.bilgeadam.lesson020;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * bu iki arraydan bir map oluşturalım
 * ve map uzerinde çalışalım
 * 
 * dışarıdan girilen kelime turkçe karakteri varsa ingilizce karaktere cevireceğiz.
 * 
 * dışarıdan girilen kelimenin turkce karakteri varsa ingilizce karaktere çevireceğiz.
 * 
 */
public class KarakterDegistirme {
	
	
    
    public static void main(String[] args) {
    	
    	char[] turkishWords = { 'İ', 'ı', 'ş', 'Ş', 'ç', 'Ç', 'ğ', 'Ğ', 'ü', 'Ü', 'ö', 'Ö' };

    	char[] englishWords = { 'I', 'i', 's', 'S', 'c', 'C', 'g', 'G', 'u', 'U', 'o', 'O' };
		
    	Scanner scanner = new Scanner(System.in);
    	
    	Map<Character, Character> map = new HashMap<>();
    	
    	for (int i = 0; i < englishWords.length; i++) {
			map.put(turkishWords[i], englishWords[i]);
    		
		}
    	
    	System.out.println("Bir kelime giriniz");
    	String kelime = scanner.nextLine();
    	
    	for (char c : map.keySet()) {
			if (kelime.contains(String.valueOf(c))) {
				kelime = kelime.replace(c, map.get(c));
			}
		}
    	
    	System.out.println("yeni hali ==> " + kelime);
    	
	}


}
