package com.bilgeadam.lesson033.openclosed;

public class ResizePhoto {

	public void resizePhoto(Instagram instagram, String type) {
		if (type.equals("jpg")) {
			instagram.setSclaeRatio(38);
		} else if (type.equals("png")) {
			instagram.setSclaeRatio(30);
		} else {
			instagram.setSclaeRatio(40);
		}

	}

	public void resizePhoto2(SocialMedia socialMedia, String type) {

		if (socialMedia instanceof Instagram) {
			if (type.equals("jpg")) {
				socialMedia.setSclaeRatio(38);
			} else if (type.equals("png")) {
				socialMedia.setSclaeRatio(30);
			} else {
				socialMedia.setSclaeRatio(40);
			}
		} else if (socialMedia instanceof Facebook) {
			if (type.equals("jpg")) {
				socialMedia.setSclaeRatio(34);
			} else if (type.equals("png")) {
				socialMedia.setSclaeRatio(37);
			} else {
				socialMedia.setSclaeRatio(45);
			}
		}

	}

	public void resize(SocialMedia socialMedia, String type) {
		socialMedia.changeScaleRatio(type);
	}
}