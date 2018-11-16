import java.util.ArrayList;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesse
 */
public class OperatorUI extends javax.swing.JFrame {

    /**
     * Creates new form OperatorUI
     */
    public OperatorUI(ArrayList<Document> dl) {
    	docList=dl;
        initComponents();
        if(docList==null)
        {
        	//fake some documents
        	docList=new ArrayList<Document>();
        	ArrayList<String> authorlist=new ArrayList<String>();
        	authorlist.add("author1");
        	docList.add(new Document("Document 1", -1, authorlist, "thePath1", 19.99));
        	docList.add(new Document("Document 2", -1, authorlist, "thePath2", 29.99));
        	docList.add(new Document("Document 3", -1, authorlist, "thePath3", 39.99));
        }
        UpdateDocList();
        modification=new ModifyFile();
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListModel1= new javax.swing.DefaultListModel<String>();
        jList1 = new javax.swing.JList<String>(jListModel1);
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

 
        
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            	AddPressed(evt);
            
            }
        });
        
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            	RemovePressed(evt);
            
            }
        });
        
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            	UpdatePressed(evt);
            
            }
        });
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Docs:");

        jScrollPane1.setViewportView(jList1);

        jButton1.setText("Add");

        jButton2.setText("Update");

        jButton3.setText("Remove");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)))
                    .addComponent(jLabel1))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        
        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void AddPressed(java.awt.event.ActionEvent evt) {
    	String Title=JOptionPane.showInputDialog("Please enter the Title of the Document");
    	if(Title==null)
    	{
    		JOptionPane.showMessageDialog(null, "Must enter a valid Title.");
    	    return;
    	}
    	int ISBN=getLargest()+1;	//dont know how ISBNs work but... suppose for this purpose the ISBNs autoincrement.
    	ArrayList<String> authors=new ArrayList<String>();
    	int authNum=1;
    	String author=JOptionPane.showInputDialog("Please enter author #"+authNum+"'s name:");
    	while(author==null)
    	{
    		JOptionPane.showMessageDialog(null, "Must enter at least one author.");
    		author=JOptionPane.showInputDialog("Please enter author #"+authNum+"'s name:");
    	}
    	while(author!=null)
    	{
    		authNum++;
    		authors.add(author);
    		author=JOptionPane.showInputDialog("Please enter author #"+authNum+"'s name:");
    	}
    	String filePath=JOptionPane.showInputDialog("Please enter filepath for this file");
    	while(filePath==null)
    	{
    		JOptionPane.showMessageDialog(null, "Must enter a filepath.");
    		filePath=JOptionPane.showInputDialog("Please enter filepath for this file");
    	}
    	double price=Double.parseDouble(JOptionPane.showInputDialog("Please enter price for this document"));
    	if(price<=0)
    	{
    		JOptionPane.showMessageDialog(null, "Detected error in price, default price of 59.99 is added.");
    		price=59.99;
    	}
    	Document tempDoc=new Document(Title, ISBN, authors, filePath, price);
		int confirm=JOptionPane.showConfirmDialog(null, "Document: " +tempDoc.toString()+"\nAre you satisfied with this document?");
		if(confirm==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Ok, no document is added.");
	    	return;
		}
		int result=-999;
		if(confirm==JOptionPane.YES_OPTION) {
			result=modification.modifyFile("Add", tempDoc);			
		}
    	
    	if(result==-1)
    		JOptionPane.showMessageDialog(null, "An exception has occurred.");
    	if(result==0)
    		JOptionPane.showMessageDialog(null, "An expected error has occurred.");
    	if(result==1)
    		JOptionPane.showMessageDialog(null, "Success.");
    	
    	
    	
    	UpdateDocList();
    }
    private int getLargest()
    {
    	int id=0;
    	for(int i=0; i<docList.size(); i++)
    		id=docList.get(i).getISBN();
    	return id;
    }
    
    private void RemovePressed(java.awt.event.ActionEvent evt) {
    	int index=jList1.getSelectedIndex();
		if(index==-1)
		{
			return;
		}
		String Document=jListModel1.get(index);
		String [] block=Document.split(",");//needs 2 splits
		String [] TitleISBN=block[0].split(" ");
		String [] Authors=block[1].split(" ");
		String [] FilepathPrice=block[2].split(" ");
		
		ArrayList<String> tempAuth=new ArrayList<String>();
		tempAuth.add("tempval");
		Document temp=new Document("tempval", Integer.parseInt(TitleISBN[1]), tempAuth, "tempval", 99.99);
		
		int confirm=JOptionPane.showConfirmDialog(null, "Document: " +Document+"\nAre you satisfied with this document?");
		if(confirm==JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Ok, no document is removed.");
	    	return;
		}
		int result=-999;
		if(confirm==JOptionPane.YES_OPTION) {
			result=modification.modifyFile("Remove", temp);			
		}
		
		if(result==-1)
    		JOptionPane.showMessageDialog(null, "An exception has occurred.");
    	if(result==0)
    		JOptionPane.showMessageDialog(null, "An expected error has occurred.");
    	if(result==1)
    		JOptionPane.showMessageDialog(null, "Success.");
    	
		
    	UpdateDocList();
    }
    
    private void UpdatePressed(java.awt.event.ActionEvent evt) {
        
    	UpdateDocList();
    }
    
    private void UpdateDocList()
    {
    	jListModel1.clear();
    	for(int i=0; i<docList.size(); i++)
    		jListModel1.addElement(docList.get(i).toString());
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OperatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        ArrayList<Document>documentsList=new ArrayList<Document>();
    	ArrayList<String> authorlist=new ArrayList<String>();
    	authorlist.add("author1");
    	documentsList.add(new Document("Document 1", 1, authorlist, "thePath1", 19.99));
    	documentsList.add(new Document("Document 2", 2, authorlist, "thePath2", 29.99));
    	documentsList.add(new Document("Document 3", 3, authorlist, "thePath3", 39.99));
     
        DatabaseSetup setup=new DatabaseSetup(documentsList);
        
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperatorUI(documentsList).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
	private ModifyFile modification;
    private ArrayList<Document> docList;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.DefaultListModel<String> jListModel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
