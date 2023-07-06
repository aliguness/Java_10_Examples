package com.bilgeadam.lesson032.factory;

import java.util.Scanner;

/*
 * 
 * kullanıcıdan aldıgım databse ismine gore loglama yapacagım 
 * 
 * 
 */
public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen bir database ismi giriniz");
		String dbName = scanner.nextLine().toLowerCase();
		ILogger logger = DatabaseFactory.createDatabase(dbName);

//		switch (dbName) {
//		case "postgre":
//			logger = new PostgreSql();
//			break;
//		case "mongo":
//			logger = new MongoDb();
//			break;
//		default:
//			System.out.println("Yanlış bir database ismi girdiniz");
//			break;
//		}

		logger.logToDatabase("Log mesaji");

	}

}