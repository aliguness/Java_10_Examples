package com.bilgeadam.lesson033.openclosed;

/* Open Closed
 * 
 * 1 - instagram sınıfımz icinde bir sclaeRatio özelliğimiz olsun 
 * ResizePhoto diye bir sınıfımız olsun bu sınıf içinde boyutlandırma yapacağız
 *  bu metot bizden bir instagram alacak birde string bir type alacak ve 
 *  eğer type jpg ise   sclaeRatio ( küçültme katsayısı) 38 eğer png ise 30 default 40 olsun 
 *  
 * 2- Yeni bir sosyal medya uygulaması daha eklendi facebook
 * facebook icin jpg-->34 png-->37 default--> 45 olsun  daha sonra resizephoto sınıfında 2.ci 
 * bir metot yazalım bu metotda facebookda goz onune alınsın 
 * 3- yeni bir sosyal medya daha ekleyelim whatsapp 
 * jpg-->28 png 32 default 36
 * 
 */
public class Instagram extends SocialMedia {

	@Override
	public void changeScaleRatio(String type) {

		if (type.equals("jpg")) {
			setSclaeRatio(38);
		} else if (type.equals("png")) {
			setSclaeRatio(30);
		} else {
			setSclaeRatio(40);
		}
	}

}