package com.bilgeadam.lesson006;

/*
 * 
 * sayilar arrayimizde gezelim
 * ve tek sayilar toplamın çift sayılar toplamına oranını bulalım
 * 
 */
public class Question40 {
	public static void main(String[] args) {
		String[] sayilar = { "4", "6", "5", "12", "13"};
		
		double tekToplam=0;
		double ciftToplam=0;
		
		for (int i = 0; i < sayilar.length; i++) {
			
			int sayi = Integer.parseInt(sayilar[i]);  // Integer a çevirdik.
			if (sayi%2==0) {
				ciftToplam+=sayi;
				
			}else {
				tekToplam+= sayi;
			}
		}
		double oran = tekToplam / ciftToplam;
		
		System.out.println("oran= " + oran);
		System.out.println("cift toplam= " + ciftToplam);
		System.out.println("tek toplam= " + tekToplam);
	}

}
