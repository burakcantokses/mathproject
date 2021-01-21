package kombinasyon.soru.sorular;

import java.util.Scanner;

import kombinasyon.Main;

/**
 * @author burak
 *
 * @time 19.Oca.2021 18:20:52
 */
public class Soru{
	public static boolean siradakiCheck = false;

	public static Scanner input = new Scanner(System.in);
	public static void soru(int soruid) {
		if (soruid == 1) {
			boolean check;
			String cevap;
			String soru = "2 + 2 = ?";

			System.out.println(soru);

			System.out.println("\nA) 4");
			System.out.println("B) 3");
			System.out.println("C) 6");
			System.out.println("D) 55");
			System.out.println("E) 44");
		
			System.out.println("\nSoru Yukarýdaki Gibidir.");
			System.out.println("Lütfen Ýþaretlediðiniz Þýkký Girin.");
			cevap = input.nextLine();
		
			if(cevap.equals("A") || cevap.equals("a")) {
				check = true;
				System.out.println("Cevabýn Doðru!");
			}else if (cevap.equals("B") || cevap.equals("b")) {
				check = false;
				System.out.println("Cevabýn Yanlýþ Doðru Cevap Ýçin ['M'] Tuþuna Bas.");
				System.out.println("Sorunun Resimli Çözümü Ýçin ['R'] Tuþuna Bas.");
			}else if (cevap.equals("C") || cevap.equals("c")) {
				check = false;
				System.out.println("Cevabýn Yanlýþ Doðru Cevap Ýçin ['M'] Tuþuna Bas.");
				System.out.println("Sorunun Resimli Çözümü Ýçin ['R'] Tuþuna Bas.");
			}else if (cevap.equals("D") || cevap.equals("d")) {
				check = false;
				System.out.println("Cevabýn Yanlýþ Doðru Cevap Ýçin ['M'] Tuþuna Bas.");
				System.out.println("Sorunun Resimli Çözümü Ýçin ['R'] Tuþuna Bas.");
			}else if (cevap.equals("E") || cevap.equals("e")) {
				check = false;
				System.out.println("Cevabýn Yanlýþ Doðru Cevap Ýçin ['M'] Tuþuna Bas.");
				System.out.println("Sorunun Resimli Çözümü Ýçin ['R'] Tuþuna Bas.");
			}else {
				while (!(cevap.equals("A") || cevap.equals("a") || cevap.equals("C") || cevap.equals("c") || cevap.equals("D") || cevap.equals("d") || cevap.equals("E") || cevap.equals("e"))) {
					System.out.println("Lütfen Geçerli Bir Þýk Girin.");
					cevap = input.nextLine();
				}
			}
		}
		
		if (soruid == 2) {
			boolean check;
			String cevap;
			String soru = "3 + 3 = ?";

			System.out.println(soru);

			System.out.println("\nA) 4");
			System.out.println("B) 3");
			System.out.println("C) 6");
			System.out.println("D) 55");
			System.out.println("E) 44");
		
			System.out.println("\nSoru Yukarýdaki Gibidir.");
			System.out.println("Lütfen Ýþaretlediðiniz Þýkký Girin.");
			cevap = input.nextLine();
		
			if(cevap.equals("A") || cevap.equals("a")) {
				check = false;
				System.out.println("Cevabýn Yanlýþ Doðru Cevap Ýçin ['M'] Tuþuna Bas.");
				System.out.println("Sorunun Resimli Çözümü Ýçin ['R'] Tuþuna Bas.");
			}else if (cevap.equals("B") || cevap.equals("b")) {
				check = false;
				System.out.println("Cevabýn Yanlýþ Doðru Cevap Ýçin ['M'] Tuþuna Bas.");
				System.out.println("Sorunun Resimli Çözümü Ýçin ['R'] Tuþuna Bas.");
			}else if (cevap.equals("C") || cevap.equals("c")) {
				check = true;
				System.out.println("Cevabýn Doðru!");
			}else if (cevap.equals("D") || cevap.equals("d")) {
				check = false;
				System.out.println("Cevabýn Yanlýþ Doðru Cevap Ýçin ['M'] Tuþuna Bas.");
				System.out.println("Sorunun Resimli Çözümü Ýçin ['R'] Tuþuna Bas.");
			}else if (cevap.equals("E") || cevap.equals("e")) {
				check = false;
				System.out.println("Cevabýn Yanlýþ Doðru Cevap Ýçin ['M'] Tuþuna Bas.");
				System.out.println("Sorunun Resimli Çözümü Ýçin ['R'] Tuþuna Bas.");
			}else {
				while (!(cevap.equals("A") || cevap.equals("a") || cevap.equals("C") || cevap.equals("c") || cevap.equals("D") || cevap.equals("d") || cevap.equals("E") || cevap.equals("e"))) {
					System.out.println("Lütfen Geçerli Bir Þýk Girin.");
					cevap = input.nextLine();
				}
			}
		}
		
	}
}
