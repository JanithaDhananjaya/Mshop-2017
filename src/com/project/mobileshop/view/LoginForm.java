/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author Janitha Dhananjaya
 */
public class LoginForm extends javax.swing.JDialog {

    /**
     * Creates new form LoginForm
     */
    public LoginForm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0, 0, 0, 0.7f));

    }

    /* public void setTime() {
     Time t1 = new Timer(0, new ActionListener() {

     @Override
     public void actionPerformed(ActionEvent e) {
     Date d1 = new Date();
     SimpleDateFormat sf = new SimpleDateFormat("hh:mm a");
     String time = sf.format(d1);
     timeLbl.setText(time);
     }
     });

     t1.start();
     }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userIconLbl = new org.jdesktop.swingx.JXLabel();
        loginBtn = new org.jdesktop.swingx.JXLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        userNameTxt = new org.jdesktop.swingx.JXTextField();
        passwordTxt = new javax.swing.JPasswordField();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        warningLbl = new org.jdesktop.swingx.JXLabel();
        lblBox = new org.jdesktop.swingx.JXLabel();
        backPanel = new org.jdesktop.swingx.JXPanel();
        titleLbl = new org.jdesktop.swingx.JXLabel();
        wallpaperLbl = new org.jdesktop.swingx.JXLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userIconLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/mobileshop/images/Images/User_96px.png"))); // NOI18N
        getContentPane().add(userIconLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 90, 80));

        loginBtn.setBackground(new java.awt.Color(97, 212, 195));
        loginBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtn.setText("LOGIN");
        loginBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        loginBtn.setOpaque(true);
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginBtnMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                loginBtnMouseReleased(evt);
            }
        });
        getContentPane().add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, 280, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 280, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 280, 10));

        userNameTxt.setBackground(new java.awt.Color(18, 18, 61));
        userNameTxt.setBorder(null);
        userNameTxt.setForeground(new java.awt.Color(255, 255, 255));
        userNameTxt.setText("Username");
        userNameTxt.setFont(new java.awt.Font("Lucida Bright", 0, 22)); // NOI18N
        userNameTxt.setMargin(new java.awt.Insets(0, 0, 2, 0));
        userNameTxt.setOpaque(false);
        userNameTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameTxtMouseClicked(evt);
            }
        });
        userNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userNameTxtActionPerformed(evt);
            }
        });
        getContentPane().add(userNameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 280, 40));

        passwordTxt.setBackground(new java.awt.Color(18, 18, 61));
        passwordTxt.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        passwordTxt.setForeground(new java.awt.Color(255, 255, 255));
        passwordTxt.setBorder(null);
        passwordTxt.setOpaque(false);
        passwordTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTxtActionPerformed(evt);
            }
        });
        getContentPane().add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 280, 40));

        jXLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        jXLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jXLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel1.setText("close");
        jXLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jXLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jXLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 550, 50, 20));

        warningLbl.setForeground(new java.awt.Color(204, 0, 0));
        warningLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        warningLbl.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        getContentPane().add(warningLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 280, 20));

        lblBox.setBackground(new java.awt.Color(18, 18, 61));
        lblBox.setOpaque(true);
        getContentPane().add(lblBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 500, 380));

        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("MEMBER LOGIN");
        titleLbl.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        backPanel.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 300, 40));

        wallpaperLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/mobileshop/images/Images/login.jpg"))); // NOI18N
        backPanel.add(wallpaperLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 550));

        getContentPane().add(backPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 700, 550));

        setBounds(0, 0, 1366, 786);
    }// </editor-fold>//GEN-END:initComponents

    private void userNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userNameTxtActionPerformed
        passwordTxt.requestFocus();
    }//GEN-LAST:event_userNameTxtActionPerformed

    private void passwordTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTxtActionPerformed
        String usernme = userNameTxt.getText();
        String password = new String(passwordTxt.getPassword());
        if (usernme.equals("Admin") && password.equals("software")) {
            System.out.println(usernme);
            System.out.println(password);
            this.dispose();
            MainPage mainPage = new MainPage();
            mainPage.setVisible(true);
        } else {
            warningLbl.setText("Password or User Name doesn't match");
           
            return;
        }
    }//GEN-LAST:event_passwordTxtActionPerformed

    private void loginBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseEntered
        loginBtn.setBackground(new Color(97, 212, 195));

    }//GEN-LAST:event_loginBtnMouseEntered

    private void loginBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseExited
        loginBtn.setBackground(new Color(97, 212, 195));

    }//GEN-LAST:event_loginBtnMouseExited

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        String usernme = userNameTxt.getText();
        String password = new String(passwordTxt.getPassword());
        if (usernme.equals("Admin") && password.equals("software")) {
            System.out.println(usernme);
            System.out.println(password);
            this.dispose();
            MainPage mainPage = new MainPage();
            mainPage.setVisible(true);
        } else {
            warningLbl.setText("Password or User Name doesn't match");
            return;
        }
    }//GEN-LAST:event_loginBtnMouseClicked

    private void loginBtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseReleased

        loginBtn.setBackground(new Color(73, 185, 185));
    }//GEN-LAST:event_loginBtnMouseReleased

    private void userNameTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameTxtMouseClicked
        userNameTxt.setText("");
        warningLbl.setText("");
    }//GEN-LAST:event_userNameTxtMouseClicked

    private void jXLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jXLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jXLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginForm dialog = new LoginForm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXPanel backPanel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel lblBox;
    private org.jdesktop.swingx.JXLabel loginBtn;
    private javax.swing.JPasswordField passwordTxt;
    private org.jdesktop.swingx.JXLabel titleLbl;
    private org.jdesktop.swingx.JXLabel userIconLbl;
    private org.jdesktop.swingx.JXTextField userNameTxt;
    private org.jdesktop.swingx.JXLabel wallpaperLbl;
    private org.jdesktop.swingx.JXLabel warningLbl;
    // End of variables declaration//GEN-END:variables
}