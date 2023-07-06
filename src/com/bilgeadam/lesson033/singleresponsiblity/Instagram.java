package com.bilgeadam.lesson033.singleresponsiblity;

import com.bilgeadam.lesson033.utility.Notification;
import com.bilgeadam.lesson033.utility.User;

/*
 * bir bildirim gonder metodu yazmanızı istioyrum 
 *  daha sonra eğer kullanıcın  emaili varsa email gonder 
 *  telefonu varsa sms gondersin hem telefon hem email varsa ikisinide gondersin 
 *  
 *  bildirim gonder==> Kullanıcı
 *  sms==>> 555-555-555 ==> sms gonderiliyor
 *  email=> mustafa@gmail.com ==> email gonderiliyor 
 * 
 * 
 * 
 */
public class Instagram {

	/*
	 * 1. basamakda bir sendNotification metodu yazdık kullanıcın telefon ve emilini
	 * kontrol edip ona gore bildirimler verdik fakat bu metodun single
	 * responsibilitye uymadığını farkettik ve 2. basama geçtik
	 * 
	 * 
	 */
	public void sendNotification(User user) {

		if (user.getEmail() != null) {

			Notification.sendEmail(user.getEmail());
		}
		if (user.getPhone() != null) {

			Notification.sendSms(user.getPhone());
		}

	}

	/*
	 * 
	 * 2. basamakda yukarıdaki metodu gorevlerine gore 2 ye ayırdık 2 ayrı metot ile
	 * single responsibilitye uygun hale getirdik
	 * 
	 */

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

}