/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.view;

import com.project.mobileshop.util.BackUp;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Janitha Dhananjaya
 */
public class SettingsFrame extends javax.swing.JFrame {

    /**
     * Creates new form SettingsFrame
     */
    public SettingsFrame() {
        initComponents();
        setBackground(new Color(0, 0, 0, 0.4f));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backpBtn = new org.jdesktop.swingx.JXLabel();
        aboutMeBtn = new org.jdesktop.swingx.JXLabel();
        changeAccountSettingsBtn = new org.jdesktop.swingx.JXLabel();
        closeBtn1 = new org.jdesktop.swingx.JXLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backpBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        backpBtn.setForeground(new java.awt.Color(255, 204, 0));
        backpBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backpBtn.setText("Back Up");
        backpBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        backpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backpBtnMouseClicked(evt);
            }
        });
        getContentPane().add(backpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 250, 50));

        aboutMeBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        aboutMeBtn.setForeground(new java.awt.Color(255, 204, 0));
        aboutMeBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aboutMeBtn.setText("About Me");
        aboutMeBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        aboutMeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutMeBtnMouseClicked(evt);
            }
        });
        getContentPane().add(aboutMeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 250, 50));

        changeAccountSettingsBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        changeAccountSettingsBtn.setForeground(new java.awt.Color(255, 204, 0));
        changeAccountSettingsBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        changeAccountSettingsBtn.setText("Change Account Settings");
        changeAccountSettingsBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        changeAccountSettingsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changeAccountSettingsBtnMouseClicked(evt);
            }
        });
        getContentPane().add(changeAccountSettingsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, 50));

        closeBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        closeBtn1.setForeground(new java.awt.Color(255, 204, 0));
        closeBtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeBtn1.setText("Close");
        closeBtn1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        closeBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtn1MouseClicked(evt);
            }
        });
        getContentPane().add(closeBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 250, 40));

        setBounds(980, 65, 267, 236);
    }// </editor-fold>//GEN-END:initComponents

    private void backpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backpBtnMouseClicked
        this.dispose();
        String backUpPath = "";
        JFileChooser fc = null;
        if (fc == null) {
            fc = new JFileChooser();
            fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            fc.setAcceptAllFileFilterUsed(false);
        }
        int returnVal = fc.showDialog(null, "Open");
        if (returnVal == JFileChooser.APPROVE_OPTION) {

            try {
                backUpPath = fc.getSelectedFile().getAbsolutePath();
                BackUp b = new BackUp();
                boolean res = b.getData("localhost", "3306", "root", "software@ijse43", "manomobile", backUpPath);
                if (res) {
                    //JOptionPane.showMessageDialog(this, "Backup created Successfully");
                    String content = "Backup created Successfully";
                    JoptionMessageDialog dialog = new JoptionMessageDialog(null, true);
                    dialog.getContent(content);
                } else {
                    //JOptionPane.showMessageDialog(this, "Error occurs while creating backup");
                    String content = "Error occurs while creating backup";
                    JoptionMessageDialog dialog = new JoptionMessageDialog(null, true);
                    dialog.getContent(content);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }//GEN-LAST:event_backpBtnMouseClicked

    private void changeAccountSettingsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changeAccountSettingsBtnMouseClicked
        this.dispose();
        ChangeAccountSettingsDialog dialog = new ChangeAccountSettingsDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_changeAccountSettingsBtnMouseClicked

    private void aboutMeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutMeBtnMouseClicked
        this.dispose();
        AboutMEDialog dialog = new AboutMEDialog(this, true);
        dialog.setVisible(true);
    }//GEN-LAST:event_aboutMeBtnMouseClicked

    private void closeBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtn1MouseClicked
        dispose();
    }//GEN-LAST:event_closeBtn1MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXLabel aboutMeBtn;
    private org.jdesktop.swingx.JXLabel backpBtn;
    private org.jdesktop.swingx.JXLabel changeAccountSettingsBtn;
    private org.jdesktop.swingx.JXLabel closeBtn1;
    // End of variables declaration//GEN-END:variables
}