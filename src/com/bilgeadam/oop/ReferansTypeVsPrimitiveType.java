package com.bilgeadam.oop;

public class ReferansTypeVsPrimitiveType {
	
	public static void main(String[] args) {
		
		
		int a = 5;
		int b = 4;
		
		
		System.out.println(a);
		System.out.println(b);
		
		a= b;
		b = 12;
		
		System.out.println(a);
		System.out.println(b);
		
		String[] sehirler1 = { "Ankara", "Istanbul", "İzmir" };
		String[] sehirler2 = { "Bursa", "Konya", "Mersin" };
		
		System.out.println(sehirler1[0]);
		System.out.println(sehirler2[0]);
		System.out.println("======================");
		
		sehirler2 = sehirler1;
		System.out.println(sehirler2[0]); // Ankara
		
		sehirler1[0] = "Bolu";
		System.out.println(sehirler2[0]); //bolu
		
		sehirler2[1] = "Edirne";
		System.out.println(sehirler1[1]); // Edirne
		
	}
}
