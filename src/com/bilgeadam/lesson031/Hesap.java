package com.bilgeadam.lesson031;

public class Hesap {

	int bakiye = 10000;

	public synchronized void paraYatir(int para) {
		bakiye += para;
		System.out.println(Thread.currentThread().getName() + " ===> para yatırdı" + bakiye);

	}

	public synchronized void paraCek(int para) {
		if (bakiye >= para) {
			bakiye -= para;
			System.out.println(Thread.currentThread().getName() + " ===> para çekti" + bakiye);
		} else {
			System.out.println(Thread.currentThread().getName() + " ===> yetersiz bakiye" + bakiye);
		}
	}
}
