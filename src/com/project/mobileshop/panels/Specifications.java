/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.panels;

import com.project.mobileshop.controller.ModelController;
import com.project.mobileshop.controller.SpecificationController;
import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.ModelDTO;
import com.project.mobileshop.core.dto.SpecificationsDTO;
import com.project.mobileshop.idgeneretor.IDGenerator;
import com.project.mobileshop.view.EditCustomerDialog;
import com.project.mobileshop.view.EditIMEINoDialog;
import com.project.mobileshop.view.JoptionMessageDialog;
import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.DatePicker;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Janitha Dhananjaya
 */
public class Specifications extends javax.swing.JPanel {

    /**
     * Creates new form UpdateItemPanel
     */
    public Specifications() {
        initComponents();
        LoadBrands();
        generateSpecificationsID();

    }

    public void generateSpecificationsID() {
        try {
            specificationSNoTxt.setText(IDGenerator.getNewID("specifications", "specifyId", "M"));
        } catch (SQLException ex) {
            Logger.getLogger(OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void LoadBrands() {
        try {
            ArrayList<ModelDTO> LoadModelNos = ModelController.getBrands();
            for (ModelDTO M : LoadModelNos) {
                brandCombo.addItem(M.getBrand());
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jXTable1 = new org.jdesktop.swingx.JXTable();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        updateItempanel = new org.jdesktop.swingx.JXPanel();
        item_code_lbl = new javax.swing.JLabel();
        qty_on_hand_lbl1 = new javax.swing.JLabel();
        titleLbl = new org.jdesktop.swingx.JXLabel();
        brandCombo = new org.jdesktop.swingx.JXComboBox();
        item_code_lbl1 = new javax.swing.JLabel();
        jXLabel1 = new org.jdesktop.swingx.JXLabel();
        displaySizeTxt = new javax.swing.JTextField();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        modelNoTxt = new javax.swing.JTextField();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        specificationSNoTxt = new javax.swing.JTextField();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        memoryTxt = new javax.swing.JTextField();
        jXLabel5 = new org.jdesktop.swingx.JXLabel();
        networkTxt = new javax.swing.JTextField();
        primarytxt = new javax.swing.JTextField();
        jXLabel6 = new org.jdesktop.swingx.JXLabel();
        jXLabel7 = new org.jdesktop.swingx.JXLabel();
        secondaryTxt = new javax.swing.JTextField();
        ramTxt = new javax.swing.JTextField();
        jXLabel8 = new org.jdesktop.swingx.JXLabel();
        simTxt = new javax.swing.JTextField();
        jXLabel9 = new org.jdesktop.swingx.JXLabel();
        jXLabel10 = new org.jdesktop.swingx.JXLabel();
        cpuTxt = new javax.swing.JTextField();
        addBtn = new org.jdesktop.swingx.JXLabel();
        sensorTxt = new javax.swing.JTextField();
        jXLabel12 = new org.jdesktop.swingx.JXLabel();
        editBtn = new org.jdesktop.swingx.JXLabel();
        operatingSystemTxt = new javax.swing.JTextField();
        modelNameCmb = new org.jdesktop.swingx.JXComboBox();
        jXLabel11 = new org.jdesktop.swingx.JXLabel();
        jXLabel13 = new org.jdesktop.swingx.JXLabel();
        jXLabel14 = new org.jdesktop.swingx.JXLabel();
        jXLabel15 = new org.jdesktop.swingx.JXLabel();
        jXLabel16 = new org.jdesktop.swingx.JXLabel();
        jXLabel17 = new org.jdesktop.swingx.JXLabel();
        saveBtn = new org.jdesktop.swingx.JXLabel();
        dialogBox_Panel = new org.jdesktop.swingx.JXPanel();
        EditIEMIPanel = new org.jdesktop.swingx.JXPanel();

        jXTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jXTable1);

        setPreferredSize(new java.awt.Dimension(1060, 680));

        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        updateItempanel.setBackground(new java.awt.Color(255, 255, 255));
        updateItempanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        item_code_lbl.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        item_code_lbl.setText("Model Name");
        updateItempanel.add(item_code_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 120, 30));

        qty_on_hand_lbl1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        qty_on_hand_lbl1.setText("Brand");
        updateItempanel.add(qty_on_hand_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 60, 30));

        titleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLbl.setText("Specifications");
        titleLbl.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        updateItempanel.add(titleLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 290, 50));

        brandCombo.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        brandCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                brandComboItemStateChanged(evt);
            }
        });
        brandCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandComboActionPerformed(evt);
            }
        });
        updateItempanel.add(brandCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 240, 40));

        item_code_lbl1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        item_code_lbl1.setText("Model No");
        updateItempanel.add(item_code_lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 120, 30));

        jXLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        jXLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel1.setText("GHz");
        jXLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        updateItempanel.add(jXLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, 50, 30));

        displaySizeTxt.setEditable(false);
        displaySizeTxt.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        displaySizeTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        displaySizeTxt.setOpaque(false);
        displaySizeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displaySizeTxtActionPerformed(evt);
            }
        });
        updateItempanel.add(displaySizeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 180, 30));

        jXLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel2.setText("Display Size");
        jXLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        updateItempanel.add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 130, 30));

        modelNoTxt.setEditable(false);
        modelNoTxt.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        modelNoTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        modelNoTxt.setOpaque(false);
        modelNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelNoTxtActionPerformed(evt);
            }
        });
        updateItempanel.add(modelNoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 90, 140, 40));

        jXLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel3.setText("Operating System");
        jXLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        updateItempanel.add(jXLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 180, 30));

        specificationSNoTxt.setEditable(false);
        specificationSNoTxt.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        specificationSNoTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        specificationSNoTxt.setOpaque(false);
        specificationSNoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                specificationSNoTxtActionPerformed(evt);
            }
        });
        updateItempanel.add(specificationSNoTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 110, -1));

        jXLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel4.setText("Internal Memeory");
        jXLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        updateItempanel.add(jXLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 180, 30));

        memoryTxt.setEditable(false);
        memoryTxt.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        memoryTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        memoryTxt.setOpaque(false);
        memoryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryTxtActionPerformed(evt);
            }
        });
        updateItempanel.add(memoryTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 180, 30));

        jXLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel5.setText("Nerwork");
        jXLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        updateItempanel.add(jXLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 100, 30));

        networkTxt.setEditable(false);
        networkTxt.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        networkTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        networkTxt.setOpaque(false);
        networkTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkTxtActionPerformed(evt);
            }
        });
        updateItempanel.add(networkTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, 180, 30));

        primarytxt.setEditable(false);
        primarytxt.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        primarytxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        primarytxt.setOpaque(false);
        primarytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                primarytxtActionPerformed(evt);
            }
        });
        updateItempanel.add(primarytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 180, 30));

        jXLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel6.setText("Primary ");
        jXLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        updateItempanel.add(jXLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 90, 30));

        jXLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel7.setText("Secondary");
        jXLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        updateItempanel.add(jXLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 350, 130, 30));

        secondaryTxt.setEditable(false);
        secondaryTxt.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        secondaryTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        secondaryTxt.setOpaque(false);
        secondaryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondaryTxtActionPerformed(evt);
            }
        });
        updateItempanel.add(secondaryTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, 180, 30));

        ramTxt.setEditable(false);
        ramTxt.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        ramTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ramTxt.setOpaque(false);
        ramTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramTxtActionPerformed(evt);
            }
        });
        updateItempanel.add(ramTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 410, 180, 30));

        jXLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel8.setText("RAM");
        jXLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        updateItempanel.add(jXLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 70, 30));

        simTxt.setEditable(false);
        simTxt.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        simTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        simTxt.setOpaque(false);
        simTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simTxtActionPerformed(evt);
            }
        });
        updateItempanel.add(simTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 180, 30));

        jXLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel9.setText("Sim");
        jXLabel9.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        updateItempanel.add(jXLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 410, 70, 30));

        jXLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel10.setText("CPU");
        jXLabel10.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        updateItempanel.add(jXLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 70, 30));

        cpuTxt.setEditable(false);
        cpuTxt.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        cpuTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cpuTxt.setOpaque(false);
        cpuTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpuTxtActionPerformed(evt);
            }
        });
        updateItempanel.add(cpuTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 180, 30));

        addBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBtn.setText("Add Features");
        addBtn.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        addBtn.setOpaque(true);
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBtnMouseExited(evt);
            }
        });
        updateItempanel.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 530, 160, 50));

        sensorTxt.setEditable(false);
        sensorTxt.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        sensorTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sensorTxt.setOpaque(false);
        sensorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sensorTxtActionPerformed(evt);
            }
        });
        updateItempanel.add(sensorTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 180, 30));

        jXLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel12.setText("Sensor");
        jXLabel12.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        updateItempanel.add(jXLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 70, 30));

        editBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        editBtn.setText("Edit Features");
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
        updateItempanel.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, 140, 50));

        operatingSystemTxt.setEditable(false);
        operatingSystemTxt.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        operatingSystemTxt.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        operatingSystemTxt.setOpaque(false);
        operatingSystemTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operatingSystemTxtActionPerformed(evt);
            }
        });
        updateItempanel.add(operatingSystemTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 180, 30));

        modelNameCmb.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        modelNameCmb.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modelNameCmbItemStateChanged(evt);
            }
        });
        modelNameCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelNameCmbActionPerformed(evt);
            }
        });
        updateItempanel.add(modelNameCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, 240, 40));

        jXLabel11.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        jXLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel11.setText("inches");
        jXLabel11.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        updateItempanel.add(jXLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 50, 30));

        jXLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        jXLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel13.setText("GB");
        jXLabel13.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        updateItempanel.add(jXLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, 50, 30));

        jXLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        jXLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel14.setText("MP");
        jXLabel14.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        updateItempanel.add(jXLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 50, 30));

        jXLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        jXLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel15.setText("MP");
        jXLabel15.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        updateItempanel.add(jXLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 350, 50, 30));

        jXLabel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 0, 0)));
        jXLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jXLabel16.setText("GB");
        jXLabel16.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        updateItempanel.add(jXLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 410, 50, 30));

        jXLabel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(23, 114, 81), 2), "Model Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Bright", 1, 14))); // NOI18N
        updateItempanel.add(jXLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 1020, 110));

        saveBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        saveBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saveBtn.setText("Save Changes");
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
        updateItempanel.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 530, 150, 50));

        jXPanel1.add(updateItempanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 680));
        jXPanel1.add(dialogBox_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 580));

        javax.swing.GroupLayout EditIEMIPanelLayout = new javax.swing.GroupLayout(EditIEMIPanel);
        EditIEMIPanel.setLayout(EditIEMIPanelLayout);
        EditIEMIPanelLayout.setHorizontalGroup(
            EditIEMIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
        );
        EditIEMIPanelLayout.setVerticalGroup(
            EditIEMIPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jXPanel1.add(EditIEMIPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1020, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jXPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void brandComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandComboActionPerformed
        modelNameCmb.removeAllItems();
        if (brandCombo.getSelectedIndex() == -1) {
            return;
        }
        String brand = brandCombo.getSelectedItem().toString();
        try {
            ArrayList<CustomDTO> all = ModelController.getModelNames(brand);
            if (all != null) {
                for (CustomDTO a : all) {
                    modelNameCmb.addItem(a.getModelName());

                }

            }
        } catch (Exception ex) {
            Logger.getLogger(Stock.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_brandComboActionPerformed

    private void displaySizeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displaySizeTxtActionPerformed
        operatingSystemTxt.requestFocus();
    }//GEN-LAST:event_displaySizeTxtActionPerformed

    private void modelNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelNoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelNoTxtActionPerformed

    private void specificationSNoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_specificationSNoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_specificationSNoTxtActionPerformed

    private void memoryTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryTxtActionPerformed
        networkTxt.requestFocus();
    }//GEN-LAST:event_memoryTxtActionPerformed

    private void networkTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkTxtActionPerformed
        primarytxt.requestFocus();
    }//GEN-LAST:event_networkTxtActionPerformed

    private void primarytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_primarytxtActionPerformed
        secondaryTxt.requestFocus();
    }//GEN-LAST:event_primarytxtActionPerformed

    private void secondaryTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondaryTxtActionPerformed
        ramTxt.requestFocus();
    }//GEN-LAST:event_secondaryTxtActionPerformed

    private void ramTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramTxtActionPerformed
        simTxt.requestFocus();
    }//GEN-LAST:event_ramTxtActionPerformed

    private void simTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simTxtActionPerformed
        cpuTxt.requestFocus();
    }//GEN-LAST:event_simTxtActionPerformed

    private void cpuTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpuTxtActionPerformed
        sensorTxt.requestFocus();
    }//GEN-LAST:event_cpuTxtActionPerformed

    private void sensorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sensorTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sensorTxtActionPerformed

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
        String speciId = specificationSNoTxt.getText();
        String modelNo = modelNoTxt.getText();

        String disSize = displaySizeTxt.getText();
        String OS = specificationSNoTxt.getText();
        String memory = memoryTxt.getText();
        String network = networkTxt.getText();
        String priCam = primarytxt.getText();
        String secCam = secondaryTxt.getText();
        String Ram = ramTxt.getText();
        String sim = simTxt.getText();
        String cpu = cpuTxt.getText();
        String sensor = sensorTxt.getText();

        if (disSize.trim().isEmpty() || OS.trim().isEmpty() || memory.trim().isEmpty() || network.trim().isEmpty() || priCam.trim().isEmpty()
                || secCam.trim().isEmpty() || Ram.trim().isEmpty() || sim.trim().isEmpty() || cpu.trim().isEmpty() || sensor.trim().isEmpty()) {
            String content = "Fill all Text Fields";
            JoptionMessageDialog dialog = new JoptionMessageDialog(null, true);
            dialog.getContent(content);
            return;
        }

        SpecificationsDTO specificationsDTO = new SpecificationsDTO(speciId, modelNo, disSize, priCam, memory, network, priCam, secCam, Ram, sim, cpu, sensor);

        try {
            boolean isAdded = SpecificationController.addSpecifications(specificationsDTO);
            if (isAdded) {
                String content = "Specifications Added Successfully";
                JoptionMessageDialog dialog = new JoptionMessageDialog(null, true);
                dialog.getContent(content);
            } else {
                String content = "ERROR!";
                JoptionMessageDialog dialog = new JoptionMessageDialog(null, true);
                dialog.getContent(content);
            }
        } catch (Exception ex) {
            Logger.getLogger(Specifications.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_addBtnMouseClicked

    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked
        displaySizeTxt.setEditable(true);
        cpuTxt.setEditable(true);
        memoryTxt.setEditable(true);
        networkTxt.setEditable(true);
        operatingSystemTxt.setEditable(true);
        primarytxt.setEditable(true);
        secondaryTxt.setEditable(true);
        ramTxt.setEditable(true);
        secondaryTxt.setEditable(true);
        simTxt.setEditable(true);
        sensorTxt.setEditable(true);

        if (displaySizeTxt.getText().equals("Not Set") && memoryTxt.getText().equals("Not Set")
                && operatingSystemTxt.getText().equals("Not Set")) {
            displaySizeTxt.setText("");
            cpuTxt.setText("");
            memoryTxt.setText("");
            networkTxt.setText("");
            operatingSystemTxt.setText("");
            secondaryTxt.setText("");
            ramTxt.setText("");
            primarytxt.setText("");
            simTxt.setText("");
            sensorTxt.setText("");
            return;
        }
        


    }//GEN-LAST:event_editBtnMouseClicked

    private void operatingSystemTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operatingSystemTxtActionPerformed
        memoryTxt.requestFocus();
    }//GEN-LAST:event_operatingSystemTxtActionPerformed

    private void brandComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_brandComboItemStateChanged

    }//GEN-LAST:event_brandComboItemStateChanged

    private void modelNameCmbItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_modelNameCmbItemStateChanged
        if (modelNameCmb.getSelectedIndex() == -1) {
            return;
        }
        String modelName = modelNameCmb.getSelectedItem().toString();
        try {
            ModelDTO OrderModelDetails = ModelController.OrderModelDetails(modelName);
            if (OrderModelDetails != null) {
                modelNoTxt.setText(OrderModelDetails.getModelNo());
            }
            SpecificationsDTO dTO = new SpecificationsDTO();
            dTO.setModelNo(modelNoTxt.getText());
            SpecificationsDTO search = SpecificationController.search(dTO);
            if (search != null) {
                specificationSNoTxt.setText(search.getSpecifyId());
                displaySizeTxt.setText(search.getDisplaySize());
                cpuTxt.setText(search.getCpu());
                memoryTxt.setText(search.getMemory());
                networkTxt.setText(search.getNetwork());
                operatingSystemTxt.setText(search.getOperatingSys());
                primarytxt.setText(search.getPrimaryCam());
                ramTxt.setText(search.getRam());
                sensorTxt.setText(search.getSensor());
                secondaryTxt.setText(search.getSecondaryCam());
                simTxt.setText(search.getSim());
                addBtn.setEnabled(false);

            } else {
                displaySizeTxt.setText("Not Set");
                cpuTxt.setText("Not Set");
                memoryTxt.setText("Not Set");
                networkTxt.setText("Not Set");
                operatingSystemTxt.setText("Not Set");
                primarytxt.setText("Not Set");
                secondaryTxt.setText("Not Set");
                ramTxt.setText("Not Set");
                secondaryTxt.setText("Not Set");
                simTxt.setText("Not Set");
                sensorTxt.setText("Not Set");

            }
        } catch (Exception ex) {
            Logger.getLogger(OrderPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modelNameCmbItemStateChanged

    private void modelNameCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelNameCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modelNameCmbActionPerformed

    private void saveBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMouseClicked
        String speciId = specificationSNoTxt.getText();
        String modelNo = modelNoTxt.getText();

        String disSize = displaySizeTxt.getText();
        String OS = specificationSNoTxt.getText();
        String memory = memoryTxt.getText();
        String network = networkTxt.getText();
        String priCam = primarytxt.getText();
        String secCam = secondaryTxt.getText();
        String Ram = ramTxt.getText();
        String sim = simTxt.getText();
        String cpu = cpuTxt.getText();
        String sensor = sensorTxt.getText();

        if (disSize.trim().isEmpty() || OS.trim().isEmpty() || memory.trim().isEmpty() || network.trim().isEmpty() || priCam.trim().isEmpty()
                || secCam.trim().isEmpty() || Ram.trim().isEmpty() || sim.trim().isEmpty() || cpu.trim().isEmpty() || sensor.trim().isEmpty()) {
            String content = "Fill all Text Fields";
            JoptionMessageDialog dialog = new JoptionMessageDialog(null, true);
            dialog.getContent(content);
            return;
        }

        SpecificationsDTO specificationsDTO = new SpecificationsDTO(speciId, modelNo, disSize, priCam, memory, network, priCam, secCam, Ram, sim, cpu, sensor);

        try {
            boolean isUpdated = SpecificationController.updateSpecifications(specificationsDTO);
            if (isUpdated) {
                String content = "Specifications Updated Successfully";
                JoptionMessageDialog dialog = new JoptionMessageDialog(null, true);
                dialog.getContent(content);
            } else {
                String content = "ERROR!";
                JoptionMessageDialog dialog = new JoptionMessageDialog(null, true);
                dialog.getContent(content);
            }
        } catch (Exception ex) {
            Logger.getLogger(Specifications.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveBtnMouseClicked

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

    private void addBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseEntered
        addBtn.setBackground(new Color(23, 114, 81));
        addBtn.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_addBtnMouseEntered

    private void addBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseExited
        addBtn.setBackground(new Color(255, 255, 255));
        addBtn.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_addBtnMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXPanel EditIEMIPanel;
    private org.jdesktop.swingx.JXLabel addBtn;
    private org.jdesktop.swingx.JXComboBox brandCombo;
    private javax.swing.JTextField cpuTxt;
    private org.jdesktop.swingx.JXPanel dialogBox_Panel;
    private javax.swing.JTextField displaySizeTxt;
    private org.jdesktop.swingx.JXLabel editBtn;
    private javax.swing.JLabel item_code_lbl;
    private javax.swing.JLabel item_code_lbl1;
    private javax.swing.JScrollPane jScrollPane1;
    private org.jdesktop.swingx.JXLabel jXLabel1;
    private org.jdesktop.swingx.JXLabel jXLabel10;
    private org.jdesktop.swingx.JXLabel jXLabel11;
    private org.jdesktop.swingx.JXLabel jXLabel12;
    private org.jdesktop.swingx.JXLabel jXLabel13;
    private org.jdesktop.swingx.JXLabel jXLabel14;
    private org.jdesktop.swingx.JXLabel jXLabel15;
    private org.jdesktop.swingx.JXLabel jXLabel16;
    private org.jdesktop.swingx.JXLabel jXLabel17;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXLabel jXLabel5;
    private org.jdesktop.swingx.JXLabel jXLabel6;
    private org.jdesktop.swingx.JXLabel jXLabel7;
    private org.jdesktop.swingx.JXLabel jXLabel8;
    private org.jdesktop.swingx.JXLabel jXLabel9;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXTable jXTable1;
    private javax.swing.JTextField memoryTxt;
    private org.jdesktop.swingx.JXComboBox modelNameCmb;
    private javax.swing.JTextField modelNoTxt;
    private javax.swing.JTextField networkTxt;
    private javax.swing.JTextField operatingSystemTxt;
    private javax.swing.JTextField primarytxt;
    private javax.swing.JLabel qty_on_hand_lbl1;
    private javax.swing.JTextField ramTxt;
    private org.jdesktop.swingx.JXLabel saveBtn;
    private javax.swing.JTextField secondaryTxt;
    private javax.swing.JTextField sensorTxt;
    private javax.swing.JTextField simTxt;
    private javax.swing.JTextField specificationSNoTxt;
    private org.jdesktop.swingx.JXLabel titleLbl;
    private org.jdesktop.swingx.JXPanel updateItempanel;
    // End of variables declaration//GEN-END:variables
}
