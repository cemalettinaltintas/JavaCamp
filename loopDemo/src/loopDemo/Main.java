package loopDemo;

public class Main {
//-Dsun.stdout.encoding=UTF-8
	public static void main(String[] args) {
		for (int i = 2; i < 20; i+=2) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti.");
		
		//While Döngüsü
		int i=1;
		while (i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti.");
		
		//Do-while Döngüsü
		int j=0;
		do {
			System.out.println(j);
			j+=2;
		} while (j<10);
		
		System.out.println("Do-While döngüsü bitti.");
	}
}
