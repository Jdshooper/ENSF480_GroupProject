
public class StaffAdmin extends User implements Staff {
	private int staffID;
	private String staffName;
	public StaffAdmin(int userID, String username, String password, char type, int staffID, String staffName) {
		super(userID, username, password, type);
		this.staffID=staffID;
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
}
