package interfacesAbstractDemo.core;

import java.rmi.RemoteException;

import interfacesAbstractDemo.bussines.abstracts.CustomerCheckService;
import interfacesAbstractDemo.entities.concret.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@SuppressWarnings("deprecation")
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		try {
			return kpsPublic.TCKimlikNoDogrula(
					Long.parseLong(customer.getNationalityId()), 
					customer.getFirstName().toUpperCase(), 
					customer.getLastName().toUpperCase(), 
					customer.getDateOfBirth().getYear());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
