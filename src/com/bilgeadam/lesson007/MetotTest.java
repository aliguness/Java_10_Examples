package com.bilgeadam.lesson007;

public class MetotTest {

	public static void main(String[] args) {
		String[] array = new String[3];
		metot1();
		String deger = "Java";
		int sayi = 1;

		metot2(deger, sayi, array);

		System.out.println("main metod===>" + array[1]);

		System.out.println(topla());
		int result = topla();

		System.out.println(result + 5);

		String isim = metot3();

		System.out.println(isim);

		System.out.println(cikar(10, 5));

		int result2 = cikar(12, 18);

		System.out.println(result2);

		String[] yeniDizi = new String[3];
		System.out.println(yeniDizi[0]);
		// arrayOlustur(yeniDizi);
		System.out.println(arrayOlustur(yeniDizi)[0]);
		// System.out.println(yeniDizi[0]);

		String[] yeniDizi2 = arrayOlustur2();
		System.out.println(yeniDizi2[1]);
	}

// Geri donusu olmayan parametresiz metot
	public static void metot1() {
		int sayi = 5;
		int sayi2 = 10;
		int sonuc = sayi + sayi2;
		System.out.println(sonuc);
		System.out.println("Metot1  çalışıyor");

	}
// geri donusu olmayan parametreli metot

	public static void metot2(String kelime, int sayi, String[] dizi) {
		System.out.println("Metot2  çalışıyor");
		dizi[sayi] = kelime;
		System.out.println(sayi);
		System.out.println(dizi[sayi]);
	}

	// geri donusulu parametresiz

	public static int topla() {
		int sayi1 = 12;
		int sayi2 = 13;
		int sonuc = sayi1 + sayi2;
		// System.out.println(sonuc);
		return sonuc;
	}

	public static String metot3() {
		return "Mustafa";
	}
	// geri donusulu parametreli

	public static int cikar(int sayi1, int sayi2) {
		sayi1 = sayi1 / 2;
//		sayi1 = 2;
//		sayi2 = 1;
		double sayi3 = 50;
		return (int) (sayi3 - sayi1 - sayi2);
	}

	public static String[] arrayOlustur(String[] dizi) {
		// dizi = new String[3];
		dizi[0] = "Html";
		dizi[1] = "Css";
		dizi[2] = "JavaScript";

		return dizi;
	}

	public static String[] arrayOlustur2() {
		String[] yeniDizi = new String[4];
		yeniDizi[0] = "Html";
		yeniDizi[1] = "Css";
		yeniDizi[2] = "JavaScript";

		return yeniDizi;
	}
}