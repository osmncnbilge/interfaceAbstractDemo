package interfacesAbstractDemo.bussines.abstracts;

import interfacesAbstractDemo.entities.concret.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);

}
