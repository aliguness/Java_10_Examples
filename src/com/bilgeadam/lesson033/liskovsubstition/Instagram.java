package com.bilgeadam.lesson033.liskovsubstition;

import com.bilgeadam.lesson033.utility.Notification;
import com.bilgeadam.lesson033.utility.User;

/* Liskov substition
 * 
 * 1- email ve sms gonder meotlarımız vardı sonra facebok dediki ben artık 
 * sms gondermeyi desteklemiyorum bu sorunu nasıl cozeriz 
 * 
 * 
 * 2- Whatsapp sadece video konferans,sohbet,resimpaylaş,hikaye paylaş ozelliklerini destekliyor
 * -- Facebook==>  post,resim,hikaye,sohbet
 * -- Instagram==> post,resim,hikaye ,sohbet
 * 
 * 
 */
public class Instagram extends SocialMedia implements ISms, IEmail, IPostable {

	@Override
	public void changeScaleRatio(String type) {

		if (type.equals("jpg")) {
			setSclaeRatio(38);
		} else if (type.equals("png")) {
			setSclaeRatio(30);
		} else {
			setSclaeRatio(40);
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
	public void sharePost() {
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