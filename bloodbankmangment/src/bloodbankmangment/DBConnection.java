/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodbankmangment;
import java.sql.*;


/**
 *
 * @author HP
 */
public class DBConnection {
   public static void main(String[]args){
       Connection con=getCon();
       if(con != null){
           System.out.println("connection established successfully");
           
       }
       else {
           System.out.println("failed to connect");
       }
   }
    
    
    public static Connection getCon()
    {
        
      
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/blooddon","root","");
            return con;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            return null;   
        }
    }
    
}




