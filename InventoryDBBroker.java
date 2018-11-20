import java.util.ArrayList;

public class InventoryDBBroker {
	private InventoryDB database;
	private boolean connection;
	public InventoryDBBroker() throws NoDatabaseConnectionException{
		connection=false;
		connectToDB();
	}
	private boolean connectToDB() throws NoDatabaseConnectionException{
		database=InventoryDB.getInventoryDB();
		if(database==null)
			throw new NoDatabaseConnectionException("In InventoryDBBroker");
		else {
			connection=true;
			return true;
		}
	}
	public int searchDocuments(String keyword, ArrayList<DocStock> documents) throws NoDatabaseConnectionException{
		if(connection==false) {
			throw new NoDatabaseConnectionException("in searchDocuments function");
		}
		ArrayList<DocStock> allDocs=database.getInventoryList();
		for(int i=0; i<allDocs.size(); i++) {
			if(allDocs.get(i).getDoc().getName().toUpperCase().contains(keyword.toUpperCase())) {
				documents.add(allDocs.get(i));
			}
		}
		return 1;
	}
	public int updateInventory(ArrayList<Document> order) throws NoDatabaseConnectionException{
		if(connection==false) {
			throw new NoDatabaseConnectionException("in updateInventory function");
		}
		ArrayList<DocStock> allDocs=database.getInventoryList();
		for(int i=0; i<order.size(); i++) {
			for(int j=0; j<allDocs.size(); j++) {
				if(order.get(i).getISBN()==allDocs.get(j).getDoc().getISBN()) {
					allDocs.get(j).setQuantity(allDocs.get(j).getQuantity()-1);
					break;
				}
			}
		}
		return 1;
	}
}