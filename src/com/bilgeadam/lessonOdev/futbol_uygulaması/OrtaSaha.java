package com.bilgeadam.lessonOdev.futbol_uygulaması;

public class OrtaSaha extends Futbolcu{
	
	private int uzunTop;
	private int uretkenlik;
	
	
	
	public OrtaSaha(String isim, String mevki, int formaNumarasi, int hiz, int pas, int sut, int topSurme,
			int dayaniklilik, int uzunTop, int uretkenlik) {
		super(isim, "Orta Saha", formaNumarasi, 0, 0, 0, 0, 0);
		this.uzunTop = uzunTop;
		this.uretkenlik = uretkenlik;
	}

	
	
}
