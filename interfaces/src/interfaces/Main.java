package interfaces;

public class Main {

	public static void main(String[] args) {
		//interfacesler newlenemez.
		Logger[] loggers= {new SmsLogger(),new FileLogger()};
		CustomerManager customerManager=new CustomerManager(loggers);
		
		Customer oguz=new Customer(1,"Oğuz","Altıntaş");
		customerManager.add(oguz);
		
	}

}
