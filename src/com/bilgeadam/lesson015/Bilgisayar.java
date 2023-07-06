package com.bilgeadam.lesson015;

import java.util.Arrays;

public class Bilgisayar {

	private String ad;
	private Anakart anakart;
	private HariciDonanim[] hariciDonanimlar;

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public Anakart getAnakart() {
		return anakart;
	}

	public void setAnakart(Anakart anakart) {
		this.anakart = anakart;
	}

	public HariciDonanim[] getHariciDonanimlar() {
		return hariciDonanimlar;
	}

	public void setHariciDonanimlar(HariciDonanim[] hariciDonanimlar) {
		this.hariciDonanimlar = hariciDonanimlar;
	}

	@Override
	public String toString() {
		return "Bilgisayar [ad=" + ad + ", anakart=" + anakart + ", hariciDonanimlar="
				+ Arrays.toString(hariciDonanimlar) + "]";
	}

}