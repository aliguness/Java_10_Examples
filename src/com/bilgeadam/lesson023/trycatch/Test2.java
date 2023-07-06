package com.bilgeadam.lesson023.trycatch;

import java.util.Scanner;

// soruyu kendimce çözmeye çalışma denemesi. Amaa hatalar var


public class Test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int sayi1, sayi2;
		double sonuc = 0;
		boolean kontrol = false;
		
		do {
			System.out.println("Birinci sayıyı giriniz: ");
			sayi1 = scanner.nextInt();

			
			System.out.println("İkinci sayıyı giriniz: ");
			sayi2 = scanner.nextInt();
			try {
				sonuc = sayi1 / sayi2;
				System.out.println("başarılı kod");
				System.out.println("bölme işlemi sonucu: "+ sonuc);
				break;

			} catch (ArithmeticException e) {
				System.out.println(e.toString());
				kontrol = true;
				System.out.println("Hata: " + e.getMessage());
				e.printStackTrace();
				System.out.println("Hata yakalandı tekrar deneyin");
				
			}
			
			
			
		} while (sonuc== 0);
		
		
	}
	public static int bolme(int sayi1, int sayi2) {
		if (sayi2 == 0) {
			throw new ArithmeticException("Sıfıra bölme hatası aldınız!");
			
		}
		return sayi1 / sayi2;
	}

}
