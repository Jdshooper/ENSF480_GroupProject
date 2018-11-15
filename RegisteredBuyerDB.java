
import java.util.ArrayList;

public class RegisteredBuyerDB {
	//Note, this is a MOCK DB since implementation does not require database.
	//also, there are some methods missing since not implementing changing style.
	//Implemented via singleton
	
	private static RegisteredBuyerDB instance=null;
	private RegisteredBuyerDB() {}
	private ArrayList<Buyer> buyerList;
	private ArrayList<Promotion> promotionList;
	public static RegisteredBuyerDB getRegisteredBuyerDB()
	{
		if(instance==null)
			instance=new RegisteredBuyerDB();
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
	 * @return the buyerList
	 */
	public ArrayList<Buyer> getBuyerList() {
		return buyerList;
	}

	/**
	 * @param buyerList the buyerList to set
	 */
	public void setBuyerList(ArrayList<Buyer> buyerList) {
		this.buyerList = buyerList;
	}

	/**
	 * @return the promotionList
	 */
	public ArrayList<Promotion> getPromotionList() {
		return promotionList;
	}

	/**
	 * @param promotionList the promotionList to set
	 */
	public void setPromotionList(ArrayList<Promotion> promotionList) {
		this.promotionList = promotionList;
	}
	
}