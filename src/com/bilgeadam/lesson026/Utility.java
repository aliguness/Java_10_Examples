package com.bilgeadam.lesson026;

import java.time.LocalDate;
import java.util.Optional;
import java.util.Scanner;

public class Utility {

	static Scanner scanner = new Scanner(System.in);

	/*
	 * Dogru deger alana kadar bizden veri almaya devam eder int deger alana kadar
	 * 
	 */

	public static int intDegerAlma(String sorgu) {

		boolean kontrol = false;
		int deger = 0;
		do {
			System.out.println(sorgu);
			try {
				deger = scanner.nextInt();
				kontrol = false;
			} catch (Exception e) {
				System.out.println(e.toString() + ": lütfen sayısal bir değer giriniz");
				kontrol = true;
			} finally {
				scanner.nextLine();
			}

		} while (kontrol);
		return deger;
	}

	public static double doubleDegerAlma(String sorgu) {

		boolean kontrol = false;
		double deger = 0;
		do {
			System.out.println(sorgu);
			try {
				deger = Double.parseDouble(scanner.nextLine());
				kontrol = false;
			} catch (Exception e) {
				System.out.println(e.toString() + ": lütfen sayısal bir değer giriniz");
				kontrol = true;
			}

		} while (kontrol);
		return deger;
	}

	public static long longDegerAlma(String sorgu) {
		boolean kontrol = false;
		long deger = 0;
		do {
			System.out.println(sorgu);
			try {
				deger = Long.parseLong(scanner.nextLine());
				kontrol = false;
			} catch (Exception e) {
				System.out.println(e.toString() + ": lütfen sayısal bir değer giriniz");
				kontrol = true;
			}
		} while (kontrol);
		return deger;
	}

	public static String stringDegerAlma(String sorgu) {
		System.out.println(sorgu);
		return scanner.nextLine();
	}

	public static LocalDate stringTarihDegeriAlma(String sorgu) {
		boolean kontrol = false;
		LocalDate date = null;
		do {
			try {
				System.out.println(sorgu);
				date = LocalDate.parse(scanner.nextLine());
				kontrol = false;
			} catch (Exception e) {
				System.out.println(e.toString() + ": lütfen yıl-ay-gun formatında bir tarih giriniz");
				kontrol = true;
			}

		} while (kontrol);

		return date;
	}

	public static Optional<LocalDate> stringTarihDegeriniTarihDegerineCevirme(String sorgu, String tarih) {
		boolean kontrol = false;
		LocalDate date = null;
		try {
			System.out.println(sorgu);
			date = LocalDate.parse(tarih);
			kontrol = false;
		} catch (Exception e) {
			System.out.println(e.toString() + ": lütfen yıl-ay-gun formatında bir tarih giriniz");
			kontrol = true;
		}
		return Optional.ofNullable(date);
	}

}
