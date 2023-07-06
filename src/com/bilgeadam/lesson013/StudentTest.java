package com.bilgeadam.lesson013;

public class StudentTest {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.name = "Mustafa";
		student1.kayıtOl();

		Student student2 = new Student();
		student2.name = "Serkan";
		student2.kayıtOl();
		Student student3 = new Student();
		student3.name = "Hilal";
		student3.kayıtOl();

		Student student4 = new Student();
		student4.name = "Elif";
		student4.kayıtOl();

		System.out.println(student1.no);
		System.out.println(student2.no);
		System.out.println(student3.no);

		System.out.println("Toplam kayıtlı ogrenci sayısı===>" + Student.index);

	}

}