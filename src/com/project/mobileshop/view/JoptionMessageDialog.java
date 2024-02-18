/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.view;

import java.awt.Color;
import java.awt.Font;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author Janitha Dhananjaya
 */
public class JoptionMessageDialog extends javax.swing.JDialog {

    /**
     * Creates new form JoptionMessageDialog
     */
    public JoptionMessageDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setBackground(new Color(0, 0, 0, 0.4f));
    }

    public void getContent(String content) {
        contantLbl.setText(content);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        titleTextLbl = new org.jdesktop.swingx.JXLabel();
        closeBtn = new org.jdesktop.swingx.JXLabel();
        titleLbl = new org.jdesktop.swingx.JXLabel();
        contantLbl = new org.jdesktop.swingx.JXLabel();
        BtnOK = new org.jdesktop.swingx.JXLabel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jXPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleTextLbl.setForeground(new java.awt.Color(255, 255, 255));
        titleTextLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleTextLbl.setText("Message");
        titleTextLbl.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jXPanel1.add(titleTextLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 40));

        closeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/mobileshop/images/Images/close for Joption.png"))); // NOI18N
        closeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeBtnMouseExited(evt);
            }
        });
        jXPanel1.add(closeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 4, 40, 30));

        titleLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/mobileshop/images/Images/Joption tool.jpg"))); // NOI18N
        jXPanel1.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, 38));

        contantLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contantLbl.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jXPanel1.add(contantLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 340, 80));

        BtnOK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnOK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnOK.setText("OK");
        BtnOK.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        BtnOK.setOpaque(true);
        BtnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnOKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnOKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnOKMouseExited(evt);
            }
        });
        jXPanel1.add(BtnOK, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 70, 30));

        jXLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/mobileshop/images/Images/High Priority_48px.png"))); // NOI18N
        jXPanel1.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(463, Short.MAX_VALUE)
                .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(426, 426, 426))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jXPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        setBounds(0, 90, 1360, 680);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnOKMouseClicked
        BtnOK.setBackground(new Color(23,114,81));
        BtnOK.setForeground(new Color(255, 255, 255));
        dispose();
    }//GEN-LAST:event_BtnOKMouseClicked

    private void closeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseEntered
        URL resource = this.getClass().getResource("/com/project/mobileshop/images/Images/close for Joption red.png");
        ImageIcon imageIcon = new ImageIcon(resource);
        closeBtn.setIcon(imageIcon);
       
    }//GEN-LAST:event_closeBtnMouseEntered

    private void closeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseExited
        URL resource = this.getClass().getResource("/com/project/mobileshop/images/Images/close for Joption.png");
        ImageIcon imageIcon = new ImageIcon(resource);
        closeBtn.setIcon(imageIcon);
    }//GEN-LAST:event_closeBtnMouseExited

    private void closeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeBtnMouseClicked
        dispose();
    }//GEN-LAST:event_closeBtnMouseClicked

    private void BtnOKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnOKMouseEntered
        BtnOK.setBackground(new Color(23, 114, 81));
        BtnOK.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_BtnOKMouseEntered

    private void BtnOKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnOKMouseExited
        BtnOK.setBackground(new Color(255, 255, 255));
        BtnOK.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_BtnOKMouseExited

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
            java.util.logging.Logger.getLogger(JoptionMessageDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JoptionMessageDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JoptionMessageDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JoptionMessageDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JoptionMessageDialog dialog = new JoptionMessageDialog(new javax.swing.JFrame(), true);
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
    private org.jdesktop.swingx.JXLabel BtnOK;
    private org.jdesktop.swingx.JXLabel closeBtn;
    private org.jdesktop.swingx.JXLabel contantLbl;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXLabel titleLbl;
    private org.jdesktop.swingx.JXLabel titleTextLbl;
    // End of variables declaration//GEN-END:variables
}