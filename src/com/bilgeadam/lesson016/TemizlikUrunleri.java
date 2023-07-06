package com.bilgeadam.lesson016;

public class TemizlikUrunleri extends Urun{
	
	private boolean zararliMi;

	public TemizlikUrunleri(double fiyat, String barkod, String sonKullanmaTarihi, boolean zararliMi) {
		super(fiyat, barkod, sonKullanmaTarihi);
		this.zararliMi = zararliMi;
	}

	public boolean isZararliMi() {
		return zararliMi;
	}

	public void setZararliMi(boolean zararliMi) {
		this.zararliMi = zararliMi;
	}

	@Override
	public String toString() {
		return "TemizlikUrunleri [zararliMi=" + zararliMi + ", getFiyat()=" + getFiyat() + ", getBarkod()="
				+ getBarkod() + ", getSonKullanmaTarihi()=" + getSonKullanmaTarihi() + "]";
	}
	
	

}
