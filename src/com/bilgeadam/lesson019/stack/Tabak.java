package com.bilgeadam.lesson019.stack;

/*
 * tabak sınıfımızda tabaklarımızın id sini ve kirli olup olmadıklarını tutalım 
 * 
 * daha sonra bir manager sınıfı olusturup  
 * bu manager sınıfında 10 tane tabak uretelim ve kirli olup olmadıkları rastgele gelsin 
 *
 * temizleri bir stackte kirlileri başka bir stackde tutatalım 
 * 
 * 
 * kullan metodu olusturalım ==> temizler stack inden bir tabak alıp kirleteceğiz 
 * 
 * temizle ve kullan metodunda eğer stacklarımız bossa  temizle metodunda kullan çalışşsın 
 * kullan metodunda temizle 
 * 
 * 
 * daha sonra secim yap metodu olusturacagız dışarıdan 1 veya 2 değer,ni alacak 
 * gelen değer 1 ise temizle 2 ise kullan metodu çalısın
 * 
 * Test sınıfında 50 kere calısan bir dongu olsun herdefasonda random bir secim uretip 
 * secim yap metodunu kullanacagız   
 * 
 */
public class Tabak {

	private int id;
	private boolean kirliMi;

	public Tabak(int id, boolean kirliMi) {
		super();
		this.id = id;
		this.kirliMi = kirliMi;
	}

	public Tabak(int id) {
		super();
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isKirliMi() {
		return kirliMi;
	}

	public void setKirliMi(boolean kirliMi) {
		this.kirliMi = kirliMi;
	}

	@Override
	public String toString() {
		return "Tabak [id=" + id + ", kirliMi=" + kirliMi + "]";
	}

}
