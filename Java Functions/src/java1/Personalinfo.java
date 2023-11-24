package java1;

import java.util.Scanner;

public class Personalinfo {
	public static void getinfo() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Adınızı girin:");
		String ad = scanner.nextLine();
		System.out.println(ad);
		System.out.println("Yas bilgilerini girin");
		int yas = scanner.nextInt();
		System.out.println(yas);
	}

}
