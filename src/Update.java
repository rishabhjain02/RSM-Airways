
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RISHABH
 */
import javax.swing.*;

public class Update extends javax.swing.JFrame {
static String uid;
    /**
     * Creates new form Update
     */
    public Update() {
        initComponents();
    }
    public Update(String id) {
    try {
        initComponents();
        uid=id;
        uidtf.setText(uid);
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/airline","root",""); 
        PreparedStatement st=con.prepareStatement("select name,city,email,phone from user_info where user_id=?");
        st.setString(1,uid);
        ResultSet rs=st.executeQuery();
        rs.next();
        String name=rs.getString(1);
        String city=rs.getString(2);
        String email=rs.getString(3);
        String phone=rs.getString(4);
        nametf.setText(name);
        citytf.setText(city);
        emailtf.setText(email);
        phonetf.setText(phone);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        citytf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        emailtf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        phonetf = new javax.swing.JTextField();
        uidtf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 590));
        getContentPane().setLayout(null);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 180, 120, 20);

        nametf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nametf.setForeground(new java.awt.Color(153, 0, 153));
        nametf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(nametf);
        nametf.setBounds(200, 180, 160, 26);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("City");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 240, 120, 20);

        citytf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        citytf.setForeground(new java.awt.Color(153, 0, 153));
        citytf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(citytf);
        citytf.setBounds(200, 240, 160, 26);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 300, 120, 20);

        emailtf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailtf.setForeground(new java.awt.Color(153, 0, 153));
        emailtf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(emailtf);
        emailtf.setBounds(200, 300, 160, 26);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Phone");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 360, 120, 20);

        phonetf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phonetf.setForeground(new java.awt.Color(153, 0, 153));
        phonetf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(phonetf);
        phonetf.setBounds(200, 360, 160, 26);

        uidtf.setEditable(false);
        uidtf.setBackground(new java.awt.Color(255, 255, 255));
        uidtf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        uidtf.setForeground(new java.awt.Color(153, 0, 153));
        uidtf.setToolTipText("CAN NOT CHANGE USER ID");
        uidtf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(uidtf);
        uidtf.setBounds(200, 120, 160, 26);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("User Id");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 120, 120, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("UPDATE DETAILS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 50, 320, 50);

        jButton1.setBackground(new java.awt.Color(153, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 450, 120, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("EDIT THE RESPECTIVE FIELD TO UPDATE DETAILS");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 410, 390, 20);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/software_update.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(390, 10, 150, 130);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/previous.png"))); // NOI18N
        jLabel9.setToolTipText("");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 10, 50, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a32new.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 610, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        Class.forName("com.mysql.jdbc.Driver"); 
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/airline","root","");
        String name=nametf.getText();
        String city=citytf.getText();
        String email=emailtf.getText();
        String phone=phonetf.getText();
        PreparedStatement st1=con.prepareStatement("update user_info set name=? where user_id=?");
        st1.setString(1,name);
        st1.setString(2,uid);
        st1.executeUpdate();
        PreparedStatement st2=con.prepareStatement("update user_info set city=? where user_id=?");
        st2.setString(1,city);
        st2.setString(2,uid);
        st2.executeUpdate();
        PreparedStatement st3=con.prepareStatement("update user_info set email=? where user_id=?");
        st3.setString(1,email);
        st3.setString(2,uid);
        st3.executeUpdate();
        PreparedStatement st4=con.prepareStatement("update user_info set phone=? where user_id=?");
        st4.setString(1,phone);
        st4.setString(2,uid);
        st4.executeUpdate();
        JOptionPane.showMessageDialog(null,"Successfully Updated");
        new Menu().setVisible(true);
        this.setVisible(false);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Update.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        new Menu().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField citytf;
    private javax.swing.JTextField emailtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nametf;
    private javax.swing.JTextField phonetf;
    private javax.swing.JTextField uidtf;
    // End of variables declaration//GEN-END:variables
}
