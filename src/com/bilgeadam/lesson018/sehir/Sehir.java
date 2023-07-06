package com.bilgeadam.lesson018.sehir;

public class Sehir implements ISehir {

	private String isim;
	private String plaka;
	private long nufus;

	public Sehir(String isim, String plaka, long nufus) {

		this.isim = isim;
		this.plaka = plaka;
		this.nufus = nufus;
	}

	public Sehir(String isim) {
		this.isim = isim;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getPlaka() {
		return plaka;
	}

	public void setPlaka(String plaka) {
		this.plaka = plaka;
	}

	public long getNufus() {
		return nufus;
	}

	public void setNufus(long nufus) {
		this.nufus = nufus;
	}

	@Override
	public String toString() {
		return "Sehir [isim=" + isim + ", plaka=" + plaka + ", nufus=" + nufus + "]";
	}

	@Override
	public String plakaKoduUret() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long rastgeleNufusUret() {
		// TODO Auto-generated method stub
		return 0;
	}

}
