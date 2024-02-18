/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.mobileshop.view;

import com.project.mobileshop.controller.InvoiceController;
import com.project.mobileshop.controller.MobileController;
import com.project.mobileshop.controller.MobileDetailController;
import com.project.mobileshop.controller.ModelController;
import com.project.mobileshop.controller.ReturnMobileController;
import com.project.mobileshop.core.dto.CustomDTO;
import com.project.mobileshop.core.dto.ModelDTO;
import com.project.mobileshop.db.DBConnection;
import java.awt.Color;
import java.awt.Dialog;
import java.math.BigDecimal;
import java.sql.Connection;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.jasper.IJSEJasperViewer;
import lk.ijse.jasper.JasperUtil;
import lk.ijse.jasper.Report;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperReportsContext;
import net.sf.jasperreports.view.JasperViewer;
import sun.java2d.pipe.SpanShapeRenderer;

/**
 *
 * @author Janitha Dhananjaya
 */
@Report("com.project.mobileshop.report")
public class ProfitPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddCurrentStockPanel
     */
    public ProfitPanel() {
        initComponents();
        LoadAllModelNames();
        LoadCurrentDate();
        getDailyProfit();
        getWeek();
        getMonths();
        getYear();
        getMonthlyProfit();
        getAnnualyProfit();

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
        curDateTxt = new org.jdesktop.swingx.JXTextField();
        brandLbl = new org.jdesktop.swingx.JXLabel();
        companyWarrentLbl = new org.jdesktop.swingx.JXLabel();
        unitPricelbl = new org.jdesktop.swingx.JXLabel();
        returnQtyTxt = new org.jdesktop.swingx.JXTextField();
        soldQtyTxt = new org.jdesktop.swingx.JXTextField();
        batchNoLbl = new org.jdesktop.swingx.JXLabel();
        modelNameCombo = new org.jdesktop.swingx.JXComboBox();
        BtnPrintDailyProfit = new org.jdesktop.swingx.JXLabel();
        yearLbl = new org.jdesktop.swingx.JXLabel();
        noOfMobilesTxt = new org.jdesktop.swingx.JXTextField();
        jXLabel3 = new org.jdesktop.swingx.JXLabel();
        jXLabel4 = new org.jdesktop.swingx.JXLabel();
        brandLbl3 = new org.jdesktop.swingx.JXLabel();
        monthlyProfitTxt = new org.jdesktop.swingx.JXTextField();
        jXLabel2 = new org.jdesktop.swingx.JXLabel();
        brandLbl4 = new org.jdesktop.swingx.JXLabel();
        annualyProfitTxt = new org.jdesktop.swingx.JXTextField();
        companyWarrentLbl1 = new org.jdesktop.swingx.JXLabel();
        dailyProfitTxt = new org.jdesktop.swingx.JXTextField();
        brandLbl5 = new org.jdesktop.swingx.JXLabel();
        monthLbl = new org.jdesktop.swingx.JXLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jXPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        curDateTxt.setForeground(new java.awt.Color(0, 0, 102));
        curDateTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        curDateTxt.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        curDateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curDateTxtActionPerformed(evt);
            }
        });
        jXPanel1.add(curDateTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 220, 40));

        brandLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        brandLbl.setText("Daily Profit");
        brandLbl.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jXPanel1.add(brandLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 140, 30));

        companyWarrentLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        companyWarrentLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyWarrentLbl.setText("Calculation");
        companyWarrentLbl.setFont(new java.awt.Font("Lucida Bright", 1, 36)); // NOI18N
        jXPanel1.add(companyWarrentLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 350, 60));

        unitPricelbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unitPricelbl.setText("Return Qty");
        unitPricelbl.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jXPanel1.add(unitPricelbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, 150, 30));

        returnQtyTxt.setEditable(false);
        returnQtyTxt.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        returnQtyTxt.setOpaque(false);
        returnQtyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnQtyTxtActionPerformed(evt);
            }
        });
        jXPanel1.add(returnQtyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 180, 30));

        soldQtyTxt.setEditable(false);
        soldQtyTxt.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        soldQtyTxt.setOpaque(false);
        soldQtyTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldQtyTxtActionPerformed(evt);
            }
        });
        jXPanel1.add(soldQtyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 180, 30));

        batchNoLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        batchNoLbl.setText("Model Name");
        batchNoLbl.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jXPanel1.add(batchNoLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 120, 30));

        modelNameCombo.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        modelNameCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                modelNameComboItemStateChanged(evt);
            }
        });
        modelNameCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modelNameComboActionPerformed(evt);
            }
        });
        jXPanel1.add(modelNameCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 180, 30));

        BtnPrintDailyProfit.setBackground(new java.awt.Color(255, 255, 255));
        BtnPrintDailyProfit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BtnPrintDailyProfit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnPrintDailyProfit.setText("Print");
        BtnPrintDailyProfit.setFont(new java.awt.Font("Lucida Bright", 1, 22)); // NOI18N
        BtnPrintDailyProfit.setOpaque(true);
        BtnPrintDailyProfit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnPrintDailyProfitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BtnPrintDailyProfitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BtnPrintDailyProfitMouseExited(evt);
            }
        });
        jXPanel1.add(BtnPrintDailyProfit, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 230, 100, 40));

        yearLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        yearLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        yearLbl.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jXPanel1.add(yearLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 220, 40));

        noOfMobilesTxt.setEditable(false);
        noOfMobilesTxt.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        noOfMobilesTxt.setOpaque(false);
        noOfMobilesTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfMobilesTxtActionPerformed(evt);
            }
        });
        jXPanel1.add(noOfMobilesTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 180, 30));

        jXLabel3.setText("RS :");
        jXLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jXPanel1.add(jXLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, 40, 40));

        jXLabel4.setText("RS :");
        jXLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jXPanel1.add(jXLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 40, 40));

        brandLbl3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        brandLbl3.setText("Monthly Profit");
        brandLbl3.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jXPanel1.add(brandLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 140, 30));

        monthlyProfitTxt.setEditable(false);
        monthlyProfitTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monthlyProfitTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        monthlyProfitTxt.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        monthlyProfitTxt.setOpaque(false);
        monthlyProfitTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthlyProfitTxtActionPerformed(evt);
            }
        });
        jXPanel1.add(monthlyProfitTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 220, 40));

        jXLabel2.setText("RS :");
        jXLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jXPanel1.add(jXLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, 40, 40));

        brandLbl4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        brandLbl4.setText("Annualy Profit");
        brandLbl4.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jXPanel1.add(brandLbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 140, 30));

        annualyProfitTxt.setEditable(false);
        annualyProfitTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        annualyProfitTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        annualyProfitTxt.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        annualyProfitTxt.setOpaque(false);
        annualyProfitTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annualyProfitTxtActionPerformed(evt);
            }
        });
        jXPanel1.add(annualyProfitTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 400, 220, 40));

        companyWarrentLbl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        companyWarrentLbl1.setText("Sold Qty");
        companyWarrentLbl1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jXPanel1.add(companyWarrentLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 130, 30));

        dailyProfitTxt.setEditable(false);
        dailyProfitTxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dailyProfitTxt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        dailyProfitTxt.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        dailyProfitTxt.setOpaque(false);
        dailyProfitTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyProfitTxtActionPerformed(evt);
            }
        });
        jXPanel1.add(dailyProfitTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 220, 40));

        brandLbl5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        brandLbl5.setText("No of Mobiles");
        brandLbl5.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jXPanel1.add(brandLbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 140, 30));

        monthLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        monthLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        monthLbl.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jXPanel1.add(monthLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 220, 40));

        add(jXPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 680));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnPrintDailyProfitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrintDailyProfitMouseExited
        BtnPrintDailyProfit.setBackground(new Color(255, 255, 255));
        BtnPrintDailyProfit.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_BtnPrintDailyProfitMouseExited

    private void BtnPrintDailyProfitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrintDailyProfitMouseEntered
        BtnPrintDailyProfit.setBackground(new Color(23, 114, 81));
        BtnPrintDailyProfit.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_BtnPrintDailyProfitMouseEntered

    private void BtnPrintDailyProfitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrintDailyProfitMouseClicked
        JasperUtil.init(ProfitPanel.class);

        JasperReportsContext ctx = JasperUtil.getReportContext();

        try {
            JasperReport compiledReport = JasperUtil.getCompiledReport("DailyReport.jasper");

            JasperFillManager fillManager = JasperFillManager.getInstance(ctx);

            HashMap<String, Object> reportParams = new HashMap<>();

            Date stm = new SimpleDateFormat("yyyy-MM-dd").parse(curDateTxt.getText());

            reportParams.put("current date", stm);
            reportParams.put("profit", dailyProfitTxt.getText());

            Connection connection = DBConnection.getInstance().getConnection();
            JasperPrint filledReport = fillManager.fill(compiledReport, reportParams, connection);

            IJSEJasperViewer frmJSEJasperViewer = new IJSEJasperViewer(filledReport);
            frmJSEJasperViewer.setTitle("Daily Profit");
            frmJSEJasperViewer.setModalExclusionType(Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
            frmJSEJasperViewer.setVisible(true);

        } catch (JRException ex) {
            Logger.getLogger(ProfitPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(ProfitPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnPrintDailyProfitMouseClicked

    private void modelNameComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modelNameComboActionPerformed

    }//GEN-LAST:event_modelNameComboActionPerformed

    private void soldQtyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldQtyTxtActionPerformed

    }//GEN-LAST:event_soldQtyTxtActionPerformed

    private void returnQtyTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnQtyTxtActionPerformed

    }//GEN-LAST:event_returnQtyTxtActionPerformed

    private void curDateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curDateTxtActionPerformed

    }//GEN-LAST:event_curDateTxtActionPerformed

    private void noOfMobilesTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfMobilesTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_noOfMobilesTxtActionPerformed

    private void monthlyProfitTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthlyProfitTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthlyProfitTxtActionPerformed

    private void annualyProfitTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annualyProfitTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_annualyProfitTxtActionPerformed

    private void dailyProfitTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyProfitTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dailyProfitTxtActionPerformed

    private void modelNameComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_modelNameComboItemStateChanged
        String modelName = modelNameCombo.getSelectedItem().toString();
        try {
            CustomDTO c = MobileDetailController.getMobileCount(modelName);
            if (c != null) {
                noOfMobilesTxt.setText(String.valueOf(c.getCount()));
            }
            CustomDTO soldCount = MobileController.getSoldMobileQty(modelName);
            if (soldCount != null) {
                soldQtyTxt.setText(String.valueOf(soldCount.getCount()));

            }
            CustomDTO returnCount = ReturnMobileController.getReturnMobileCount(modelName);
            if (returnCount != null) {
                returnQtyTxt.setText(String.valueOf(returnCount.getCount()));

            }
        } catch (Exception ex) {
            Logger.getLogger(ProfitPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_modelNameComboItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXLabel BtnPrintDailyProfit;
    private org.jdesktop.swingx.JXTextField annualyProfitTxt;
    private org.jdesktop.swingx.JXLabel batchNoLbl;
    private org.jdesktop.swingx.JXLabel brandLbl;
    private org.jdesktop.swingx.JXLabel brandLbl3;
    private org.jdesktop.swingx.JXLabel brandLbl4;
    private org.jdesktop.swingx.JXLabel brandLbl5;
    private org.jdesktop.swingx.JXLabel companyWarrentLbl;
    private org.jdesktop.swingx.JXLabel companyWarrentLbl1;
    private org.jdesktop.swingx.JXTextField curDateTxt;
    private org.jdesktop.swingx.JXTextField dailyProfitTxt;
    private org.jdesktop.swingx.JXLabel jXLabel2;
    private org.jdesktop.swingx.JXLabel jXLabel3;
    private org.jdesktop.swingx.JXLabel jXLabel4;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    private org.jdesktop.swingx.JXComboBox modelNameCombo;
    private org.jdesktop.swingx.JXLabel monthLbl;
    private org.jdesktop.swingx.JXTextField monthlyProfitTxt;
    private org.jdesktop.swingx.JXTextField noOfMobilesTxt;
    private org.jdesktop.swingx.JXTextField returnQtyTxt;
    private org.jdesktop.swingx.JXTextField soldQtyTxt;
    private org.jdesktop.swingx.JXLabel unitPricelbl;
    private org.jdesktop.swingx.JXLabel yearLbl;
    // End of variables declaration//GEN-END:variables

    private void LoadAllModelNames() {
        try {
            ArrayList<ModelDTO> all = ModelController.getAll();
            if (all != null) {
                for (ModelDTO a : all) {
                    modelNameCombo.addItem(a.getModelName());
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(ProfitPanel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void LoadCurrentDate() {
        Date curDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        curDateTxt.setText(sdf.format(curDate));
    }

    private void getDailyProfit() {
        String curDate = curDateTxt.getText();
        try {
            ArrayList<CustomDTO> dailyProfit = InvoiceController.getDailyProfit(curDate);
            BigDecimal profit = new BigDecimal(0);
            if (dailyProfit != null) {

                for (CustomDTO d : dailyProfit) {
                    profit = profit.add(d.getProfit());
                }
                System.out.println("Profit :" + profit);
                dailyProfitTxt.setText(String.valueOf(profit));
            } else {
                dailyProfitTxt.setText("0.00");
            }
        } catch (Exception ex) {
            Logger.getLogger(ProfitPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getWeek() {
        Calendar ca1 = Calendar.getInstance();

        ca1.set(2017, 8, 20);

        int wk = ca1.get(Calendar.WEEK_OF_MONTH);
        System.out.println("Week of Month :" + wk);
    }

    private void getMonths() {
        Calendar mCalendar = Calendar.getInstance();
        String month = mCalendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
        monthLbl.setText(month);
    }

    private void getMonthlyProfit() {
        try {
            ArrayList<CustomDTO> monthlyProfit = InvoiceController.getMonthlyProfit();
            BigDecimal profit = new BigDecimal(0);
            if (monthlyProfit != null) {

                for (CustomDTO d : monthlyProfit) {
                    profit = profit.add(d.getProfit());
                }
                System.out.println("Profit :" + profit);
                monthlyProfitTxt.setText(String.valueOf(profit));
            } else {
                monthlyProfitTxt.setText("0.00");
            }
        } catch (Exception ex) {
            Logger.getLogger(ProfitPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getAnnualyProfit() {
        try {
            ArrayList<CustomDTO> annualyProfit = InvoiceController.getAnnualyProfit();
            BigDecimal profit = new BigDecimal(0);
            if (annualyProfit != null) {

                for (CustomDTO d : annualyProfit) {
                    profit = profit.add(d.getProfit());
                }
                System.out.println("Profit :" + profit);
                annualyProfitTxt.setText(String.valueOf(profit));
            } else {
                annualyProfitTxt.setText("0.00");
            }
        } catch (Exception ex) {
            Logger.getLogger(ProfitPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getYear() {
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);
        String yearInString = String.valueOf(year);
        yearLbl.setText(yearInString);
    }
}
