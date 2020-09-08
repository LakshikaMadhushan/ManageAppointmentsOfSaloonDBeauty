
package lk.ijse.salone.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import static javax.swing.UIManager.getString;
import lk.ijse.salone.DB.DBConnection;
import lk.ijse.salone.Model.Customer;
import lk.ijse.salone.Model.Employee;


public class CustomerController {
   
   public ArrayList<String> getAllIDS() throws ClassNotFoundException, SQLException{
       ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT Cus_ID FROM Customer").executeQuery();
       ArrayList<String> list=new ArrayList<>();
       while(set.next()){
          
           list.add(set.getString(1));
       }
       return list;
   }

    public Customer getCustomer(Object selectedItem) throws ClassNotFoundException, SQLException {
       ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Customer WHERE Cus_ID='"+ selectedItem+"'").executeQuery();
        if(set.next()){
           return new Customer(
                   set.getString(1),
                   set.getString(2),
                   set.getString(3),
                   set.getInt(4)
           );
    }
    return null;
}

    public boolean saveCustomer(Customer c1) throws ClassNotFoundException, SQLException {
       PreparedStatement stm = DBConnection.getInstance().getConnection().prepareStatement("INSERT INTO Customer VALUES(?,?,?,?)");
        stm.setObject(1, c1.getCus_ID());
        stm.setObject(2, c1.getCus_Name());
        stm.setObject(3, c1.getCus_Address());
        stm.setObject(4, c1.getCus_TP());
        return stm.executeUpdate()>0;
    }

    public String generateId() throws ClassNotFoundException, SQLException {
       ResultSet stm = DBConnection.getInstance().getConnection().prepareStatement("SELECT Cus_ID FROM Customer ORDER BY Cus_ID DESC LIMIT 1").executeQuery();
       
       if(stm.next()){
           String s1 = stm.getString(1);
           String[] arr = s1.split("C");
           int id = Integer.parseInt( arr[1]);
            id+=1;
           if(id<10){
               return "C00"+id;
           }else if (id<100){
               return "C0"+id;
           }else{
               return "C"+id;
           }
           
           
       }else{
           return "C001" ;
       }
       
    }

    public ArrayList<Customer> getCustomers() throws SQLException, ClassNotFoundException {
       ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Customer").executeQuery();
       ArrayList<Customer>list=new ArrayList();
       while(set.next()){
           Customer c1=new Customer();
           c1.setCus_ID(set.getString(1));
            c1.setCus_Name(set.getString(2));
             c1.setCus_Address(set.getString(3));
              c1.setCus_TP(Integer.parseInt(set.getString(4)));
              list.add(c1);
       }
       return list;
    }

    public ArrayList<Customer> searchCustomer(String id) throws ClassNotFoundException, SQLException {
       ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Customer WHERE Cus_ID='"+id+"'").executeQuery();
       ArrayList<Customer>list=new ArrayList();
       if(set.next()){
           Customer c1=new Customer();
           c1.setCus_ID(set.getString(1));
            c1.setCus_Name(set.getString(2));
             c1.setCus_Address(set.getString(3));
              c1.setCus_TP(Integer.parseInt(set.getString(4)));
              list.add(c1);
       return list;
       }
       return null;
    }  

    public boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException {
         return DBConnection.getInstance().getConnection().prepareStatement("DELETE FROM Customer WHERE Cus_ID='"+id+"'").executeUpdate()>0;
    }

    public boolean updateCustomer(Customer c1) throws ClassNotFoundException, SQLException {
       Connection conn = DBConnection.getInstance().getConnection();
       PreparedStatement stm = conn.prepareStatement("UPDATE Customer SET Cus_Name=?,Cus_Address =?,Cus_TP =? WHERE Cus_ID=? ");
       
       stm.setObject(1, c1.getCus_Name());
       stm.setObject(2, c1.getCus_Address());
       stm.setObject(3, c1.getCus_TP());
       stm.setObject(4, c1.getCus_ID());
       return stm.executeUpdate()>0;
    }

    
        
        
    }

    

   

