/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.salone.view;

import java.awt.Color;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import lk.ijse.salone.Controller.AppointmentController;
import lk.ijse.salone.Model.Appointment;

/**
 *
 * @author Lakshika
 */
public class DashBoardPanel extends javax.swing.JPanel {

    /**
     * Creates new form DashBoardPanel
     */
    public DashBoardPanel() {
        try {
            initComponents();
            jPanel1.setBackground(new Color(0,0,0,120));
            jPanel2.setBackground(new Color(0,0,0,20));
            loadTimeAndDAte();
            loadAppointments();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DashBoardPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DashBoardPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        txtSearchDate = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearchDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        add(txtSearchDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, 160, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/salone/Pictures/icons8_Search_45px_2.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 90, 50, 50));

        lblDate.setBackground(new java.awt.Color(255, 255, 255));
        lblDate.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 150, 40));

        lblTime.setBackground(new java.awt.Color(255, 255, 255));
        lblTime.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        add(lblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 40, 150, 40));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 10, 64));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/salone/Pictures/icons8_Logout_Rounded_Up_40px.png"))); // NOI18N
        jButton1.setText("Logout");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 650, 150, 50));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment ID", "Customer ID", "Employee ID", "Apoointment Date", "Appointment Time", "Service Date", "Service Time", "Duration(Minutes)"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 990, 430));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 1030, 480));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/salone/Pictures/icons8_Home_65px.png"))); // NOI18N
        jLabel3.setText("Dash Board");
        jLabel3.setFocusable(false);
        jLabel3.setIconTextGap(20);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            loadAppointments();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DashBoardPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DashBoardPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed
      
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblTime;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtSearchDate;
    // End of variables declaration//GEN-END:variables

    private void loadTimeAndDAte() {
       Date date =new Date();
       SimpleDateFormat format1=new SimpleDateFormat("YYYY-MM-dd");
       lblDate.setText(format1.format(date));
       txtSearchDate.setText(format1.format(date));
       
        SimpleDateFormat format2=new SimpleDateFormat("HH:mm:ss");
            lblTime.setText(format2.format(date));
    }

    private void loadAppointments() throws ClassNotFoundException, SQLException {
   ArrayList<Appointment>list=  new AppointmentController().getAppointments(txtSearchDate.getText());
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        model.setRowCount(0);
        for (Appointment appointment : list) {
              Object[]rowData={
            appointment.getAp_ID(),appointment.getCus_ID(),appointment.getEmp_ID(),appointment.getAp_Date(),appointment.getAp_Time(),
                appointment.getActual_Service_Date(),appointment.getActual_Service_Time(),appointment.getDuration()
                    };
            model.addRow(rowData);
        }
    }
}