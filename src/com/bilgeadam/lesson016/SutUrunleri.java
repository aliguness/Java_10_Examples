package com.bilgeadam.lesson016;

public class SutUrunleri extends Urun{
	
	private String tur;

	public SutUrunleri(double fiyat, String barkod, String sonKullanmaTarihi, String tur) {
		super(fiyat, barkod, sonKullanmaTarihi);
		this.tur = tur;
	}

	public String getTur() {
		return tur;
	}

	public void setTur(String tur) {
		this.tur = tur;
	}

	@Override
	public String toString() {
		return "SutUrunleri [tur=" + tur + ", getFiyat()=" + getFiyat() + ", getBarkod()=" + getBarkod()
				+ ", getSonKullanmaTarihi()=" + getSonKullanmaTarihi() + "]";
	}
	

}
