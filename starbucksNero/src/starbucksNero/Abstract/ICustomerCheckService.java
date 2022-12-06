package starbucksNero.Abstract;

import starbucksNero.Entities.Customer;

public interface ICustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
