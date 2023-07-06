package com.bilgeadam.lesson008;

public class _001_Marathon_Soru1 {
	public static void main(String[] args) {
		
		yildizlar();
		
}
	

	private static void yildizlar() {
		
				for(int i = 1; i < 4; i++) {
			System.out.println("* * * * * * *");
		}
		
		for (int i = 7; i > 0 ; i--) {
			
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		
	}

	}
}
