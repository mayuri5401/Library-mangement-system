/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package log;
import java.sql.*;
import project.ConnectionPrivider;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author mayuri
 */
public class returnbook extends javax.swing.JFrame {
      Connection con;
    ResultSet rs;
   PreparedStatement pst;

    /**
     * Creates new form returnbook
     */
    public returnbook() {
        initComponents();
    }
    public void delete(){
    
    String sql ="delete from issue where studentid =?";
    try{
        pst=con.prepareStatement(sql);
        
                pst.setString(1, txtstudent.getText());
//                pst.setString(2, txtbname.getText());
//                pst.setString(3, txtprice.getText());
//                pst.setString(4, txtpub.getText());
//                pst.setString(5, txtstudent.getText());
//                pst.setString(6, txtsname.getText());
//                pst.setString(7, txtfname.getText());
//                pst.setString(8, txtcname.getText());
//                pst.setString(9, txtdate.getText());
        pst.execute();
    }
    catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    
    
    }
    public void clear(){
        txtbook.setText(null);
           txtbname.setText(null);   
           txtprice.setText(null);
           txtpub.setText(null);
           txtstudent.setText(null);
           txtsname.setText(null); 
           txtfname.setText(null);
           txtcname.setText(null);
              
              txtdate.setText(null);  
        date2.setDate(null);
               
              
              
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtbook = new javax.swing.JTextField();
        txtstudent = new javax.swing.JTextField();
        txtsname = new javax.swing.JTextField();
        txtdate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        date2 = new com.toedter.calendar.JDateChooser();
        txtfname = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtbname = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        txtpub = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("ReturnDate:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("BookID :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 138, 100, 31));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("IssueDate:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 340, 100, 31));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Name:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 149, 100, 31));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("StudentID:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 73, 100, 31));

        txtbook.setBackground(new java.awt.Color(0, 0, 102));
        txtbook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtbook.setForeground(new java.awt.Color(255, 255, 255));
        txtbook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbookActionPerformed(evt);
            }
        });
        getContentPane().add(txtbook, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 69, 200, 37));

        txtstudent.setBackground(new java.awt.Color(0, 0, 102));
        txtstudent.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtstudent.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtstudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 69, 200, 37));

        txtsname.setBackground(new java.awt.Color(0, 0, 102));
        txtsname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtsname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtsname, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 147, 200, 37));

        txtdate.setBackground(new java.awt.Color(0, 0, 102));
        txtdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtdate.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 334, 200, 37));

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 70, 170, 34));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\mayuri\\OneDrive\\Documents\\NetBeansProjectsw\\LibraryManagement\\dist\\Icon 1\\return-book-1-560407.png")); // NOI18N
        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 448, -1, 50));

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\mayuri\\OneDrive\\Documents\\NetBeansProjectsw\\LibraryManagement\\dist\\Icon 1\\red-x-mark-transparent-background-3.png")); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, -1, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ReturnBook:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(442, 389, -1, 30));

        date2.setBackground(new java.awt.Color(0, 0, 102));
        date2.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(date2, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 389, 200, 30));

        txtfname.setBackground(new java.awt.Color(0, 0, 102));
        txtfname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtfname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 218, 200, 37));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("FatherName:");
        jLabel7.setToolTipText("");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 223, -1, 26));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("CourseName:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 299, 118, 26));

        txtcname.setBackground(new java.awt.Color(0, 0, 102));
        txtcname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtcname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtcname, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 293, 200, 37));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("BookName:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 80, 91, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Publisher:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 283, -1, -1));

        txtbname.setBackground(new java.awt.Color(0, 0, 102));
        txtbname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtbname.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtbname, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 134, 200, 37));

        txtprice.setBackground(new java.awt.Color(0, 0, 102));
        txtprice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtprice.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 207, 200, 37));

        txtpub.setBackground(new java.awt.Color(0, 0, 102));
        txtpub.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtpub.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtpub, new org.netbeans.lib.awtextra.AbsoluteConstraints(815, 282, 200, 37));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Price:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(706, 218, 65, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setText("ReturnBook.");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(466, 19, 256, 32));

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\mayuri\\OneDrive\\Documents\\NetBeansProjectsw\\LibraryManagement\\dist\\Icon 1\\abstract-blur-defocused-bookshelf-library.jpg")); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
         
         String a3=txtstudent.getText();
         
        String sql;
        sql = "select * from issue where studentid="+a3+"";
        try{
                con = ConnectionPrivider.getCon();
            
           pst=con.prepareStatement(sql);
           rs=pst.executeQuery();  
             if(rs.next()){
                   txtbook.setText(rs.getString(1));
                   txtbname.setText(rs.getString(2));
                   txtprice.setText(rs.getString(3));
                   txtpub.setText(rs.getString(4));
                   
                   txtsname.setText(rs.getString(6));
                   txtfname.setText(rs.getString(7));
                   txtcname.setText(rs.getString(8));
                   txtdate.setText(rs.getString(9));
               
                
                 rs.close();
                 pst.close();
                 
           }
           else
           {
                 JOptionPane.showMessageDialog(null,"student id and bookid in not exit in data");
           }
        
        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

     String sql="INSERT INTO `returnbook`(`bookid`, `name`, `price`, `publisher`, `studentid`, `sname`, `fathername`, `coursename`, `issuedate`,`returndate`)"+"VALUES (?,?,?,?,?,?,?,?,?,?)";
        try {
            pst=con.prepareStatement(sql);
           
                pst.setString(1, txtbook.getText());
                pst.setString(2, txtbname.getText());
                pst.setString(3, txtprice.getText());
                pst.setString(4, txtpub.getText());
                pst.setString(5, txtstudent.getText());
                pst.setString(6, txtsname.getText());
                pst.setString(7, txtfname.getText());
                pst.setString(8, txtcname.getText());
                pst.setString(9, txtdate.getText());
               
           String dob;
           SimpleDateFormat dformat = new SimpleDateFormat("yyyy-MM-dd");
           dob=dformat.format(date2.getDate());
            pst.setString(10, dob);
            pst.execute();
             JOptionPane.showMessageDialog(null,"book returned"); 
            delete();
            clear();
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e); 
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtbookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbookActionPerformed

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
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser date2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtbname;
    private javax.swing.JTextField txtbook;
    private javax.swing.JTextField txtcname;
    private javax.swing.JTextField txtdate;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtpub;
    private javax.swing.JTextField txtsname;
    private javax.swing.JTextField txtstudent;
    // End of variables declaration//GEN-END:variables
}
