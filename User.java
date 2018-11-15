
public class User {
	private int userID;
	private Credential credentials;
	private char type;
	public User(int userID, String username, String password, char type) {
		this.userID=userID;
		this.credentials=new Credential(username, password);
		this.type=type;
	}
	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}
	/**
	 * @return the credentials
	 */
	public Credential getCredentials() {
		return credentials;
	}
	/**
	 * @param credentials the credentials to set
	 */
	public void setCredentials(Credential credentials) {
		this.credentials = credentials;
	}
	/**
	 * @return the type
	 */
	public char getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(char type) {
		this.type = type;
	}
	
}
