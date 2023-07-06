package com.bilgeadam.lessonOdev.futbol_uygulaması;

public class Futbolcu {
	
	private String isim;
	private String mevki;
	private int formaNumarasi;
	private int hiz;
	private int pas;
	private int sut;
	private int topSurme;
	private int dayaniklilik;
	
	
	public Futbolcu(String isim, String mevki, int formaNumarasi, int hiz, int pas, int sut, int topSurme,
			int dayaniklilik) {
		super();
		this.isim = isim;
		this.mevki = mevki;
		this.formaNumarasi = formaNumarasi;
		this.hiz = hiz;
		this.pas = pas;
		this.sut = sut;
		this.topSurme = topSurme;
		this.dayaniklilik = dayaniklilik;
	}


	public void setFormaNumarasi(int formaNumarasi) {
		this.formaNumarasi = formaNumarasi;
	}
	
	
	

}
