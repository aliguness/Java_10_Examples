package com.bilgeadam.lesson022.movieapp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/*
 * 1-film sınıfımız olsun
 * 2-yonetmen olsun
 * 3 film turlerimiz olsun 
 * 4-her filmin bir puanı olsun 
 * 5-her filmin oyuncuları olsun 
 * 6-her sınıfın kaydet guncelle sil metodları olsun 
 * 
 * 
 */
public class Test {

	public static void main(String[] args) {

		Manager<Film, String> filmManager = new Manager<>();
		Manager<Cast, Long> castManager = new Manager<>();

		Yonetmen yonetmen = new Yonetmen("Miyazaki", null);

		castManager.kayitEt(Database.casts, yonetmen);
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);

		String id = UUID.randomUUID().toString();
		System.out.println(id);

		castManager.sil(1L);
		filmManager.sil("ssss");

		Film film = new Film("Ruhların kaçışı", List.of(ETur.ANIME, ETur.DRAMA), yonetmen);

		filmManager.kayitEt(Database.filmList, film);

		List<Film> list = new ArrayList<>();

		listeyeEkle(list, film);
		System.out.println(list.get(0));
	}

	public static <T> void listeyeEkle(List<T> list, T t) {
		list.add(t);
	}

}
