package oop2;

public class Main {

	public static void main(String[] args) {
//		LogManager logManager=new LogManager();
//		logManager.log(1);
//		logManager.log(2);
		//Yönetim veritabanına loglama desteğinin kaldır derse?
		CustomerManager customerManager=new CustomerManager();
		customerManager.add(new EmailLogger());
	}
}
