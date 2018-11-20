/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 import java.awt.event.*;
 import javax.swing.*;
 import java.util.ArrayList;
 import java.lang.Exception;

/**
 *
 * @author Jesse Hooper
 */
public class BuyerGUI extends javax.swing.JFrame implements GUIStrategy{

    /**
     * Creates new form BuyerGUI
     */
    public BuyerGUI(Buyer user) {
        initComponents();
        this.buyer=user;
        buyerListener.updateCart();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buyerListener = new BuyerGUIListener(this);
        cart = Cart.getCart();
        cart.setPromotions(new ArrayList<Promotion>());
        cart.setBooks(new ArrayList<Document>());

        searchResults = new ArrayList<DocStock>();

        regControl=new RegistrationController();
        invControl=new InventoryController();

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListModel1 = new javax.swing.DefaultListModel<String>();
        jList1 = new javax.swing.JList<String>(jListModel1);
        jButton4 = new javax.swing.JButton();
        jButton4.addActionListener(buyerListener);
        jButton5 = new javax.swing.JButton();
        jButton5.addActionListener(buyerListener);
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListModel2 = new javax.swing.DefaultListModel<String>();
        jList2 = new javax.swing.JList<String>(jListModel2);
        jButton6 = new javax.swing.JButton();
        jButton6.addActionListener(buyerListener);
        jButton7 = new javax.swing.JButton();
        jButton7.addActionListener(buyerListener);
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListModel3 = new javax.swing.DefaultListModel<String>();
        jList3 = new javax.swing.JList<String>(jListModel3);
        jButton8 = new javax.swing.JButton();
        jButton8.addActionListener(buyerListener);
        jButton9 = new javax.swing.JButton();
        jButton9.addActionListener(buyerListener);
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jButton10 = new javax.swing.JButton();
        jButton10.addActionListener(buyerListener);
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Shopping Cart");

        jScrollPane1.setViewportView(jList1);

        jButton4.setText("Remove");

        jButton5.setText("Place Order");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(jButton5))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Shopping Cart");

        jPanel1.add(jPanel2, "ShoppingCartCard");

        jLabel2.setText("Search");

        jScrollPane2.setViewportView(jList2);

        jButton6.setText("Add to Cart");

        jButton7.setText("Search");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6)
                            .addComponent(jButton7))))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, "SearchCard");

        jLabel3.setText("Promotions");

        jScrollPane3.setViewportView(jList3);

        jButton8.setText("Add");

        jButton9.setText("Refresh");

        jLabel4.setText("Status:");

        jTextPane1.setEditable(false);
        jScrollPane4.setViewportView(jTextPane1);

        jButton10.setText("Switch Status");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane4))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton8)
                            .addComponent(jButton9)
                            .addComponent(jButton10))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton10)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton9)))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, "PromotionsCard");

        jButton1.setText("Shopping Cart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              java.awt.CardLayout card = (java.awt.CardLayout)jPanel1.getLayout();
              card.show(jPanel1, "ShoppingCartCard");
              buyerListener.updateCart();
            }
        });

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              java.awt.CardLayout card = (java.awt.CardLayout)jPanel1.getLayout();
              card.show(jPanel1, "SearchCard");
            }
        });

        jButton3.setText("Promotions");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              java.awt.CardLayout card = (java.awt.CardLayout)jPanel1.getLayout();
              card.show(jPanel1, "PromotionsCard");
              buyerListener.displayStatus();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        // Uncomment what is below later when Reg is made

      /*  if(regControl.getRegistration(buyerID)==1)
        	jTextPane1.replaceSelection("Registered");
        else if(regControl.getRegistration(buyerID)==0)
        	jTextPane1.replaceSelection("Not Registered");
        else if(regControl.getRegistration(buyerID)==-1)
        	jTextPane1.replaceSelection("Database error");*/
        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     * Commented out to be able to be run by LoginUI
     */
    // public static void main(String args[]) {
    //     /* Set the Nimbus look and feel */
    //     //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    //     /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
    //      * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
    //      */
    //     try {
    //         for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //             if ("Nimbus".equals(info.getName())) {
    //                 javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                 break;
    //             }
    //         }
    //     } catch (ClassNotFoundException ex) {
    //         java.util.logging.Logger.getLogger(BuyerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (InstantiationException ex) {
    //         java.util.logging.Logger.getLogger(BuyerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (IllegalAccessException ex) {
    //         java.util.logging.Logger.getLogger(BuyerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //         java.util.logging.Logger.getLogger(BuyerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //     }
    //     //</editor-fold>
    //
    //     /* Create and display the form */
    //     java.awt.EventQueue.invokeLater(new Runnable() {
    //         public void run() {
    //             new BuyerGUI(1).setVisible(true);
    //         }
    //     });
    // }

    /**
     * A method to reveal the GUI
     */
    public void displayGUI(){
      jPanel1.setVisible(true);
    }

    /**
     * A method to hide the GUI
     */
    public void hideGUI(){
      jPanel1.setVisible(false);
    }

    /**
    * This gets the search results
    */
    public ArrayList<DocStock> getSearchResults() {
		return searchResults;
	}

    /**
     *
     * @param searchResults is updated in a listener.
     */
	public void setSearchResults(ArrayList<DocStock> searchResults) {
		this.searchResults = searchResults;
	}

	private void UpdateSearchResult()
    {
    	jListModel2.clear();
    	for(int i=0; i<searchResults.size(); i++)
    		jListModel2.addElement(searchResults.get(i).getDoc().toString());
    }



	// Variables declaration - do not modify//GEN-BEGIN:variables
    public BuyerGUIListener buyerListener;
    public Cart cart;
    public RegistrationController regControl;
    public InventoryController invControl;
    public Buyer buyer;
    public ArrayList<DocStock> searchResults;

    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton10;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JButton jButton7;
    public javax.swing.JButton jButton8;
    public javax.swing.JButton jButton9;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.DefaultListModel<String> jListModel1;
    public javax.swing.JList<String> jList1;
    public javax.swing.DefaultListModel<String> jListModel2;
    public javax.swing.JList<String> jList2;
    public javax.swing.DefaultListModel<String> jListModel3;
    public javax.swing.JList<String> jList3;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanel4;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables


    public class BuyerGUIListener implements ActionListener {
        BuyerGUI buyerGui;


    public BuyerGUIListener(BuyerGUI buyer){
        buyerGui = buyer;
    }


    public void actionPerformed(ActionEvent e) {
        // Shopping List:
        if(e.getSource() == jButton4) // Remove
            removeShoppingItem();
        if(e.getSource() == jButton5) // Place Order
            placeOrder();
        // Search:
        if(e.getSource() == jButton6) // Add cart
            addToCart();
        if(e.getSource() == jButton7) // Search
            search();
        // Promotions:
        if(e.getSource() == jButton8) // Add
            addPromotions();
        if(e.getSource() == jButton9) // Refresh
            refreshPromotions();
        if(e.getSource() == jButton10) // Switch Status
            switchStatus();
    }

    /**
     * removes selected item from cart and list
     */
    private void removeShoppingItem(){
      int index = jList1.getSelectedIndex();
      if(index == -1) return;
      String selection = jListModel1.get(index);
      if(selection.equals("Books:") || selection.equals("Promotions:")) return;
      int bookNum = buyerGui.cart.getBooks().size();
      int promoNum = buyerGui.cart.getPromotions().size();
      if(index > bookNum){ // if promo
        buyerGui.cart.getPromotions().remove(index-(bookNum+1));
      } else { // else book
        buyerGui.cart.getBooks().remove(index-1);
      }
      updateCart();
    }

    /**
     * TODO Finish this method
     * a method that asks for credit card info and then places the order
     */
    private void placeOrder(){
      int bookNum = buyerGui.cart.getBooks().size();
      int promoNum = buyerGui.cart.getPromotions().size();
      if(bookNum == 0){
        JOptionPane.showMessageDialog(null, "Cannot place order, your cart is empty!");
        return;
      }
      try{
        String cNumS = JOptionPane.showInputDialog("What is your credit card number?");
        int cNum = Integer.parseInt(cNumS);
        String cMoYr = JOptionPane.showInputDialog("What is your credit card expiry date?");
        String cCodeS = JOptionPane.showInputDialog("What is your credit card code?");
        int cCode = Integer.parseInt(cCodeS);
        CardDetails cardD = new CardDetails(cNum, cMoYr, cCode);

        // Create payment

        // Update inventory DB

        // 

      } catch(Exception e){
        JOptionPane.showMessageDialog(null, "Your order was Canceled");
      }
    }

    /**
     * a method that adds a searched book to the cart
     */
    private void addToCart(){
      try{
        int index = jList2.getSelectedIndex();
        if(index == -1) return;
        buyerGui.cart.getBooks().add(buyerGui.searchResults.get(index).getDoc());
        updateCart();
        JOptionPane.showMessageDialog(null, "Added item to cart.");
      }
      catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error: order not made.");
      }
    }

    /**
     * a method to look for a book
     */
    private void search(){

    	int confirm=JOptionPane.showConfirmDialog(null, "Would you like to start a new search?");
		if(confirm==JOptionPane.NO_OPTION) {
	    	return;
		}
		String docTitle=JOptionPane.showInputDialog("Please enter the name of the document to search for.");

		while(docTitle==null)
		{
			docTitle=JOptionPane.showInputDialog("Please enter the name of the document to search for.");
		}
		JOptionPane.showMessageDialog(null, "you typed: " +docTitle);
		buyerGui.setSearchResults(new ArrayList<DocStock> ());//clear the thing
		buyerGui.invControl.searchDocuments(docTitle, buyerGui.getSearchResults());
		if(buyerGui.getSearchResults().isEmpty())
		{
			JOptionPane.showMessageDialog(null, "you typed: " +docTitle+" but no results were found.");
			return;
		}
		//JOptionPane.showMessageDialog(null, buyerGui.getSearchResults().get(0).getDoc().toString());

		buyerGui.UpdateSearchResult();
    }

    /**
     * add to cart
     */
    private void addPromotions(){

    }

    /**
     * a method that gets the latest promotions if the user is registered
     */
    private void refreshPromotions(){

    }

    /**
     * a method that displays the buyer's current status (reg or unreg)
     */
    private void displayStatus(){
        if(regControl.getRegistration(buyerGui.buyer.getUserID())==1){
          buyerGui.jTextPane1.setText("Registered");
          System.out.println(jTextPane1.getText());
        }
        else{
          buyerGui.jTextPane1.setText("Unregistered");
        }
      }

      /**
       * a method to switch the buyer's current status (reg or unreg)
       */
    private void switchStatus(){
    	if(regControl.changeRegistration(buyerGui.buyer.getUserID())) {
      		displayStatus();
      	}
      	else {
      		buyerGui.jTextPane1.setText("Database Error");
      	}
      }

    /**
     * A method that displays the current items in the cart
     */
    public void updateCart(){
      buyerGui.jListModel1.removeAllElements();
      if(buyerGui.cart.getBooks() == null || buyerGui.cart.getPromotions() == null){
        jListModel1.addElement("Your Shopping Cart is Empty!");
      } else{
        jListModel1.addElement("Books:");
        for(int i = 0; i<buyerGui.cart.getBooks().size(); i++)
          jListModel1.addElement(buyerGui.cart.getBooks().get(i).toString());
        jListModel1.addElement("Promotions:");
        for(int i = 0; i<buyerGui.cart.getPromotions().size(); i++)
          jListModel1.addElement(buyerGui.cart.getPromotions().get(i).toString());
      }
    }


  } // end of buyer listener
}
