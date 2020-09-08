
package lk.ijse.salone.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.salone.DB.DBConnection;
import lk.ijse.salone.Model.Customer;
import lk.ijse.salone.Model.Employee;


public class EmployeeController {
    
    public ArrayList<String> getAllIDS() throws ClassNotFoundException, SQLException{
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT Emp_ID FROM Employee").executeQuery();
        ArrayList<String> list=new ArrayList<>();
        
        
        while(set.next()){
            list.add(set.getString(1));
            
        }
        return list;
    }
     public Employee getEmployee(Object selectedItem) throws ClassNotFoundException, SQLException {
       ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Employee WHERE Emp_ID='"+ selectedItem+"'").executeQuery();
        if(set.next()){
           return new Employee(
                   set.getString(1),
                   set.getString(2),
                   set.getString(3),
                   set.getInt(4),
                   set.getInt(4)
           );
    }
    return null;
}

    public boolean getEmployees(Employee e1) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement stm = conn.prepareStatement("INSERT INTO Employee VALUES (?,?,?,?,?)");
        stm.setObject(1, e1.getEmp_ID());
         stm.setObject(2, e1.getEmp_Name());
          stm.setObject(3, e1.getEmp_Address());
           stm.setObject(4, e1.getEmp_Age());
            stm.setObject(5, e1.getEmp_TP());
            return stm.executeUpdate()>0;
    }

    public String generateId() throws ClassNotFoundException, SQLException {
       ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT Emp_ID FROM Employee ORDER BY Emp_ID DESC LIMIT 1").executeQuery();
       
       if(set.next()){
        String s=set.getString(1);
           String[] arr = s.split("E");
           int id= Integer.parseInt(arr[1]);
           id+=1;
           if(id<10){
               return "E00"+id;
           }else if(id<100){
               return "E0"+id;
           }else{
             return "E"+id;
           }
           
       }
      return "E001";
    }

    public Employee searchEmployee(String id) throws ClassNotFoundException, SQLException {
       ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Employee WHERE Emp_ID='"+id+"' ").executeQuery();
       if(set.next()){
        Employee e1=new Employee();
        e1.setEmp_ID(set.getString(1));
        e1.setEmp_Name(set.getString(2));
        e1.setEmp_Address(set.getString(3));
        e1.setEmp_Age(Integer.parseInt(set.getString(4)));
        e1.setEmp_TP(Integer.parseInt(set.getString(5)));
        return e1;
       }
       return null;
    }

    public boolean updateEmployee(Employee e1) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement stm = conn.prepareStatement("UPDATE Employee SET Emp_Name=?,Emp_Address=?,Emp_Age=?,Emp_TP=? WHERE Emp_ID=?");
        
         stm.setObject(1, e1.getEmp_Name());
          stm.setObject(2, e1.getEmp_Address());
           stm.setObject(3, e1.getEmp_Age());
            stm.setObject(4, e1.getEmp_TP());
            stm.setObject(5, e1.getEmp_ID());
            return stm.executeUpdate()>0;
    }

    public boolean deleteEmployee(String id) throws ClassNotFoundException, SQLException {
       return DBConnection.getInstance().getConnection().prepareStatement("DELETE FROM Employee WHERE Emp_ID='"+id+"' ").executeUpdate()>0;
    }

    public ArrayList<Employee> loadEmployee() throws ClassNotFoundException, SQLException {
     ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT * FROM Employee").executeQuery();
     ArrayList<Employee>list=new ArrayList<>();
     
     while(set.next()){
         Employee e1=new Employee();
         e1.setEmp_ID(set.getString(1));
         e1.setEmp_Name(set.getString(2));
         e1.setEmp_Address(set.getString(3));
         e1.setEmp_Age(Integer.parseInt(set.getString(4)));
         e1.setEmp_TP(Integer.parseInt(set.getString(5)));
         list.add(e1);
     }
     
     return list;
    }

    
    
}
