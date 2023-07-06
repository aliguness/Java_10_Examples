package com.bilgeadam.lesson016;

public class Kisi {
	private String isim;
	private String soyisim;
	private String adres;
	private String tel;

	public Kisi(String isim, String soyisim, String adres, String tel) {
		super();
		this.isim = isim;
		this.soyisim = soyisim;
		this.adres = adres;
		this.tel = tel;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Kisi [isim=" + isim + ", soyisim=" + soyisim + ", adres=" + adres + ", tel=" + tel + "]";
	}

}
