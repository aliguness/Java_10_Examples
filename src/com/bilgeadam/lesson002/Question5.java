package com.bilgeadam.lesson002;

import java.util.Scanner;

/*
 * 
 * @author
 * 
 * Dışarıdan veri alma şle ilgili örnekler
 * 
 * Scanner
 * 
 * toplu yorum satırı kısayolu ctrl shift c
 */
public class Question5 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);   //Scanner scanner = new Scanner(System.in); burayı scanner olarak kullanabiliriz.
				System.out.println("Lütfen bir isim giriniz");
		String isim = input.nextLine();
		
		System.out.println("isim= "+isim);
		
		int sayi1=10;
		System.out.println("Lütfen bir sayi giriniz");
		int sayi2=input.nextInt();
		double sayi3=input.nextDouble(); // console'dan ondalık değerleri ,(virgül) ile girelim 25,4 gibi
//		long sayi4=input.nextLong();
//		float sayi5=input.nextFloat();
		
		
		System.out.println(sayi1+sayi2+sayi3);
		
		// int (sayısal) degerden sonra bir String deger almak istersek mutlaka boş bir nextLine() kullanalım. Çünkü Scanner'ın BUGı var.
		
		input.nextLine();
		System.out.println("Lütfen bir isim giriniz");
		String isim2=input.nextLine();
		System.out.println("isim2:"+isim2 );
		
		System.out.println("Lütfen yeni bir isim giriniz");
		 isim2=input.nextLine();
		 System.out.println("isim2:"+isim2);
		 
		
		
		
		
		
		
		
	}

}
