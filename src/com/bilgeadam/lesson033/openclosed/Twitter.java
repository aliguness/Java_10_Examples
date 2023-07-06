package com.bilgeadam.lesson033.openclosed;

public class Twitter extends SocialMedia {

	@Override
	public void changeScaleRatio(String type) {
		if (type.equals("jpg")) {
			setSclaeRatio(37);
		} else if (type.equals("png")) {
			setSclaeRatio(42);
		} else {
			setSclaeRatio(46);
		}
	}

}