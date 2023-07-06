package com.bilgeadam.lesson023;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
 * Dışarıdan String bir dogum gunu tarihi alalım 
 * daha sonra gunumuz ile kıyaslayalım kac gun kac hafta kac yıl  yaşamısız onu bulalım  
 * 
 * 
 */
public class DogumGunuOrnek {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen dogun gunuzu (gun/ay/yıl) şeklinde giriniz");
		String dogumGunu = scanner.nextLine();
//		String gun2 = "2010-05-18";
//		LocalDate date = LocalDate.parse(gun2);
		LocalDate now = LocalDate.now();
		System.out.println("gunumuz " + now);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
		LocalDate dogumGunu2 = LocalDate.parse(dogumGunu, formatter);
		System.out.println("dogun gunumuz " + dogumGunu2);
		long gun = dogumGunu2.until(now, ChronoUnit.DAYS);
		long ay = dogumGunu2.until(now, ChronoUnit.MONTHS);
		long yıl = dogumGunu2.until(now, ChronoUnit.YEARS);
		long hafta = dogumGunu2.until(now, ChronoUnit.WEEKS);
		System.out.println(yıl + " yıl " + ay + " ay " + hafta + " hafta " + gun + " gundur dunyadasınız");

	}
}
