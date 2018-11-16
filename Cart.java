import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Jiexuan Li
 *
 */
public class Cart {

	private static Cart instance=null;
	private ArrayList<Document> books;
	private Cart() {}
	private ArrayList<Promotion> promotions;
	public static Cart getCart()
	{
		if(instance==null)
			instance=new Cart();
		return instance;
	}
	/**
	 * @return the books
	 */
	public ArrayList<Document> getBooks() {
		return books;
	}
	/**
	 * @param books the books to set
	 */
	public void setBooks(ArrayList<Document> books) {
		this.books = books;
	}
	/**
	 * @return the promotions
	 */
	public ArrayList<Promotion> getPromotions() {
		return promotions;
	}
	/**
	 * @param promotions the promotions to set
	 */
	public void setPromotions(ArrayList<Promotion> promotions) {
		this.promotions = promotions;
	}
}