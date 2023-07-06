package com.bilgeadam.lesson018.databaseOrnek;

import java.util.ArrayList;
import java.util.List;

/*
 * 1 tane liste olusturalım
 * 
 * Ankara
 * Bursa
 * Antalya
 * Artvin
 * Erzurum
 * Bursa
 * Karaman
 * 
 * 
 * an ile baslayan şehirleri silelim
 * 
 * 
 */
public class ArraylistOrnek {

	public static void main(String[] args) {

		List<String> sehirler = new ArrayList<>();
		sehirler.add("Ankara");
		sehirler.add("Antalya");
		sehirler.add("Bursa");
		sehirler.add("Artvin");
		sehirler.add("Erzurum");
		sehirler.add("Canakkale");
		sehirler.add("Antalya");
		sehirler.add("Ankara");
		sehirler.add("Karaman");
		sehirler.add("Ankara");
		sehirler.add("Ankara");

//		for (int i = 0; i < sehirler.size(); i++) {
//			System.out.println("liste boyutu ===> " + sehirler.size());
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.remove(i);
//				i--;
//			}
//		}

//		for (int i = 0; i < sehirler.size(); i++) {
//			System.out.println("liste boyutu ===> " + sehirler.size());
//			if (sehirler.get(i).startsWith("An")) {
//				sehirler.remove(i);
//				sehirler.add(i, "xxx");
//			}
//		}
		for (int i = 0; i < sehirler.size(); i++) {
			System.out.println("liste boyutu ===> " + sehirler.size());
			if (sehirler.get(i).startsWith("An")) {
				sehirler.set(i, "xxx");
			}
		}

		for (int i = 0; i < sehirler.size(); i++) {
			System.out.println("liste boyutu ===> " + sehirler.size());
			if (sehirler.get(i).startsWith("An")) {
				sehirler.set(i, sehirler.get(i).replace("An", "xxx"));
			}
		}

		System.out.println(sehirler);

	}

}
