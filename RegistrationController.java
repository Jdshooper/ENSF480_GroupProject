import java.util.ArrayList;
import java.util.Date;

public class RegistrationController {
	RegisteredBuyerDBBroker dbBroker;
	public RegistrationController(){
		try {
			dbBroker=new RegisteredBuyerDBBroker();
		}catch(NoDatabaseConnectionException e) {
			e.printStackTrace();
		}
	}
	public int getRegistration(int buyerID) {
		int reg;
		try {
			reg=dbBroker.getRegistration(buyerID);
		}catch(NoDatabaseConnectionException e) {
			e.printStackTrace();
			return -1;
		}
		return reg;
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
			//return dbBroker.getPromotions(buyerID, promotions);
			int x=dbBroker.getPromotions(buyerID, promotions);
			return x;
		}catch(NoDatabaseConnectionException e) {
			e.printStackTrace();
			return -1;
		}
	}
	public int createPromotion(int id, String name, Date validUntil, int discount) {
		try {
			return dbBroker.createPromotion(name, validUntil, discount);
		}catch(NoDatabaseConnectionException e) {
			e.printStackTrace();
			return -1;
		}
	}
}
