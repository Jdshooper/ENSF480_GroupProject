
public class PaymentController {
	PaymentDBBroker dbBroker;
	public PaymentController(){
		try {
			dbBroker=new PaymentDBBroker();
		}catch(NoDatabaseConnectionException e) {
			e.printStackTrace();
		}
	}
	public int createPayment(int id, int cardNum, String expiryDate, int verificationNo) {
		try {
			return dbBroker.createPayment(id, cardNum, expiryDate, verificationNo);
		}catch(NoDatabaseConnectionException e) {
			e.printStackTrace();
			return -1;
		}
	}
}