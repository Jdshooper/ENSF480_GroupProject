import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Jiexuan Li
 *
 */
public class SoftwareDocumentDB {
	//Note, this is a MOCK DB since implementation does not require database.
	//also, there are some methods missing since not implementing changing style.
	//Implemented via singleton
	
	private static SoftwareDocumentDB instance=null;
	private SoftwareDocumentDB() {}
	private ArrayList<Document> doc_In_DB;
	public static SoftwareDocumentDB getSoftwareDocumentDB()
	{
		if(instance==null)
			instance=new SoftwareDocumentDB();
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
	public void updateList(ArrayList<Document> updatedDocuments)
	{
		setDoc_In_DB(updatedDocuments);
	}

	/**
	 * @return the doc_In_DB
	 */
	public ArrayList<Document> getDoc_In_DB() {
		return doc_In_DB;
	}

	/**
	 * @param doc_In_DB the doc_In_DB to set
	 */
	public void setDoc_In_DB(ArrayList<Document> doc_In_DB) {
		this.doc_In_DB = doc_In_DB;
	}
}
