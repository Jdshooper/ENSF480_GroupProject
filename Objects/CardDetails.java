package Objects;

public class CardDetails {
	private int cardNum;
	private String expiryDate;
	private int verificationNo;
	public CardDetails(int cardNum, String expiryDate, int verificationNo) {
		this.cardNum=cardNum;
		this.expiryDate=expiryDate;
		this.verificationNo=verificationNo;
	}
	/**
	 * @return the cardNum
	 */
	public int getCardNum() {
		return cardNum;
	}
	/**
	 * @param cardNum the cardNum to set
	 */
	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	/**
	 * @return the expiryDate
	 */
	public String getExpiryDate() {
		return expiryDate;
	}
	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	/**
	 * @return the verificationNo
	 */
	public int getVerificationNo() {
		return verificationNo;
	}
	/**
	 * @param verificationNo the verificationNo to set
	 */
	public void setVerificationNo(int verificationNo) {
		this.verificationNo = verificationNo;
	}

}
