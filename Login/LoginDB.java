package Login;

import Buyer.*;
import Exceptions.*;
import Objects.*;

import java.util.ArrayList;

public class LoginDB {
	//Note, this is a MOCK DB since implementation does not require database.
	//also, there are some methods missing since not implementing changing style.
	//Implemented via singleton

	private static LoginDB instance=null;
	private LoginDB() {}
	private ArrayList<User> userList;
	public static LoginDB getLoginDB()
	{
		if(instance==null)
			instance=new LoginDB();
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
	 * @return the userList
	 */
	public ArrayList<User> getUserList() {
		return userList;
	}

	/**
	 * @param userList the userList to set
	 */
	public void setUserList(ArrayList<User> userList) {
		this.userList = userList;
	}

}
