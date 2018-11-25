package Login;

import Buyer.*;
import Exceptions.*;
import Objects.*;
import Documents.SoftwareDocumentDB;
import Inventory.InventoryDB;
import Promotions.RegisteredBuyerDB;


import java.util.ArrayList;
import java.util.*;

public class DatabaseSetup {

	SoftwareDocumentDB softwaredoc;
	InventoryDB	invdocStock;
	RegisteredBuyerDB buyerDB;
	//note, needs to be a db variable here for every database.
	public DatabaseSetup() {
		softwaredoc=SoftwareDocumentDB.getSoftwareDocumentDB();
		invdocStock=InventoryDB.getInventoryDB();
		buyerDB=RegisteredBuyerDB.getRegisteredBuyerDB();
		setupInventoryDB();
		setupSoftwareDocumentDB();
		buyerDBSetup();
	}
	public void setupInventoryDB()
	{
		ArrayList<Document>documentsList=new ArrayList<Document>();
     	ArrayList<String> authorlist=new ArrayList<String>();
     	authorlist.add("author1");
     	documentsList.add(new Document("Dog Book 1", 1, authorlist, "thePath1", 19.99));
     	documentsList.add(new Document("Cat Book 2", 2, authorlist, "thePath2", 29.99));
     	documentsList.add(new Document("Dog Book 3", 3, authorlist, "thePath3", 39.99));

     	ArrayList<DocStock> docStockList=new ArrayList<DocStock>();
     	docStockList.add(new DocStock(documentsList.get(0), 3));
     	docStockList.add(new DocStock(documentsList.get(1), 5));
     	docStockList.add(new DocStock(documentsList.get(2), 2));
     	invdocStock.setInventoryList(docStockList);
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
	public void buyerDBSetup() {
		//setting up RegisteredBuyerDB
		ArrayList<Buyer> buyers=new ArrayList<Buyer>();
		buyers.add(new Buyer(-1, "u2", "p2", 'b'));
		buyerDB.setBuyerList(buyers);

		Calendar calendar=new GregorianCalendar(2018,10,21);
		Date date=calendar.getTime();
		ArrayList<Promotion> promotions=new ArrayList<Promotion>();
		promotions.add(new Promotion("promo1",date,10));
		calendar=new GregorianCalendar(2018,11,25);
		date=calendar.getTime();
		promotions.add(new Promotion("promo2",date,3));
		calendar=new GregorianCalendar(2019,0,18);
		date=calendar.getTime();
		promotions.add(new Promotion("promo3",date,5));
		buyerDB.setPromotionList(promotions);
	}
}
