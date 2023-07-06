package com.bilgeadam.lesson011;

import java.util.Arrays;

public class Question56 {
	
	public static void main(String[] args) {
		
		int[] dizi = { 36, 5, 4, 7, 87, 96, 125 };
		
		Arrays.sort(dizi);
		for(int i : dizi) {
			System.out.println(i);
		}
		
		int[] dizi2 = new int[5];
		Arrays.fill(dizi2, 10);
		
		
		for(int i : dizi2) {
			System.err.println(i);
		}
	}

}
