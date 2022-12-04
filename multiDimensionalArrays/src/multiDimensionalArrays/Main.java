package multiDimensionalArrays;

public class Main {

	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Kocaeli";
		sehirler[0][2] = "Bursa";
		sehirler[1][0] = "Tokat";
		sehirler[1][1] = "Samsun";
		sehirler[1][2] = "Rize";
		sehirler[2][0] = "Ankara";
		sehirler[2][1] = "Konya";
		sehirler[2][2] = "Yozgat";
		for (int i = 0; i < sehirler.length; i++) {
			for (int j = 0; j < sehirler.length; j++) {
				System.out.println(sehirler[i][j]);
			}
			System.out.println("-----------");
		}
	}

}
