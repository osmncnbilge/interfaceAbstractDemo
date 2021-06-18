package interfacesAbstractDemo.bussines.concret;

import interfacesAbstractDemo.bussines.abstracts.CustomerCheckService;
import interfacesAbstractDemo.entities.concret.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		return true;
	}

}
