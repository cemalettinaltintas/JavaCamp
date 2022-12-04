package sgtringDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj="Mustafa Kemal Atatürk";
		
//		System.out.println(mesaj);
//		System.out.println("Eleman sayısı : "+mesaj.length());
//		System.out.println("5. Eleman : "+mesaj.charAt(4));
//		System.out.println(mesaj.concat(" Atatürk"));
//		System.out.println(mesaj.startsWith("M"));
//		System.out.println(mesaj.endsWith("l"));
//		
//		char[] karakterler=new char[7];
//		mesaj.getChars(0, 7, karakterler, 0);
//		System.out.println(karakterler);
//		
//		System.out.println(mesaj.indexOf("a"));
//		System.out.println(mesaj.lastIndexOf("a"));
		String yeniMesaj=mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		System.out.println(mesaj);
		System.out.println(mesaj.substring(8));
		System.out.println(mesaj.substring(0,7));
		System.out.println("-----------");
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
	}

}
