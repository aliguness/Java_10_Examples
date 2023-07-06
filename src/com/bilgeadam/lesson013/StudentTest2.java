package com.bilgeadam.lesson013;

public class StudentTest2 {

	public static void main(String[] args) {

		Student student1 = Student.kayıtOl2();
		Student student2 = new Student();
		student2 = Student.kayıtOl2();
		Student student3 = Student.kayıtOl2();

		System.out.println("kayıtlı ogrenci sayısı==>" + Student.index);
		System.out.println(student1.no);
		System.out.println(student2.no);
	}
}
