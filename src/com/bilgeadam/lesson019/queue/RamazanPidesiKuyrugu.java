package com.bilgeadam.lesson019.queue;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

/*
 * String bir kuyruk olusturcagız 
 *  bir metot ile bu kuyruga 10 tane musteri ekleyelim 
 * 
 * daha sonra random 1 ile 12 arasında bir pide uretelim pidesayımız rastgele gelecek
 * 
 * daha sonra olusmus olan kuyruga pideleri dağıtalım  
 * pide bittiğinde pide kalmadı yazlım 
 * 
 * ve daha sonra pide almayan varsa yazdıralım 
 * 
 * 
 * 
 */
public class RamazanPidesiKuyrugu {

	Queue<String> musteriler = new ArrayBlockingQueue(10);

	public static void main(String[] args) {
		RamazanPidesiKuyrugu ramazanPidesiKuyrugu = new RamazanPidesiKuyrugu();
		ramazanPidesiKuyrugu.musteriOlustur();
		ramazanPidesiKuyrugu.pideDağıt();
		ramazanPidesiKuyrugu.geriyeKalanlar();

	}

	public void musteriOlustur() {
		for (int i = 1; i < 11; i++) {
			musteriler.offer("Musteri " + i);
		}
	}

	public void pideDağıt() {
		Random random = new Random();
		int pideSayisi = random.nextInt(1, 13);
		System.out.println("Pideler Çıkıyor!!!!!");
		System.out.println("Pide sayisi==>" + pideSayisi);

		for (int i = 1; i <= pideSayisi; i++) {
			if (!musteriler.isEmpty()) {
				System.out.println(musteriler.poll() + " pidesini aldı");
			} else {
				System.out.println("kalan pide sayisi ==>" + (pideSayisi - (i - 1)));
				break;
			}
		}

	}

	public void geriyeKalanlar() {
		if (musteriler.isEmpty()) {
			System.out.println("Pidesini Almayan kalmadı");
		} else {
			System.out.println("pide bitti Pidesini almayanlar:");
			for (String musteri : musteriler) {
				System.out.println(musteri);
			}
		}
	}

}
