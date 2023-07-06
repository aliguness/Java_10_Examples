package com.bilgeadam.lesson033.dependencyinversion.socialmedia;

import com.bilgeadam.lesson033.utility.User;

public class Twitter extends SocialMedia implements ISms, IEmail, IPostable {

	@Override
	public void changeScaleRatio(String type) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sharePhoto() {
		// TODO Auto-generated method stub

	}

	@Override
	public void chat() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sharePost() {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendEmail(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void sendSms(User user) {
		// TODO Auto-generated method stub

	}

}