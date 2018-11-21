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
			throw new NoDatabaseConnectionException("In connectToDB");
		else {
			connection=true;
			return true;
		}
	}

	// public int createPayment(int id, int cardNum, String expiryDate, int verificationNo) throws NoDatabaseConnectionException{
	// 	if(connection==false) {
	// 		throw new NoDatabaseConnectionException("in createPayment function");
	// 	}
	// 	Payment payment=new Payment(id, cardNum, expiryDate, verificationNo);
	// 	ArrayList<Payment> payments=database.getPaymentList();
	// 	payments.add(payment);
	// 	database.setPaymentList(payments);
	// 	return 1;
	// }

	/**
	 * Adds payment to the database
	 */
	public int addPayment(Payment p) throws NoDatabaseConnectionException{
		if(connection==false) {
			throw new NoDatabaseConnectionException("in addPayment function");
		}
		ArrayList<Payment> payments=database.getPaymentList();
		payments.add(p);
		database.setPaymentList(payments);
		displayPaymentDB();
		return 1;
	}


	private void displayPaymentDB() throws NoDatabaseConnectionException{
		if(connection==false) {
			throw new NoDatabaseConnectionException("in addPayment function");
		}

		ArrayList<Payment> payments=database.getPaymentList();
		if(payments.size() == 0) {
			System.out.println("The PaymentDB is empty!");
			return;
		}
		System.out.println("\nDisplaying PaymentDB:\n");
		for(int i = 0; i < payments.size(); i++){
			System.out.println("Payment id = " + payments.get(i).getId());
			System.out.println("userID = " + payments.get(i).getUserID());
			System.out.println("Books:");
			for(int j = 0; j < payments.get(i).getBooks().size();j++){
				System.out.println(payments.get(i).getBooks().get(j).toString());
			}
			System.out.println("Promotions:");
			for(int j = 0; j < payments.get(i).getPromotions().size();j++){
				System.out.println(payments.get(i).getPromotions().get(j).toString());
			}
			System.out.println("");
		}

	}
}
