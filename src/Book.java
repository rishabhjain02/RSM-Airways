
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
public class Book extends javax.swing.JFrame {
static String id; 
    /**
     * Creates new form Book
     */
    public Book() {
        initComponents();
    }
public Book(String a) {
        initComponents();
        id=a;
        //uidtf.setText(id);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nametf = new javax.swing.JTextField();
        fidtf = new javax.swing.JTextField();
        sourcetf = new javax.swing.JTextField();
        destf = new javax.swing.JTextField();
        uidtf = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        notf = new javax.swing.JTextField();
        agetf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        cb3 = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 700));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 153));
        jLabel2.setText("BOOK FLIGHT");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 50, 280, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 170, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("FLIGHT ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 220, 110, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("AGE");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 370, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("DESTINATION");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 320, 130, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("USER ID");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 120, 110, 30);

        nametf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nametf.setForeground(new java.awt.Color(0, 0, 204));
        nametf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(nametf);
        nametf.setBounds(220, 170, 140, 30);

        fidtf.setEditable(false);
        fidtf.setBackground(new java.awt.Color(255, 255, 255));
        fidtf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fidtf.setForeground(new java.awt.Color(0, 0, 204));
        fidtf.setToolTipText("");
        fidtf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(fidtf);
        fidtf.setBounds(220, 220, 140, 30);

        sourcetf.setEditable(false);
        sourcetf.setBackground(new java.awt.Color(255, 255, 255));
        sourcetf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sourcetf.setForeground(new java.awt.Color(0, 0, 204));
        sourcetf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(sourcetf);
        sourcetf.setBounds(220, 270, 140, 30);

        destf.setEditable(false);
        destf.setBackground(new java.awt.Color(255, 255, 255));
        destf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        destf.setForeground(new java.awt.Color(0, 0, 204));
        destf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(destf);
        destf.setBounds(220, 320, 140, 30);

        uidtf.setEditable(false);
        uidtf.setBackground(new java.awt.Color(255, 255, 255));
        uidtf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        uidtf.setForeground(new java.awt.Color(0, 0, 204));
        uidtf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        uidtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidtfActionPerformed(evt);
            }
        });
        getContentPane().add(uidtf);
        uidtf.setBounds(220, 120, 140, 30);

        jButton3.setBackground(new java.awt.Color(102, 255, 204));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("BOOK ");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(100, 560, 160, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airport.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 0, 190, 150);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("DATE OF JOURNEY");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 480, 140, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("SOURCE");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 270, 110, 30);

        notf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        notf.setForeground(new java.awt.Color(0, 0, 204));
        notf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(notf);
        notf.setBounds(220, 420, 140, 30);

        agetf.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        agetf.setForeground(new java.awt.Color(0, 0, 204));
        agetf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(agetf);
        agetf.setBounds(220, 370, 140, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("NO. OF TICKETS");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(40, 420, 130, 30);

        cb1.setForeground(new java.awt.Color(0, 0, 255));
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cb1.setSelectedItem(null);
        getContentPane().add(cb1);
        cb1.setBounds(220, 480, 50, 30);

        cb2.setForeground(new java.awt.Color(0, 0, 255));
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cb2.setSelectedItem(null);
        getContentPane().add(cb2);
        cb2.setBounds(280, 480, 50, 30);

        cb3.setForeground(new java.awt.Color(0, 0, 255));
        cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "17", "18", "19", "20", "21", "22" }));
        cb3.setSelectedItem(null);
        getContentPane().add(cb3);
        cb3.setBounds(340, 480, 50, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("DD");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(230, 460, 30, 17);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("MM");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(290, 460, 30, 17);

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("YY");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(350, 460, 20, 17);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/previous.png"))); // NOI18N
        jLabel15.setToolTipText("");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 48, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\RISHABH\\Pictures\\a7.jpg")); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(550, 700));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 570, 730);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/airline","root","");   
           
String uid=uidtf.getText();
String name=nametf.getText();
String fid=fidtf.getText();
int age=Integer.parseInt(agetf.getText());
int ticket=Integer.parseInt(notf.getText());
PreparedStatement s=con.prepareStatement("select fare from flight_details where flight_id=?");
s.setString(1,fid);
ResultSet rs=s.executeQuery();
rs.next();
int fare=rs.getInt(1);
fare=fare*ticket;
PreparedStatement st=con.prepareStatement("insert into booking(user_id,name,flight_id,age,tickets,fare,payment_done) values(?,?,?,?,?,?,?)");
st.setString(1,uid);
st.setString(2, name);
st.setString(3, fid);
st.setInt(4, age);
st.setInt(5, ticket);
st.setInt(6, fare);
st.setString(7,"No");
st.executeUpdate();
PreparedStatement t=con.prepareStatement("select booking_no from booking where user_id=? and name=?");
t.setString(1,uid);
t.setString(2,name);
ResultSet ts=t.executeQuery();
ts.next();
int booking_no=ts.getInt(1);
JOptionPane.showMessageDialog(null, "Congrats Your ticket has been successfully booked and your booking no. is "+booking_no);
new Booked(uid).setVisible(true);
this.setVisible(false);// TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void uidtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidtfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uidtfActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new Search_flight().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agetf;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    public javax.swing.JTextField destf;
    public javax.swing.JTextField fidtf;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nametf;
    private javax.swing.JTextField notf;
    public javax.swing.JTextField sourcetf;
    public javax.swing.JTextField uidtf;
    // End of variables declaration//GEN-END:variables
}
