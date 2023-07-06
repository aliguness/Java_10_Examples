package com.bilgeadam.lesson019.queue;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Test {

	public static void main(String[] args) {

		Queue<Integer> kuyruk1 = new LinkedList<>();
		Queue<Integer> kuyruk2 = new ArrayBlockingQueue<>(5);
		Queue<Integer> kuyruk3 = new ConcurrentLinkedQueue<>();
		// kuyruk 1
		kuyruk1.add(25);
		kuyruk1.add(50);
		System.out.println(kuyruk1.peek());
		System.out.println(kuyruk1.peek());
		System.out.println(kuyruk1.peek());
		System.out.println(kuyruk1.peek());
		System.out.println("poll");
		System.out.println(kuyruk1.poll());
		System.out.println(kuyruk1.peek());
		System.out.println(kuyruk1.poll());
		System.out.println(kuyruk1.peek());
		// kuyruk2
//		kuyruk2.add(20);
//		kuyruk2.add(30);
//		kuyruk2.add(40);
//		kuyruk2.add(50);
//		kuyruk2.add(60);
//		kuyruk2.add(70);
		System.out.println("offer");
		kuyruk2.offer(20);
		kuyruk2.offer(30);
		kuyruk2.offer(40);
		kuyruk2.offer(50);
		boolean kontrol1 = kuyruk2.offer(60);
		boolean kontrol2 = kuyruk2.offer(70);
		System.out.println(kontrol1);
		System.out.println(kontrol2);
		while (!kuyruk2.isEmpty()) {
			System.out.println(kuyruk2.poll());
		}

		///// oncelikli kuyruk

		System.out.println("=====oncelikli kuyruk =====");
		Queue<Integer> kuyruk4 = new PriorityQueue<>();

		kuyruk4.offer(80);
		kuyruk4.offer(30);
		kuyruk4.offer(120);
		kuyruk4.offer(20);
		kuyruk4.offer(90);
		System.out.println(kuyruk4.peek());
		System.out.println("for each yazdırımı");
		for (Integer integer : kuyruk4) {
			System.out.println(integer);
		}

		System.out.println("kuyruktan sırayla yazdrım");
		while (!kuyruk4.isEmpty()) {
			System.out.println(kuyruk4.poll());

		}

		Queue<Musteri> musteriler = new PriorityQueue<>();

		musteriler.offer(new Musteri("Mustafa", 35));
		musteriler.offer(new Musteri("Kemal", 65));
		musteriler.offer(new Musteri("Mert", 25));
		musteriler.offer(new Musteri("Ece", 15));
		musteriler.offer(new Musteri("Tuba", 25));

		while (!musteriler.isEmpty()) {
			System.out.println(musteriler.poll());
		}

		/// yaşa gore sıralama eğer yaşlar eşit ise isme gore sıralar
		Comparator<Musteri2> comparatorYas = new Comparator<Musteri2>() {
			@Override
			public int compare(Musteri2 o1, Musteri2 o2) {
				if ((o1.yas - o2.yas == 0)) {
					return o1.isim.compareTo(o2.isim);

				} else {
					return o1.yas - o2.yas;
				}
			}
		};

		// isme gore sıralama
		Comparator<Musteri2> comparatorIsim = new Comparator<Musteri2>() {
			@Override
			public int compare(Musteri2 o1, Musteri2 o2) {
				return o1.isim.compareTo(o2.isim);
			}
		};
		Queue<Musteri2> musteriler2 = new PriorityQueue<>(comparatorYas);

		musteriler2.offer(new Musteri2("Mustafa", 35));
		musteriler2.offer(new Musteri2("Kemal", 65));
		musteriler2.offer(new Musteri2("Zeliha", 25));
		musteriler2.offer(new Musteri2("Mert", 25));
		musteriler2.offer(new Musteri2("Ece", 15));
		musteriler2.offer(new Musteri2("Tuba", 25));
		System.out.println("Musteriler2");
		while (!musteriler2.isEmpty()) {
			System.out.println(musteriler2.poll());
		}
	}

}
