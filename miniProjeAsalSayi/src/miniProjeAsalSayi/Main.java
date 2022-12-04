package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		//bug: Uygulamadaki sistemsel hatalardır. Açıklardır.
		int number=1;
		int remainder=number%2;
		boolean isPrime=true;
		//System.out.println(remainder);
		
		if (number==1) {
			System.out.println("Sayı asal değildir.");
			return;
		}
		
		for (int i = 2; i < number; i++) {
			if (number%i==0) {
				isPrime=false;
				break;
			}
			
		}
		if (isPrime) {
			System.out.println("Sayı asaldır.");
		}else {
			System.out.println("Sayı asal değildir.");
		}
	}

}
