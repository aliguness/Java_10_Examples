package com.bilgeadam.lesson032.singelton.lazy;

/*
 * 1- 1 tane Robotumuz var bu robotun çalış metodu var 
 * 	çalış metodunda==> hascode----> numaralı robot çalışıyor 
 * 2- Ev halkı sınıfımız olsun bu sınıfta Robot cagır metodu olsun 
 * bu metot çalısınca bize robot sınıfındaki çalış metodunu çalıstırsın 
 * ( ev halkı herdefasında aynı robotu çağırmalı)
 * 3- Test sınıfında  3 tane ev halkı yaratarak bunu deneyeleim 
 * 
 * 
 * 
 */
public class Robot {

	private static Robot instance;

	private Robot() {
		// TODO Auto-generated constructor stub
	}

	// threadlerin aynı anda bu metoda girmesini engellemek için synchronized
	// keywordunu kullanmak gerekir public synchronized static Robot getRobot()   burası önemli***
	// bu sayede eğer Threadler uzerinde çalışıyorsak her
	// defasında aynı nesneyi uretmeyi granti altına almıs oluruz
	//public synchronized static Robot getRobot(){} örnek..
	public static Robot getRobot() {

		if (instance == null) {
			instance = new Robot();
		}

		return instance;
	}

	public void calis() {
		System.out.println(hashCode() + " ---> numaralı robot çalışıyor");
	}

}