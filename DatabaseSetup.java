import java.util.ArrayList;

public class DatabaseSetup {

	SoftwareDocumentDB softwaredoc;
	//note, needs to be a db variable here for every database.
	public DatabaseSetup() {
		softwaredoc=SoftwareDocumentDB.getSoftwareDocumentDB();
	}
	
	public void setupSoftwareDocumentDB(ArrayList<Document> docList)
	{
		softwaredoc.setDoc_In_DB(docList);
	}
	
	public void setupSoftwareDocumentDB()
	{
		ArrayList<Document>documentsList=new ArrayList<Document>();
     	ArrayList<String> authorlist=new ArrayList<String>();
     	authorlist.add("author1");
     	documentsList.add(new Document("Document 1", 1, authorlist, "thePath1", 19.99));
     	documentsList.add(new Document("Document 2", 2, authorlist, "thePath2", 29.99));
     	documentsList.add(new Document("Document 3", 3, authorlist, "thePath3", 39.99));
     	softwaredoc.setDoc_In_DB(documentsList);
	}

}
