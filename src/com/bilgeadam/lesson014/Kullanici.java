package com.bilgeadam.lesson014;

public class Kullanici {
	private int id;
	private String username;
	private String sifre;
	private String isim;
	private Sepet sepet;

	public Kullanici(int id, String username, String sifre, String isim) {
		this(username, sifre, isim);
		this.id = id;
	}

	public Kullanici(String username, String sifre, String isim) {
		this.username = username;
		this.sifre = sifre;
		this.isim = isim;
		this.sepet = new Sepet();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public Sepet getSepet() {
		return sepet;
	}

	public void setSepet(Sepet sepet) {
		this.sepet = sepet;
	}

	@Override
	public String toString() {
		return "Kullanici [id=" + id + ", username=" + username + ", sifre=" + sifre + ", isim=" + isim + ", sepet="
				+ sepet + "]";
	}

}