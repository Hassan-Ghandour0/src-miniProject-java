
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.print.*;
import javafx.print.Printer;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.JTextArea;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class NewJFrame4 extends javax.swing.JFrame {

   
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
   
   float total;
    int a;
    float p;
    int q;
    int c;
    float t;/**
     
     * Creates new form NewJFrame4
     */
    public NewJFrame4() {
        initComponents();
        showTableData();
        showDate();
    }
    
     public void showDate(){
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TOTAL = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        category = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        amount = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        quantity = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        reID = new javax.swing.JLabel();
        TOT = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 1280, 700));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("CustomerID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(18, 19, 95, 15);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        getContentPane().add(id);
        id.setBounds(131, 14, 70, 25);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Customer name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(18, 50, 110, 15);
        getContentPane().add(name);
        name.setBounds(131, 45, 70, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Product id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(304, 16, 102, 15);

        pid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pidActionPerformed(evt);
            }
        });
        getContentPane().add(pid);
        pid.setBounds(466, 11, 60, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Product name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(304, 52, 102, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Category");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(304, 88, 80, 15);
        getContentPane().add(pname);
        pname.setBounds(466, 47, 60, 25);

        jButton1.setText("Submit");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(18, 186, 90, 21);

        jButton2.setText("Print");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 460, 80, 21);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Total ($)");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(733, 464, 69, 17);

        TOTAL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTALActionPerformed(evt);
            }
        });
        getContentPane().add(TOTAL);
        TOTAL.setBounds(820, 458, 80, 30);
        getContentPane().add(jLabel7);
        jLabel7.setBounds(28, 215, 0, 0);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Price of item($)");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(304, 128, 102, 20);
        getContentPane().add(category);
        category.setBounds(466, 83, 60, 25);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Phone");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(18, 81, 72, 15);

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        getContentPane().add(phone);
        phone.setBounds(131, 81, 70, 25);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Address");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(18, 127, 80, 15);

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        getContentPane().add(address);
        address.setBounds(131, 124, 70, 25);
        getContentPane().add(price);
        price.setBounds(466, 126, 60, 25);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(46, 271, 813, 104);

        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });
        getContentPane().add(amount);
        amount.setBounds(762, 11, 61, 25);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Amount");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(667, 16, 64, 15);

        jButton3.setText("reset");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(140, 186, 90, 21);

        jButton4.setText("Cancel");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(140, 460, 70, 21);
        getContentPane().add(quantity);
        quantity.setBounds(469, 170, 60, 25);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Quantity");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(310, 180, 80, 20);

        time.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        time.setForeground(new java.awt.Color(255, 0, 0));
        time.setText("Time");
        getContentPane().add(time);
        time.setBounds(430, 460, 160, 17);

        area.setColumns(20);
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(950, 40, 290, 350);

        reID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reID.setForeground(new java.awt.Color(255, 51, 0));
        getContentPane().add(reID);
        reID.setBounds(270, 460, 100, 30);

        TOT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        TOT.setForeground(new java.awt.Color(0, 204, 0));
        TOT.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TOT.setAutoscrolls(false);
        TOT.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TOT.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(TOT);
        TOT.setBounds(1030, 430, 110, 70);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/WhatsApp Image 2022-09-24 at 11.26.02 AM_1.jpeg"))); // NOI18N
        jLabel14.setText("jLabel14");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(0, 0, 1280, 530);

        setSize(new java.awt.Dimension(1278, 522));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void pidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pidActionPerformed
        
try {
             con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ghandour","root","");
               pst=con.prepareStatement("SELECT ProductID, ProductName, Category, Price,Quantity FROM product WHERE ProductID=?");
          
           
           int PID = Integer.parseInt(pid.getText());
           pst.setInt(1, PID);
           ResultSet rs = pst.executeQuery();
           if(rs.next()==false)
           {
               JOptionPane.showMessageDialog(this," not found");
               pname.setText("");
               category.setText("");
               price.setText("");
                quantity.setText("");
               
            
           }
           else
           {
               pname.setText(rs.getString("ProductName"));
               category.setText(rs.getString("Category"));
               price.setText(rs.getString("Price"));
               quantity.setText(rs.getString("Quantity"));
             
           }
               
       }  catch (SQLException ex) {
          Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
      }// TODO add your handling code here:
    }//GEN-LAST:event_pidActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          q = Integer.parseInt(quantity.getText());
          a = Integer.parseInt(amount.getText());
      
            if(a>q){
                JOptionPane.showMessageDialog(null,"Erreur amount>quantity?????");
                
            }
            else
            {
        try{
          String sql="INSERT INTO transaction"
                  +"(customerID, Name, Phone, Address, ProductID, ProductName, Category, Price, Amount)"
                  +"VALUES (?,?,?,?,?,?,?,?,?)";
     
            pst = con.prepareStatement(sql);
            pst.setString(1,id.getText());
            pst.setString(2,name.getText());
            pst.setString(3,phone.getText());
            pst.setString(4,address.getText()); 
            pst.setString(5,pid.getText());
            pst.setString(6,pname.getText());
            pst.setString(7,category.getText());
            pst.setString(8,price.getText());
            pst.setString(9,amount.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null," submit successfully");
            }
      catch(HeadlessException | SQLException ex){
           JOptionPane.showMessageDialog(null,ex);
      }          try {
             con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ghandour","root","");
               pst=con.prepareStatement("SELECT ID FROM transaction WHERE customerID=?");
          
           
           int ID = Integer.parseInt(id.getText());
           pst.setInt(1, ID);
           ResultSet rs = pst.executeQuery();
           if(rs.next()==false)
           {
               JOptionPane.showMessageDialog(this," not found");
               reID.setText("");
              
            
           }
           else
           {
               reID.setText("ReceiptID:  "+rs.getString("ID"));
              
           }
               
       }  catch (SQLException ex) {
          Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
      }              
       
    
          
        
              showTableData();
              
         p = Float.parseFloat(price.getText());
         a = Integer.parseInt(amount.getText());
      
       if(total!=0){
           total=total +(p*a);
            TOTAL.setText(Float.toString(total));
            
            
           
       }
       else {
        total=p*a;
         TOTAL.setText(Float.toString(total));
        }
       if(t!=0){
           t=t+(p*a);
           TOT.setText(Float.toString(t)+"($)");
       }
       else{
           t=p*a;
           TOT.setText(Float.toString(t)+"($)");
       }
       
       c=(q-a);
         quantity.setText(Integer.toString(c));
              try{
          String sql="UPDATE product SET Quantity=? WHERE ProductID=?";
          con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ghandour","root","");
          pst = con.prepareStatement(sql);
          pst.setString(1,quantity.getText());
          pst.setString(2,pid.getText());
          pst.executeUpdate();
             
          
          area.setText("****************************************************\n");
          area.setText(area.getText()+"                               *** Receipt ***         \n");
           area.setText(area.getText()+reID.getText()+"\n");
           area.setText(area.getText()+"customerID:  "+id.getText()+"\n");
              area.setText(area.getText()+"Name:  "+name.getText()+"\n");
               area.setText(area.getText()+"phone:  "+phone.getText()+"\n");
                area.setText(area.getText()+"Address:  "+address.getText()+"\n");
                 area.setText(area.getText()+"ProductID:  "+pid.getText()+"\n");
                  area.setText(area.getText()+"ProductName:  "+pname.getText()+"\n");
                   area.setText(area.getText()+"Category:  "+category.getText()+"\n");
                    area.setText(area.getText()+"Price of item:  "+price.getText()+"\n");
                     area.setText(area.getText()+"amount:  "+amount.getText()+"\n");
                      area.setText(area.getText()+"Total:  "+TOTAL.getText()+"$"+"\n");
             
             
             
             
            
      }
      catch(HeadlessException | SQLException ex){
           JOptionPane.showMessageDialog(null,ex);
      }
         
         
    }   
               
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        time.setText(formatter.format(date));
         area.setText(area.getText()+"\n"+date);
        
          
              
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
       try {
             con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ghandour","root","");
               pst=con.prepareStatement("SELECT customerID, name, Phone, Address FROM client WHERE customerID=?");
          
           
           int ID = Integer.parseInt(id.getText());
           pst.setInt(1, ID);
           ResultSet rs = pst.executeQuery();
           if(rs.next()==false)
           {
               JOptionPane.showMessageDialog(this," not found");
               name.setText("");
               phone.setText("");
               address.setText("");
            
           }
           else
           {
               name.setText(rs.getString("name"));
               phone.setText(rs.getString("Phone"));
               address.setText(rs.getString("Address"));
              
           }
               
       }  catch (SQLException ex) {
          Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
      }
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       try{
         
              id.setText("");
              name.setText("");
              phone.setText("");
              address.setText("");
              id.setText("");
              pid.setText("");
              pname.setText("");
              category.setText("");
              price.setText("");
              amount.setText("");
              quantity.setText("");
              TOTAL.setText("");
              total=0;
             
              
             JOptionPane.showMessageDialog(null," reset successfully");
      }
      catch(HeadlessException ex){
           JOptionPane.showMessageDialog(null,ex);
      }  showTableData();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTALActionPerformed

       
// TODO add your handling code here:
    }//GEN-LAST:event_TOTALActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 try{
     area.print();
 }catch(java.awt.print.PrinterException e){
     System.err.format("no printer found",e.getMessage());
 }
     
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed
public void showTableData(){
    try{
        con =DriverManager.getConnection("jdbc:mysql://localhost:3306/ghandour","root","");
        String sql = "SELECT * FROM transaction";
        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
      
       
       
    }
    catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex);
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
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TOT;
    private javax.swing.JTextField TOTAL;
    private javax.swing.JTextField address;
    private javax.swing.JTextField amount;
    private javax.swing.JTextArea area;
    private javax.swing.JTextField category;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pname;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quantity;
    private javax.swing.JLabel reID;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
