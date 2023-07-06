package com.bilgeadam.ucakAppMarathon;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class Yolcu {

	private int id;
	private String ad;
	private String soyad;
	private int koltukNo;
	private boolean checkIn;
	static final int BASE_FİYAT = 100;
	private Map<String, Integer> biletler;

	public Yolcu(int id, String ad, String soyad) {
		super();
		this.id = id;
		this.ad = ad;
		this.soyad = soyad;
		this.koltukNo = koltukNoUret();
		this.biletler = new HashMap<>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public int getKoltukNo() {
		return koltukNo;
	}

	public void setKoltukNo(int koltukNo) {
		this.koltukNo = koltukNo;
	}

	public boolean isCheckIn() {
		return checkIn;
	}

	public void setCheckIn(boolean checkIn) {
		this.checkIn = checkIn;
	}

	public static int getBasefiyat() {
		return BASE_FİYAT;
	}

	public Map<String, Integer> getBiletler() {
		return biletler;
	}

	public void setBiletler(Map<String, Integer> biletler) {
		this.biletler = biletler;
	}

	public int koltukNoUret() {
		Random random = new Random();
		return random.nextInt(1, 201);
	}

	public abstract void yolcuBilgileriniGetir();

	public abstract void biletAl(EFirma firmaAdi);

	public void checkInYap() {
		if (checkIn) {
			System.out.println(ad + " için zaten check in yapılmıştır");
		} else {
			System.out.println("Check in yapılmıştır iyi uçuşlar");
			this.checkIn = true;
		}

	};

	public void uçağaBin() {
		if (checkIn) {
			System.out.println(ad + " " + koltukNo + " Numaralı koltukta ucaga binebilrisiniz");
		} else {
			System.out.println("Ucaga binmek için lütfen chekin yapın");
		}

	}

	@Override
	public String toString() {
		return "Yolcu [id=" + id + ", ad=" + ad + ", soyad=" + soyad + ", koltukNo=" + koltukNo + ", checkIn=" + checkIn
				+ "]";
	}

}
