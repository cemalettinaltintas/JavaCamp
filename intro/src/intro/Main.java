package intro;
public class Main {

	public static void main(String[] args) {
	    String kredi1="Hızlı Kredi";
	    String kredi2="Maaşını Halkbanktan Alanlara Özel";
	    String kredi3="Mutlu Emeklilik İhtiyaç Kredisi";
	    String kredi4="Kamu Çalışanlarına Özel";
	    String kredi5="Özel Sektör Çalışanlarına Özel";
	    String kredi6="Gayri Menkul Arsa";
	    
	   // System.out.println(kredi1);
	   // System.out.println(kredi2);
	    //System.out.println(kredi3);
	   // System.out.println(kredi4);
	   // System.out.println(kredi5);
	   // System.out.println(kredi6);
	    

	    //ilkel tip
	    int sayi1=10;
	    int sayi2=20;
	    sayi1=sayi2;
	    sayi2=1000;
	    //System.out.println(sayi1);//20

	    //referans tip
	    int[] sayilar1={1,2,3,4,5};
	    int[] sayilar2={10,20,30,40,50};
	    sayilar1=sayilar2;
	    sayilar2[0]=1000;
	    //System.out.println(sayilar1[0]);//1000

	    String sehir1="Ankara";
	    String sehir2="İstanbul";
	    sehir1=sehir2;
	    sehir2="İzmir";
	    //System.out.println(sehir1);//İstanbul
	    
	    String[] krediler={
	      "Hızlı Kredi",
	      "Maaşını Halkbanktan Alanlara Özel",
	      "Mutlu Emeklilik İhtiyaç Kredisi",
	      "Kamu Çalışanlarına Özel",
	      "Özel Sektör Çalışanlarına Özel",
	      "Gayri Menkul Arsa",
	      "MEB Kredisi"
	    };
	    //foreach
	    for(String kredi:krediler){
	      System.out.println(kredi);
	    }
	    
	    double dolarDun=18.60;
	    double dolarBugun=18.50;
	    //System.out.println(dolarBugun<dolarDun);
	  
	    if(dolarBugun<dolarDun){
	      System.out.println("Dolar düştü.");
	    }else{
	      System.out.println("Dolar yükseldi.");
	    }
	}
}