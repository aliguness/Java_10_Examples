package com.bilgeadam.lesson013;

public class StringPool {

	public static void main(String[] args) {

		String isim = "Mustafa";
		String isim2 = "Mustafa";

		System.out.println(isim == isim2);

		String isim3 = "Mustafa Ozturk";
		String isim4 = "Mustafa Ozturk";
		isim4 = "Mustafa ÖZTÜRK";
		isim4 = "Serkan";

		String isim5 = "Mustafa ÖZTÜRK";

		System.out.println(isim4 == isim5);

		String isim6 = new String("Hilal");
		String isim7 = new String("Hilal");
		String isim8 = new String("Hilal");
		isim6 = isim8;
		isim7 = isim8;
		isim8 = "xxx";
		System.out.println(isim8 == isim7);
		System.out.println(isim7);
		String isim9 = "Hilal";
		String isim10 = new String("Hilal");

		System.out.println(isim10 == isim9);

	}

}
