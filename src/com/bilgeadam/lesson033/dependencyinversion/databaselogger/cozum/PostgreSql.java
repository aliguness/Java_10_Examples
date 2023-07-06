package com.bilgeadam.lesson033.dependencyinversion.databaselogger.cozum;

public class PostgreSql implements ILogger {

	public void log(String ex) {
		System.out.println(ex + " ---> postgreye loglandı");
	}

}