/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.view;

import com.project.mobileshop.controller.GRNController;
import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.GRNDTO;
import com.project.mobileshop.db.DBConnection;
import com.project.mobileshop.panels.AddGRN;
import java.awt.Color;
import java.awt.Dialog;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class GRNItemDetailsDailog extends javax.swing.JDialog {

    /**
     * Creates new form CloseDialog
     */
    public GRNItemDetailsDailog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setBackground(new Color(0, 0, 0, 0.7f));
    }

    public void getGRN(GRNDTO grndto) {
        GRNNoTxt.setText(grndto.getGRNId());
        dateTxt.setText(grndto.getGRNDate());
        supplierIdTxt.setText(grndto.getSupplierId());

        String grnId = grndto.getGRNId();

        try {
            ArrayList<CustomDTO> grnDetails = GRNController.getGRNDetails(grnId);
            if (grnDetails != null) {
                DefaultTableModel dtm = (DefaultTableModel) itemTable.getModel();
                dtm.setRowCount(0);
                for (CustomDTO g : grnDetails) {
                    Object[] row = {g.getModelNo(), g.getModelName(), g.getDeliveredQty(), g.getItemPrice()};
                    dtm.addRow(row);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(GRNItemDetailsDailog.class.getName()).log(Level.SEVERE, null, ex);
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

        backPanel = new org.jdesktop.swingx.JXPanel();
        titletxt = new org.jdesktop.swingx.JXLabel();
        titleLbl = new org.jdesktop.swingx.JXLabel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        GRNNoTxt = new org.jdesktop.swingx.JXTextField();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        dateTxt = new org.jdesktop.swingx.JXTextField();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        supplierIdTxt = new org.jdesktop.swingx.JXTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemTable = new org.jdesktop.swingx.JXTable();
        OKBtn = new org.jdesktop.swingx.JXLabel();
        printBtn = new org.jdesktop.swingx.JXLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        backPanel.setBackground(new java.awt.Color(255, 255, 255));
        backPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titletxt.setForeground(new java.awt.Color(255, 255, 255));
        titletxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titletxt.setText("Item Details");
        titletxt.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        backPanel.add(titletxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 250, 40));

        titleLbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/project/mobileshop/images/Images/GRn Item Title Bar.jpg"))); // NOI18N
        backPanel.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 60));

        jXLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel1.setText("GRN No");
        jXLabel1.setToolTipText("");
        jXLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        backPanel.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 100, 30));

        GRNNoTxt.setEditable(false);
        GRNNoTxt.setBackground(new java.awt.Color(255, 255, 255));
        GRNNoTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        GRNNoTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        GRNNoTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        GRNNoTxt.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        GRNNoTxt.setMargin(new java.awt.Insets(0, 0, 2, 0));
        backPanel.add(GRNNoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 90, 30));

        jXLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel2.setText("Date");
        jXLabel2.setToolTipText("");
        jXLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        backPanel.add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 100, 30));

        dateTxt.setEditable(false);
        dateTxt.setBackground(new java.awt.Color(255, 255, 255));
        dateTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        dateTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dateTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        dateTxt.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        dateTxt.setMargin(new java.awt.Insets(0, 0, 2, 0));
        backPanel.add(dateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 140, 30));

        jXLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel3.setText("Supplier ID");
        jXLabel3.setToolTipText("");
        jXLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        backPanel.add(jXLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, 130, 30));

        supplierIdTxt.setEditable(false);
        supplierIdTxt.setBackground(new java.awt.Color(255, 255, 255));
        supplierIdTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        supplierIdTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        supplierIdTxt.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        supplierIdTxt.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        supplierIdTxt.setMargin(new java.awt.Insets(0, 0, 2, 0));
        supplierIdTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierIdTxtActionPerformed(evt);
            }
        });
        backPanel.add(supplierIdTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 140, 30));

        itemTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        itemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Model No", "Model Name", "Delivered Qty", "Uniit Price"
            }
        ));
        itemTable.setColumnMargin(3);
        itemTable.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        itemTable.setGridColor(new java.awt.Color(0, 0, 0));
        itemTable.setRowHeight(25);
        itemTable.setRowMargin(3);
        itemTable.setSelectionBackground(new java.awt.Color(153, 255, 153));
        itemTable.setShowGrid(true);
        jScrollPane1.setViewportView(itemTable);

        backPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 800, 220));

        OKBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        OKBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OKBtn.setText("OK");
        OKBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        OKBtn.setOpaque(true);
        OKBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OKBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OKBtnMouseExited(evt);
            }
        });
        backPanel.add(OKBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 120, 40));

        printBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        printBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        printBtn.setText("Print");
        printBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        printBtn.setOpaque(true);
        printBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printBtnMouseExited(evt);
            }
        });
        backPanel.add(printBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 410, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(266, Short.MAX_VALUE)
                .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 264, 264))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        setBounds(0, 90, 1370, 680);
    }// </editor-fold>//GEN-END:initComponents

    private void supplierIdTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierIdTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierIdTxtActionPerformed

    private void OKBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKBtnMouseClicked
        dispose();
    }//GEN-LAST:event_OKBtnMouseClicked

    private void printBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printBtnMouseClicked

        JasperUtil.init(GRNItemDetailsDailog.class);

        JasperReportsContext ctx = JasperUtil.getReportContext();

        try {
            JasperReport compiledReport = JasperUtil.getCompiledReport("ViewGRN.jasper");

            JasperFillManager fillManager = JasperFillManager.getInstance(ctx);

            HashMap<String, Object> reportParams = new HashMap<>();

            reportParams.put("grnno", GRNNoTxt.getText());
            for (int i = 0; i < itemTable.getRowCount(); i++) {
                reportParams.put("deliveredQty", itemTable.getValueAt(i, 2).toString());
            }

            Connection connection = DBConnection.getInstance().getConnection();
            JasperPrint filledReport = fillManager.fill(compiledReport, reportParams, connection);

            IJSEJasperViewer frmJSEJasperViewer = new IJSEJasperViewer(filledReport);
            frmJSEJasperViewer.setTitle("GRN Details Report");
            frmJSEJasperViewer.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
            frmJSEJasperViewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(GRNItemDetailsDailog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printBtnMouseClicked

    private void OKBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKBtnMouseEntered
        OKBtn.setBackground(new Color(23, 114, 81));
        OKBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_OKBtnMouseEntered

    private void printBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printBtnMouseEntered
        printBtn.setBackground(new Color(23, 114, 81));
        printBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_printBtnMouseEntered

    private void OKBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKBtnMouseExited
        OKBtn.setBackground(new Color(255, 255, 255));
        OKBtn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_OKBtnMouseExited

    private void printBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printBtnMouseExited
        printBtn.setBackground(new Color(255, 255, 255));
        printBtn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_printBtnMouseExited

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
            java.util.logging.Logger.getLogger(GRNItemDetailsDailog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GRNItemDetailsDailog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GRNItemDetailsDailog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GRNItemDetailsDailog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                GRNItemDetailsDailog dialog = new GRNItemDetailsDailog(new javax.swing.JFrame(), true);
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
    private org.jdesktop.swingx.JXTextField GRNNoTxt;
    private org.jdesktop.swingx.JXLabel OKBtn;
    private org.jdesktop.swingx.JXPanel backPanel;
    private org.jdesktop.swingx.JXTextField dateTxt;
    private org.jdesktop.swingx.JXTable itemTable;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel printBtn;
    private org.jdesktop.swingx.JXTextField supplierIdTxt;
    private org.jdesktop.swingx.JXLabel titleLbl;
    private org.jdesktop.swingx.JXLabel titletxt;
    // End of variables declaration//GEN-END:variables
}
