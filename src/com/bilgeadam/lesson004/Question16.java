package com.bilgeadam.lesson004;

import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Question16 {
	public static void main(String[] args) {
		
		int taban;
		int kuvvet;
		long sonuc = 1;
		Scanner input = new Scanner(System.in);	
		System.out.println("Lütfen bir taban değeri giriniz");
		taban = input.nextInt();
		System.out.println("Lütfen bir kuvvet deperş girinizi");
		kuvvet = input.nextInt();
		
		int i = 1;
		while (i <= kuvvet) {
			sonuc *= taban;
			i++;
			
		}System.out.println(taban+ "^" +kuvvet+"= "+sonuc);
		
	} 

}
