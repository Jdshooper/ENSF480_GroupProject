
public class Payment {
	private static int paymentID=0;
	private int id;
	private int userID;
	private Cart cart;
	private CardDetails cardDetails;
	public Payment(int id, int cardNum, String expiryDate, int verificationNo) {
		id=paymentID++;
		this.userID=id;
		this.cardDetails=new CardDetails(cardNum, expiryDate, verificationNo);
		cart=Cart.getCart();
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
