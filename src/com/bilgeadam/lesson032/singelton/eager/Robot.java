package com.bilgeadam.lesson032.singelton.eager;

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

	private static Robot instance = new Robot();

	private Robot() {

	}

	public static Robot getRobot() {
		return instance;
	}

	public void calis() {
		System.out.println(hashCode() + " ---> numaralı robot çalışıyor");
	}

}