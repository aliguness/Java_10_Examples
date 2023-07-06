package com.bilgeadam.lesson003;
/*
 * 
 * 1 den başlayarak sayıları toplayalım toplamımız 50 den büyük olana kadar programımız
 * çalışsın sonunda da toplamı ve kaç kere çalıştığını yazalım;
 * 
 * 
 */
public class Question14 {
	public static void main(String[] args) {
		
		int sayac = 0;
		int toplam = 0;
		int sayi = 0;
		while (toplam<=50) {
			sayi++;
			toplam+= sayi;
			sayac++;
			System.out.println("dongu toplam= "+toplam+" dongu sayısı " + sayac);
		}
		System.out.println("toplam= " + toplam);
		System.out.println("sayac= " + sayac);
		System.out.println("sayi= " + sayi);
	}
}
