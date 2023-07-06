package com.bilgeadam.lessonOdev.futbol_uygulaması;

public class Defans extends Futbolcu {
	
	
	private int topCalma;
	private int markaj;
	private int sıçrama;
	
	
	
	public Defans(String isim, String mevki, int formaNumarasi, int hiz, int pas, int sut, int topSurme,
			int dayaniklilik, int topCalma, int markaj, int sıçrama) {
		super(isim, "Defans", formaNumarasi, 0, 0, 0, 0, 0);
		this.topCalma = topCalma;
		this.markaj = markaj;
		this.sıçrama = sıçrama;
	}
	
	
	
	

}
