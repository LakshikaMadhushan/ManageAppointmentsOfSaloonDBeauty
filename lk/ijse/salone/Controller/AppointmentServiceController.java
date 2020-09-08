
package lk.ijse.salone.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.salone.DB.DBConnection;
import lk.ijse.salone.Model.AppointmentService;


public class AppointmentServiceController {

//    boolean saveAppointmentService(ArrayList<AppointmentService> list) throws ClassNotFoundException, SQLException {
//        System.out.println("SaveAppointmentSevice");
//       for(AppointmentService temp: list){
//           PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO Appointment_Service VALUES(?,?,?)");
//          stm.setObject(1, temp.getAp_ID());
//            stm.setObject(2, temp.getS_ID());
//            stm.setObject(3, temp.getS_Price());
//           
//        boolean issaved = stm.executeUpdate() > 0;
//             if (!issaved) {
//                return false;
//            }
//       }
//    return true;
//    }

    public boolean saveAppointmentService(AppointmentService s1) throws ClassNotFoundException, SQLException {
    PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO Appointment_Service VALUES(?,?,?)");
    
            stm.setObject(1, s1.getAp_ID());
            stm.setObject(2, s1.getS_ID());
            stm.setObject(3, s1.getS_Price());
           
        return stm.executeUpdate() > 0;
    
    }

    public ArrayList<AppointmentService> serachAppointmentService(String id) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        ResultSet set = conn.prepareStatement("SELECT * FROM Appointment_Service WHERE Ap_ID='"+id+"'").executeQuery();
        ArrayList<AppointmentService>list=new ArrayList<>();
       while(set.next()){
            AppointmentService a1 = new AppointmentService();
            a1.setAp_ID(set.getString(1));
             a1.setS_ID(set.getString(2));
              a1.setS_Price(Double.parseDouble(set.getString(3)));
              list.add(a1);
        }
       return list;
    }

    public boolean deleteAppointmentService(String id,String id2) throws ClassNotFoundException, SQLException {
       return DBConnection.getInstance().getConnection().prepareStatement("DELETE FROM Appointment_Service WHERE Ap_ID='"+id+"' AND S_ID='"+id2+"'").executeUpdate()>0;
        
        
    }

    public boolean serachAppointmentService(AppointmentService s1) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("UPDATE Appointment_Service SET S_ID=?,S_Price=? WHERE Ap_ID=?");
        stm.setObject(1, s1.getS_ID());
         stm.setObject(2, s1.getS_Price());
          stm.setObject(3, s1.getAp_ID());
          return stm.executeUpdate()>0;
    }

    public ArrayList<AppointmentService> getAppointmentServices() throws ClassNotFoundException, SQLException {
         Connection conn = DBConnection.getInstance().getConnection();
        ResultSet set = conn.prepareStatement("select * from Appointment_Service").executeQuery();
          ArrayList<AppointmentService>list=new ArrayList<>();
          
          while(set.next()){
              AppointmentService a1= new AppointmentService();
              a1.setAp_ID(set.getString(1));
              a1.setS_ID(set.getString(2));
              a1.setS_Price(Double.parseDouble(set.getString(3)));
              list.add(a1);
          }
          return list;
    }

    public String searchPrice(String id) throws ClassNotFoundException, SQLException {
     
       Connection conn = DBConnection.getInstance().getConnection();
        ResultSet set = conn.prepareStatement("select S_Price from Appointment_Service WHERE S_ID='"+id+"'").executeQuery();  
        if(set.next()){
        return set.getString(1);
        }else{
            return null;
        }
    }

    public boolean toDeleteAppointmentService(String id) throws ClassNotFoundException, SQLException {
     Connection conn = DBConnection.getInstance().getConnection();
        ResultSet set = conn.prepareStatement("SELECT * FROM Appointment_Service WHERE Ap_ID='"+id+"'").executeQuery();
       int i=0;
       while(set.next()){
           i++;
        }
       return i>1;
    }
}
