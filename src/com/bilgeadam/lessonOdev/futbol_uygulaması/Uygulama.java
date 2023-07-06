package com.bilgeadam.lessonOdev.futbol_uygulaması;

public class Uygulama {
	
	public static void main(String[] args) {
		
		
		Takim takim = new Takim("FenerBahçe", "Istanbul", 55000, null, null, null);
		
		Futbolcu futbolcu1 = new Futbolcu("Futbolcu1", "Defans", 2, 70, 75, 78, 60, 80);
		Futbolcu futbolcu2 = new Futbolcu("Futbolcu2", "Defans", 3, 70, 75, 78, 60, 80);
		Futbolcu futbolcu3 = new Futbolcu("Futbolcu3", "Defans", 4, 70, 75, 78, 60, 80);
		Futbolcu futbolcu4 = new Futbolcu("Futbolcu4", "Defans", 5, 70, 75, 78, 60, 80);
		Futbolcu futbolcu5 = new Futbolcu("Futbolcu5", "Orta Saha", 6, 78, 76, 78, 70, 80);
		Futbolcu futbolcu6 = new Futbolcu("Futbolcu6", "Orta Saha", 7, 70, 75, 78, 60, 80);
		Futbolcu futbolcu7 = new Futbolcu("Futbolcu7", "Orta Saha", 8, 70, 75, 78, 60, 80);
		Futbolcu futbolcu8 = new Futbolcu("Futbolcu8", "Orta Saha", 9, 70, 75, 78, 60, 80);
		Futbolcu futbolcu9 = new Futbolcu("Futbolcu9", "Forvet", 11, 65, 75, 90, 60, 80);
		Futbolcu futbolcu10 = new Futbolcu("Futbolcu10", "Forvet", 10, 70, 75, 78, 60, 80);
		Kaleci kaleci = new Kaleci("Volkan", "Kaleci", 1, 85, 70, 75, 30, 80, 90, 95);
		
		
		takim.kaleciEkle(kaleci);
		takim.defansOyucusuEkle(futbolcu1);
		takim.defansOyucusuEkle(futbolcu2);
		takim.defansOyucusuEkle(futbolcu3);
		takim.defansOyucusuEkle(futbolcu4);
		takim.defansOyucusuEkle(futbolcu5);
		takim.ortaSahaOyuncusuEkle(futbolcu6);
		takim.ortaSahaOyuncusuEkle(futbolcu7);
		takim.ortaSahaOyuncusuEkle(futbolcu8);
		takim.ortaSahaOyuncusuEkle(futbolcu9);
		takim.forvetOyuncusuEkle(futbolcu10);
		
		
		takim.taktikBelirle("4-4-2");
		
		
	}

}
