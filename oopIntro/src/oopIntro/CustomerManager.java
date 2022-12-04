package oopIntro;

public class CustomerManager {
//	public void add(IndividualCustomer customer) {
//		System.out.println(customer.getCustomerNumber());
//	}
//	public void add(CorporateCustomer customer) {
//		System.out.println(customer.getCustomerNumber());
//	}
	
	//Polymorphism
	//Customer kendisini extend eden sınıfların referanslarını tutabilir.
	//SOLID : O ->Open Closed Principle
	public void add(Customer customer) {
		System.out.println(customer.getCustomerNumber());
	}
	
	public void addMultiple(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
}

