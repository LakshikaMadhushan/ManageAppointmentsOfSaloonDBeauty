
package lk.ijse.salone.Controller;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import lk.ijse.salone.DB.DBConnection;


public class ReportController {

    public Double getAlldailyIncome(String s1) throws Exception {
       
        System.out.println(s1);
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement(" SELECT SUM(Pay_Amount) FROM Payment WHERE P_Date='"+s1+"'").executeQuery();
       double d=0;
        if(set.next()){
             d=set.getInt(1);
             return d;
        }
     
       
     
        return null;
    }

    public Double getMonthlyIncome(String s1) throws ClassNotFoundException, SQLException, ParseException {
        
      

      
      
      
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement
        (" SELECT SUM(Pay_Amount) FROM Payment WHERE year(P_date)=year('"+ s1 +"') and month(P_Date)=month('"+ s1 +"')").executeQuery();
       double d=0;
        if(set.next()){
             d=set.getInt(1);
             return d;
        }
     
       
     
        return null;
        
        
    }

    public Double getYearlyIncome(String s1) throws Exception {
       
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement
        (" SELECT SUM(Pay_Amount) FROM Payment WHERE year(P_date)=year('"+ s1 +"')").executeQuery();
       double d=0;
        if(set.next()){
             d=set.getInt(1);
             return d;
        }
     
       
     
        return null;
        
        
    }

    public Double getEmployeeAlldailyIncome(Object a1,String s1) throws Exception{
      
          ResultSet set = DBConnection.getInstance().getConnection().prepareStatement
        (" SELECT SUM(Pay_Amount ) from Payment,Appointment WHERE Payment.Ap_ID= Appointment.Ap_ID AND P_Date='"+s1+"' AND Emp_ID='"+a1+"' ").executeQuery();
        double d=0;
        if(set.next()){
             d=set.getInt(1);
             return d;
        }
     
       
     
        return null;
    }

    public Double getEmployeeAllMonthlyIncome(Object a1, String s1)  throws Exception{
       ResultSet set = DBConnection.getInstance().getConnection().prepareStatement
        (" SELECT SUM(Pay_Amount ) from Payment,Appointment WHERE Payment.Ap_ID= Appointment.Ap_ID AND month(P_Date)=month('"+s1+"')"
                + "AND year(P_Date)=year('"+s1+"')"+" AND Emp_ID='"+a1+"' ").executeQuery();
        double d=0;
        if(set.next()){
             d=set.getInt(1);
             return d;
        }
     
       
     
        return null;
    }

    public Double getEmployeeAllYearlyIncome(Object a1, String s1)  throws Exception{
     ResultSet set = DBConnection.getInstance().getConnection().prepareStatement
        (" SELECT SUM(Pay_Amount ) from Payment,Appointment WHERE Payment.Ap_ID= Appointment.Ap_ID AND year(P_Date)=year('"+s1+"')"+" AND Emp_ID='"+a1+"' ").executeQuery();
        double d=0;
        if(set.next()){
             d=set.getInt(1);
             return d;
        }
     
       
     
        return null;
    }

    public double getServiceIncomeDaily(Object a1, String s1)  throws Exception{
     ResultSet set = DBConnection.getInstance().getConnection().prepareStatement
        ("SELECT COUNT(S_ID)*S_Price from Payment,Appointment_Service WHERE Payment.Ap_ID = Appointment_Service.Ap_ID  AND P_Date='"+s1+"' AND S_ID='"+a1+"' AND Balance='0' ").executeQuery();
        double d=0;
        if(set.next()){
             d=set.getInt(1);
             return d;
        }
     
        
       
     
        return 0;
    }

    public double getServiceIncomeMonthly(Object a1, String s1)  throws Exception{
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement
        ("SELECT COUNT(S_ID)*S_Price from Payment,Appointment_Service WHERE Payment.Ap_ID = Appointment_Service.Ap_ID AND year(P_Date)=year('"+s1+"')  AND month(P_Date)=month('"+s1+"') AND S_ID='"+a1+"' AND Balance='0' ").executeQuery();
        double d=0;
        if(set.next()){
             d=set.getInt(1);
             return d;
        }
     
        
       
     
        return 0;
    }

    public double getServiceIncomeYearly(Object a1, String s1)throws Exception {
       ResultSet set = DBConnection.getInstance().getConnection().prepareStatement
        ("SELECT COUNT(S_ID)*S_Price from Payment,Appointment_Service WHERE Payment.Ap_ID = Appointment_Service.Ap_ID AND year(P_Date)=year('"+s1+"')   AND S_ID='"+a1+"' AND Balance='0' ").executeQuery();
        double d=0;
        if(set.next()){
             d=set.getInt(1);
             return d;
        }
     
        
       
     
        return 0;
    }

    public double getCatogeryIncomeDaily(Object a1, String s1)throws Exception {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement
        ("SELECT COUNT(Appointment_Service.S_ID)*Appointment_Service.S_Price from Payment,Appointment_Service,Service WHERE Payment.Ap_ID = Appointment_Service.Ap_ID AND Appointment_Service.S_ID=Service.S_ID AND P_Date='"+s1+"'AND Cat_ID='"+a1+"' AND Balance='0' GROUP BY Service.S_ID  ").executeQuery();
        double d=0;
       while(set.next()){
           d+=set.getInt(1);
       }
       return d;
        
    }

    public double getCatogeryIncomeMonthly(Object a1, String s1)throws Exception {
         ResultSet set = DBConnection.getInstance().getConnection().prepareStatement
        ("SELECT COUNT(Appointment_Service.S_ID)*Appointment_Service.S_Price from Payment,Appointment_Service,Service WHERE Payment.Ap_ID = Appointment_Service.Ap_ID AND Appointment_Service.S_ID=Service.S_ID AND month(P_Date)=month('"+s1+"') AND year(P_Date)=year('"+s1+"') AND Cat_ID='"+a1+"' AND Balance='0' GROUP BY Service.S_ID  ").executeQuery();
        double d=0;
       while(set.next()){
           d+=set.getInt(1);
       }
       return d;
    }

    public double getCatogeryIncomeYearly(Object a1, String s1)throws Exception  {
        ResultSet set = DBConnection.getInstance().getConnection().prepareStatement
        ("SELECT COUNT(Appointment_Service.S_ID)*Appointment_Service.S_Price from Payment,Appointment_Service,Service WHERE Payment.Ap_ID = Appointment_Service.Ap_ID AND Appointment_Service.S_ID=Service.S_ID AND year(P_Date)=year('"+s1+"') AND Cat_ID='"+a1+"' AND Balance='0' GROUP BY Service.S_ID  ").executeQuery();
        double d=0;
       while(set.next()){
           d+=set.getInt(1);
       }
       return d;
    }

   
    
}

