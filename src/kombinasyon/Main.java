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
		System.out.println("�sminizi Girin.");
		ad = input.nextLine();
		System.out.println("Soyad�n�z� Girin.");
		soyad = input.nextLine();
		check = true;	
		System.out.printf("\nKombinasyon Konu Anlat�m�, Soru ��z�m� Sihirbaz�na Ho�geldin %s %s !", ad,soyad);
		}
		System.out.println("\n----------------------------------------------------------------------------");
        System.out.println("\tSorular�n Cevaplar�n� G�rmek ��in ['M'] Tu�una Bas�l�r.");
        System.out.println("\t��klar� ��aretlemek ��in ['A'],['B'],['C'],['D'],['E'] Tu�lar� Kullan�l�r.");
        System.out.println("\tSorunun Resimli ��z�m�n� G�rmek ��in ['R'] Tu�una Bas�l�r.");
        System.out.println("----------------------------------------------------------------------------");
        System.out.println("\n");
        System.out.println("L�tfen Ne Yapmak �stedi�inizi Se�in.");
        System.out.println("Konu Anlat�m� ��in ['K'], Soru ��z�m� ��in ['S'] Tu�una Bas�n.");
        mod = input.nextLine();
        while (!(mod.equals("K") || mod.equals("k") || mod.equals("S") || mod.equals("s"))) {
        	System.out.println("L�tfen Ge�erli Bir Harf Giri�i Yap�n�z.");	
            System.out.println("Konu Anlat�m� ��in ['K'], Soru ��z�m� ��in ['S'] Tu�una Bas�n.");
            mod = input.nextLine();
		}
        if (mod.equals("k") || mod.equals("K")) {
        	konuAnlat(0);
        }else if (mod.equals("S") || mod.equals("s")) {
        	soruCoz(0);
        }else {
            while (!(mod.equals("K") || mod.equals("k") || mod.equals("S") || mod.equals("s"))) {
            	System.out.println("L�tfen Ge�erli Bir Harf Giri�i Yap�n�z.");	
                System.out.println("Konu Anlat�m� ��in ['K'], Soru ��z�m� ��in ['S'] Tu�una Bas�n.");
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
			System.out.println("Kombinasyon Konu Anlat�m� B�l�m�ne Ho�geldiniz.");
			System.out.println("1) Kombinasyon Nas�l G�sterilir?");
			System.out.println("2) Kombinasyon Ba�ka Nas�l G�sterilir?");
			System.out.println("3) Kombinasyon Kurallar� Nedir?");
			System.out.println("Yukar�daki Konu Anlat�m� Se�eneklerinden Birini Se�ip Ba��ndaki Numaray� Konsola Tu�lay�n.");
			num = input.nextLine();
			while (!(num.equals("1") || num.equals("2") || num.equals("3"))) {
				System.out.println("L�tfen Ge�erli Bir Numara Giriniz.");
				System.out.println("1) Kombinasyon Nas�l G�sterilir?");
				System.out.println("2) Kombinasyon Ba�ka Nas�l G�sterilir?");
				System.out.println("3) Kombinasyon Kurallar� Nedir?");
				System.out.println("Yukar�daki Konu Anlat�m� Se�eneklerinden Birini Se�ip Ba��ndaki Numaray� Konsola Tu�lay�n.");
				num = input.nextLine();
			}
			
			if (num.equals("1")) {
				System.out.println(num + " Numaral� Anlat�ma Y�nlendiriliyorsun.");
				OpenWebsite.openLink(url1);
			}else if (num.equals("2")) {
				OpenWebsite.openLink(url2);
			}else if (num.equals("3")) {
				OpenWebsite.openLink(url3);
			}else {
				System.out.println("1) Kombinasyon Nas�l G�sterilir?");
				System.out.println("2) Kombinasyon Ba�ka Nas�l G�sterilir?");
				System.out.println("3) Kombinasyon Kurallar� Nedir?");
				System.out.println("Yukar�daki Konu Anlat�m� Se�eneklerinden Birini Se�ip Ba��ndaki Numaray� Konsola Tu�lay�n.");
				num = input.nextLine();
				while (!(num.equals("1") || num.equals("2") || num.equals("3"))) {
					System.out.println("L�tfen Ge�erli Bir Numara Giriniz.");
					System.out.println("1) Kombinasyon Nas�l G�sterilir?");
					System.out.println("2) Kombinasyon Ba�ka Nas�l G�sterilir?");
					System.out.println("3) Kombinasyon Kurallar� Nedir?");
					System.out.println("Yukar�daki Konu Anlat�m� Se�eneklerinden Birini Se�ip Ba��ndaki Numaray� Konsola Tu�lay�n.");
					num = input.nextLine();
				}
			}
			System.out.println("Geri D�nmek ��in ['G'] Tu�una Bas�n. ��kmak ��in ['G'] D���nda Herhangi Bir Tu�a Bas�n.");
			back = input.nextLine();
			if (back.equals("G") || back.equals("g")) {
				Main.main(null);
			}else {
				System.out.println("Program Kapat�ld�.");
				System.exit(0);
			}
		}
	}

	public static void soruCoz(int id) {
		clearScreen();
		System.out.println("Soru ��z�m B�l�m�ne Ho�geldin.");
		System.out.println("\n----------------------------------------------------------------------------");
        System.out.println("\tSorular�n Cevaplar�n� G�rmek ��in ['M'] Tu�una Bas�l�r.");
        System.out.println("\t��klar� ��aretlemek ��in ['A'],['B'],['C'],['D'],['E'] Tu�lar� Kullan�l�r.");
        System.out.println("\tSorunun Resimli ��z�m�n� G�rmek ��in ['R'] Tu�una Bas�l�r.");
        System.out.println("----------------------------------------------------------------------------");
        int soruid;
        int soruids;
        int max = 10;
        String siradakiSoru;
        System.out.println("\nProgramda �stedi�in Sorudan Ba�layabilirsin.");
        System.out.println("Sadece Ba�lamak �stedi�in Sorunun Numaras�n� Yaz! (1-10)");
        soruid = Integer.parseInt(input.nextLine());
        while(soruid <1 || soruid > 10) {
        	System.out.println("L�tfen Ge�erli Soru Numaras� Gir.");
            soruid = Integer.parseInt(input.nextLine());
        }
        
        for (soruids = soruid ; soruids <= max; soruids++) {
        	System.out.println("\n");
        	System.out.println("\n");
        	if (soruids == 1) {
        		Soru.soru(soruids);
        	}else {
        		System.out.println("S�radaki Soru ��in ['S'] Tu�una Bas.");
        		System.out.println("Anamen�ye D�nmek ��in ['A'] Tu�una Bas.");
        		siradakiSoru = input.nextLine();
        		if (siradakiSoru.equals("S") || siradakiSoru.equals("s")) {
        			System.out.println("S�radaki Soruya Ge�iyorsunuz.");
        			Soru.soru(soruids);
        			/*
        			 * Cevap Yanl��sa �al��acak Method Yap�lacak!!
        			 */
        		}else if (siradakiSoru.equals("A") || siradakiSoru.equals("a")) {
        			System.out.println("Anamen�ye Y�nlendiriliyorsun.");
        			Main.main(null);
        		}else {
        			while (!(siradakiSoru.equals("S") || siradakiSoru.equals("s") || siradakiSoru.equals("A") || siradakiSoru.equals("a"))) {
						System.out.println("Ge�erli Bir Harf Giri�i Yap!");
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
