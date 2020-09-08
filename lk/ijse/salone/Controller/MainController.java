/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.salone.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import lk.ijse.salone.DB.DBConnection;

/**
 *
 * @author Lakshika
 */
public class MainController {

    public static String getAppointmentId() throws ClassNotFoundException, SQLException {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT Ap_ID FROM Appointment ORDER BY Ap_ID DESC LIMIT 1").executeQuery();
       
        if (set.next()) {
        String tempId = set.getString(1);
        String[] arr = tempId.split("A");
        int id = Integer.parseInt(arr[1]);
        id += 1;
        
        if(id<10){
            return "A00"+id;
        }else if(id<100){
            return "A0"+id;
        }else{
            return "A"+id;
        }
    }else{
            return "A001";
        }
        
        
    }
    
}
