package com.bilgeadam.lesson018.ODEV;

import java.util.Scanner;

public class Manager {
	
	Database database;
	
	
	
	public Manager(Database database) { // dışarıdan bir tane database alıp içeridekine veriyor.
		super();
		this.database = database;
	}

	public void menu() {
		
		System.out.println("1-Veriekle");
		System.out.println("2-Verisil");
		System.out.println("3-Veriguncelle");
		System.out.println("4-Verilerigetir");
		System.out.println("0-Çıkış");
		
	}
	
	public void calistir() {
		
		Scanner scanner = new Scanner(System.in);
		
		int secim = 0;
		database.login();
		do {
			
			menu();
			secim=scanner.nextInt();
			switch (secim) {
			case 1:
				database.veriEkle();
				break;
			case 2:
				database.veriSil();
				break;
			case 3:
				database.veriGuncelle();
				break;
			case 4:
				database.verileriGetir();
				break;
			case 0:

			default:
				System.out.println();
				break;
			}
		} while (secim != 0);
	}

}
