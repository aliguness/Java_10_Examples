package com.bilgeadam.lesson025.optional;

import java.time.LocalDate;

public class Urun {

	private String isim;
	private double fiyat;
	private LocalDate sonKullanmaTarihi;

	public Urun(String isim, double fiyat, LocalDate sonKullanmaTarihi) {
		super();
		this.isim = isim;
		this.fiyat = fiyat;
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getFiyat() {
		return fiyat;
	}

	public void setFiyat(double fiyat) {
		this.fiyat = fiyat;
	}

	public LocalDate getSonKullanmaTarihi() {
		return sonKullanmaTarihi;
	}

	public void setSonKullanmaTarihi(LocalDate sonKullanmaTarihi) {
		this.sonKullanmaTarihi = sonKullanmaTarihi;
	}

	@Override
	public String toString() {
		return "Urun [isim=" + isim + ", fiyat=" + fiyat + ", sonKullanmaTarihi=" + sonKullanmaTarihi + "]";
	}

}
