package com.bilgeadam.lesson019.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
 * 
 * 
 * bir set olusturalım  bu sete film kategorisi ekleyeceğiz 
 * kategori ekle diye bir metot yazıp dısardan veri alacagız ve 
 * sete e ekleyeceğiz eğer 
 * kategeri daha once eklenmişşe bu kategorei daha once eklenmiştir çıktısı versin
 * eklenmemis ise kategori başarı ile eklenmiştir 
 * 
 * 
 */
public class SetOrnek {
	Set<String> kategoriler = new HashSet<>();
	Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		SetOrnek setOrnek = new SetOrnek();
		setOrnek.kategoriEkle2();
		setOrnek.kategoriEkle2();
		setOrnek.kategoriEkle2();

		for (String string : setOrnek.kategoriler) {
			System.out.println(string);
		}
	}

	public void kategoriEkle() {
		System.out.println("Lütfen bir kategori giriniz");
		String kategori = scanner.nextLine().toUpperCase();
		if (kategoriler.contains(kategori)) {
			System.out.println(kategori + " kategorisi daha once eklenmiştir");
		} else {
			System.out.println(kategori + " başarlı bir şekilde eklenmiştir");
			kategoriler.add(kategori);
		}

	}

	public void kategoriEkle2() {
		System.out.println("Lütfen bir kategori giriniz");
		String kategori = scanner.nextLine().toUpperCase();
		if (kategoriler.add(kategori)) {
			System.out.println(kategori + " başarlı bir şekilde eklenmiştir");
		} else {
			System.out.println(kategori + " kategorisi daha once eklenmiştir");

		}

	}
}