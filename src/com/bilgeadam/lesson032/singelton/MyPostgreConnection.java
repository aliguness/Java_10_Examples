package com.bilgeadam.lesson032.singelton;

/*
 * Singelton yapısında bir Sınıf olusturmak için gerkli adımlar
 * 
 * 1-const ---> private olacak yeni bir nesne new lememize izin verilmeyecek
 * 2-sınıf içinde kendi referasında private startic bir değişken tutacağız 
 * 3- static bir getInstance() metodu olusturyoruz içerisinde sınıf içinde tanımladığımız
 * instance değişkeninin null olup olmadığını kontrol ediyoruz  eğer null ise newleme işlemini 
 * yapıyoruz ve meoto sonunda yeni olusturdugumuz instance' ı geri donuyoruz 
 * eger null değilse daha once olusturulmustur bizde daha once olusturulmus instance'ı 
   bu metot sayesinde geri donuyoruz  

 */

public class MyPostgreConnection {

	private static MyPostgreConnection instance;

	private MyPostgreConnection() {

	}

	public static MyPostgreConnection getInstance() {

		if (instance == null) {
			instance = new MyPostgreConnection();
		}

		return instance;
	}

	@Override
	public String toString() {
		return "MyPostgreConnection [hashCode()=" + hashCode() + "]";
	}

}