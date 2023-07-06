package com.bilgeadam.lesson033.openclosed;

public class Facebook extends SocialMedia {

	@Override
	public void changeScaleRatio(String type) {

		if (type.equals("jpg")) {
			setSclaeRatio(34);
		} else if (type.equals("png")) {
			setSclaeRatio(37);
		} else {
			setSclaeRatio(45);
		}
	}
}