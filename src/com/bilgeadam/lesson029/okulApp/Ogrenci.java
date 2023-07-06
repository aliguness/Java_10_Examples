package com.bilgeadam.lesson029.okulApp;

import java.io.Serializable;
import java.time.LocalDate;

public class Ogrenci implements Serializable {

	private String isim;
	private double ort;
	private EDurum durum;
	private LocalDate dogumTarihi;

	public Ogrenci(String isim, double ort, LocalDate dogumTarihi) {
		super();
		this.isim = isim;
		this.ort = ort;
		this.dogumTarihi = dogumTarihi;
		durumBelirle(ort);

	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public double getOrt() {
		return ort;
	}

	public void setOrt(double ort) {
		this.ort = ort;
	}

	public EDurum getDurum() {
		return durum;
	}

	public void setDurum(EDurum durum) {
		this.durum = durum;
	}

	public LocalDate getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(LocalDate dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public void durumBelirle(double ort) {
		if (ort < 60) {
			this.durum = EDurum.KALDI;
		} else {
			this.durum = EDurum.GECTI;
		}
	}

	@Override
	public String toString() {
		return "Ogrenci [isim=" + isim + ", ort=" + ort + ", durum=" + durum + ", dogumTarihi=" + dogumTarihi + "]";
	}

}