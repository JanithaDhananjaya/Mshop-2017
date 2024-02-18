/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.panels;

import com.project.mobileshop.controller.BatchController;
import com.project.mobileshop.controller.GRNController;
import com.project.mobileshop.controller.MobileDetailController;
import com.project.mobileshop.controller.ModelController;
import com.project.mobileshop.core.dto.BatchDTO;
import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.GRNDTO;
import com.project.mobileshop.core.dto.MobileDTO;
import com.project.mobileshop.core.dto.MobileDetailDTO;
import com.project.mobileshop.core.dto.ModelDTO;
import com.project.mobileshop.view.EditIMEINoDialog;
import com.project.mobileshop.view.JoptionMessageDialog;
import java.awt.Color;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Janitha Dhananjaya
 */
public class ManageMobilePanel extends javax.swing.JPanel {

    /**
     * Creates new form AddNewItemPanel
     */
    public ManageMobilePanel() {
        initComponents();
        start();
        LoadAllBrandNames();
    }

    public void start() {

    }

    public void LoadAllBrandNames() {
        try {
            ArrayList<ModelDTO> allBrands = ModelController.getBrands();
            if (allBrands != null) {
                for (ModelDTO a : allBrands) {
                    String brand = a.getBrand();
                    System.out.println(brand);
                    brandComboBox.addItem(brand);
                }
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageMobilePanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        InnerPanel = new org.jdesktop.swingx.JXPanel();
        iten_name_lbl1 = new javax.swing.JLabel();
        qty_on_hand_lbl2 = new javax.swing.JLabel();
        original_price_lbl5 = new javax.swing.JLabel();
        editBtn = new org.jdesktop.swingx.JXLabel();
        titleLbl = new org.jdesktop.swingx.JXLabel();
        batchComboBox = new org.jdesktop.swingx.JXComboBox();
        modelNameComboBox = new org.jdesktop.swingx.JXComboBox();
        originalPriceTxt = new org.jdesktop.swingx.JXTextField();
        qty_on_hand_lbl4 = new javax.swing.JLabel();
        sellingPriceTxt = new org.jdesktop.swingx.JXTextField();
        qty_on_hand_lbl5 = new javax.swing.JLabel();
        amountTxt = new org.jdesktop.swingx.JXTextField();
        qty_on_hand_lbl7 = new javax.swing.JLabel();
        qtyTxt = new org.jdesktop.swingx.JXTextField();
        qty_on_hand_lbl3 = new javax.swing.JLabel();
        brandComboBox = new org.jdesktop.swingx.JXComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        mobileTable = new org.jdesktop.swingx.JXTable();
        boaderLbl = new org.jdesktop.swingx.JXLabel();
        boaderLbl1 = new org.jdesktop.swingx.JXLabel();
        saveBtn = new org.jdesktop.swingx.JXLabel();

        jXLabel1.setText("jXLabel1");

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1060, 680));
        setPreferredSize(new java.awt.Dimension(1060, 680));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InnerPanel.setBackground(new java.awt.Color(255, 255, 255));
        InnerPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iten_name_lbl1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        iten_name_lbl1.setText("Model Name");
        InnerPanel.add(iten_name_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 120, 30));

        qty_on_hand_lbl2.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        qty_on_hand_lbl2.setText("Original Price");
        InnerPanel.add(qty_on_hand_lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 120, 30));

        original_price_lbl5.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        original_price_lbl5.setText("Batch");
        InnerPanel.add(original_price_lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 60, 30));

        editBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editBtn.setText("Edit");
        editBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        editBtn.setOpaque(true);
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editBtnMouseExited(evt);
            }
        });
        InnerPanel.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 550, 90, 40));

        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Manage Mobile");
        titleLbl.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        InnerPanel.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 280, 50));

        batchComboBox.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        batchComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                batchComboBoxItemStateChanged(evt);
            }
        });
        batchComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batchComboBoxActionPerformed(evt);
            }
        });
        InnerPanel.add(batchComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 180, 30));

        modelNameComboBox.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        modelNameComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modelNameComboBoxItemStateChanged(evt);
            }
        });
        modelNameComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelNameComboBoxActionPerformed(evt);
            }
        });
        InnerPanel.add(modelNameComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 180, 30));

        originalPriceTxt.setEditable(false);
        originalPriceTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        originalPriceTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        originalPriceTxt.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        originalPriceTxt.setOpaque(false);
        InnerPanel.add(originalPriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 120, 30));

        qty_on_hand_lbl4.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        qty_on_hand_lbl4.setForeground(new java.awt.Color(102, 0, 0));
        qty_on_hand_lbl4.setText("Selling Price");
        InnerPanel.add(qty_on_hand_lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 110, 30));

        sellingPriceTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        sellingPriceTxt.setForeground(new java.awt.Color(255, 51, 0));
        sellingPriceTxt.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        sellingPriceTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sellingPriceTxtMouseClicked(evt);
            }
        });
        sellingPriceTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sellingPriceTxtKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sellingPriceTxtKeyTyped(evt);
            }
        });
        InnerPanel.add(sellingPriceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 170, 110, 30));

        qty_on_hand_lbl5.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        qty_on_hand_lbl5.setText("Amount");
        InnerPanel.add(qty_on_hand_lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 170, 70, 30));

        amountTxt.setEditable(false);
        amountTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        amountTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        amountTxt.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        amountTxt.setOpaque(false);
        InnerPanel.add(amountTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, 140, 30));

        qty_on_hand_lbl7.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        qty_on_hand_lbl7.setText("Qty");
        InnerPanel.add(qty_on_hand_lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 40, 30));

        qtyTxt.setEditable(false);
        qtyTxt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        qtyTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        qtyTxt.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        qtyTxt.setOpaque(false);
        InnerPanel.add(qtyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 90, 30));

        qty_on_hand_lbl3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        qty_on_hand_lbl3.setText("Brand");
        InnerPanel.add(qty_on_hand_lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 60, 30));

        brandComboBox.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        brandComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                brandComboBoxItemStateChanged(evt);
            }
        });
        brandComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandComboBoxActionPerformed(evt);
            }
        });
        InnerPanel.add(brandComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 180, 30));

        mobileTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mobileTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IMEI No", "Colour", "Status", "Batch No"
            }
        ));
        mobileTable.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        mobileTable.setGridColor(new java.awt.Color(0, 0, 0));
        mobileTable.setRowHeight(25);
        mobileTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mobileTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mobileTable);

        InnerPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 720, 210));

        boaderLbl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 139, 120)), "Mobile Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Bright", 1, 12), new java.awt.Color(79, 139, 120))); // NOI18N
        InnerPanel.add(boaderLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 760, 280));

        boaderLbl1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(79, 139, 120)), "Model Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Lucida Bright", 1, 12), new java.awt.Color(79, 139, 120))); // NOI18N
        InnerPanel.add(boaderLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 980, 200));

        saveBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        saveBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saveBtn.setText("Save");
        saveBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        saveBtn.setOpaque(true);
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveBtnMouseExited(evt);
            }
        });
        InnerPanel.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 270, 90, 40));

        jXPanel1.add(InnerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 630));

        add(jXPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 630));
    }// </editor-fold>//GEN-END:initComponents

    private void brandComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandComboBoxActionPerformed

    private void brandComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_brandComboBoxItemStateChanged

        modelNameComboBox.removeAllItems();
        String brand = brandComboBox.getSelectedItem().toString();

        try {
            ArrayList<CustomDTO> all = ModelController.getModelNames(brand);
            if (all != null) {
                for (CustomDTO a : all) {
                    String modelName = a.getModelName();
                    modelNameComboBox.addItem(modelName);

                }
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageMobilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_brandComboBoxItemStateChanged

    private void sellingPriceTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellingPriceTxtKeyTyped
        char keyChar = evt.getKeyChar();
        String sellingPrice = sellingPriceTxt.getText();
        if (!Character.isDigit(keyChar)) {
            evt.consume();
        }
    }//GEN-LAST:event_sellingPriceTxtKeyTyped

    private void sellingPriceTxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sellingPriceTxtKeyPressed

    }//GEN-LAST:event_sellingPriceTxtKeyPressed

    private void sellingPriceTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sellingPriceTxtMouseClicked
        String value = sellingPriceTxt.getText().toString();
        if (value.equals("Set a selling Price")) {
            sellingPriceTxt.setText("");
            return;
        }

    }//GEN-LAST:event_sellingPriceTxtMouseClicked

    private void modelNameComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_modelNameComboBoxItemStateChanged
        batchComboBox.removeAllItems();

        if (modelNameComboBox.getSelectedIndex() == -1) {
            return;
        }
        String modelName = modelNameComboBox.getSelectedItem().toString();
        if (modelName != null) {
            try {
                ArrayList<BatchDTO> batchList = BatchController.getBatch(modelName);
                if (batchList != null) {
                    for (BatchDTO b : batchList) {
                        batchComboBox.addItem(b.getBatchNo());
                    }
                }

            } catch (Exception ex) {
                Logger.getLogger(ManageMobilePanel.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_modelNameComboBoxItemStateChanged

    private void batchComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_batchComboBoxItemStateChanged
        if (batchComboBox.getSelectedIndex() == -1) {
            return;
        }
        String batchNo = batchComboBox.getSelectedItem().toString();
        try {
            BatchDTO BatchDetails = BatchController.BatchDetails(batchNo);
            if (BatchDetails != null) {
                qtyTxt.setText(String.valueOf(BatchDetails.getQty()));
                originalPriceTxt.setText(String.valueOf(BatchDetails.getOriginalPrice()));
                System.out.println(BatchDetails.getSellingPrice().intValue() == 0);
                if (BatchDetails.getSellingPrice().intValue() == 0) {
                    sellingPriceTxt.setText("Set a selling Price");
                } else {
                    sellingPriceTxt.setText(String.valueOf(BatchDetails.getSellingPrice()));
                }
                amountTxt.setText(String.valueOf(BatchDetails.getAmount()));

                getModelNo = BatchDetails.getModelNo();

            }
        } catch (Exception ex) {
            Logger.getLogger(ManageMobilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_batchComboBoxItemStateChanged

    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked
        if (mobileTable.getSelectedRow() == -1) {
            String content = "Please Select a Mobile";
            JoptionMessageDialog dialog = new JoptionMessageDialog(null, true);
            dialog.getContent(content);
            return;
        }

        int selectedRow = mobileTable.getSelectedRow();
        MobileDetailDTO mobiledTO = new MobileDetailDTO();
        mobiledTO.setIMEIno(mobileTable.getValueAt(selectedRow, 0).toString());
        mobiledTO.setColur(mobileTable.getValueAt(selectedRow, 1).toString());
        mobiledTO.setBatchNo(mobileTable.getValueAt(selectedRow, 3).toString());

        ModelDTO modelDTO = new ModelDTO();
        modelDTO.setModelName(modelNameComboBox.getSelectedItem().toString());

        String modelno = null;
        String modelName = modelNameComboBox.getSelectedItem().toString();
        try {
            ModelDTO modelNo = ModelController.getModelDetails(modelName);
            if (modelNo != null) {
                modelno = modelNo.getModelNo();
            }
        } catch (Exception ex) {
            Logger.getLogger(ManageMobilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        modelDTO.setModelNo(modelno);

        EditIMEINoDialog dialog = new EditIMEINoDialog(null, true);
        dialog.getMobileDetails(modelDTO, mobiledTO);
        dialog.setVisible(true);
    }//GEN-LAST:event_editBtnMouseClicked

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        if (sellingPriceTxt.getText().trim().isEmpty()) {
            String content = "Please set a Selling Price";
            JoptionMessageDialog dialog = new JoptionMessageDialog(null, true);
            dialog.getContent(content);
            return;
        }

        try {
            BigDecimal sellingPrice = new BigDecimal(sellingPriceTxt.getText());
            String modelName = modelNameComboBox.getSelectedItem().toString();
            ModelDTO modelDetails = ModelController.getModelDetails(modelName);
            String modelNo = null;
            if (modelDetails != null) {
                modelNo = modelDetails.getModelNo();
            }
            BatchDTO batchDTO = new BatchDTO(
                    batchComboBox.getSelectedItem().toString(),
                    modelNo,
                    sellingPrice,
                    new BigDecimal(originalPriceTxt.getText()),
                    Integer.parseInt(qtyTxt.getText()),
                    new BigDecimal(amountTxt.getText())
            );

            boolean isUpdated = BatchController.updateBatch(batchDTO);
            if (isUpdated) {
                String content = "Selling Price set Successfully";
                JoptionMessageDialog dialog = new JoptionMessageDialog(null, true);
                dialog.getContent(content);
            } else {
                String content = "ERROR!";
                JoptionMessageDialog dialog = new JoptionMessageDialog(null, true);
                dialog.getContent(content);
            }

        } catch (Exception ex) {
            Logger.getLogger(ManageMobilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_saveBtnMouseClicked

    private void modelNameComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelNameComboBoxActionPerformed

        if (modelNameComboBox.getSelectedIndex() == -1) {
            return;
        }
        String modelName = modelNameComboBox.getSelectedItem().toString();

        try {
            ArrayList<MobileDetailDTO> choosedIMEINo = MobileDetailController.getChoosedIMEINo(modelName);
            if (choosedIMEINo != null) {
                dtm = (DefaultTableModel) mobileTable.getModel();
                dtm.setRowCount(0);
                for (MobileDetailDTO c : choosedIMEINo) {
                    if (c.getStatus().equals("not sell")) {
                        Object[] row = {c.getIMEIno(), c.getColur(), c.getStatus(), c.getBatchNo()};
                        dtm.addRow(row);
                    }
                }

            }
        } catch (Exception ex) {
            Logger.getLogger(ManageMobilePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modelNameComboBoxActionPerformed

    private void batchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batchComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_batchComboBoxActionPerformed

    private void saveBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseEntered
        saveBtn.setBackground(new Color(23, 114, 81));
        saveBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_saveBtnMouseEntered

    private void saveBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseExited
        saveBtn.setBackground(new Color(255, 255, 255));
        saveBtn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_saveBtnMouseExited

    private void editBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseExited
        editBtn.setBackground(new Color(255, 255, 255));
        editBtn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_editBtnMouseExited

    private void editBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseEntered
        editBtn.setBackground(new Color(23, 114, 81));
        editBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_editBtnMouseEntered

    private void mobileTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mobileTableMouseClicked
        int disabledRow = mobileTable.getSelectedRow();

    }//GEN-LAST:event_mobileTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXPanel InnerPanel;
    private org.jdesktop.swingx.JXTextField amountTxt;
    private org.jdesktop.swingx.JXComboBox batchComboBox;
    private org.jdesktop.swingx.JXLabel boaderLbl;
    private org.jdesktop.swingx.JXLabel boaderLbl1;
    private org.jdesktop.swingx.JXComboBox brandComboBox;
    private org.jdesktop.swingx.JXLabel editBtn;
    private javax.swing.JLabel iten_name_lbl1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXTable mobileTable;
    private org.jdesktop.swingx.JXComboBox modelNameComboBox;
    private org.jdesktop.swingx.JXTextField originalPriceTxt;
    private javax.swing.JLabel original_price_lbl5;
    private org.jdesktop.swingx.JXTextField qtyTxt;
    private javax.swing.JLabel qty_on_hand_lbl2;
    private javax.swing.JLabel qty_on_hand_lbl3;
    private javax.swing.JLabel qty_on_hand_lbl4;
    private javax.swing.JLabel qty_on_hand_lbl5;
    private javax.swing.JLabel qty_on_hand_lbl7;
    private org.jdesktop.swingx.JXLabel saveBtn;
    private org.jdesktop.swingx.JXTextField sellingPriceTxt;
    private org.jdesktop.swingx.JXLabel titleLbl;
    // End of variables declaration//GEN-END:variables
    private int nextBtnDisabled = 0;
    private DefaultTableModel dtm = null;
    private int selectedRow = 0;
    private String getModelNo = null;
    private int qty = 1;
}
