
package lk.ijse.salone.Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import lk.ijse.salone.DB.DBConnection;
import lk.ijse.salone.Model.Payment;

public class PaymentController {

    public String getAppointmentId() throws ClassNotFoundException, SQLException {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT Ap_ID FROM Appointment ORDER BY Ap_ID DESC LIMIT 1").executeQuery();
    
        if(set.next()){
            String a1 = set.getString(1);
            return a1;
        }else{
            return "A001";
        }
    }

    public String getPaymentId() throws ClassNotFoundException, SQLException {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT P_ID FROM Payment ORDER BY P_ID DESC LIMIT 1").executeQuery();
  
        if(set.next()){
            
            String tempId=set.getString(1);
            String [] arr=tempId.split("P");
            int id=Integer.parseInt(arr[1]);
            id+=1;
            
            if(id<10){
                return "P00"+id;
            }else if(id<100){
                return "P0"+id;
            }else {
                return "P"+id;
            }
           }else{
         return "P001";
        }
    }

   public double[] getTotalCostAndBalance(String id) throws ClassNotFoundException, SQLException {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement("SELECT S_Price  FROM Appointment_Service WHERE Ap_ID ='"+id+"'").executeQuery();
        double [] arr=new double[2];
        double total = 0;
        double payAmount=0;
        while(set.next()){
             total+=set.getDouble(1);
         }
         arr[0]=total;
          
         ResultSet set1 = DBConnection.getInstance().getConnection().prepareStatement("SELECT Pay_Amount   FROM Payment WHERE Ap_ID ='"+id+"'").executeQuery();  
         while(set1.next()){
             payAmount+=set1.getDouble(1);
         }
         arr[1]=total-payAmount;
        
         return arr;
   }

    public boolean savePayemet(Payment p1) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("INSERT INTO Payment VALUES (?,?,?,?,?,?,?)");
        stm.setObject(1, p1.getAp_ID());
        stm.setObject(2, p1.getP_ID());
        stm.setObject(3, p1.getP_Date());
        stm.setObject(4, p1.getP_Time());
        stm.setObject(5, p1.getPay_Amount());
        stm.setObject(6, p1.getBalance());
        stm.setObject(7, p1.getTotal_Cost());
        if(stm.executeUpdate()>0){
            return true;
        }else{
            return false;
        }
    }

    public ArrayList<Payment> getPayment(String id) throws ClassNotFoundException, SQLException {
        ResultSet set = DBConnection.getConnection().prepareStatement("SELECT * FROM Payment WHERE Ap_ID='"+id+"'").executeQuery();
       ArrayList <Payment> list=new ArrayList<>();
        
       while(set.next()){
           Payment p1=new Payment();
           p1.setAp_ID(set.getString(1));
             p1.setP_ID(set.getString(2));
               p1.setP_Date(set.getString(3));
                 p1.setP_Time(set.getString(4));
                   p1.setPay_Amount(Double.parseDouble(set.getString(5)));
                     p1.setBalance(Double.parseDouble(set.getString(6)));
                       p1.setTotal_Cost(Double.parseDouble(set.getString(7)));
                      
                   list.add(p1);
       }
       return list;
    }

    public boolean removePayment(String aid, String pid) throws ClassNotFoundException, SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement("DELETE FROM Payment WHERE Ap_ID='"+aid+"' and P_ID='"+pid+"'");
         return stm.executeUpdate()>0;
    }

    public boolean paymentUpdate(Payment p1) throws ClassNotFoundException, SQLException {
         Connection conn = DBConnection.getInstance().getConnection();
          PreparedStatement stm = conn.prepareStatement("UPDATE Payment SET Pay_Amount=?,Balance=? WHERE Ap_ID=? and P_ID=? ");
          stm.setObject(1,p1.getPay_Amount());
           stm.setObject(2,p1.getBalance());
          stm.setObject(3,p1.getAp_ID());
          stm.setObject(4,p1.getP_ID());
          
          return stm.executeUpdate()>0;
    }

    public ArrayList<Payment> getPayments() throws SQLException {
       ResultSet set = DBConnection.getConnection().prepareStatement("SELECT * FROM Payment" ).executeQuery();
       ArrayList <Payment> list=new ArrayList<>();
        
       while(set.next()){
           Payment p1=new Payment();
           p1.setAp_ID(set.getString(1));
             p1.setP_ID(set.getString(2));
               p1.setP_Date(set.getString(3));
                 p1.setP_Time(set.getString(4));
                   p1.setPay_Amount(Double.parseDouble(set.getString(5)));
                     p1.setBalance(Double.parseDouble(set.getString(6)));
                       p1.setTotal_Cost(Double.parseDouble(set.getString(7)));
                      
                   list.add(p1);
       }
       return list;
    }

   

  

   
   
    
}
