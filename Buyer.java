
public class Buyer extends User{
	private Cart shoppingCart;
	private Boolean registered;
	public Buyer(int userID, String username, String password, char type) {
		super(userID, username, password, type);
		shoppingCart=Cart.getCart();
		registered=false;
	}
	public Boolean getRegistered() {
		return registered;
	}
	public void setRegistered(Boolean registered) {
		this.registered=registered;
	}
}
