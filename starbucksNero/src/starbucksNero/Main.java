package starbucksNero;

import starbucksNero.Abstract.BaseCustomerManager;
import starbucksNero.Adapters.MernisServiceAdapter;
import starbucksNero.Concretes.CustomerCheckManager;
import starbucksNero.Concretes.StarbucksCustomerManager;
import starbucksNero.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Cemalettin","Altıntaş",1983,"12345678910"));
	}
}
