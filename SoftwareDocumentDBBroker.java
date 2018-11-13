import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Jiexuan Li
 *
 */
public class SoftwareDocumentDBBroker {
	
	private SoftwareDocumentDB database;
	private boolean connection;
	
	public SoftwareDocumentDBBroker() throws NoDatabaseConnectionException
	{
		connection=false;
		connectToDB();
	}
	private boolean connectToDB() throws NoDatabaseConnectionException
	{
		database=database.getSoftwareDocumentDB();
		if(database==null)
			throw new NoDatabaseConnectionException("In SoftwareDocumentDBBroker");
		else
			connection=true;
		return true;
	}
	public boolean modifyFile(String modification, Document docModified) throws CannotModifyFileException
	{
		
		if(modification.equals("Add"))
			return addFile(docModified);
		else if(modification.equals("Remove"))
			return removeFile(docModified);
		else if(modification.equals("Update"))
			return updateFile(docModified);
		else

		throw new CannotModifyFileException("Cannot Modify File, Incorrect mofication somehow. nothing is changed.");
	}
	
	private boolean addFile(Document docModified) throws CannotModifyFileException {
		//TODO: Make this work. since it DOES NOT WORK CURRENTLY 11/12/2018
		//NOTE, IF ADDFILE IS ADDING FILE WITH SAME ISBN, DELETE THE ONE ALREADY IN DATABASE, BY DOING removeFile.
		throw new CannotModifyFileException("Cannot add file currently. Functionality is unavalible.");
	//	return false;
	}
	
	private boolean updateFile(Document docModified) throws CannotModifyFileException {
		if(removeFile(docModified))
			if(addFile(docModified))
				return true;
		//functionally, this works. Database wise, it is different since UPDATE is a statement, 
		//however there is no database so this works easier and it is fine.
		return false;
	}
	
	private boolean removeFile(Document docModified) {
		ArrayList<Document> DBDocs=database.getDoc_In_DB();
		Document temp;
		for(int i=0; i<DBDocs.size(); i++)
		{
			temp=DBDocs.get(i);
			if(temp.equals(temp, docModified))
			{
				DBDocs.remove(i);
				return SendUpdateQuery("DELETE Document WHERE ISBN=ISBN IS SUCCESSFUL AT INDEX "+i+". ");
				//this might be useful for debugging.
			}
		}
		return false;
	}
	
	public ArrayList<Document> getDocumentList()
	{
		if(connection==false)
			return null;
		else
			return database.getDoc_In_DB();
	}
	
	public boolean SendUpdateQuery(String query)
	{
		return database.DoQuery(query);
	}
}
