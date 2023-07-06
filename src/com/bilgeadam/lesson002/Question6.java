package com.bilgeadam.lesson002;

import java.util.Scanner;

public class Question6 {
	
	
	// A=pi*r^2 
	// Ç= 2*pi*r

	public static void main(String[] args) {
		
		
		double pi = 3.14, yariCap, cevre, alan;
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen Dairenin yarıçapını giriniz");
		yariCap=input.nextDouble();
		
		cevre=2*pi*yariCap;
		alan=pi*(yariCap*yariCap);
		
		System.out.println("Dairenin alanı= "+alan+"\nDairenin çevresi= "+cevre);
		
		
		
	}

}
