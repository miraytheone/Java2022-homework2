package arkadasSayilar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int sayi1;
		int sayi2;
		int sum1=0;
		int sum2=0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayı giriniz");
		sayi1 = scan.nextInt();
		
		System.out.println("Lütfen bir sayı giriniz.");
		sayi2 = scan.nextInt();

		for(int i=1; i<sayi1;i++) {
			if(sayi1 % i ==0) {
				sum1 = sum1 + i;
			}
		}
		
		for (int j=1; j<sayi2;j++) {
			if(sayi2 % j == 0 ){
				sum2 = sum2 + j;
			}
		}
		
		if(sum1 == sayi2  && sum2 == sayi1) {
			System.out.println(sayi1 + " ve " + sayi2 + " arkadaş sayıdır.");
		}
		else {
			System.out.println(sayi1 + " ve " + sayi2 + " arkadaş sayı değildir.");
		}
	}

}
