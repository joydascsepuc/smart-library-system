/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartlibrarysystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class AddCodes extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement pstmt=null;
    ResultSet rs = null;
    /**
     * Creates new form AddCodes
     */
    public AddCodes() {
        initComponents();
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
        jTextFieldcode = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButtonback = new javax.swing.JButton();
        jButtonAdd = new javax.swing.JButton();
        jTextFieldAddCategory = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Add Admin Codes :");

        jTextFieldcode.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Codes :");

        jButtonback.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButtonback.setText("Go Back");
        jButtonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbackActionPerformed(evt);
            }
        });

        jButtonAdd.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jTextFieldAddCategory.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextFieldAddCategory.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Add Category :");

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Category :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextFieldAddCategory)
                    .addComponent(jTextFieldcode, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(jButtonback, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(194, 194, 194))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldcode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonback, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbackActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        MainAdminPage map = new MainAdminPage();
        map.setVisible(true);
        map.setResizable(false);
    }//GEN-LAST:event_jButtonbackActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        if(jTextFieldcode.getText().trim().equals("")){
           JOptionPane.showMessageDialog(null, "Please write a code.", "ERROR", JOptionPane.ERROR_MESSAGE);
           jTextFieldcode.requestFocus();
           
    }                                          
        else{
            add();
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(jTextFieldAddCategory.getText().trim().equals(null)){
                JOptionPane.showMessageDialog(null, "Write first.. :D ");
                
            }
        else{
            addcatagory();
        }
    }//GEN-LAST:event_jButton1ActionPerformed
        
    public void addcatagory(){
       
       
        int count=0;
        try{
            
            con = (Connection) DriverManager.getConnection(smartlibrarysystem.DB_Connection.db_url, smartlibrarysystem.DB_Connection.db_userName, smartlibrarysystem.DB_Connection.db_password);
            pstmt=(PreparedStatement) con.prepareStatement("SELECT * FROM `category`");
            
            ResultSet rs = pstmt.executeQuery();
            while(rs.next()){
               //String u = jTextFieldSingUpUserName.getText().trim();
               String cname = rs.getString("cname");
               if(jTextFieldAddCategory.getText().trim().equalsIgnoreCase(cname)){
                    count = 1;
                   break;
               }
           }
           if(count == 0){
           pstmt=(PreparedStatement) con.prepareStatement("INSERT INTO `category` (`cname`) VALUES ('"+jTextFieldAddCategory.getText().trim()+"')");
     
            int isOk=0;
            isOk = pstmt.executeUpdate();
            if(isOk>0)
            {
                JOptionPane.showMessageDialog(null, "Successfully Add Category "+jTextFieldAddCategory.getText()+"","Confirmation",JOptionPane.INFORMATION_MESSAGE);
                 
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed.!","Error",JOptionPane.ERROR_MESSAGE);

            }
            }
        else{
            JOptionPane.showMessageDialog(null, "Hey!! Already have this category..!!");
            count = 0;
        }
        
        }
        catch(SQLException ex){
      JOptionPane.showMessageDialog(null, "Error occured due to:\n"+ex.getMessage(),"Error!",JOptionPane.ERROR_MESSAGE);
    }
    finally{
        try{
                if(pstmt!=null) pstmt.close();
                if(con!=null)con.close();
            }
                    catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error occured due to:\n"+ex.getMessage(),"Error!",JOptionPane.ERROR_MESSAGE);
        
    }
               
        }
    }
    
    
    private void add(){
        
        try{
            
            int check = 0;
            con = (Connection) DriverManager.getConnection(smartlibrarysystem.DB_Connection.db_url, smartlibrarysystem.DB_Connection.db_userName, smartlibrarysystem.DB_Connection.db_password);
           
           pstmt=(PreparedStatement) con.prepareStatement("SELECT code FROM `admincodes` WHERE `code`= '"+jTextFieldcode.getText().trim()+"'");
           
           //String sql = "select * from usertable where username=u";
           ResultSet rs = pstmt.executeQuery();
           while(rs.next()){
               //String u = jTextFieldSingUpUserName.getText().trim();
               String name = rs.getString("code");
               if(jTextFieldcode.getText().trim().equalsIgnoreCase(name)){
                    check = 1;
                   break;
               }
           }
           if(check==0){
               
               pstmt=(PreparedStatement) con.prepareStatement("insert into admincodes(code)"
               + "values(?) ");
               
               pstmt.setString(1, jTextFieldcode.getText()); 
               
               int isOk=0;
            
            isOk = pstmt.executeUpdate();
            if(isOk>0){
                JOptionPane.showMessageDialog(null,"Code Added!");
                jTextFieldcode.setText(null);
                jTextFieldcode.requestFocus();
            }
           }
           else{
               JOptionPane.showMessageDialog(null,"This code is already there!");
               jTextFieldcode.setText(null);
               jTextFieldcode.requestFocus();
           }
        }
        catch(Exception ex){
            
        }
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
            java.util.logging.Logger.getLogger(AddCodes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCodes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCodes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCodes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCodes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldAddCategory;
    private javax.swing.JTextField jTextFieldcode;
    // End of variables declaration//GEN-END:variables
}
