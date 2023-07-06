package com.bilgeadam.lesson018;

import java.util.Scanner;

public class Manager {
	
	Scanner scanner = new Scanner(System.in);
	
	
	
	public void menu() {
		
		System.out.println("1-Veriekle");
		System.out.println("2-Verisil");
		System.out.println("3-Veriguncelle");
		System.out.println("4-Verilerigetir");
		System.out.println("0-Çıkış");
	}
		
	
	public void calistir() {
		
		IDatabase database = secim();
		
		database.login();	
		
		String islem;
		
		System.out.println("=====================");
		
		do {
			menu();
			System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz..");
			islem= scanner.nextLine();
			
			switch (islem) {
			case "1":
				database.veriEkle();
				
				break;
			case "2":
				database.veriSil();
				break;
			case "3":
				database.veriGuncelle();
				break;
			case "4":
				database.verileriGetir();
				break;
			case "0":
				System.out.println("Çıkış yapıldı...");
				break;

			default:
				System.out.println("Lütfen geçerli bir işlem giriniz");
				break;
			}
			
			
		} while (!islem.equals("0"));
	}
	
	
	
	public IDatabase secim() {
		System.out.println("1-MySql");
		System.out.println("2-Oracle");

		System.out.println("Lütfen database seçimini yapınız");
		IDatabase database= null;
		
		String secim = scanner.nextLine();
		switch (secim) {
		case "1":
			database = new MySql();
			
			break;
		case "2":
			database = new Oracle();
			break;

		default:
			System.out.println("Lütfen geçerli bir giriş yapınız...");
			break;
		}
		return database;
	}
}
