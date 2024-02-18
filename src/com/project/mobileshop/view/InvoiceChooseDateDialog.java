/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.view;

import com.project.mobileshop.controller.InvoiceController;
import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.db.DBConnection;
import java.awt.Color;
import java.awt.Dialog;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.jasper.IJSEJasperViewer;
import lk.ijse.jasper.JasperUtil;
import lk.ijse.jasper.Report;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperReportsContext;

/**
 *
 * @author Janitha Dhananjaya
 */
@Report("com.project.mobileshop.report")
public class InvoiceChooseDateDialog extends javax.swing.JDialog {

    /**
     * Creates new form InvoiceChooseDateDialog
     */
    public InvoiceChooseDateDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0, 0, 0, 0.6f));
        DisabledDates();
    }

    private void DisabledDates() {
        Date date = new Date();
        datePicker.getMonthView().setUpperBound(date);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        datePicker = new org.jdesktop.swingx.JXDatePicker();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        chooseDatetable = new org.jdesktop.swingx.JXTable();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        previewBtn = new org.jdesktop.swingx.JXLabel();
        BtnClose = new org.jdesktop.swingx.JXLabel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        datePicker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datePickerMouseClicked(evt);
            }
        });
        datePicker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datePickerActionPerformed(evt);
            }
        });
        getContentPane().add(datePicker, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 230, 30));

        jXLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel8.setText("Choose Date");
        jXLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        getContentPane().add(jXLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 170, -1));

        chooseDatetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Invoice No", "Customer Name", "Brand", "Model Name", "Total Amount"
            }
        ));
        chooseDatetable.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jScrollPane3.setViewportView(chooseDatetable);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 830, 220));

        jXPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previewBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        previewBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        previewBtn.setText("Preview");
        previewBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        previewBtn.setOpaque(true);
        previewBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previewBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                previewBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                previewBtnMouseExited(evt);
            }
        });
        jXPanel1.add(previewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 440, 150, 40));

        BtnClose.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnClose.setText("Close");
        BtnClose.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        BtnClose.setOpaque(true);
        BtnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnCloseMouseExited(evt);
            }
        });
        jXPanel1.add(BtnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 150, 40));

        jXLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel1.setText("Invoice");
        jXLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jXPanel1.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 270, 40));

        getContentPane().add(jXPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 930, 520));

        setBounds(0, 90, 1366, 680);
    }// </editor-fold>//GEN-END:initComponents

    private void datePickerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datePickerMouseClicked

    }//GEN-LAST:event_datePickerMouseClicked

    private void datePickerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datePickerActionPerformed
        Date chooseDate = datePicker.getDate();
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        String choosedDate = date.format(chooseDate);
        System.out.println(choosedDate);

        try {
            ArrayList<CustomDTO> invoiceList = InvoiceController.getDateInvoices(choosedDate);
            DefaultTableModel dtm = (DefaultTableModel) chooseDatetable.getModel();
            dtm.setRowCount(0);
            System.out.println("dtm.setRowCount(0);");
            if (invoiceList != null) {
                System.out.println("loop");
                for (CustomDTO i : invoiceList) {
                    Object[] row = {i.getSoldInvoiceNo(), i.getCustomerName(), i.getBrand(), i.getModelName(), i.getSellingPrice()};
                    dtm.addRow(row);
                    System.out.println("!null came");
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(InvoiceChooseDateDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_datePickerActionPerformed

    private void previewBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previewBtnMouseClicked
        if (chooseDatetable.getSelectedRow() == -1) {
           
            String content = "Select an Invoice No";
            JoptionMessageDialog dialog = new JoptionMessageDialog(null, true);
            dialog.getContent(content);
            return;
           
        }
        int selectedRow = chooseDatetable.getSelectedRow();
        JasperUtil.init(InvoiceChooseDateDialog.class);
        JasperReportsContext ctx = JasperUtil.getReportContext();

        try {
            JasperReport compiledReport = JasperUtil.getCompiledReport("Invoice.jasper");

            JasperFillManager fillManager = JasperFillManager.getInstance(ctx);

            HashMap<String, Object> reportParams = new HashMap<>();

            reportParams.put("invoiceid", chooseDatetable.getValueAt(selectedRow, 0));

            Connection connection = DBConnection.getInstance().getConnection();
            JasperPrint filledReport = fillManager.fill(compiledReport, reportParams, connection);

            IJSEJasperViewer frmJSEJasperViewer = new IJSEJasperViewer(filledReport);
            frmJSEJasperViewer.setTitle("Invoice");
            frmJSEJasperViewer.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
            frmJSEJasperViewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(InvoiceChooseDateDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_previewBtnMouseClicked

    private void previewBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previewBtnMouseEntered
        previewBtn.setBackground(new Color(23, 114, 81));
        previewBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_previewBtnMouseEntered

    private void BtnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCloseMouseClicked
        dispose();
    }//GEN-LAST:event_BtnCloseMouseClicked

    private void BtnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCloseMouseEntered
        BtnClose.setBackground(new Color(255, 14, 65));
        BtnClose.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_BtnCloseMouseEntered

    private void previewBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previewBtnMouseExited
        previewBtn.setBackground(new Color(255, 255, 255));
        previewBtn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_previewBtnMouseExited

    private void BtnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCloseMouseExited
        BtnClose.setBackground(new Color(255, 255, 255));
        BtnClose.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_BtnCloseMouseExited

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
            java.util.logging.Logger.getLogger(InvoiceChooseDateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceChooseDateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceChooseDateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceChooseDateDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InvoiceChooseDateDialog dialog = new InvoiceChooseDateDialog(new javax.swing.JFrame(), true);
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
    private org.jdesktop.swingx.JXLabel BtnClose;
    private org.jdesktop.swingx.JXTable chooseDatetable;
    private org.jdesktop.swingx.JXDatePicker datePicker;
    private javax.swing.JScrollPane jScrollPane3;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXLabel previewBtn;
    // End of variables declaration//GEN-END:variables
}
