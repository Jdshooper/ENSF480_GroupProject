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
	

}