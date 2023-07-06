package com.bilgeadam.lesson019.stack;

import java.util.Random;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		Manager manager = new Manager();
		manager.tabakOlustur();
		System.out.println("Kirliler");
		System.out.println(manager.kirliler);
		System.out.println("Temizler");
		System.out.println(manager.temizler);
//
//		manager.temizle();
//		manager.temizle();
//		manager.temizle();
//		manager.temizle();
//		manager.temizle();
//		manager.temizle();
//		manager.temizle();
//		manager.temizle();
//		manager.temizle();
//		manager.temizle();

		// System.out.println(manager.temizler);

		for (int i = 0; i < 50; i++) {
			Random random = new Random();
			manager.secimYap(random.nextInt(1, 3));
			Thread.sleep(1500);
		}

	}

}
