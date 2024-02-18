/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.panels;

import com.project.mobileshop.controller.MobileDetailController;
import com.project.mobileshop.controller.ModelController;
import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.ModelDTO;
import com.project.mobileshop.db.DBConnection;
import java.awt.Color;
import java.awt.Dialog;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import lk.ijse.jasper.IJSEJasperViewer;
import lk.ijse.jasper.JasperUtil;
import lk.ijse.jasper.Report;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;

/**
 *
 * @author Janitha Dhananjaya
 */
@Report("com.project.mobileshop.report")
public class QuickSearchPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuickSearchPanel
     */
    public QuickSearchPanel() {
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

        backPanel = new org.jdesktop.swingx.JXPanel();
        repeirDetailsPanel = new org.jdesktop.swingx.JXPanel();
        mostSoldModelBtn = new javax.swing.JLabel();
        notSellModelBtn = new javax.swing.JLabel();
        lowSoldModelBtn = new javax.swing.JLabel();
        Title_lbl1 = new org.jdesktop.swingx.JXLabel();
        tablePanel = new org.jdesktop.swingx.JXPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modeltable = new org.jdesktop.swingx.JXTable();

        setPreferredSize(new java.awt.Dimension(1060, 680));

        backPanel.setBackground(new java.awt.Color(255, 255, 255));
        backPanel.setPreferredSize(new java.awt.Dimension(1020, 680));
        backPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        repeirDetailsPanel.setBackground(new java.awt.Color(255, 255, 255));
        repeirDetailsPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 114, 81), 2), "Search From", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Bright", 1, 14))); // NOI18N
        repeirDetailsPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mostSoldModelBtn.setBackground(new java.awt.Color(255, 255, 255));
        mostSoldModelBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        mostSoldModelBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostSoldModelBtn.setText("Most Sold Models");
        mostSoldModelBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mostSoldModelBtn.setOpaque(true);
        mostSoldModelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostSoldModelBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostSoldModelBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mostSoldModelBtnMouseExited(evt);
            }
        });
        repeirDetailsPanel.add(mostSoldModelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 210, 50));

        notSellModelBtn.setBackground(new java.awt.Color(255, 255, 255));
        notSellModelBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        notSellModelBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        notSellModelBtn.setText("Not Sold Models");
        notSellModelBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        notSellModelBtn.setOpaque(true);
        notSellModelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notSellModelBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                notSellModelBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                notSellModelBtnMouseExited(evt);
            }
        });
        repeirDetailsPanel.add(notSellModelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 200, 50));

        lowSoldModelBtn.setBackground(new java.awt.Color(255, 255, 255));
        lowSoldModelBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        lowSoldModelBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lowSoldModelBtn.setText("Low Sold Models");
        lowSoldModelBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lowSoldModelBtn.setOpaque(true);
        lowSoldModelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lowSoldModelBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lowSoldModelBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lowSoldModelBtnMouseExited(evt);
            }
        });
        lowSoldModelBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lowSoldModelBtnKeyPressed(evt);
            }
        });
        repeirDetailsPanel.add(lowSoldModelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 40, 210, 50));

        backPanel.add(repeirDetailsPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 930, 130));

        Title_lbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title_lbl1.setText("Quick Search");
        Title_lbl1.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        backPanel.add(Title_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 270, 30));

        tablePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        modeltable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Brand", "Model Name", "Model No", "Sold Qty", "Delivered Qty"
            }
        ));
        modeltable.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        modeltable.setGridColor(new java.awt.Color(0, 0, 0));
        modeltable.setRowHeight(25);
        jScrollPane1.setViewportView(modeltable);

        tablePanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 340));

        backPanel.add(tablePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 930, 340));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(backPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mostSoldModelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostSoldModelBtnMouseClicked
        try {
            ArrayList<CustomDTO> mostSoldModels = MobileDetailController.mostSoldModel();
            if (mostSoldModels != null) {
                DefaultTableModel dtm = (DefaultTableModel) modeltable.getModel();
                dtm.setRowCount(0);
                for (CustomDTO c : mostSoldModels) {
                    Object[] row = {c.getBrand(), c.getModelName(), c.getModelNo(), c.getSoldQty(), c.getDeliveredQty() + c.getSoldQty()};
                    dtm.addRow(row);

                }
            }

        } catch (Exception ex) {
            Logger.getLogger(QuickSearchPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_mostSoldModelBtnMouseClicked

    private void lowSoldModelBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lowSoldModelBtnKeyPressed

    }//GEN-LAST:event_lowSoldModelBtnKeyPressed

    private void lowSoldModelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowSoldModelBtnMouseClicked
        try {
            ArrayList<CustomDTO> lowSoldModel = MobileDetailController.lowSoldModel();
            if (lowSoldModel != null) {
                DefaultTableModel dtm = (DefaultTableModel) modeltable.getModel();
                dtm.setRowCount(0);
                for (CustomDTO c : lowSoldModel) {
                    Object[] row = {c.getBrand(), c.getModelName(), c.getModelNo(), c.getSoldQty(), c.getDeliveredQty() + c.getSoldQty()};
                    dtm.addRow(row);
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(QuickSearchPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lowSoldModelBtnMouseClicked

    private void notSellModelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notSellModelBtnMouseClicked
        try {
            ArrayList<CustomDTO> notSellModels = MobileDetailController.allNotSellModels();
            ArrayList<CustomDTO> allSoldModels = MobileDetailController.allSoldModels();

            if (notSellModels != null && allSoldModels != null) {
                dtm = (DefaultTableModel) modeltable.getModel();
                dtm.setRowCount(0);
                
                for (CustomDTO notSell : notSellModels) {
                    boolean exist = false;
                    System.out.println("not sell :" + notSell.getModelName());
                    for (CustomDTO sold : allSoldModels) {
                        if (notSell.getModelName().equals(sold.getModelName())) {
                            System.out.println("Sold :" + sold.getModelName());
                            exist = true;
                            break;
                        }
                    }
                    if (exist==false) {
                        System.out.println("add :" + notSell.getModelName());
                        Object[] row = {notSell.getBrand(), notSell.getModelName(), notSell.getModelNo(), "0", notSell.getDeliveredQty()};
                        dtm.addRow(row);
                    }

                }

            }
        } catch (Exception ex) {
            Logger.getLogger(QuickSearchPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_notSellModelBtnMouseClicked

    private void mostSoldModelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostSoldModelBtnMouseEntered
        mostSoldModelBtn.setBackground(new Color(23, 114, 81));
        mostSoldModelBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_mostSoldModelBtnMouseEntered

    private void lowSoldModelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowSoldModelBtnMouseEntered
        lowSoldModelBtn.setBackground(new Color(23, 114, 81));
        lowSoldModelBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_lowSoldModelBtnMouseEntered

    private void notSellModelBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notSellModelBtnMouseEntered
        notSellModelBtn.setBackground(new Color(23, 114, 81));
        notSellModelBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_notSellModelBtnMouseEntered

    private void mostSoldModelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostSoldModelBtnMouseExited
        mostSoldModelBtn.setBackground(new Color(255, 255, 255));
        mostSoldModelBtn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_mostSoldModelBtnMouseExited

    private void lowSoldModelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lowSoldModelBtnMouseExited
        lowSoldModelBtn.setBackground(new Color(255, 255, 255));
        lowSoldModelBtn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_lowSoldModelBtnMouseExited

    private void notSellModelBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notSellModelBtnMouseExited
        notSellModelBtn.setBackground(new Color(255, 255, 255));
        notSellModelBtn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_notSellModelBtnMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXLabel Title_lbl1;
    private org.jdesktop.swingx.JXPanel backPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lowSoldModelBtn;
    private org.jdesktop.swingx.JXTable modeltable;
    private javax.swing.JLabel mostSoldModelBtn;
    private javax.swing.JLabel notSellModelBtn;
    private org.jdesktop.swingx.JXPanel repeirDetailsPanel;
    private org.jdesktop.swingx.JXPanel tablePanel;
    // End of variables declaration//GEN-END:variables
    private DefaultTableModel dtm = null;
}