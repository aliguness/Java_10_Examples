package com.bilgeadam.lesson033.openclosed;

public class WhatsApp extends SocialMedia {

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

}