package com.bilgeadam.lesson022.movieapp;

import java.util.List;
import java.util.Set;

public class Film {
	private String id;
	private String isim;
	private List<ETur> turler;
	private double puan;
	private Yonetmen yonetmen;
	private Set<Oyuncu> oyuncular;

	public Film(String isim, List<ETur> turler, Yonetmen yonetmen) {
		super();
		this.isim = isim;
		this.turler = turler;
		this.yonetmen = yonetmen;
	}

	public Film(String isim, List<ETur> turler) {
		super();
		this.isim = isim;
		this.turler = turler;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public List<ETur> getTurler() {
		return turler;
	}

	public void setTurler(List<ETur> turler) {
		this.turler = turler;
	}

	public double getPuan() {
		return puan;
	}

	public void setPuan(double puan) {
		this.puan = puan;
	}

	public Yonetmen getYonetmen() {
		return yonetmen;
	}

	public void setYonetmen(Yonetmen yonetmen) {
		this.yonetmen = yonetmen;
	}

	public Set<Oyuncu> getOyuncular() {
		return oyuncular;
	}

	public void setOyuncular(Set<Oyuncu> oyuncular) {
		this.oyuncular = oyuncular;
	}

	@Override
	public String toString() {
		return "Film [id=" + id + ", isim=" + isim + ", turler=" + turler + ", puan=" + puan + ", yonetmen=" + yonetmen
				+ ", oyuncular=" + oyuncular + "]";
	}

}