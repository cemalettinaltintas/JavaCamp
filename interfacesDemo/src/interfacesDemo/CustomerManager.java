package interfacesDemo;

public class CustomerManager {
	private ICustomerDal customerDal;
	
	//Polymorphismin interfaceslerle uygulanma versiyonudur.
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	
	public void add() {
		customerDal.add();
	}
}
