package com.bilgeadam.lesson008;

import java.util.Scanner;


public class _001_Marathon_Soru5 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int secim;
		
		do {
			//Menü
			
			System.out.println("\n* * * * * * * * * * * * * *");
			System.out.println("* Geometrik Hesaplayıcı       *");
			System.out.println("* * * * * * * * * * * * * * *");
			System.out.println("1. kare alan hesaplama");
			System.out.println("2. kare çevre hesaplama");
			System.out.println("3. Dikdörtgen alan hesaplama");
			System.out.println("4. Dikdörtgen çevre hesaplama");
			System.out.println("5. Daire alan hesaplama");
			System.out.println("6. Daire çevre hesaplama");
			System.out.println("7. Çıkış");
			System.out.println("\nSeçiminiz (1 - 7): ");
			
			//seçim kısmı ataması
			System.out.println("Lütfen bir seçim yapınız: ");
			secim = input.nextInt();
			
			switch (secim) {
			case 1:
				// kare alanı hesaplaması
				System.out.print(("\nLütfen karenin bir kenar uzunluğunu giriniz"));
				double kenar =input.nextDouble();
				double kareAlan = kenar * kenar;
				System.out.printf("Karenin alanı: " + kareAlan);
				
				break;
			case 2:
				// kare alanı hesaplaması
				System.out.print(("\nLütfen karenin bir kenar uzunluğunu giriniz"));
				double kenar2 = input.nextDouble();
				double kareCevre = 4 * kenar2;
				System.out.println("Karenin alanı: " + kareCevre);
				break;
			case 3:
				// dikdörtgen alan hesaplaması
				System.out.print("\nDikdörtgenin kısa kenar uzunluğunu girin: ");
				double kisaKenar = input.nextDouble();
				System.out.print("Dikdörtgenin uzun kenar uzunlugunu girin: ");
				double uzunKenar = input.nextDouble();
				double dikdortgenAlan = kisaKenar * uzunKenar;
				System.out.println("Dikdörtgenin alanı: " + dikdortgenAlan);
				break;
				
			case 4:
				// dikdörtgen çevre hesaplaması
				System.out.print("\nDikdörtgenin kısa kenar uzunluğunu girin: ");
				double kisaKenar1 = input.nextDouble();
				System.out.print("Dikdörtgenin uzun kenar uzunlugunu girin: ");
				double uzunKenar1 = input.nextDouble();
				double dikdortgenCevre = 2 * (kisaKenar1 + uzunKenar1);
				System.out.println("Dikdörtgenin çevresi: " + dikdortgenCevre);
				
				break;
			case 5:
				// Daire cevre hesaplaması
				System.out.print("\nDairenin yarıçapını girin: ");
				double yaricap = input.nextDouble();
				double daireCevre = 2 * yaricap * 3.14;
				System.out.println("Dairenin cevresi: " + daireCevre);
				break;
			case 6:
				// Daire  alan hesaplaması
				System.out.print("\nDairenin yarıçapını girin: ");
				double yaricap1 = input.nextDouble();
				double daireAlan = yaricap1 * yaricap1 * 3.14;
				System.out.println("Dairenin alanı: " + daireAlan);
				break;
			case 7:
				System.out.println("Programdan çıkılıyor...");
				break;

			default:
				System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar sayı girin");
				break;
			}
			
		} while (secim !=7);
		
	//	input.close();
		
		
	}


}
