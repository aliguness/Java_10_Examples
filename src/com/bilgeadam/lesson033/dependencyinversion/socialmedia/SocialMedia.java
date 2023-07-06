package com.bilgeadam.lesson033.dependencyinversion.socialmedia;

public abstract class SocialMedia implements ISocialMedia {

	private double sclaeRatio;

	public abstract void changeScaleRatio(String type);

	public double getSclaeRatio() {
		return sclaeRatio;
	}

	public void setSclaeRatio(double sclaeRatio) {
		this.sclaeRatio = sclaeRatio;
	}

	/// burdaki metotlarımız burdan kaldırabiliriz alt sınıflar implemente ettiği
	// için kaldırırsak sorun çıkmayacaktır.

	public abstract void sharePhoto();

	public abstract void chat();

}