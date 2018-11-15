
import java.util.ArrayList;

public class InventoryDB {
	//Note, this is a MOCK DB since implementation does not require database.
	//also, there are some methods missing since not implementing changing style.
	//Implemented via singleton
	
	private static InventoryDB instance=null;
	private InventoryDB() {}
	private ArrayList<Document> inventoryList;
	public static InventoryDB getInventoryDB()
	{
		if(instance==null)
			instance=new InventoryDB();
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
	 * @return the inventoryList
	 */
	public ArrayList<Document> getInventoryList() {
		return inventoryList;
	}

	/**
	 * @param inventoryList the inventoryList to set
	 */
	public void setInventoryList(ArrayList<Document> inventoryList) {
		this.inventoryList = inventoryList;
	}
	
}