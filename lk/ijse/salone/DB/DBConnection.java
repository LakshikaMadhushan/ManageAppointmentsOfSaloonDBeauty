
package lk.ijse.salone.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
    private static DBConnection dBConnection;
    private static Connection connection;
    
   private DBConnection() throws ClassNotFoundException, SQLException{
       
       Class.forName("com.mysql.jdbc.Driver");
       connection=DriverManager.getConnection("jdbc:mysql://localhost/Saloon","root","1234");
   }
   public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
       return(dBConnection==null)? (dBConnection=new DBConnection()) : (dBConnection);
   }
   public static Connection getConnection(){
       return connection;
   }
    
}
