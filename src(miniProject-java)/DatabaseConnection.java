
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class DatabaseConnection {
    public static void main(String[] args)
    {
    
    connection();
    }
public static Connection connection() 
{
    Connection conn = null;
    
try{
    Class.forName("com.mysql.jdbc.Driver");
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
    Statement stm=conn.createStatement();
    ResultSet rs;
        rs = stm.executeQuery("select* from admin");
    System.out.println("true");}
catch(SQLException sqle)
{

System.out.println("Sql Exception :"+sqle.getMessage());
}

catch(ClassNotFoundException e)
{
System.out.println("Class Not Found Exception:"+e.getMessage());
}

return(conn);
} 

}