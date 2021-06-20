package interfacesAbstractDemo;

import java.util.Date;

import interfacesAbstractDemo.bussines.abstracts.BaseCustomerManager;
import interfacesAbstractDemo.bussines.concret.NeroCustomerManager;
import interfacesAbstractDemo.bussines.concret.StarbucksCustomerManager;
import interfacesAbstractDemo.core.MernisServiceAdapter;
import interfacesAbstractDemo.entities.concret.Customer;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("deprecation")
		Date birthDay = new Date(1996, 27, 03);
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1, "Osman Can", "Bilge", birthDay, "48388545768"));
	}

}
