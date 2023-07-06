package com.bilgeadam.lesson029;

import java.io.Serializable;
import java.time.LocalDate;

public class Movie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1817558149570460871L;

	private String title;
	private String genre;
	private LocalDate date;

	public Movie(String title, String genre, LocalDate date) {
		super();
		this.title = title;
		this.genre = genre;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", genre=" + genre + ", date=" + date + "]";
	}

}