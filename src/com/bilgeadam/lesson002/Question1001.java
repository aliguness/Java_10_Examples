package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question1001 {
	public static void main(String[] args) {
		
//		int turkLirasi = 100;		
//		float dolarKuru = turkLirasi/19.42f;
//		System.out.println(dolarKuru);
		
		// YENI SORU		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Lütfen dairenin yarıçapı giriniz: ");
//	 		float yariCap = input.nextFloat();
//	 		
//	 		float pi = 3.14f;
//			float alan = yariCap*yariCap*pi;
//			float cevre = 2*pi*yariCap;
//			
//		System.out.println("alanı: "+(alan)+"\n"+"Cevresi: "+(cevre));
		
		//YENI SORU
		
//		int sayi1;
//		int sayi2;
//		int toplam;
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Bir sayı giriniz. ");
//		 sayi1 = input.nextInt();
//		 System.out.println("Lütfen ikinci sayıyı giriniz. ");
//		 sayi2 = input.nextInt();
//		 
//		 toplam = sayi1 + sayi2;
//		 
//		 System.out.println("toplam: "+toplam);
//		 
//		 boolean kontrol = (toplam % 2 == 0);
//		 System.out.println(kontrol);
//		 System.out.println(toplam % 2 == 0?"Çift":"Tek");
//		 System.out.println(kontrol?"Çift":"Tek");
		
		
		// YENİ SORU
//		double vizeNotu;
//		double finalNotu;
//		String isim;
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Lütfen öğrenci ismi giriniz: ");
//		isim =input.nextLine();
//		
//		System.out.println("Lütfen vize notunu giriniz: ");
//		vizeNotu=input.nextDouble();
//		
//		System.out.println("Lütfen final notu giriniz: ");
//		finalNotu =input.nextDouble();
//		
//		double ortalama =(vizeNotu*40/100)+(finalNotu*60/100);
//		
//		System.out.println(ortalama>=60?"Geçti":"Kaldı");
				
		//YENİ SORU ( ekrana 5 kere merhaba yazdırma programı. For ile)
		
		
//		for(int i = 0; i<5; i++) {
//			System.out.println("Merhaba");
//			
//		}
		// YENİ SORU 1'den girdiğimiz sayıya kadar olan sayıların toplamını ekrana yazdıran program.
		
		//For için
		
//		int sayi1;
//		int toplam = 0;
//		Scanner input = new Scanner(System.in);
//				System.out.println("Lütfen bir sayı giriniz: ");
//		 sayi1 = input.nextInt();
//		
//		for(int i=1; i<sayi1; i++) {
//			toplam+=i;
//			
//		}System.out.println("For toplam: "+toplam);
//		
//		//while için
//		
//		toplam = 0;
//		int i = 1;	
//		while ( i<sayi1) {
//			
//			toplam+=i;
//			i++;
//				
//			}System.out.println("While toplam = "+toplam);
		 
		 // YENİ SORU
		
		//1'den başlayıp klavyeden girilen sayıya kadar olan sayıların çiftlerinin toplamını gosteren  program .
		
//		int sayi;
//		int toplam = 0;
//		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Lütfen bir sayı giriniz: ");
//		sayi = input.nextInt();
//		
//		for(int i=0; i<=sayi; i+=2) {
//			toplam+=i;
//		}System.out.println("Toplam: "+toplam);
//		
//		// ? koşullu yöntemi ile yaptık.
//		toplam = 0;
//		for (int i = 1; i <=sayi; i++) {
//			
//			int a =i%2==0?i:0;
//			toplam+=a;	
//		}
//			System.out.println("Toplam: "+toplam);
//		 
		//YENİ SORU
		// kullanıcıdan alınan bir sayının çarpım tablosunu yazdıralım.
		
		
//		Scanner input = new Scanner(System.in);
//			System.out.println("Lütfen bir sayı giriniz");
//			int sayi = input.nextInt();
//			System.out.println("Çarpım tablosu ");
//			for(int i = 1; i<=10; i++) {
//		
//				System.out.println(sayi+"x"+i+ "= " + (sayi *i));
//			}		
		
		// YENİ SORU
		
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Lütfen bir Sayı giriniz: ");
//		
//		int sayi = input.nextInt();
//		int faktoriyel = 1;
//		int i = 1;
//		while( i <= sayi) {
//			faktoriyel*=sayi;
//			sayi--;
//			
//		}System.out.println("faktoriyel= " + faktoriyel);
//		
//		System.out.println("Lütfen bir Sayı giriniz: ");
//		 sayi = input.nextInt();
//		 faktoriyel = 1;
//		 
//		
//		for(int j=1; j<=sayi; j++) {
//			faktoriyel*=j;
//			
//		}System.out.println("Faktoriyel= " + faktoriyel);
//		
//		//j'i azaltarak yapma şekli.
//		
//		faktoriyel = 1;
//		 
//		
//		for(int j=sayi; j>=1; j--) {
//			faktoriyel*=j;
//			
//		}System.out.println("Faktoriyel= " + faktoriyel);
		
		//YENİ SORU
		
		
//		int sayac = 0;
//		int toplam = 0;
//		int sayi = 0;
//		while (toplam<=50) {
//			sayi++;
//			toplam+=sayi;
//			sayac++;
//			System.out.println("dongu toplam" + toplam + " dongu sayısı " + sayac);
//			
//		}
//		System.out.println("toplam: "+(toplam));
//		System.out.println("sayac: "+(sayac));
//		System.out.println("sayac: "+(sayi));
		
		// YENİ SORU
		
//		Scanner input = new Scanner(System.in);
//		System.out.println("Lütfen bir sayı giriniz.");
//		int sayi = input.nextInt();
//		int basamakDegeri;
//		int sayac =0;
//		int toplam =0;
//		
//		do {
//			basamakDegeri = sayi % 10;
//			toplam+=basamakDegeri;
//			sayi/=10;
//			sayac++;
//			
//		} while (sayi != 0); // veya sayi > 0 yazılabilir
//		
//		System.out.println("toplam= " + toplam );
//		System.out.println("basamak sayısı= " + sayac);
		
		// ODEV KISMI
		
//		int sayi,üssü,sonuc=1;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Lütfen önce bir taban sayı sonra üssü sayı giriniz.");
//		sayi=scanner.nextInt();
//		üssü=scanner.nextInt();
//		
//		for(int i =0; i<üssü; i++) {
//			sonuc*=sayi;
//		}
//		System.out.println(sayi+"^"+üssü+" = "+ sonuc );
//		
//		//ODEV 2
//		
//		for(char i = 'A'; i<='Z';i++) {
//			System.out.print(i);
//		}
//		
//		// ODEV 3
//		int sayi2 = 1, toplam = 0, i = 0;
//		
//		for (i = 0; sayi2 != 0; i++) {
//			sayi2 = scanner.nextInt();
//			toplam += sayi2;
//		}
//		System.out.println("Toplam = " + toplam + "\tOrtalama = " + (toplam / (i-1)));
//		
//		// ODEV 4
//		
//		double toplamTek=0,toplamCift=0;
//		for(i=1; i<=100; i++) {
//			
//			if(i%2==0) {
//				toplamCift+=i;
//			}else {
//				toplamTek+=i;
//			}
//		}
//		System.out.println("toplamCift/toplamTek = " +(toplamCift/toplamTek));
		
		//ODEVLERİN FARKLI ÇÖZUMU
//		int taban;
//		int kuvvet;
//		long sonuc=1;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Lütfen bir taban değeri giriniz");
//		taban = scanner.nextInt();
//		System.out.println("kuvvet giriniz");
//		kuvvet=scanner.nextInt();
//		
//		int i = 1;
//		while(i<=kuvvet) {
//			sonuc *= taban;
//			i++;
//		}
//		System.out.println(taban+"^"+kuvvet+"= "+sonuc);
		
		// alfabeyi yazdırma şekli. ASCII kodları. a=97 z=122
//		for(char i=97; i<=122; i++) {
//			System.out.print(i+" ");
//		}
		
		// Başka bir ORNEK
		
//		double toplamTek=0;
//		double toplamCift=0;
//		
//		for (int i = 1; i <= 100; i++) {
//			if (i%2==0) {
//				toplamCift +=i;
//				
//			}else {
//				toplamTek +=i;
//			}
//		}
//		System.out.println("Çift Toplam= "+toplamCift+"\nTek toplam= "+toplamTek);
//		System.out.println("Oranı= "+(toplamCift/toplamTek));
//		
		
		
	}

}
