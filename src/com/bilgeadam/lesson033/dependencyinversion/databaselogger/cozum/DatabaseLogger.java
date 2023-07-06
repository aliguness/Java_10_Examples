package com.bilgeadam.lesson033.dependencyinversion.databaselogger.cozum;

public class DatabaseLogger {

	ILogger databese;

	public DatabaseLogger(ILogger databese) {

		this.databese = databese;
	}

	public void logToDatabase(String ex) {
		databese.log(ex);
	}
}