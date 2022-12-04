package sesliHarfler;


public class Main {

	public static void main(String[] args) {
		//kalinInceHarf();
		//mukemmelSayi();
		//arkadasSayi();
		int[] sayilar=new int[] {1,2,3,4,5,6};
		int aranacak=5;
		boolean varMi=false;
		for (int i = 0; i < sayilar.length; i++) {
			if (aranacak==sayilar[i]) {
				varMi=true;
				break;
			}
		}
		if (varMi) {
			System.out.println("Sayı mevcuttur.");
		}else {
			System.out.println("Sayı mevcut değildir.");
		}
	}

	public static void arkadasSayi() {
		int sayi1=220;
		int sayi2=284;
		int toplam1=0;
		int toplam2=0;
		for (int i = 1; i < sayi1; i++) {
			if (sayi1%i==0) {
				toplam1+=i;
			}
		}
		for (int i = 1; i < sayi2; i++) {
			if (sayi2%i==0) {
				toplam2+=i;
			}
		}
		if (sayi1==toplam2 && sayi2==toplam1) {
			System.out.println("Bu iki sayı arkadaştır.");
		} else {
			System.out.println("Bu iki sayı arkadaş değildir.");
		}
	}

	public static void mukemmelSayi() {
		//6 --> 1,2,3
		//28 -->1,2,4,7,14
		int number=28;
		int total=0;
		for (int i = 1; i < number; i++) {
			if (number%i==0) {
				total+=i;
			}
		}
		if (total==number) {
			System.out.println(number +" mükemmel sayıdır.");
		}else {
			System.out.println(number +" mükemmel sayı değildir.");
		}
	}

	public static void kalinInceHarf() {
		char harf = 'K';
		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Girilen harf kalın ünlü harftir");
			break;
		case 'E':
		case 'İ':
		case 'Ö':
		case 'Ü':
			System.out.println("Girilen harf ince ünlü harftir");
			break;
		default:
			System.out.println("Girilen harf sessiz harftir");
		}
	}
}
