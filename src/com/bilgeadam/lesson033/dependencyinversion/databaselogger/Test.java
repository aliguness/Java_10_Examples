package com.bilgeadam.lesson033.dependencyinversion.databaselogger;

import com.bilgeadam.lesson033.dependencyinversion.exception.StoryException;
import com.bilgeadam.lesson033.dependencyinversion.exception.VideoException;
import com.bilgeadam.lesson033.dependencyinversion.socialmedia.WhatsApp;

public class Test {

	public static void main(String[] args) {
		WhatsApp whatsApp = new WhatsApp();
		DatabaseLogger databaseLogger = new DatabaseLogger();

		try {
			whatsApp.videoConferancing();

		} catch (VideoException e) {
			databaseLogger.logToMongo(e.toString());
		}

		try {
			whatsApp.shareStory();
		} catch (StoryException e) {
			databaseLogger.logToPostgre(e.toString());
		}
	}
}