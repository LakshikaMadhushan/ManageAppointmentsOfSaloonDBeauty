
package lk.ijse.salone.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.salone.DB.DBConnection;
import lk.ijse.salone.Model.Catogery;


public class CatogeryController {
    public ArrayList<String> getAllIDS() throws ClassNotFoundException, SQLException{
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT Cat_ID FROM Category").executeQuery();
        ArrayList<String> list=new ArrayList<>();
        
        while(set.next()){
            list.add(set.getString(1));
        }
        return list;
    }

    public String getCatogeryName(String id) throws ClassNotFoundException, SQLException {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT Cat_Name FROM Category WHERE Cat_ID='"+id+"'").executeQuery();
        if(set.next()){
            
            return set.getString(1);
        }
        return null;
    }

    public ArrayList<Catogery> getCatogery() throws ClassNotFoundException, SQLException {
      ArrayList<Catogery>list=new ArrayList<>();
      ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Category").executeQuery();
      
      while(set.next()){
          Catogery c1=new Catogery();
          c1.setCat_ID(set.getString(1));
          c1.setCat_Name(set.getString(2));
          list.add(c1);
          
      }
      return list;
    }

    public String generateCatogeryId() throws ClassNotFoundException, SQLException {
         ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT Cat_ID FROM Category ORDER BY Cat_ID DESC LIMIT 1").executeQuery(); 
         if(set.next()){
             String s1=set.getString(1);
             String[] arr = s1.split("T");
             int id=Integer.parseInt(arr[1]);
             id+=1;
             if(id<10){
                 return "CT00"+id;
             }else if(id<100){
                 return "CT"+id;
             }else{
                 return "CT"+id;
             }
         }else{
             return"CT001";
         }
    }

    public Catogery searchCatogery(String id) throws ClassNotFoundException, SQLException {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Category WHERE Cat_ID='"+id+"'").executeQuery();
        if(set.next()){
            Catogery c1=new Catogery();
            c1.setCat_ID(set.getString(1));
             c1.setCat_Name(set.getString(2));
             return c1;
        }
            return null;
        }

    public boolean saveCatogery(Catogery c1) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("INSERT INTO Category VALUES(?,?)");
        stm.setObject(1, c1.getCat_ID());
        stm.setObject(2, c1.getCat_Name());
        return stm.executeUpdate()>0;
    }

    public boolean deleteCatogery(String id) throws ClassNotFoundException, SQLException {
      return  DBConnection.getInstance().getConnection().prepareStatement("DELETE FROM Category WHERE Cat_ID='"+id+"'").executeUpdate()>0;
    }

    public boolean updateCatogery(Catogery c1) throws ClassNotFoundException, SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("UPDATE Category SET Cat_Name=? WHERE Cat_Id=?");
        stm.setObject(2, c1.getCat_ID());
        stm.setObject(1, c1.getCat_Name());
        return stm.executeUpdate()>0;
    }

   
    } 

    
    

