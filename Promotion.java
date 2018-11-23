import java.util.*;

public class Promotion {
	private static int promoID=0;
	private int id;
	private String name;
	private Date validUntil;
	private int discount;
	public Promotion(String name, Date validUntil, int discount) {
		this.id=promoID++;
		this.name=name;
		this.validUntil=validUntil;
		this.discount=discount;
	}

	public String toString(){
		return "" + id + " " + name + " Expires: " + validUntil + " Discount: $" + discount;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the validUntil
	 */
	public Date getValidUntil() {
		return validUntil;
	}
	/**
	 * @param validUntil the validUntil to set
	 */
	public void setValidUntil(Date validUntil) {
		this.validUntil = validUntil;
	}
	/**
	 * @return the discount
	 */
	public int getDiscount() {
		return discount;
	}
	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
