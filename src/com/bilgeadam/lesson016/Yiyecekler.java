package com.bilgeadam.lesson016;

public class Yiyecekler extends Urun{

	private boolean paketliMi;

	public Yiyecekler(double fiyat, String barkod, String sonKullanmaTarihi, boolean paketliMi) {
		super(fiyat, barkod, sonKullanmaTarihi);
		this.paketliMi = paketliMi;
	}

	public boolean isPaketliMi() {
		return paketliMi;
	}

	public void setPaketliMi(boolean paketliMi) {
		this.paketliMi = paketliMi;
	}

	@Override
	public String toString() {
		return "Yiyecekler [paketliMi=" + paketliMi + ", getFiyat()=" + getFiyat() + ", getBarkod()=" + getBarkod()
				+ ", getSonKullanmaTarihi()=" + getSonKullanmaTarihi() + "]";
	}
	
	
	
}
