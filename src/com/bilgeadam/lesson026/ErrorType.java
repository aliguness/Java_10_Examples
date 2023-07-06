package com.bilgeadam.lesson026;

public enum ErrorType {

	DOLU_YER_SECIMI(1001, "Sectiğiniz yer doludur"), SINIRLAR_DISINDA(1002, "Yaptıgınız secim sınırlar dısındadır"),
	YETERSIZ_AGIRLIK(1003, "100 kilonun altında yuk kabulu yoktur!!!!"),
	GECERSIZ_KABUL_TARIHI(1004, "Kabul tarihi geçmiştir!!!"),
	MESAI_GUNU_DISI(1005, "Mesai gunlerimiz sadece hafta içidir")

	;

	private String message;
	private int code;

	private ErrorType(int code, String message) {
		this.message = message;
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

}
