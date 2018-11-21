import java.util.ArrayList;

public class Payment {
	private static int paymentID=0;
	private int id;
	private int userID;
	// Details of the transaction:
	private ArrayList<Document> books;
	private ArrayList<Promotion> promotions;
	private CardDetails cardDetails;

	public Payment(int uid, ArrayList<Document> b, ArrayList<Promotion> p, int cardNum, String expiryDate, int verificationNo) {
		id=paymentID++;
		this.userID=uid;
		this.cardDetails=new CardDetails(cardNum, expiryDate, verificationNo);
		this.books = b;
		this.promotions = p;
	}
	public ArrayList<Document> getBooks(){
		return books;
	}
	public ArrayList<Promotion> getPromotions(){
		return promotions;
	}
	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

}
