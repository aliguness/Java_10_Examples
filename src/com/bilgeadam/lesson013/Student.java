package com.bilgeadam.lesson013;

import java.util.Scanner;

/*
 * öğrencinin bir numarası bir isim olsun 
 * daha sonra kayıt metodu yazalım 
 * Mustafa adlı ogrenci başarı ile kayıt edildi ogrenci numarası 1 
 * Serkan adlı ogrenci başarı ile kayıt edildi ogrenci numarası 2 
 * 
 * 
 */
public class Student {

	String name;
	static int index;
	int no;

	public void kayıtOl() {
		index++;
		no = index;
		System.out.println("==============");
		System.out.println(name + " adlı ogrenci başarı ile kayıt olmustur");
		System.out.println("ogrenci numarası=" + no);
		System.out.println("=============");

	}

	public static Student kayıtOl2() {
		index++;
		Student student = new Student();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen ogrenci ismi giriniz");
		student.name = scanner.nextLine();
		student.no = index;
		System.out.println("==============");
		System.out.println(student.name + " adlı ogrenci başarı ile kayıt olmustur");
		System.out.println("ogrenci numarası=" + student.no);
		System.out.println("=============");

		return student;

	}
}