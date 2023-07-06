package com.bilgeadam.lesson018.ODEV;

import java.util.Scanner;

/*
 * 
 * 1 database sec metodu yapalım 
 * bu metot bize 2 secenek sunsun bunlardan birini secip 
 * daha sonra manager sınıfındaki calıstır metodunu calıstıralım ;
 * 
 * 
 */

public class Main {

	public static void main(String[] args) {
//		Database database = databaseSec2();
//		Manager manager = new Manager(database);
//		manager.calistir();

		databaseSec();
	}

	public static void databaseSec() {
		Manager manager;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-Mysql");
		System.out.println("2-Oracle");
		System.out.println("3-PostgreSql");
		System.out.println("Lütfen bir database seciniz");
		int secim = scanner.nextInt();
		Database database = null;
		switch (secim) {
		case 1:
			database = new MySql();
			break;
		case 2:
			database = new Oracle();
			break;
		case 3:
			database = new PostgreSql();
			break;
		default:
			System.out.println("Yanlış secim yaptınız");
			break;
		}
		manager = new Manager(database);
		manager.calistir();

	}

	public static Database databaseSec2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1-Mysql");
		System.out.println("2-Oracle");
		System.out.println("Lütfen bir database seciniz");
		int secim = scanner.nextInt();
		Database database = null;
		switch (secim) {
		case 1:
			database = new MySql();
			break;
		case 2:
			database = new Oracle();
			break;
		default:
			System.out.println("Yanlış secim yaptınız");
			break;
		}
		return database;
	}
}
