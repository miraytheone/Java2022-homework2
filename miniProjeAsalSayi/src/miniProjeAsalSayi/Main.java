package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		int myList[] = {3,5,7,9,11,15,16,23};
		
		for( int number:myList) {
			boolean isPrime = true;
			for(int i=2; i<number;i++) {
				if(number % i == 0) {
					isPrime = false;
				}
				
			}
			if(isPrime) {
				System.out.println("Sayı asaldır.");
			}
			else {
				System.out.println("Sayı asal değildir.");
			}
		}

}
}