package starbucksNero.Concretes;

import starbucksNero.Abstract.ICustomerCheckService;
import starbucksNero.Entities.Customer;

public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}
}
