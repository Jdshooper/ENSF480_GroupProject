
public class Author extends User implements Staff {
	private int staffID;
	private String penName;
	private String staffName;
	public Author(int userID, String username, String password, char type, int staffID, String penName, String staffName) {
		super(userID, username, password, type);
		this.staffID=staffID;
		this.penName=penName;
		this.staffName=staffName;
	}
	@Override
	public int getStaffID() {
		return staffID;
	}
	@Override
	public String getStaffName() {
		return staffName;
	}
	@Override
	public void setStaffName(String newName) {
		staffName=newName;
	}
	public String getPenName() {
		return penName;
	}
	public void setPenName(String newName) {
		penName=newName;
	}
}
