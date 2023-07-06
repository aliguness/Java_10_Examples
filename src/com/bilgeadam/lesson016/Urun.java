package com.bilgeadam.lesson016;

public class Urun {
	private int id;
	private double fiyat;
	private String barkod;
	private String sonKullanmaTarihi;

	public Urun(double fiyat, String barkod, String sonKullanmaTarihi) {
		super();
		this.fiyat = fiyat;
		this.barkod = barkod;
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}

	public Urun(int id, double fiyat, String barkod, String sonKullanmaTarihi) {
		super();
		this.id = id;
		this.fiyat = fiyat;
		this.barkod = barkod;
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public String getBarkod() {
		return barkod;
	}

	public void setBarkod(String barkod) {
		this.barkod = barkod;
	}

	public String getSonKullanmaTarihi() {
		return sonKullanmaTarihi;
	}

	public void setSonKullanmaTarihi(String sonKullanmaTarihi) {
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}

	@Override
	public String toString() {
		return "Urun [id=" + id + ", fiyat=" + fiyat + ", barkod=" + barkod + ", sonKullanmaTarihi=" + sonKullanmaTarihi
				+ "]";
	}

}
