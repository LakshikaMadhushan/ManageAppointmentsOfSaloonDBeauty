/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.salone.view;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import lk.ijse.salone.Controller.AppointmentServiceController;
import lk.ijse.salone.Model.AppointmentService;

/**
 *
 * @author Lakshika
 */
public class AppointmentServicePanel extends javax.swing.JPanel {

    /**
     * Creates new form AppointmentServicePanel
     */
    public AppointmentServicePanel() {
        try {
            initComponents();
            jPanel1.setBackground(new Color(0,0,0,40));
            jPanel2.setBackground(new Color(0,0,0,40));
            jPanel3.setBackground(new Color(0,0,0,40));
            jPanel4.setBackground(new Color(0,0,0,120));
            loadAllAppointmentService();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AppointmentServicePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AppointmentServicePanel.class.getName()).log(Level.SEVERE, null, ex);
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
        txtPrice = new javax.swing.JTextField();
        txtAppointmentId = new javax.swing.JTextField();
        txtServiceId = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Appoinment ID       ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 230, 50));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Service     ID         ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 230, 50));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Price                   ");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, 50));

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });
        add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 320, 40));

        txtAppointmentId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtAppointmentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppointmentIdActionPerformed(evt);
            }
        });
        add(txtAppointmentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 270, 40));

        txtServiceId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        txtServiceId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServiceIdActionPerformed(evt);
            }
        });
        add(txtServiceId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 270, 40));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/salone/Pictures/icons8_Checked_45px.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 50, 40));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/salone/Pictures/icons8_Search_45px_2.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 50, 40));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 620, 200));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/salone/Pictures/icons8_Edit_Property_65px.png"))); // NOI18N
        jLabel3.setText("Appointment Service");
        jLabel3.setIconTextGap(20);
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 80));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment ID", "Service_ID", "Price"
            }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 930, 230));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 980, 270));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
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

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 190, 200));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 10, 64));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 990, 10));
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void txtAppointmentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppointmentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppointmentIdActionPerformed

    private void txtServiceIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServiceIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtServiceIdActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            AppointmentService s1=new AppointmentService();
            s1.setAp_ID(txtAppointmentId.getText());
            s1.setS_ID(txtServiceId.getText());
            s1.setS_Price(Double.parseDouble(txtPrice.getText()));
            
            boolean isSaved=  new AppointmentServiceController().saveAppointmentService(s1);
            if(isSaved){
                JOptionPane.showMessageDialog(null,"Saved");
                 loadAllAppointmentService();
            }else{
              
                 JOptionPane.showMessageDialog(null, "Try again","Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            //Logger.getLogger(AppointmentServicePanel.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Something went wrong","Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        try { 
            ArrayList<AppointmentService>list= new AppointmentServiceController().serachAppointmentService(txtAppointmentId.getText());
           
            DefaultTableModel model = (DefaultTableModel) tbl.getModel();
            model.setRowCount(0);
            for (AppointmentService a1 : list) {
                Object[] rowData={a1.getAp_ID(),a1.getS_ID(),a1.getS_Price()};
                model.addRow(rowData);
            }
            
        } catch (Exception ex) {
            //Logger.getLogger(AppointmentServicePanel.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Something went wrong","Error", JOptionPane.ERROR_MESSAGE);
        } 
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
       
        int row=tbl.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        
       txtAppointmentId.setText((String) model.getValueAt(row, 0));
       txtServiceId.setText((String) model.getValueAt(row, 1));
       txtPrice.setText( model.getValueAt(row, 2).toString());
        
    }//GEN-LAST:event_tblMouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       try {
           
           boolean toDelete=new AppointmentServiceController().toDeleteAppointmentService(txtAppointmentId.getText()); 
           if(toDelete){
           boolean isDeleted=new AppointmentServiceController().deleteAppointmentService(txtAppointmentId.getText(),txtServiceId.getText());
            if(isDeleted){
                 JOptionPane.showMessageDialog(null,"Deleted Successfully"); 
                  loadAllAppointmentService();
            }else{
               JOptionPane.showMessageDialog(null, "Try again","Error", JOptionPane.ERROR_MESSAGE);
            }}else{
               JOptionPane.showMessageDialog(null,"Cant Delete Full Appointment Here"); 
           }
        } catch (Exception ex) {
            //Logger.getLogger(AppointmentServicePanel.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Something went wrong","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try {
            AppointmentService s1=new AppointmentService();
            s1.setAp_ID(txtAppointmentId.getText());
            s1.setS_ID(txtServiceId.getText());
            s1.setS_Price(Double.parseDouble(txtPrice.getText()));
            boolean isUpdate=new AppointmentServiceController().serachAppointmentService(s1);
            
            if(isUpdate){
                   JOptionPane.showMessageDialog(null,"Updated"); 
                    loadAllAppointmentService();
            }else{
               JOptionPane.showMessageDialog(null, "Try again","Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception ex) {
            //Logger.getLogger(AppointmentServicePanel.class.getName()).log(Level.SEVERE, null, ex);
             JOptionPane.showMessageDialog(null, "Something went wrong","Error", JOptionPane.ERROR_MESSAGE);
        } 
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            String price= new AppointmentServiceController().searchPrice(txtServiceId.getText());
            if(price!=null){
                txtPrice.setText(price);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AppointmentServicePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AppointmentServicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtAppointmentId;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtServiceId;
    // End of variables declaration//GEN-END:variables

    private void loadAllAppointmentService() throws ClassNotFoundException, SQLException {
       
      ArrayList<AppointmentService>list= new AppointmentServiceController().getAppointmentServices();
       
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        model.setRowCount(0);
      for (AppointmentService a1 : list) {
        
            Object[] rowdata={a1.getAp_ID(),a1.getS_ID(),a1.getS_Price()};
            model.addRow(rowdata);
            
        }
    }
}
