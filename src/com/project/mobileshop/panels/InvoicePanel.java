/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.panels;

import com.project.mobileshop.controller.InvoiceController;
import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.db.DBConnection;
import com.project.mobileshop.view.InvoiceChooseDateDialog;
import com.project.mobileshop.view.JoptionMessageDialog;
import java.awt.Color;
import java.awt.Dialog;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
public class InvoicePanel extends javax.swing.JPanel {

    /**
     * Creates new form InvoicePanel
     */
    public InvoicePanel() {
        initComponents();
        LoadTodayInvoices();
        LoadYesterdayInvoices();
        multiPanel.setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        multiPanel = new org.jdesktop.swingx.JXPanel();
        backPanel = new org.jdesktop.swingx.JXPanel();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        invoiceTodayTabel = new org.jdesktop.swingx.JXTable();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        jXPanel2 = new org.jdesktop.swingx.JXPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        invoiceYesterdayTabel = new org.jdesktop.swingx.JXTable();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        previewBtn = new org.jdesktop.swingx.JXLabel();
        yesterdayLbl = new org.jdesktop.swingx.JXLabel();
        TodaypreviewBtn = new org.jdesktop.swingx.JXLabel();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        todayLbl = new org.jdesktop.swingx.JXLabel();
        yesterdaypreviewBtn1 = new org.jdesktop.swingx.JXLabel();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();

        multiPanel.setBackground(new java.awt.Color(255, 255, 255));
        multiPanel.setOpaque(false);

        backPanel.setBackground(new java.awt.Color(255, 255, 255));
        backPanel.setPreferredSize(new java.awt.Dimension(1060, 680));
        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        invoiceTodayTabel.setModel(new javax.swing.table.DefaultTableModel(
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
        invoiceTodayTabel.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jScrollPane3.setViewportView(invoiceTodayTabel);

        jXPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 190));

        backPanel.add(jXPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 670, 190));

        jXLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jXLabel2.setForeground(new java.awt.Color(255, 102, 102));
        jXLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel2.setText("Yesteraday");
        jXLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        backPanel.add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 150, -1));

        jXPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        invoiceYesterdayTabel.setModel(new javax.swing.table.DefaultTableModel(
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
        invoiceYesterdayTabel.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jScrollPane2.setViewportView(invoiceYesterdayTabel);

        javax.swing.GroupLayout jXPanel2Layout = new javax.swing.GroupLayout(jXPanel2);
        jXPanel2.setLayout(jXPanel2Layout);
        jXPanel2Layout.setHorizontalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
        );
        jXPanel2Layout.setVerticalGroup(
            jXPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
        );

        backPanel.add(jXPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 440, 680, 200));

        jXLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel1.setText("Invoice");
        jXLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        backPanel.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 270, 40));

        previewBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        previewBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        previewBtn.setText("Choose another Date");
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
        backPanel.add(previewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 600, 210, 40));

        yesterdayLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yesterdayLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yesterdayLbl.setText("Date");
        yesterdayLbl.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        backPanel.add(yesterdayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 200, -1));

        TodaypreviewBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TodaypreviewBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TodaypreviewBtn.setText("Preview");
        TodaypreviewBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        TodaypreviewBtn.setOpaque(true);
        TodaypreviewBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TodaypreviewBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TodaypreviewBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TodaypreviewBtnMouseExited(evt);
            }
        });
        backPanel.add(TodaypreviewBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 150, 40));

        jXLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jXLabel9.setForeground(new java.awt.Color(255, 102, 102));
        jXLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel9.setText("Today");
        jXLabel9.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        backPanel.add(jXLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 110, -1));

        todayLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        todayLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        todayLbl.setText("Date");
        todayLbl.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        backPanel.add(todayLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 210, -1));

        yesterdaypreviewBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yesterdaypreviewBtn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yesterdaypreviewBtn1.setText("Preview");
        yesterdaypreviewBtn1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        yesterdaypreviewBtn1.setOpaque(true);
        yesterdaypreviewBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yesterdaypreviewBtn1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yesterdaypreviewBtn1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yesterdaypreviewBtn1MouseExited(evt);
            }
        });
        backPanel.add(yesterdaypreviewBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, 150, 40));

        jXLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 124, 105), 3));
        backPanel.add(jXLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 750, 300));

        jXLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 124, 105), 3));
        backPanel.add(jXLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 750, 290));

        multiPanel.add(backPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(multiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(multiPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TodaypreviewBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TodaypreviewBtnMouseClicked
        if (invoiceTodayTabel.getSelectedRow() == -1) {

            String content = "Select an Invoice No";
            JoptionMessageDialog dialog = new JoptionMessageDialog(null, true);
            dialog.getContent(content);
            return;
        }
        int selectedRow = invoiceTodayTabel.getSelectedRow();
        JasperUtil.init(InvoicePanel.class);
        JasperReportsContext ctx = JasperUtil.getReportContext();

        try {
            JasperReport compiledReport = JasperUtil.getCompiledReport("Invoice.jasper");

            JasperFillManager fillManager = JasperFillManager.getInstance(ctx);

            HashMap<String, Object> reportParams = new HashMap<>();

            reportParams.put("invoiceid", invoiceTodayTabel.getValueAt(selectedRow, 0));

            Connection connection = DBConnection.getInstance().getConnection();
            JasperPrint filledReport = fillManager.fill(compiledReport, reportParams, connection);

            IJSEJasperViewer frmJSEJasperViewer = new IJSEJasperViewer(filledReport);
            frmJSEJasperViewer.setTitle("Invoice");
            frmJSEJasperViewer.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
            frmJSEJasperViewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_TodaypreviewBtnMouseClicked

    private void TodaypreviewBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TodaypreviewBtnMouseEntered
        TodaypreviewBtn.setBackground(new Color(23, 114, 81));
        TodaypreviewBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_TodaypreviewBtnMouseEntered

    private void yesterdaypreviewBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesterdaypreviewBtn1MouseClicked
        if (invoiceYesterdayTabel.getSelectedRow() == -1) {

            String content = "Select an Invoice No";
            JoptionMessageDialog dialog = new JoptionMessageDialog(null, true);
            dialog.getContent(content);
            return;
        }
        int selectedRow = invoiceYesterdayTabel.getSelectedRow();
        JasperUtil.init(InvoicePanel.class);
        JasperReportsContext ctx = JasperUtil.getReportContext();

        try {
            JasperReport compiledReport = JasperUtil.getCompiledReport("Invoice.jasper");

            JasperFillManager fillManager = JasperFillManager.getInstance(ctx);

            HashMap<String, Object> reportParams = new HashMap<>();

            reportParams.put("invoiceid", invoiceYesterdayTabel.getValueAt(selectedRow, 0));

            Connection connection = DBConnection.getInstance().getConnection();
            JasperPrint filledReport = fillManager.fill(compiledReport, reportParams, connection);

            IJSEJasperViewer frmJSEJasperViewer = new IJSEJasperViewer(filledReport);
            frmJSEJasperViewer.setTitle("Invoice");
            frmJSEJasperViewer.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
            frmJSEJasperViewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_yesterdaypreviewBtn1MouseClicked

    private void yesterdaypreviewBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesterdaypreviewBtn1MouseEntered
        yesterdaypreviewBtn1.setBackground(new Color(23, 114, 81));
        yesterdaypreviewBtn1.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_yesterdaypreviewBtn1MouseEntered

    private void previewBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previewBtnMouseEntered
        previewBtn.setBackground(new Color(23, 114, 81));
        previewBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_previewBtnMouseEntered

    private void previewBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previewBtnMouseClicked
        InvoiceChooseDateDialog chooseDateDialog = new InvoiceChooseDateDialog(null, true);
        chooseDateDialog.setVisible(true);
    }//GEN-LAST:event_previewBtnMouseClicked

    private void previewBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previewBtnMouseExited
       previewBtn.setBackground(new Color(255, 255, 255));
        previewBtn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_previewBtnMouseExited

    private void yesterdaypreviewBtn1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesterdaypreviewBtn1MouseExited
        yesterdaypreviewBtn1.setBackground(new Color(255, 255, 255));
        yesterdaypreviewBtn1.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_yesterdaypreviewBtn1MouseExited

    private void TodaypreviewBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TodaypreviewBtnMouseExited
        TodaypreviewBtn.setBackground(new Color(255, 255, 255));
        TodaypreviewBtn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_TodaypreviewBtnMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXLabel TodaypreviewBtn;
    private org.jdesktop.swingx.JXPanel backPanel;
    private org.jdesktop.swingx.JXTable invoiceTodayTabel;
    private org.jdesktop.swingx.JXTable invoiceYesterdayTabel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXPanel jXPanel2;
    private org.jdesktop.swingx.JXPanel multiPanel;
    private org.jdesktop.swingx.JXLabel previewBtn;
    private org.jdesktop.swingx.JXLabel todayLbl;
    private org.jdesktop.swingx.JXLabel yesterdayLbl;
    private org.jdesktop.swingx.JXLabel yesterdaypreviewBtn1;
    // End of variables declaration//GEN-END:variables

    private void LoadTodayInvoices() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String curDate = sdf.format(date);
        todayLbl.setText(curDate);

        try {
            ArrayList<CustomDTO> invoiceList = InvoiceController.getDateInvoices(curDate);
            DefaultTableModel dtm = (DefaultTableModel) invoiceTodayTabel.getModel();
            dtm.setRowCount(0);
            if (invoiceList != null) {
                for (CustomDTO i : invoiceList) {
                    Object[] row = {i.getSoldInvoiceNo(), i.getCustomerName(), i.getBrand(), i.getModelName(), i.getSellingPrice()};
                    dtm.addRow(row);
                }

            }
        } catch (Exception ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Date yesterday() {
        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        return cal.getTime();
    }

    private String getYesterdayDateString() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        return dateFormat.format(yesterday());
    }

    private void LoadYesterdayInvoices() {
        String yesterday = getYesterdayDateString();
        yesterdayLbl.setText(yesterday);

        try {
            ArrayList<CustomDTO> invoiceList = InvoiceController.getDateInvoices(yesterday);
            DefaultTableModel dtm = (DefaultTableModel) invoiceYesterdayTabel.getModel();
            dtm.setRowCount(0);
            if (invoiceList != null) {
                for (CustomDTO i : invoiceList) {
                    Object[] row = {i.getSoldInvoiceNo(), i.getCustomerName(), i.getBrand(), i.getModelName(), i.getSellingPrice()};
                    dtm.addRow(row);
                }

            }
        } catch (Exception ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
