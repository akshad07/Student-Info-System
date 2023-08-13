import java.sql.*;
public class studentapp {
    public static void main (String args[])
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bca";
            String username = "root";
            String password = "Akshad@07sp";
            Connection con = DriverManager.getConnection(url, username, password);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
