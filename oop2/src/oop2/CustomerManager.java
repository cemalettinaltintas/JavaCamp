package oop2;

public class CustomerManager {
	public void add(Logger logger) {
		// müşteri ekleme kodları
		System.out.println("Customer added.");
		
		//Yönetim bundan böyle dosyaya da loglama yapılacak derse?
		//Altın kural :İş yapan sınıf başka bir iş yapan sınıfı kullanacaksa
		//asla somut sınıftan gidilmez.
		
		//DatabaseLogger databaseLogger=new DatabaseLogger();
		//databaseLogger.log();
		logger.log();
	}
}
