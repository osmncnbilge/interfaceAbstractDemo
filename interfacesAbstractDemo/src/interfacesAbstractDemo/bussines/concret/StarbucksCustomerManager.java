package interfacesAbstractDemo.bussines.concret;

import interfacesAbstractDemo.bussines.abstracts.BaseCustomerManager;
import interfacesAbstractDemo.bussines.abstracts.CustomerCheckService;
import interfacesAbstractDemo.entities.concret.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer){
		
		try {
			if(customerCheckService.checkIfRealPerson(customer)) {
				super.save(customer);	
			} else {
				throw new Exception("Not a valid person");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
