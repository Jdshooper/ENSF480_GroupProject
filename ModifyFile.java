/**
 * 
 */

/**
 * @author Jiexuan Li
 *
 */
public class ModifyFile {

	private SoftwareDocumentDBBroker broker;
	private Document theDoc;
	/**
	 * 
	 */
	public ModifyFile() {
		try {
			broker=new SoftwareDocumentDBBroker();
		} catch (NoDatabaseConnectionException e) {
			
			//THIS SHOULD HAVE A POPUP OR SOMETHING SAYING NO DATABASE CONNECTION.
			
			e.printStackTrace();
		}
	}

	//NOTE, if 0 then no modification but still okay, if 1 then modification, if -1 then exception.
	public int modifyFile(String modification, Document document)
	{
		theDoc=document;
		if(modification=="Add")
			if(!createFile(theDoc))
			{
				//SHOULD HAVE A POPUP OR SOMETHING SAYING hurr durr cant create document s0z
			}
		
		try {
		boolean result=broker.modifyFile(modification, theDoc);
		if(result==true)
			return 1;
		if(result==false)
			return 0;
			//cannot do it in database for some reason, ie remove fails, and could be that another person 
			//removed the file before you did. Not a fatal error.
		} catch (CannotModifyFileException e) {
			//SHOULD HAVE A POPUP OR SOMETHING SAYING cannot modify file ya fool.
			
			
			e.printStackTrace();
			return -1;
		}
		return -1111;//should never get here, but just in case programmer screwed it up.
	}
	public boolean createFile(Document x)
	{
		//THIS SHOULD CREATE THE FILE THAT THE USER SELECTED FROM THEIR COMPUTER IN BOUNDARY
		//HOWEVER, NO DATABASE IMPLEMENTED, SO THIS ONLY DEALS WITH OBJECTS.
		return true;
	}
	
	public void setDoc(Document x)
	{
		theDoc=x;
	}
}
