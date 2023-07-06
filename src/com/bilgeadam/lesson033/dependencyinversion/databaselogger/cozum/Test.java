package com.bilgeadam.lesson033.dependencyinversion.databaselogger.cozum;

import com.bilgeadam.lesson033.dependencyinversion.exception.StoryException;
import com.bilgeadam.lesson033.dependencyinversion.exception.VideoException;
import com.bilgeadam.lesson033.dependencyinversion.socialmedia.WhatsApp;

public class Test {

	public static void main(String[] args) {
		WhatsApp whatsApp = new WhatsApp();
		DatabaseLogger databaseLogger = null;
		try {
			whatsApp.videoConferancing();

		} catch (VideoException e) {
//			MongoDb mongoDb = new MongoDb();
			Mysql mysql = new Mysql();
			databaseLogger = new DatabaseLogger(mysql);
			databaseLogger.logToDatabase(e.toString());
		}

		try {
			whatsApp.shareStory();
		} catch (StoryException e) {
			PostgreSql postgreSql = new PostgreSql();
			databaseLogger = new DatabaseLogger(postgreSql);
			databaseLogger.logToDatabase(e.toString());

		}
	}
}