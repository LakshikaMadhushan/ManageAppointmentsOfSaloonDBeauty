/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.salone.view;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import lk.ijse.salone.Controller.PaymentController;
import lk.ijse.salone.DB.DBConnection;
import lk.ijse.salone.Model.Payment;

/**
 *
 * @author Lakshika
 */
public class PaymentPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePayment
     */
    public PaymentPanel() {
        try {
            initComponents();
            jPanel1.setBackground(new Color(0,0,0,40));
            jPanel2.setBackground(new Color(0,0,0,120));
            jPanel3.setBackground(new Color(0,0,0,40));
            jPanel4.setBackground(new Color(0,0,0,40));
            generateAppointmentId();
            generatePaymentId();
            setPaymentDateAndTime(); 
            setTotalCostAndBalance();
            loadAppointments();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTotalCost = new javax.swing.JTextField();
        txtAppointmentId = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtTime = new javax.swing.JTextField();
        txtPayAmount = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtPaymentId = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        txtConfirm = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Appoinment ID      :");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 230, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Payment ID          :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 230, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Date                   :");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Time                   :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 50));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Pay Amount          :");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, 50));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Balance               :");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 230, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Total Cost            :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 230, 50));

        txtTotalCost.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTotalCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalCostActionPerformed(evt);
            }
        });
        add(txtTotalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 430, 320, 40));

        txtAppointmentId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtAppointmentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppointmentIdActionPerformed(evt);
            }
        });
        add(txtAppointmentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 270, 40));

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });
        add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 320, 40));

        txtTime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimeActionPerformed(evt);
            }
        });
        add(txtTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, 320, 40));

        txtPayAmount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPayAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPayAmountActionPerformed(evt);
            }
        });
        add(txtPayAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 220, 40));

        txtBalance.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBalanceActionPerformed(evt);
            }
        });
        add(txtBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 320, 40));

        tbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment ID", "Payment ID", "Date", "Time", "Pay Amount", "Balance", "Total Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 980, 180));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPaymentId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPaymentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaymentIdActionPerformed(evt);
            }
        });
        jPanel1.add(txtPaymentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 270, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/salone/Pictures/icons8_Search_45px_2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 50, 40));

        txtConfirm.setBackground(new java.awt.Color(255, 255, 255));
        txtConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/salone/Pictures/icons8_Checked_45px.png"))); // NOI18N
        txtConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(txtConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 50, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/salone/Pictures/icons8_Reset_45px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 50, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/salone/Pictures/icons8_Reset_45px.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 60, 50, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 610, 360));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/salone/Pictures/icons8_Receive_Cash_65px.png"))); // NOI18N
        jLabel3.setText("Manage Payment");
        jLabel3.setIconTextGap(20);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 80));

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setBackground(new java.awt.Color(0, 204, 0));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/salone/Pictures/icons8_Add_New_40px_1.png"))); // NOI18N
        jButton5.setText("Add");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        jButton6.setBackground(new java.awt.Color(0, 153, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/salone/Pictures/icons8_Available_Updates_45px.png"))); // NOI18N
        jButton6.setText("update");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, 50));

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 0, 0));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/salone/Pictures/icons8_Trash_Can_40px.png"))); // NOI18N
        jButton7.setText("Delete");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 170, 50));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 290, 190, 190));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 1020, 200));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 10, 64));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 1030, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void txtTotalCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalCostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalCostActionPerformed

    private void txtAppointmentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppointmentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppointmentIdActionPerformed

    private void txtPaymentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaymentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaymentIdActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTimeActionPerformed

    private void txtPayAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPayAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPayAmountActionPerformed

    private void txtBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBalanceActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
      
        try {
            
            if( txtPayAmount.getText().length()==0 ){
                 JOptionPane.showMessageDialog(null, "Please Enter Payment Amount ","Error", JOptionPane.ERROR_MESSAGE);
            }else{
            Payment p1=new Payment(
                    txtAppointmentId.getText(),
                    txtPaymentId.getText(),
                    txtDate.getText(),
                    txtTime.getText(),
                    Double.parseDouble((String)txtPayAmount.getText()),
                    Double.parseDouble((String)txtBalance.getText()),
                    Double.parseDouble((String) txtTotalCost.getText())
                   
            );
            
            boolean isSaved= new PaymentController().savePayemet(p1);
            if(isSaved){
                JOptionPane.showMessageDialog(null, "Saved Successfully");
                loadAppointments();
                num=0;
            }else{
                 JOptionPane.showMessageDialog(null, "try again","Error", JOptionPane.ERROR_MESSAGE);
            }
            generatePaymentId();
       
        } }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            ArrayList<Payment> list=  new PaymentController().getPayment(txtAppointmentId.getText());
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            
            model.setRowCount(0);
            for(Payment temp:list){
                Object[] rawData={temp.getAp_ID(),temp.getP_ID(),temp.getP_Date(),
                    temp.getP_Time(),temp.getPay_Amount(),temp.getBalance(),temp.getTotal_Cost()};
               
                model.addRow(rawData);
                
                
            }
            
           
            setTotalCostAndBalance();
            
            txtPayAmount.setText(null);
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
        int num=0;
    private void txtConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmActionPerformed
        String id=txtPaymentId.getText();
      if(txtPayAmount.getText().length()==0){
          JOptionPane.showMessageDialog(null,"Pleace Enter Pay Amount","Error", JOptionPane.ERROR_MESSAGE);
           
      }  else{
           double pay1 = Double.parseDouble(txtPayAmount.getText());
            double Balance1 = Double.parseDouble(txtBalance.getText());
          
          if(pay1>Balance1){
               JOptionPane.showMessageDialog(null,"Out of Limit Payment","Error", JOptionPane.ERROR_MESSAGE);
          }else{
              
          
        if(num==0){
        num+=1;
        
        double pay = Double.parseDouble(txtPayAmount.getText());
        double balance=Double.parseDouble(txtBalance.getText());
        double balance1=balance-pay;
        txtBalance.setText(balance1+"");
        }else{
            JOptionPane.showMessageDialog(null,"Already done","Error", JOptionPane.ERROR_MESSAGE);
        }}}
    }//GEN-LAST:event_txtConfirmActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {        
            setTotalCostAndBalance();
            txtPayAmount.setText(null);
            num=0;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        int row = tbl.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
         txtAppointmentId.setText( model.getValueAt(row, 0).toString());
         txtPaymentId.setText( model.getValueAt(row, 1).toString());
          txtDate.setText( model.getValueAt(row, 2).toString());
           txtTime.setText( model.getValueAt(row, 3).toString());
            txtPayAmount.setText( model.getValueAt(row, 4).toString());
             txtBalance.setText( model.getValueAt(row, 5).toString());
              txtTotalCost.setText( model.getValueAt(row, 6).toString());
        
        
        
    }//GEN-LAST:event_tblMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     
        try {
            boolean isDeleted=  new PaymentController().removePayment(txtAppointmentId.getText().toString(),txtPaymentId.getText().toString());
            if(isDeleted){
                JOptionPane.showMessageDialog(null, "Deleted Successfully");
                loadAppointments();
            }else{
                  JOptionPane.showMessageDialog(null, "try again","Error", JOptionPane.ERROR_MESSAGE);
            }
            generatePaymentId();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    try {
        
      if(txtPayAmount.getText().length()==0){
     JOptionPane.showMessageDialog(null,"Pleace Enter Pay Amount","Error", JOptionPane.ERROR_MESSAGE);
}   else{
                   Payment p1=new Payment(
                    txtAppointmentId.getText(),
                    txtPaymentId.getText(),
                    txtDate.getText(),
                    txtTime.getText(),
                    Double.parseDouble((String)txtPayAmount.getText()),
                    Double.parseDouble((String)txtBalance.getText()),
                    Double.parseDouble((String) txtTotalCost.getText())
                   
            );
        
        
        
        
        
        
        
    
            boolean isUpdated=new  PaymentController().paymentUpdate(p1);
            if(isUpdated){
                 JOptionPane.showMessageDialog(null, "Update Successfully");
                 loadAppointments();
            }else{
                 JOptionPane.showMessageDialog(null, "Try Again","Error", JOptionPane.ERROR_MESSAGE);
            }}
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            generatePaymentId();
            setPaymentDateAndTime();
            txtPayAmount.setText(null);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtAppointmentId;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JButton txtConfirm;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtPayAmount;
    private javax.swing.JTextField txtPaymentId;
    private javax.swing.JTextField txtTime;
    private javax.swing.JTextField txtTotalCost;
    // End of variables declaration//GEN-END:variables

    private void generateAppointmentId() throws ClassNotFoundException, SQLException {
     String a1= new PaymentController().getAppointmentId();
     txtAppointmentId.setText(a1);
    }

    private void generatePaymentId() throws ClassNotFoundException, SQLException {
     String p1= new PaymentController().getPaymentId();
     txtPaymentId.setText(p1);
    }

    private void setPaymentDateAndTime() {
      Date date=new Date();
      SimpleDateFormat format1=new SimpleDateFormat("YYYY-MM-dd");
        SimpleDateFormat format2=new SimpleDateFormat("HH:mm:ss");
        txtDate.setText(format1.format(date));
        txtTime.setText(format2.format(date));
      
    }

    private void setTotalCostAndBalance() throws ClassNotFoundException, SQLException {
        double [] arr=new PaymentController().getTotalCostAndBalance(txtAppointmentId.getText());
        
        txtTotalCost.setText(arr[0]+"");
        txtBalance.setText(arr[1]+"");
    }

    private void loadAppointments() {
        try {
            ArrayList<Payment>list= new PaymentController().getPayments();
            
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            
            for (Payment payment : list) {
                Object[] rawData={
                    payment.getAp_ID(),payment.getP_ID(),payment.getP_Date(),payment.getP_Time(),payment.getPay_Amount(),payment.getBalance(),
                        payment.getTotal_Cost()
                };
                model.addRow(rawData);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
    }

   
}







