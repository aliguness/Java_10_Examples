package com.bilgeadam.lesson032.singelton.enums;

public class Test {
	public static void main(String[] args) {
		EvHalki anne = new EvHalki();
		EvHalki baba = new EvHalki();
		EvHalki cocuk = new EvHalki();
	
	//	anne.robotCagir();
	//	baba.robotCagir();
	//	cocuk.robotCagir();
		
		anne.start();
		baba.start();
		cocuk.start();
		
	}
	
	

}
