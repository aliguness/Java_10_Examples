package com.bilgeadam.lessonOdev.futbol_uygulaması;

public class Kaleci extends Futbolcu{
	
	
	private int kurtaris;
	private int gorusAlani;



	public Kaleci(String isim, String mevki, int formaNumarasi, int hiz, int pas, int sut, int topSurme,
			int dayaniklilik, int kurtaris, int gorusAlani) {
		super(isim, "Kaleci", formaNumarasi, 0, 0, 0, 0, 0);
		this.kurtaris = kurtaris;
		this.gorusAlani = gorusAlani;
	}

}
