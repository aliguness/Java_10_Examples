package com.bilgeadam.lesson020;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/*
 * 1- isime karşılık not gelecek şekilde bir map yapısı kuralım
 * 2- isim ve notlar bir map yapısında tutalım
 * 3- her ogrencinin notlarını yazdılarım
 * 4- her ogrencinin not ort hesaplayalım
 * 
 * 
 * 
 */
public class MapOrnek2 {
	public static void main(String[] args) {
		
		String[] ogrenci = { "Mustafa", "Ece", "Elif"};
		int[] notlar = {60, 80, 75};
		
		int [][] notlar2= {	{50, 50, 50}, {80, 90, 80},{70, 50, 86} };
		
		
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, int[]> map2 = new HashMap<>();

		
		for (int i = 0; i < ogrenci.length; i++) {
			map1.put(ogrenci[i], notlar[i]);
			
		}
		
		for (String isim : map1.keySet() ) { // key değerlerini set içinde topladık
			System.out.println(isim+"==>" + map1.get(isim));
		}
	
		// BURDAN SONRASI ALTERNATİFTİR
		for (Entry<String, Integer> deger : map1.entrySet()) { // ENTRY'DE KULLANILABİLİR
			
			System.out.println(deger.getKey()+"==="+ deger.getValue());
		}
		
		//map2 çözüm
		
		for (int i = 0; i < notlar2.length; i++) {
			map2.put(ogrenci[i], notlar2[i]);
		}
		
		for (Entry<String, int[]> deger: map2.entrySet()) {
			System.out.println(deger.getKey()+ "notları===>");
			int toplam = 0;
			
			for (int not: deger.getValue()) {
				System.out.println(not);
				toplam += not;
				
			}
			System.out.println("ortalama=" + (toplam / deger.getValue().length));
			System.out.println("=========");
			
		}
			
			
	}
}
