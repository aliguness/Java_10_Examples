package com.bilgeadam.lesson018.databaseOrnek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraylistTest2 {

	public static void main(String[] args) {

		String[] array = { "Ankara", "Bursa", "Artvin" };

//		List<String> liste = Arrays.asList(array);
//		System.out.println(liste);
//		liste.remove(1);

		// dogru kullanım
		List<String> liste2 = new ArrayList<>(Arrays.asList(array));
		System.out.println(liste2);
		liste2.remove(1);
		System.out.println(liste2);

//		List<String> liste3 = List.of("İstanbul", "Erzurum", "Konya");
//		System.out.println(liste3);
//		liste3.remove(1);

		List<String> liste3 = new ArrayList<>(List.of("İstanbul", "Erzurum", "Konya"));
		System.out.println(liste3);
		liste3.remove(1);
		System.out.println(liste3);
		System.out.println(liste3.contains("Ankara"));
		liste3.add("Ankara");
		Collections.shuffle(liste3);
		System.out.println(liste3);
		Collections.sort(liste3);
		System.out.println(liste3);
	}

}
