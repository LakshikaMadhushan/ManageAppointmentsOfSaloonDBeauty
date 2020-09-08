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
import lk.ijse.salone.Controller.AppointmentController;
import lk.ijse.salone.Model.Appointment;

/**
 *
 * @author Lakshika
 */
public class AppointmentPanel extends javax.swing.JPanel {

    /**
     * Creates new form AppointmentPanel
     */
    public AppointmentPanel() {
        try {
            initComponents();
            jPanel1.setBackground(new Color(0,0,0,40));
            jPanel2.setBackground(new Color(0,0,0,120));
           
            jPanel5.setBackground(new Color(0,0,0,40));
            jPanel6.setBackground(new Color(0,0,0,40));
            loadAppointments();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtServiceDate = new javax.swing.JTextField();
        txtServiceTime = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAppointmentDate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAppointmentTime = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCustomerId = new javax.swing.JTextField();
        txtEmployeeId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAppointmentId = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appoinment ID", "Customer ID", "Employee ID", "Appointment Date", "Appointment Timel", "Service Date", "Service Time", "Duration"
            }
        ));
        tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, 1000, 140));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/salone/Pictures/icons8_Edit_File_65px.png"))); // NOI18N
        jLabel3.setText("Manage Appointment");
        jLabel3.setIconTextGap(20);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, 70));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 80));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel5.setForeground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 1020, 160));

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
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 470, 170, 50));

        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 170, 50));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 190, 130));

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 10, 64));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, 1030, 10));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Duration   ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 120, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Service Time");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 150, 30));

        txtServiceDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtServiceDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 320, 40));

        txtServiceTime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtServiceTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 320, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Appoinment Date");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 50));

        txtAppointmentDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtAppointmentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 320, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Appoinment Time ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 200, 30));

        txtAppointmentTime.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtAppointmentTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 320, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Service Date ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, 40));

        txtDuration.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtDuration, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 320, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Customer ID");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 140, 50));

        txtCustomerId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 320, 40));

        txtEmployeeId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtEmployeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 320, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Appoinment ID ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 170, 30));

        txtAppointmentId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.add(txtAppointmentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 270, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Employee ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, 30));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 620, 410));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     
        try {   
            Appointment a1=new AppointmentController().getAppointmentById(txtAppointmentId.getText().toString());
            
            if(a1!=null){
                txtAppointmentId.setText(a1.getAp_ID());
                txtCustomerId.setText(a1.getCus_ID());
                txtEmployeeId.setText(a1.getEmp_ID());
                txtAppointmentDate.setText(a1.getAp_Date());
                txtAppointmentTime.setText(a1.getAp_Time());
                txtServiceDate.setText(a1.getActual_Service_Date());
                txtServiceTime.setText(a1.getActual_Service_Time());
                txtDuration.setText(a1.getDuration()+"");
            }else{
                JOptionPane.showMessageDialog(null, "Appointment Id not match","Error", JOptionPane.ERROR_MESSAGE);
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
     
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
     
        try {
          if(txtAppointmentId.getText().length()==0 || txtCustomerId.getText().length()==0 || 
                  txtEmployeeId.getText().length()==0 || txtAppointmentDate.getText().length()==0
                  || txtAppointmentTime.getText().length()==0 || txtServiceDate.getText().length()==0
                  || txtServiceTime.getText().length()==0 || txtDuration.getText().length()==0){
              
              JOptionPane.showMessageDialog(null, "Please Fill Text Fields","Error", JOptionPane.ERROR_MESSAGE);
          }else{
            Appointment appointment = new Appointment(
                   
                    txtCustomerId.getText(),
                     txtEmployeeId.getText(),
                    txtAppointmentId.getText(),
                   txtAppointmentDate.getText(),
                    txtAppointmentTime.getText(),
                    txtServiceDate.getText(),
                    txtServiceTime.getText(),
                    Integer.parseInt(txtDuration.getText())
                    
                    
                    
                    
            );
            
            
            
            boolean isUpdated=  new AppointmentController().updateAppointment(appointment);
            if(isUpdated){
                JOptionPane.showMessageDialog(null, "Updated SuccesFully");
                
                 loadAppointments();
            }else{
                 JOptionPane.showMessageDialog(null, "Try again","Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } }catch (ClassNotFoundException | SQLException ex) {
            
           Logger.getLogger(AppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            if(txtAppointmentId.getText().length()==0){
                 JOptionPane.showMessageDialog(null, "Please Enter Appointment ID","Error", JOptionPane.ERROR_MESSAGE);
            }else{
            
            boolean isDeleted=new AppointmentController().dropAppointment(txtAppointmentId.getText());
            
            if(isDeleted){
                JOptionPane.showMessageDialog(null, "Delete Successfully");
                 loadAppointments();
            }else{
                JOptionPane.showMessageDialog(null, "Try again","Error", JOptionPane.ERROR_MESSAGE);
            } } } catch (ClassNotFoundException ex) {
            Logger.getLogger(AppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AppointmentPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
     
     
    }//GEN-LAST:event_jButton7ActionPerformed

    private void tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMouseClicked
        DefaultTableModel model = (DefaultTableModel) tbl.getModel();
        int row = tbl.getSelectedRow();
        
          txtAppointmentId.setText( model.getValueAt(row, 0).toString());
          txtCustomerId.setText( model.getValueAt(row, 1).toString());
        txtEmployeeId.setText( model.getValueAt(row, 2).toString());
          txtAppointmentDate.setText( model.getValueAt(row, 3).toString());
         txtAppointmentTime.setText( model.getValueAt(row, 4).toString());
        txtServiceDate.setText( model.getValueAt(row, 5).toString());
         txtServiceTime.setText( model.getValueAt(row, 6).toString());
          txtDuration.setText( model.getValueAt(row, 7).toString());
        
        
        
    }//GEN-LAST:event_tblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtAppointmentDate;
    private javax.swing.JTextField txtAppointmentId;
    private javax.swing.JTextField txtAppointmentTime;
    private javax.swing.JTextField txtCustomerId;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtServiceDate;
    private javax.swing.JTextField txtServiceTime;
    // End of variables declaration//GEN-END:variables

    private void loadAppointments() throws ClassNotFoundException, SQLException {
      ArrayList<Appointment>list=new AppointmentController().loadAppointments();
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
