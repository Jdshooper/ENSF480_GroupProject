package Promotions;

import Exceptions.*;
import Objects.*;

import java.util.ArrayList;
import java.util.Date;

public class RegisteredBuyerDBBroker {

	private RegisteredBuyerDB database;
	private boolean connection;
	public RegisteredBuyerDBBroker() throws NoDatabaseConnectionException{
		connection=false;
		connectToDB();
	}
	private boolean connectToDB() throws NoDatabaseConnectionException{
		database=RegisteredBuyerDB.getRegisteredBuyerDB();
		if(database==null)
			throw new NoDatabaseConnectionException("In RegisteredBuyerDBBroker");
		else {
			connection=true;
			return true;
		}
	}
	public int findBuyer(int buyerID) {
		ArrayList<Buyer> buyers=database.getBuyerList();
		for(int i=0; i<buyers.size(); i++) {
			if(buyers.get(i).getUserID()==buyerID)
				return i;
		}
		return -1;
	}
	public int getRegistration(int buyerID) throws NoDatabaseConnectionException{
		if(connection==false) {
			throw new NoDatabaseConnectionException("In getRegistration function");
		}
		ArrayList<Buyer> buyers=database.getBuyerList();
		int buyerIndex=findBuyer(buyerID);
		if(buyers.get(buyerIndex).getRegistered())
			return 1;
		else
			return 0;
	}
	public boolean changeRegistration(int buyerID) throws NoDatabaseConnectionException{
		if(connection==false) {
			throw new NoDatabaseConnectionException("In changeRegistration function");
		}
		ArrayList<Buyer> buyers=database.getBuyerList();
		int buyerIndex=findBuyer(buyerID);
		buyers.get(buyerIndex).setRegistered(!buyers.get(buyerIndex).getRegistered());
		database.setBuyerList(buyers);
		return database.DoQuery("Change Registration.");
	}
	public int getPromotions(int buyerID, ArrayList<Promotion> promotions) throws NoDatabaseConnectionException{
		if(connection==false) {
			throw new NoDatabaseConnectionException("in getPromotions function");
		}
		ArrayList<Buyer> buyers=database.getBuyerList();
		int buyerIndex=findBuyer(buyerID);
		if(buyers.get(buyerIndex).getRegistered()) {
			ArrayList<Promotion> promotionList=database.getPromotionList();
			for(int i=0; i<promotionList.size(); i++) {
				Date current=new Date();
				if(promotionList.get(i).getValidUntil().after(current)) {
					promotions.add(promotionList.get(i));
				}
			}
			database.setPromotionList(promotions);
			return 1;
		}
		return 0;
	}
	public int createPromotion(String name, Date validUntil, int discount) throws NoDatabaseConnectionException{
		if(connection==false) {
			throw new NoDatabaseConnectionException("in createPromotion function");
		}
		Promotion promotion=new Promotion(name, validUntil, discount);
		ArrayList<Promotion> promotions=database.getPromotionList();
		promotions.add(promotion);
		database.setPromotionList(promotions);
		return 1;
	}
}
