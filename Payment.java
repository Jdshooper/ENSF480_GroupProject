
public class Payment {
	private int id;
	private Cart cart;
	private CardDetails cardDetails;
	public Payment(int id, int cardNum, String expiryDate, int verificationNo) {
		this.id=id;
		this.cardDetails=new CardDetails(cardNum, expiryDate, verificationNo);
		cart=Cart.getCart();
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
}
