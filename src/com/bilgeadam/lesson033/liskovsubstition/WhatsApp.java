package com.bilgeadam.lesson033.liskovsubstition;

import com.bilgeadam.lesson033.utility.Notification;
import com.bilgeadam.lesson033.utility.User;

public class WhatsApp extends SocialMedia implements ISms, IEmail, IConferencable {

	@Override
	public void changeScaleRatio(String type) {
		if (type.equals("jpg")) {
			setSclaeRatio(28);
		} else if (type.equals("png")) {
			setSclaeRatio(32);
		} else {
			setSclaeRatio(36);
		}
	}

	public void sendEmail(User user) {
		if (user.getEmail() != null) {
			Notification.sendEmail(user.getEmail());
		}
	}

	public void sendSms(User user) {
		if (user.getPhone() != null) {
			Notification.sendSms(user.getPhone());
		}
	}

	@Override
	public void videoConferancing() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sharePhoto() {
		// TODO Auto-generated method stub

	}

	@Override
	public void shareStory() {
		// TODO Auto-generated method stub

	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub

	}

}