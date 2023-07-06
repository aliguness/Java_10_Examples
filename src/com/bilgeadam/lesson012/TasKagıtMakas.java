package com.bilgeadam.lesson012;

import java.awt.color.ICC_Profile;

/*
 * 
 * Seceneklerimiz enum olsun
 * 
 * daha sonra bu secenekleri, kullanıcıyasunup aralarından bir tanesini seçmesini istiyelim
 * 
 * pc seçimi ise random bir şikelilde bu 3seçenekten biri olsun
 * daha sonra seçtiğimiz ile pc seçimini karşılaştırıp kazanıp kazanmadığını belirleyelim
 * 
 * 
 */

import java.util.Random;
import java.util.Scanner;


public class TasKagıtMakas {
	
	static ESecenek [] secenekler = ESecenek.values();  // Burada seçenekleri diziye çevirdik. Birden fazla metodda kullanmak için. taskagıtınmakasın secenekler adında bir ozelliği var gibi.
	
	
	public static ESecenek secimYap() {
		Scanner scanner = new Scanner(System.in);
		for (ESecenek secenek: secenekler) {
			System.out.println((secenek.ordinal() + 1)+ "-"+ secenek);
			
		}
		System.out.println("Lütfen TAS/KAGIT/MAKAS");
		/*
		 * 1-Tas  2-Kagıt 3-Makas     seçim yaptırcaz.
		 * 
		 */		
		
		int secim = secimKontrol();
		
		return secenekler[secim-1];
		
		
	}


	private static int secimKontrol() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen TAS/KAGIT/MAKAS verilerinden birini seciniz");
		int secim = -1;
		
//		while (secim < 1 && secim > 3) {
//			System.out.println("yanlış bir secim yaptınız lütfen tekrar deneyiniz");
//			secim = scanner.nextInt();
//		}
		
		do {
			System.out.println("lütfen 1 ile 3 arası bir sayı giriniz");
			secim = scanner.nextInt();
		} while (secim < 1 || secim > 3);
		
				
				return secim;
	}
	
	public static ESecenek pcSecimiYap() {
		
		Random random = new Random();
		int index = random.nextInt(secenekler.length); // lenght  3 ==>0,1,2
		
		return secenekler[index];
	}
	
	public static void oyun() {
		
		ESecenek secimim = secimYap();
		ESecenek pcSecim = pcSecimiYap();
		
		if (pcSecim == secimim) {
			System.out.println("Beraberlik");
			
		} else {
			switch (secimim) {
			case TAS:
				if (pcSecim == ESecenek.KAGIT) {
					System.out.println("Kaybettiniz");
				}else {
					System.out.println("Kazandınız");
				}
				
				break;
			case KAGIT:
				if (pcSecim == ESecenek.MAKAS) {
					System.out.println("Kaybettiniz");
				}else {
					System.out.println("Kazandınız");
				}
				break;
				
			case MAKAS:
					if(pcSecim == ESecenek.TAS) {
						System.out.println("Kaybettiniz");
					}else {
						System.out.println("Kazandınız");
					}
					break;
			default:
				break;
			}
		}
		System.out.println("pcSecimi ==> "+ pcSecim);
		
		
	}
	
}
