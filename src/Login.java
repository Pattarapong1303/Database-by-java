/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labnerd;

import javax.swing.JOptionPane;

/**
 *
 * @author NONT
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    
    Admin admin;
    public Login() {
        initComponents();
        admin = new Admin();
        admin.setUssername("admin");
        admin.setPassword("1234");

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        usserNameTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setLocation(new java.awt.Point(300, 200));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Bangna New", 0, 24)); // NOI18N
        jLabel7.setText("Username");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 130, 50));

        jLabel10.setFont(new java.awt.Font("Bangna New", 1, 36)); // NOI18N
        jLabel10.setText("Sign in");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 150, 50));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 490, 490, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 490, 10));

        jLabel12.setFont(new java.awt.Font("Bangna New", 0, 24)); // NOI18N
        jLabel12.setText("Password");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 130, 50));

        usserNameTextField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        usserNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        usserNameTextField.setText("Enter your ussername");
        usserNameTextField.setBorder(null);
        usserNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usserNameTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(usserNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 480, 40));

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        passwordField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passwordField.setBorder(null);
        jPanel2.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 450, 480, 40));

        jButton1.setFont(new java.awt.Font("Bangna New", 1, 24)); // NOI18N
        jButton1.setText("Login");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 520, 490, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usserNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usserNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usserNameTextFieldActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String password = String.valueOf(passwordField.getPassword());
        if(admin.getPassword().equals(password) && admin.getUssername().equals(usserNameTextField.getText()))
        {
            Main3 main = new Main3();
            main.setVisible(true);
            System.out.println("Pass");
            this.setVisible(false);
        }
        else
        {
            System.out.println("Fall");
            JOptionPane.showMessageDialog(null,"Please check your username and password again.","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usserNameTextField;
    // End of variables declaration//GEN-END:variables
}