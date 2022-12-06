package starbucksNero.Concretes;

import starbucksNero.Abstract.BaseCustomerManager;
import starbucksNero.Abstract.ICustomerCheckService;
import starbucksNero.Adapters.MernisServiceAdapter;
import starbucksNero.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
    private ICustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person.");
		}
	}
}
