package com.bilgeadam.lesson029.okulApp;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class Ogretmen extends Thread {

	private String isim;
	private List<Ogrenci> ogrenciler;
	private BufferedReader bufferedReader;

	public Ogretmen(String isim, BufferedReader bufferedReader) {
		this.isim = isim;
		this.bufferedReader = bufferedReader;
		this.ogrenciler = new ArrayList<>();
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public List<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}

	public void setOgrenciler(List<Ogrenci> ogrenciler) {
		this.ogrenciler = ogrenciler;
	}

	public void notlariOku() {
		this.ogrenciler = FileManager.dosyadanVeriOku(this.isim, bufferedReader);
	}

	public void dosyaOlustur() {
		FileManager.ogretmenDosyasıOlustur(ogrenciler, isim);

	}

	public List<Ogrenci> dosyadanOgrencileriGetir() {
		this.ogrenciler = FileManager.ogrencileriGetir(isim);
		return ogrenciler;
	}

	@Override
	public void run() {
		notlariOku();
	}

	@Override
	public String toString() {
		return "Ogretmen [isim=" + isim + ", ogrenciler=" + ogrenciler + "]";
	}

}