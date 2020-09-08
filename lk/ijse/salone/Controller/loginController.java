
package lk.ijse.salone.Controller;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.salone.DB.DBConnection;



public class loginController {

    public static boolean Login(String userName,String password) throws ClassNotFoundException, SQLException{
        Connection connection=DBConnection.getInstance().getConnection();
        PreparedStatement prepareStm=null;
        ResultSet rst=null;
        
        try{
            String SQL="Select * from login where User=? and Password=? ";
            prepareStm=connection.prepareStatement(SQL);
            prepareStm.setString(1, userName);
            prepareStm.setString(2,password);

            rst=prepareStm.executeQuery();
            if(rst.next()){
                return true;
            }else{
                return false;
            }
        }catch(Exception ex){
            return false;
        }finally{
            rst.close();
        }
        
    }
}