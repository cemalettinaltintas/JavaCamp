package interfaces;

public class CustomerManager {
	//CustomerManager, Looger a bağımlı
	//Neye bağımlıysak onun private değişkenini oluşturuyoruz.
	private Logger[] loggers;
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	//iki tip bağımlılık var.
	//loostly - tightly couplud
	public void add(Customer customer) {
		System.out.println("Müşteri eklendi : "+customer.getFirstName());
//		DatabaseLogger logger=new DatabaseLogger();
//		logger.log(customer.getFirstName()+" veritabanına loglandı.");
		//this.logger.log(customer.getFirstName());
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi :"+customer.getFirstName());
//		DatabaseLogger logger=new DatabaseLogger();
//		logger.log(customer.getFirstName()+" veritabanına loglandı.");
//		this.logger.log(customer.getFirstName());
//		for(Logger logger :loggers) {
//			logger.log(customer.getFirstName());
//		}
		Utils.runLoggers(loggers, customer.getLastName());
	}
}
