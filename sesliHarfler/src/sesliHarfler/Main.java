package sesliHarfler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char harf;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sesli bir harf giriniz.");
		harf = scan.next().charAt(0);
		
		switch (harf) {
			case 'a':
			case 'ı':
			case 'o':
			case 'u':
				System.out.println(harf + " kalın sesli harf.");
				break;
			case 'e':
			case 'i':
			case 'ö':
			case 'ü':
				System.out.println(harf + " ince sesli harf.");
				break;
				default:
					System.out.println(harf + " sesli harf değildir.");
		}
		
	}

}
