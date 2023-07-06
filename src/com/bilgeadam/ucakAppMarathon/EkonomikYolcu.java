package com.bilgeadam.ucakAppMarathon;

public class EkonomikYolcu extends Yolcu {

	static final int EKONOMI_FIYAT = 100;

	public EkonomikYolcu(int id, String ad, String soyad) {
		super(id, ad, soyad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void yolcuBilgileriniGetir() {
		System.out.println("Ekonomi yolcusu " + getAd() + " Biletleri" + getBiletler());
	}

	@Override
	public void biletAl(EFirma firmaAdi) {
		int fiyat = BASE_FİYAT + EKONOMI_FIYAT;

		if (getBiletler().containsKey(firmaAdi.name())) {
			getBiletler().put(firmaAdi.name(), getBiletler().get(firmaAdi.name()) + fiyat);
			System.out.println(firmaAdi + " adlı firmadan bir bilet daha alınmıstır " + getBiletler());
		} else {
			getBiletler().put(firmaAdi.name(), fiyat);
			System.out.println(getAd() + " adlı yolcu" + firmaAdi + " için Ekonomi sınıfından bilet almıştır "
					+ "Biletleriniz ---> " + getBiletler());
		}

	}

}