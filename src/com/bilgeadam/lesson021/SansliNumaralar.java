package com.bilgeadam.lesson021;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SansliNumaralar {

	Map<Integer, Integer> map;
	List<Integer> list;
	Set<Integer> set;

	/*
	 * 20=4 30=2 1=14 35=2
	 * 
	 */

	public SansliNumaralar() {
		map = new HashMap<>();
		list = new ArrayList<>();
		set = new TreeSet<>();
	}

	public void mapOlustur() {
		Random random = new Random();
		for (int i = 0; i < 10000; i++) {
			int sayi = random.nextInt(1, 101);
			if (!map.containsKey(sayi)) {
				map.put(sayi, 1);
			} else {
				map.replace(sayi, map.get(sayi) + 1);
			}

		}

	}

	public void listeOlustur() {
		for (Integer key : map.keySet()) {
			int value = map.get(key);
			for (int i = 0; i < value; i++) {
				list.add(key);
			}
		}
	}
	
	public void sansliNumaraliBul() {
		Random random = new Random();
		Collections.shuffle(list);
		int count = 0;
		while (set.size() < 10) {
			count++;
			int index = random.nextInt(list.size());
			set.add(list.get(index));
		}
		
		System.out.println("Dongu sayisi" + count );
		
	//	for (int i = 0; i < 10; i++) {
	//		int index = random.nextInt(list.size());
	//		set.add(list.get(index));
	//	}
		
		
	}

}



/*
 * public class SansliNumaralar { public static void main(String[] args) { //
 * Rastgele sayı üretimi için Random sınıfını kullanalım Random random = new
 * Random();
 * 
 * // Sayıların sayısını tutmak için bir Map yapısı oluşturalım Map<Integer,
 * Integer> sayiAdetleri = new HashMap<>();
 * 
 * // 1'den 100'e kadar rastgele 10000 sayı üretelim for (int i = 0; i < 10000;
 * i++) { int sayi = random.nextInt(100) + 1; // 1 ile 100 arasında rastgele bir
 * sayı üretelim
 * 
 * // Oluşturulan sayıyı Map yapısında tutalım if
 * (sayiAdetleri.containsKey(sayi)) { int adet = sayiAdetleri.get(sayi);
 * sayiAdetleri.put(sayi, adet + 1); // Sayının adetini bir arttıralım } else {
 * sayiAdetleri.put(sayi, 1); // Yeni bir sayı olduğu için adetini 1 olarak
 * ayarlayalım } }
 * 
 * // Her sayıya karşılık gelen adetleri ekrana yazdıralım for (int sayi :
 * sayiAdetleri.keySet()) { int adet = sayiAdetleri.get(sayi);
 * System.out.println(sayi + " = " + adet); } } }
 * 
 */
