import java.util.ArrayList;

public class PaymentDBBroker {
	private PaymentDB database;
	private boolean connection;
	public PaymentDBBroker() throws NoDatabaseConnectionException{
		connection=false;
		connectToDB();
	}
	private boolean connectToDB() throws NoDatabaseConnectionException{
		database=PaymentDB.getPaymentDB();
		if(database==null)
			throw new NoDatabaseConnectionException("In PaymentDBBroker");
		else {
			connection=true;
			return true;
		}
	}
	public int createPayment(int id, int cardNum, String expiryDate, int verificationNo) throws NoDatabaseConnectionException{
		if(connection==false) {
			throw new NoDatabaseConnectionException("in createPayment function");
		}
		Payment payment=new Payment(id, cardNum, expiryDate, verificationNo);
		ArrayList<Payment> payments=database.getPaymentList();
		payments.add(payment);
		database.setPaymentList(payments);
		return 1;
	}
}
