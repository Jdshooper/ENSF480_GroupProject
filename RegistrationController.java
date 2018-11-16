import java.util.ArrayList;

public class RegistrationController {
	RegisteredBuyerDBBroker dbBroker;
	public RegistrationController(){
		try {
			dbBroker=new RegisteredBuyerDBBroker();
		}catch(NoDatabaseConnectionException e) {
			e.printStackTrace();
		}
	}
	public boolean changeRegistration(int buyerID) {
		try {
			dbBroker.changeRegistration(buyerID);
		}catch(NoDatabaseConnectionException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public int getPromotions(int buyerID, ArrayList<Promotion> promotions){
		try {
			return dbBroker.getPromotions(buyerID, promotions);
		}catch(NoDatabaseConnectionException e) {
			e.printStackTrace();
			return -1;
		}
	}
}
