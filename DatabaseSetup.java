import java.util.ArrayList;

public class DatabaseSetup {

	SoftwareDocumentDB softwaredoc;
	//note, needs to be a db variable here for every database.
	public DatabaseSetup(ArrayList<Document> docList) {
		softwaredoc=SoftwareDocumentDB.getSoftwareDocumentDB();
		softwaredoc.setDoc_In_DB(docList);
	}

}
