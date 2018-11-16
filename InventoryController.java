import java.util.ArrayList;

public class InventoryController {
	InventoryDBBroker dbBroker;
	public InventoryController(){
		try {
			dbBroker=new InventoryDBBroker();
		}catch(NoDatabaseConnectionException e) {
			e.printStackTrace();
		}
	}
	public int searchDocuments(String keyword, ArrayList<DocStock> documents) {
		try {
			return dbBroker.searchDocuments(keyword, documents);
		}catch(NoDatabaseConnectionException e) {
			e.printStackTrace();
			return -1;
		}
	}
	public int updateInventory(ArrayList<Document> order) {
		try {
			return dbBroker.updateInventory(order);
		}catch(NoDatabaseConnectionException e) {
			e.printStackTrace();
			return -1;
		}
	}
}