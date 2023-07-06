package com.bilgeadam.lesson021.movieapp;

public interface ICrud<T> {

	T kayitEt(T t);

	void guncelle(T t);

	void sil(long id);

}
