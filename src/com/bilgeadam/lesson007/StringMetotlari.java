package com.bilgeadam.lesson007;

public class StringMetotlari {

	public static void main(String[] args) {

		String value1 = "Merhaba Dünya";
		String value2 = "Java";
		System.out.println(value1.length());// uzunluk
		System.out.println(value1.charAt(0));// index değerindeki Charı donuyor
		System.out.println(value1.concat(value2));// birleştirme işlemi
		System.out.println(value1);
		System.out.println(value2);
		String value3 = value2.concat(value1);
		System.out.println(value3);
		System.out.println(value1 + value2);
		; // belli index aralıgındaki değerleri alma
		System.out.println(value1.substring(4, 5));
		System.out.println(value1.substring(1));
		System.out.println(value1.substring(7, 9));
		System.out.println(value1.substring(5));
		System.out.println(value1.substring(5, value1.length()));
		System.out.println(value1.substring(5, value1.length() - 1));
		// içeriyormu
		System.out.println(value1.contains("Mer"));
		System.out.println(value1.contains("D"));
		System.out.println(value1.contains(" D"));
		System.out.println(value1.contains(" d"));
		// eşitlik kontrolu
		String value4 = "Merhaba Dünya";
		String value5 = "merhaba Dünya";
		String value6 = new String("Merhaba Dünya");
		String value7 = new String("Merhaba Dünya");
		System.out.println(value1.equals(value4));
		System.out.println(value1.equals(value5));
		System.out.println(value1.equalsIgnoreCase(value5));
		System.out.println(value1 == value4);
		System.out.println(value1 == value6);
		System.out.println(value1.equals(value6));
		System.out.println(value7.equals(value6));
		System.out.println(value7 == value6);

		//

//		value6 = value7;
//		System.out.println(value7 == value6);
//
//		value7 = "Mustafa";
//
//		System.out.println(value6);
//		value6 = "XXX";
//		System.out.println(value7);
//		String value8 = value6 + "12";
//		value8 += 5;
		// Merhaba Dünya
		// Bir karakterin kacıncı indexde oldugunu bulan metot
		System.out.println(value1.indexOf("a"));
		System.out.println(value1.lastIndexOf("a"));
		System.out.println(value1.lastIndexOf("a"));
		System.out.println(value1.indexOf("x"));
		// Uppercase LowerCase // buyultme kücültme
		System.out.println(value1.toUpperCase());
		// value1 = value1.toUpperCase();
		System.out.println(value1);
		System.out.println(value1.toLowerCase());
		// System.out.println(value1.toUpperCase(Locale.ENGLISH));
		System.out.println(value1.substring(0, 3).toUpperCase() + value1.substring(3));
		// replace //değiştirme
		System.out.println(value1.replace('a', 'x'));
		System.out.println(value1.replace("a", "c"));
		System.out.println(value1.replace("x", "c"));

		// StartsWith endWiths // ile baslıyor mu ile bitiyor mu
		System.out.println(value1.startsWith("M"));
		System.out.println(value1.startsWith("m"));
		System.out.println(value1.endsWith("a"));
		System.out.println(value1.endsWith("m"));

		String value9 = " xxx ";
		System.out.println(value9);
		System.out.println(value9.trim());

		// split
		String value10 = "Java,React,.Net";
		String[] dizi = value10.split("a");
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		// System.out.println(dizi[0]);
		char[] array = value10.toCharArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}

	}

}