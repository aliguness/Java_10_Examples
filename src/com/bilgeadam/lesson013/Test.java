package com.bilgeadam.lesson013;

public class Test {

	public static void main(String[] args) {

		StaticOrnek.number2 = 12;
		StaticOrnek.numaraVer2();
		StaticOrnek so = new StaticOrnek();
		so.number1 = 15;
		//	so.number2 = 25;  böyle nesne üzerinden ulaşmak gereksiz çünkü zaten static.
	}

}
	
	