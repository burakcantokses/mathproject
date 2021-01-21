package kombinasyon;

import java.util.Scanner;

import kombinasyon.soru.sorular.Soru;
import kombinasyon.utils.OpenWebsite;

/**
 * @author burak
 *
 * @time 15.Oca.2021 16:50:46
 */
public class Main {
	public static Scanner input = new Scanner(System.in);
	public static boolean check = false;

	public static void main(String[] args) {
		String ad,soyad,mod;
		if (check == false) { 
		System.out.println("Ýsminizi Girin.");
		ad = input.nextLine();
		System.out.println("Soyadýnýzý Girin.");
		soyad = input.nextLine();
		check = true;	
		System.out.printf("\nKombinasyon Konu Anlatýmý, Soru Çözümü Sihirbazýna Hoþgeldin %s %s !", ad,soyad);
		}
		System.out.println("\n----------------------------------------------------------------------------");
        System.out.println("\tSorularýn Cevaplarýný Görmek Ýçin ['M'] Tuþuna Basýlýr.");
        System.out.println("\tÞýklarý Ýþaretlemek Ýçin ['A'],['B'],['C'],['D'],['E'] Tuþlarý Kullanýlýr.");
        System.out.println("\tSorunun Resimli Çözümünü Görmek Ýçin ['R'] Tuþuna Basýlýr.");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("Lütfen Ne Yapmak Ýstediðinizi Seçin.");
        System.out.println("Konu Anlatýmý Ýçin ['K'], Soru Çözümü Ýçin ['S'] Tuþuna Basýn.");
        mod = input.nextLine();
        while (!(mod.equals("K") || mod.equals("k") || mod.equals("S") || mod.equals("s"))) {
        	System.out.println("Lütfen Geçerli Bir Harf Giriþi Yapýnýz.");	
            System.out.println("Konu Anlatýmý Ýçin ['K'], Soru Çözümü Ýçin ['S'] Tuþuna Basýn.");
            mod = input.nextLine();
		}
        if (mod.equals("k") || mod.equals("K")) {
        	konuAnlat(0);
        }else if (mod.equals("S") || mod.equals("s")) {
        	soruCoz(0);
        }else {
            while (!(mod.equals("K") || mod.equals("k") || mod.equals("S") || mod.equals("s"))) {
            	System.out.println("Lütfen Geçerli Bir Harf Giriþi Yapýnýz.");	
                System.out.println("Konu Anlatýmý Ýçin ['K'], Soru Çözümü Ýçin ['S'] Tuþuna Basýn.");
                mod = input.nextLine();
    		}
        }
	}
	
	public static void konuAnlat(int id) {
		clearScreen();
		if (id == 0) {
			String num,back;
			String url1 = "https://i.hizliresim.com/x1XWVk.jpg";
			String url2 = "https://i.hizliresim.com/2bl4te.jpg";
			String url3 = "https://i.hizliresim.com/yJ3Lz9.jpg";
			System.out.println("Kombinasyon Konu Anlatýmý Bölümüne Hoþgeldiniz.");
			System.out.println("1) Kombinasyon Nasýl Gösterilir?");
			System.out.println("2) Kombinasyon Baþka Nasýl Gösterilir?");
			System.out.println("3) Kombinasyon Kurallarý Nedir?");
			System.out.println("Yukarýdaki Konu Anlatýmý Seçeneklerinden Birini Seçip Baþýndaki Numarayý Konsola Tuþlayýn.");
			num = input.nextLine();
			while (!(num.equals("1") || num.equals("2") || num.equals("3"))) {
				System.out.println("Lütfen Geçerli Bir Numara Giriniz.");
				System.out.println("1) Kombinasyon Nasýl Gösterilir?");
				System.out.println("2) Kombinasyon Baþka Nasýl Gösterilir?");
				System.out.println("3) Kombinasyon Kurallarý Nedir?");
				System.out.println("Yukarýdaki Konu Anlatýmý Seçeneklerinden Birini Seçip Baþýndaki Numarayý Konsola Tuþlayýn.");
				num = input.nextLine();
			}
			
			if (num.equals("1")) {
				System.out.println(num + " Numaralý Anlatýma Yönlendiriliyorsun.");
				OpenWebsite.openLink(url1);
			}else if (num.equals("2")) {
				OpenWebsite.openLink(url2);
			}else if (num.equals("3")) {
				OpenWebsite.openLink(url3);
			}else {
				System.out.println("1) Kombinasyon Nasýl Gösterilir?");
				System.out.println("2) Kombinasyon Baþka Nasýl Gösterilir?");
				System.out.println("3) Kombinasyon Kurallarý Nedir?");
				System.out.println("Yukarýdaki Konu Anlatýmý Seçeneklerinden Birini Seçip Baþýndaki Numarayý Konsola Tuþlayýn.");
				num = input.nextLine();
				while (!(num.equals("1") || num.equals("2") || num.equals("3"))) {
					System.out.println("Lütfen Geçerli Bir Numara Giriniz.");
					System.out.println("1) Kombinasyon Nasýl Gösterilir?");
					System.out.println("2) Kombinasyon Baþka Nasýl Gösterilir?");
					System.out.println("3) Kombinasyon Kurallarý Nedir?");
					System.out.println("Yukarýdaki Konu Anlatýmý Seçeneklerinden Birini Seçip Baþýndaki Numarayý Konsola Tuþlayýn.");
					num = input.nextLine();
				}
			}
			System.out.println("Geri Dönmek Ýçin ['G'] Tuþuna Basýn. Çýkmak Ýçin ['G'] Dýþýnda Herhangi Bir Tuþa Basýn.");
			back = input.nextLine();
			if (back.equals("G") || back.equals("g")) {
				Main.main(null);
			}else {
				System.out.println("Program Kapatýldý.");
				System.exit(0);
			}
		}
	}

	public static void soruCoz(int id) {
		clearScreen();
		System.out.println("Soru Çözüm Bölümüne Hoþgeldin.");
		System.out.println("\n----------------------------------------------------------------------------");
        System.out.println("\tSorularýn Cevaplarýný Görmek Ýçin ['M'] Tuþuna Basýlýr.");
        System.out.println("\tÞýklarý Ýþaretlemek Ýçin ['A'],['B'],['C'],['D'],['E'] Tuþlarý Kullanýlýr.");
        System.out.println("\tSorunun Resimli Çözümünü Görmek Ýçin ['R'] Tuþuna Basýlýr.");
        System.out.println("----------------------------------------------------------------------------");
        int soruid;
        int soruids;
        int max = 10;
        String siradakiSoru;
        System.out.println("\nProgramda Ýstediðin Sorudan Baþlayabilirsin.");
        System.out.println("Sadece Baþlamak Ýstediðin Sorunun Numarasýný Yaz! (1-10)");
        soruid = Integer.parseInt(input.nextLine());
        while(soruid <1 || soruid > 10) {
        	System.out.println("Lütfen Geçerli Soru Numarasý Gir.");
            soruid = Integer.parseInt(input.nextLine());
        }
        
        for (soruids = soruid ; soruids <= max; soruids++) {
        	System.out.println("\n");
        	System.out.println("\n");
        	if (soruids == 1) {
        		Soru.soru(soruids);
        	}else {
        		System.out.println("Sýradaki Soru Ýçin ['S'] Tuþuna Bas.");
        		System.out.println("Anamenüye Dönmek Ýçin ['A'] Tuþuna Bas.");
        		siradakiSoru = input.nextLine();
        		if (siradakiSoru.equals("S") || siradakiSoru.equals("s")) {
        			System.out.println("Sýradaki Soruya Geçiyorsunuz.");
        			Soru.soru(soruids);
        			/*
        			 * Cevap Yanlýþsa Çalýþacak Method Yapýlacak!!
        			 */
        		}else if (siradakiSoru.equals("A") || siradakiSoru.equals("a")) {
        			System.out.println("Anamenüye Yönlendiriliyorsun.");
        			Main.main(null);
        		}else {
        			while (!(siradakiSoru.equals("S") || siradakiSoru.equals("s") || siradakiSoru.equals("A") || siradakiSoru.equals("a"))) {
						System.out.println("Geçerli Bir Harf Giriþi Yap!");
		        		siradakiSoru = input.nextLine();
					}
        		}
        	}
        	
		}
        
	}
	
	/*
	 * Util Methods
	 */
	public static void clearScreen() {  
		for (int i = 0; i < 100; i++) {
			System.out.println("");
		}
	}  
	
}
