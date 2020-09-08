/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.salone.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.salone.DB.DBConnection;
import lk.ijse.salone.Model.Appointment;
import lk.ijse.salone.Model.AppointmentService;
import lk.ijse.salone.Model.Employee;

/**
 *
 * @author Lakshika
 */
public class AppointmentController {

    public static ArrayList<Appointment> getAppointment(String id,String id2) throws ClassNotFoundException, SQLException {
        
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Appointment WHERE Emp_ID ='" + id + "'AND Actual_Service_Date='"+id2+"' ").executeQuery();
        ArrayList<Appointment> list = new ArrayList<>();

        while (set.next()) {

            Appointment appointment = new Appointment();
            appointment.setCus_ID(set.getString(1));
            appointment.setEmp_ID(set.getString(2));
            appointment.setAp_ID(set.getString(3));
            appointment.setAp_Date(set.getString(4));
            appointment.setAp_Time(set.getString(5));
            appointment.setActual_Service_Date(set.getString(6));
            appointment.setActual_Service_Time(set.getString(7));
            appointment.setDuration(set.getInt(8));
            list.add(appointment);

        }

        return list;

    }

        public boolean saveAppointment(Appointment appointment) throws ClassNotFoundException, SQLException {
       // System.out.println("Save Appointment");
         Connection conn = DBConnection.getInstance().getConnection();
        try {
           
           
           conn.setAutoCommit(false);
            PreparedStatement stm = conn.prepareStatement("INSERT INTO Appointment VALUES(?,?,?,?,?,?,?,?)");
            stm.setObject(1, appointment.getCus_ID());
            stm.setObject(2, appointment.getEmp_ID());
            stm.setObject(3, appointment.getAp_ID());
            stm.setObject(4, appointment.getAp_Date());
            stm.setObject(5, appointment.getAp_Time());
            stm.setObject(6, appointment.getActual_Service_Date());
            stm.setObject(7, appointment.getActual_Service_Time());
            stm.setObject(8, appointment.getDuration());
            boolean result = stm.executeUpdate() > 0;

            if (result) {
                for (AppointmentService appointmentService : appointment.getList()) {
                    PreparedStatement statement = conn.prepareStatement("INSERT INTO Appointment_Service VALUES(?,?,?)");
                    statement.setObject(1, appointmentService.getAp_ID());
                    statement.setObject(2, appointmentService.getS_ID());
                    statement.setObject(3, appointmentService.getS_Price());
                    boolean issaved = statement.executeUpdate() > 0;
                    if(!issaved){
                         conn.rollback();
                        return false;
                    }
                }
                conn.commit();
                return true;
            }else{
                conn.rollback();
                return false;
            }
        } catch (Exception ex) {
            Logger.getLogger(AppointmentController.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            conn.setAutoCommit(true);
        }
        return false;
    }

    public Appointment getAppointmentById(String id) throws ClassNotFoundException, SQLException {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Appointment WHERE Ap_ID ='" + id + "' ").executeQuery();
       Appointment a1=new Appointment();
       
      if(set.next()){
          a1.setCus_ID(set.getString(1));
          a1.setEmp_ID(set.getString(2));
           a1.setAp_ID(set.getString(3));
           a1.setAp_Date(set.getString(4));
           a1.setAp_Time(set.getString(5));
           a1.setActual_Service_Date(set.getString(6));
           a1.setActual_Service_Time(set.getString(7));
           a1.setDuration(set.getInt(8));
           return a1;
      } 
       
       return null;
    }

    public boolean updateAppointment(Appointment a1) throws ClassNotFoundException, SQLException {
      
         Connection conn = DBConnection.getInstance().getConnection();
         PreparedStatement stm = conn.prepareStatement("UPDATE Appointment SET Actual_Service_Date =?,Actual_Service_Time=? WHERE Ap_ID=?");
        stm.setString(1,a1.getActual_Service_Date());
         stm.setString(2,a1.getActual_Service_Time());
          stm.setString(3,a1.getAp_ID());
         System.out.println(a1.getAp_ID());
       return stm.executeUpdate()>0;
    }

    public boolean dropAppointment(String id) throws ClassNotFoundException, SQLException {
       return  DBConnection.getInstance().getConnection().prepareStatement("DELETE FROM Appointment WHERE Ap_ID='"+id+"'").executeUpdate() >0;
    }

    public ArrayList<Appointment> loadAppointments() throws ClassNotFoundException, SQLException {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Appointment").executeQuery();
        ArrayList<Appointment>list=new ArrayList<>();
        while(set.next()){
            Appointment a1=new Appointment();
            a1.setCus_ID(set.getString(1));
             a1.setEmp_ID(set.getString(2));
             a1.setAp_ID(set.getString(3));
              a1.setAp_Date(set.getString(4));
               a1.setAp_Time(set.getString(5));
                a1.setActual_Service_Date(set.getString(6));
                 a1.setActual_Service_Time(set.getString(7));
                 a1.setDuration(Integer.parseInt(set.getString(8)));
                 list.add(a1);
        }
    return list;
    }

    public ArrayList<Appointment> getAppointments(String date) throws ClassNotFoundException, SQLException {
       
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Appointment WHERE Actual_Service_Date='"+date+"' ").executeQuery();
        
         ArrayList<Appointment>list=new ArrayList<>();
          while(set.next()){
            Appointment a1=new Appointment();
            a1.setCus_ID(set.getString(1));
             a1.setEmp_ID(set.getString(2));
             a1.setAp_ID(set.getString(3));
              a1.setAp_Date(set.getString(4));
               a1.setAp_Time(set.getString(5));
                a1.setActual_Service_Date(set.getString(6));
                 a1.setActual_Service_Time(set.getString(7));
                 a1.setDuration(Integer.parseInt(set.getString(8)));
                 list.add(a1);
        }
    return list;
    }

   

   

}
