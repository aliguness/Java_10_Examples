package com.bilgeadam.lesson032.factory;

public class MongoDb implements ILogger {

	@Override
	public void logToDatabase(String message) {
		System.out.println(message + "----> mongoDb'ye loglandı");

	}

}
