import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RISHABH
 */
public class Forget extends javax.swing.JFrame {

    /**
     * Creates new form Forget
     */
    public Forget() {
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        uidtf = new javax.swing.JTextField();
        emailtf = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        passtf = new javax.swing.JPasswordField();
        conftf = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 520));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("New Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 230, 120, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("User id");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 90, 120, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Confirm Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 300, 160, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Email Id");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 160, 120, 20);

        uidtf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uidtf.setForeground(new java.awt.Color(0, 0, 204));
        uidtf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(uidtf);
        uidtf.setBounds(250, 90, 140, 30);

        emailtf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        emailtf.setForeground(new java.awt.Color(0, 0, 204));
        emailtf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(emailtf);
        emailtf.setBounds(250, 160, 140, 30);

        jButton1.setBackground(new java.awt.Color(102, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("SUBMIT");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(130, 380, 120, 50);

        passtf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passtf.setForeground(new java.awt.Color(0, 0, 255));
        passtf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(passtf);
        passtf.setBounds(250, 230, 140, 30);

        conftf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        conftf.setForeground(new java.awt.Color(0, 0, 255));
        conftf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(conftf);
        conftf.setBounds(250, 300, 140, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/key2.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 0, 180, 160);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("CHANGE PASSWORD");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 10, 410, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\RISHABH\\Pictures\\a12.jpg")); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 520));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 590, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/airline","root","");
            String uid=uidtf.getText();
            String email=emailtf.getText();
            String pass1=new String(passtf.getPassword());
            String pass2=new String(conftf.getPassword());
            PreparedStatement st=con.prepareStatement("select email from user_info where user_id=?");
            st.setString(1,uid);
ResultSet rs=st.executeQuery();
rs.next();
String email2=rs.getString(1);
if(email.equals(email2))
{
if(pass1.equals(pass2))
{
   PreparedStatement t=con.prepareStatement("update user_info set password=? where user_id=?") ;
   t.setString(1, pass1);
   t.setString(2,uid);
   t.executeUpdate();
   JOptionPane.showMessageDialog(null,"Password Successfully changed.");
   new Login().setVisible(true);
   this.setVisible(false);
}
else
JOptionPane.showMessageDialog(null,"Password of both the fields are different. So,Retype Password.");
}
else
{
    JOptionPane.showMessageDialog(null,"Invalid Email Id for this user id");
// TOst=con.prepareStatementDO add your handling code here:
        }} catch (ClassNotFoundException ex) {
            Logger.getLogger(Forget.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Forget.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Forget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forget.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forget().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField conftf;
    private javax.swing.JTextField emailtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField passtf;
    private javax.swing.JTextField uidtf;
    // End of variables declaration//GEN-END:variables
}
