package interfacesDemo;

public class Main {
 public static void main(String[] args) {
	 //interfaceler de abstractlar gibi newlenemez.
	 //referans tutucudurlar.
	 //abstractlar ile interfacelerin temel farkı şudur.
	 //bir class birden fazla interface i implement edebilir
	 //ancak bir sadece bir classı extends edebilir.
	 //ICustomerDal customerDal=new OracleCustomerDal();
	 
	 CustomerManager customerManager=new CustomerManager(new MySqlCustomerDal());
	 customerManager.add();
	 
	 
 }
}
