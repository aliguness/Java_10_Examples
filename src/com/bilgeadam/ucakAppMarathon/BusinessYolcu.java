package com.bilgeadam.ucakAppMarathon;

public class BusinessYolcu extends Yolcu {

	static final int BUSINNES_FIYAT = 200;

	static final int BUSINNESVIP_FIYAT = 150;

	private boolean isVip;

	public BusinessYolcu(int id, String ad, String soyad, boolean isVip) {
		super(id, ad, soyad);
		this.isVip = isVip;
	}

	public boolean isVip() {
		return isVip;
	}

	public void setVip(boolean isVip) {
		this.isVip = isVip;
	}

	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Business yolcusu " + getAd() + " Biletleri" + getBiletler());

	}

	@Override
	public void biletAl(EFirma firmaAdi) {
		int fiyat = 0;
		String value = "";
		if (isVip) {
			fiyat = BASE_FİYAT + BUSINNES_FIYAT + BUSINNESVIP_FIYAT;
			value = "VİP";
		} else {
			fiyat = BASE_FİYAT + BUSINNES_FIYAT;
		}
		getBiletler().put(firmaAdi.name(), fiyat);
		System.out.println(getAd() + " adlı yolcu" + firmaAdi + " için" + value + " için bilet almıştır "
				+ "Biletleriniz ---> " + getBiletler());
	}

}
