package com.bilgeadam.lesson033.openclosed;

import com.bilgeadam.lesson033.utility.Notification;
import com.bilgeadam.lesson033.utility.User;

public abstract class SocialMedia {

	private double sclaeRatio;

	public abstract void changeScaleRatio(String type);

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

	public double getSclaeRatio() {
		return sclaeRatio;
	}

	public void setSclaeRatio(double sclaeRatio) {
		this.sclaeRatio = sclaeRatio;
	}
}