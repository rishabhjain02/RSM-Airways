/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RISHABH
 */
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Signup extends javax.swing.JFrame {

    /**
     * Creates new form Signup
     */
    public Signup() {
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

        gp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        idtf = new javax.swing.JTextField();
        nametf = new javax.swing.JTextField();
        emailtf = new javax.swing.JTextField();
        phonetf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        r1 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        r2 = new javax.swing.JRadioButton();
        cpasstf = new javax.swing.JPasswordField();
        passtf = new javax.swing.JPasswordField();
        citytf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN UP");
        setMinimumSize(new java.awt.Dimension(610, 590));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Gender");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 150, 120, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 255, 51));
        jLabel8.setText("SIGN UP FORM");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 40, 320, 40);

        idtf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        idtf.setForeground(new java.awt.Color(255, 51, 255));
        idtf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(idtf);
        idtf.setBounds(190, 190, 160, 26);

        nametf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        nametf.setForeground(new java.awt.Color(255, 51, 255));
        nametf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(nametf);
        nametf.setBounds(190, 100, 160, 26);

        emailtf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emailtf.setForeground(new java.awt.Color(255, 51, 255));
        emailtf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(emailtf);
        emailtf.setBounds(190, 290, 160, 26);

        phonetf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        phonetf.setForeground(new java.awt.Color(255, 51, 255));
        phonetf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(phonetf);
        phonetf.setBounds(190, 340, 160, 26);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("User id");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 190, 120, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Email");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 290, 120, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Phone");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 340, 120, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Confirm Password");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 440, 160, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Name");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 100, 120, 20);

        r1.setBackground(new java.awt.Color(255, 255, 255));
        gp.add(r1);
        r1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r1.setText("Male");
        r1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });
        getContentPane().add(r1);
        r1.setBounds(190, 150, 70, 19);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Password");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 390, 120, 20);

        r2.setBackground(new java.awt.Color(255, 255, 255));
        gp.add(r2);
        r2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        r2.setText("Female");
        r2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(r2);
        r2.setBounds(280, 150, 70, 19);

        cpasstf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cpasstf.setForeground(new java.awt.Color(255, 51, 255));
        cpasstf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(cpasstf);
        cpasstf.setBounds(190, 440, 160, 26);

        passtf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        passtf.setForeground(new java.awt.Color(255, 51, 255));
        passtf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(passtf);
        passtf.setBounds(190, 390, 160, 26);

        citytf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        citytf.setForeground(new java.awt.Color(255, 51, 255));
        citytf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(citytf);
        citytf.setBounds(190, 240, 160, 26);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("City");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 240, 120, 20);

        jButton1.setBackground(new java.awt.Color(102, 255, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 255));
        jButton1.setText("SAVE");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 490, 100, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a28.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(410, 0, 140, 160);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/register.PNG"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(400, 360, 130, 120);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/previous.png"))); // NOI18N
        jLabel15.setToolTipText("");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 48, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\RISHABH\\Pictures\\a14.jpg")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1024, 177));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 610, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/airline","root","");
            String name=nametf.getText();
            String id=idtf.getText();
            String city=citytf.getText();
            String email=emailtf.getText();
            //int phone=Integer.parseInt(phonetf.getText());
            String pass1=new String(passtf.getPassword());
             String pass2=new String(cpasstf.getPassword());
         
           
             if(name=="" || id=="" || city=="" || email=="" ||  pass1=="" || pass2=="")
             {
                 JOptionPane.showMessageDialog(null, "Please fill all fields");
             }
             else
             {
                if(pass1.equals(pass2))
             {
             Statement stmt=con.createStatement();
             ResultSet rs=stmt.executeQuery("select name from user_info where user_id='"+id+"'");
            int count=0;
            while(rs.next())
            {
                count++;
                break;
               
            }
            if(count>0)
            {
                JOptionPane.showMessageDialog(null, "This user id is already registered. Please enter another id");
            }
            else
            {
            PreparedStatement st=con.prepareStatement("insert into user_info values(?,?,?,?,?,?,?)");
            st.setString(1, nametf.getText());
            if(r1.isSelected())
                st.setString(2,"Male");
            else
                st.setString(2, "Female");
            st.setString(3, idtf.getText());
            st.setString(4, citytf.getText());
            st.setString(5, emailtf.getText());
            st.setString(6, phonetf.getText());
            st.setString(7,new String(passtf.getPassword()));
            st.executeUpdate();
            
           JOptionPane.showMessageDialog(null, "Successfully signed up");
            this.setVisible(false);
            new Home().setVisible(true);
             }
             }
else
JOptionPane.showMessageDialog(null, "Password do not match");
con.close();}// TODO add your handling code here:
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        new Home().setVisible(true);
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
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Signup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField citytf;
    private javax.swing.JPasswordField cpasstf;
    private javax.swing.JTextField emailtf;
    private javax.swing.ButtonGroup gp;
    private javax.swing.JTextField idtf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nametf;
    private javax.swing.JPasswordField passtf;
    private javax.swing.JTextField phonetf;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    // End of variables declaration//GEN-END:variables
}
