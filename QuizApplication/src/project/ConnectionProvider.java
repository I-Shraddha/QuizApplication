
package project;
import java.sql.*;
/**
 *
 * @author Admin
 */
public class ConnectionProvider {
    public static Connection getCon()
            {
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizdb","root","Root123");
                    return con;
                }
                catch(Exception e)
                {
//                    e.printStackTrace();
                    return null;
                }
            }
}
