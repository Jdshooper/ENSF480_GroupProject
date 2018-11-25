package Objects;

public class DocStock {
	private Document doc;
	private int quantity;
	public DocStock(Document doc, int quantity) {
		this.doc=doc;
		this.quantity=quantity;
	}
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the doc
	 */
	public Document getDoc() {
		return doc;
	}
}
