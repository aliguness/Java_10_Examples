package com.bilgeadam.lesson008;

public class Toplama {
	
	public static void main(String[] args) {
	        Toplama toplama = new Toplama();
	        System.out.println(toplama.topla(5, 10));
	        System.out.println(toplama.topla(3.5, 2.8));
	        System.out.println(toplama.topla(2, 4, 6));
	        
	        
	        
	        
	    }
	
	
	    public int topla(int sayi1, int sayi2) {
	        return sayi1 + sayi2;
	        
	    }

	    public double topla(double sayi1, double sayi2) {
	        return sayi1 + sayi2;
	    }

	    public int topla(int sayi1, int sayi2, int sayi3) {
	        return sayi1 + sayi2 + sayi3;
	        
	    }

	    
	}


