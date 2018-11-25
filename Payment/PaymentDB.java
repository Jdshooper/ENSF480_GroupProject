package Payment;

import Exceptions.*;
import Objects.*;

import java.util.ArrayList;

public class PaymentDB {
	//Note, this is a MOCK DB since implementation does not require database.
	//also, there are some methods missing since not implementing changing style.
	//Implemented via singleton

	private static PaymentDB instance=null;
	private PaymentDB() {
		paymentList = new ArrayList<Payment>();
	}
	private ArrayList<Payment> paymentList;
	public static PaymentDB getPaymentDB()
	{
		if(instance==null)
			instance=new PaymentDB();
		return instance;
	}

	public boolean DoQuery(String query)
	{
		//database does the query
		//if query succeeds return true
		//else return false

		//pretend that this does something.
		return true;
	}

	/**
	 * @return the paymentList
	 */
	public ArrayList<Payment> getPaymentList() {
		return paymentList;
	}

	/**
	 * @param paymentList the paymentList to set
	 */
	public void setPaymentList(ArrayList<Payment> paymentList) {
		this.paymentList = paymentList;
	}

}
