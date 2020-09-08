
package lk.ijse.salone.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.salone.DB.DBConnection;
import lk.ijse.salone.Model.Service;


public class ServiceController {
    
    public ArrayList<String> getAllIDS(Object selectedItem) throws ClassNotFoundException, SQLException{
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT S_ID FROM Service WHERE Cat_ID ='"+selectedItem+"'").executeQuery();
        
        ArrayList<String> list=new ArrayList<>();
        while(set.next()){
            
            list.add(set.getString(1));
           
        }
        return list;
    }

    public Service getService(String id) throws ClassNotFoundException, SQLException {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Service WHERE S_Id ='"+id+"'").executeQuery();
        
        if(set.next()){
            return new Service(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getDouble(4),
                    set.getInt(5)
            );
            
           }
        
        return null;    
    }

    public String generateId() throws ClassNotFoundException, SQLException {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT S_ID FROM Service ORDER BY S_ID DESC LIMIT 1 ").executeQuery();
        if(set.next()){
            String s1=set.getString(1);
            String[] arr = s1.split("S");
            int id=Integer.parseInt(arr[1])+1;
            if(id<10){
                return "S00"+id;
            }else if(id<100){
                return "S0"+id;
            }else{
                return "S"+id;
            }
            
            
        }else{
            return "S001";
        }
        
        
    }

    public boolean saveService(Service s1) throws ClassNotFoundException, SQLException {
        PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO Service VALUES(?,?,?,?,?)");
        stm.setObject(1, s1.getCat_ID());
        stm.setObject(2, s1.getS_ID());
        stm.setObject(3, s1.getS_Name());
        stm.setObject(4, s1.getS_Price());
         stm.setObject(5, s1.getS_Price());
       return  stm.executeUpdate()>0;
    }

    public Service getServiceById(String id) throws ClassNotFoundException, SQLException {
        ResultSet stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Service WHERE S_ID='"+id+"'").executeQuery();
        if(stm.next()){
            Service s1=new Service();
            s1.setCat_ID(stm.getString(1));
            s1.setS_ID(stm.getString(2));
            s1.setS_Name(stm.getString(3));
            s1.setS_Price(Double.parseDouble(stm.getString(4)));
            s1.setS_Duration(Integer.parseInt(stm.getString(5)));
            return s1;
        }else{
        return null;
    }}

    public boolean updateService(Service s1) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("UPDATE Service SET Cat_ID=?,S_Name=?,S_Price=?,S_Duration=? WHERE S_ID=? ");
        stm.setObject(1, s1.getCat_ID());
          stm.setObject(2, s1.getS_Name());
            stm.setObject(3, s1.getS_Price());
              stm.setObject(4, s1.getS_Duration());
                stm.setObject(5, s1.getS_ID());
                
             return   stm.executeUpdate()>0;
    }

    public boolean deleteService(String id) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
         PreparedStatement stm = conn.prepareStatement("DELETE FROM Service WHERE S_ID='"+id+"'");
         
         return stm.executeUpdate()>0;
         
    }

    public ArrayList<Service> getAllService() throws ClassNotFoundException, SQLException {
        ResultSet stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Service").executeQuery();
        ArrayList<Service>list=new ArrayList<>();
        
        while(stm.next()){
            Service s1=new Service();
            s1.setCat_ID(stm.getString(1));
             s1.setS_ID(stm.getString(2));
              s1.setS_Name(stm.getString(3));
               s1.setS_Price(stm.getDouble(4));
                s1.setS_Duration(stm.getInt(5));
                list.add(s1);
        }
        return list;
        
    }

    
    
    
}
