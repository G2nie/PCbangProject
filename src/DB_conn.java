import java.sql.*;
import java.io.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DB_conn {
    String strDriver = "com.mysql.cj.jdbc.Driver";
    String strURL = "jdbc:mysql://localhost:3306/example?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    String strUser = "test";
    String strPWD = "pm1023";
//    String strURL = "jdbc:mysql://115.41.134.165:3306/example?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
//    String strUser = "root";
//    String strPWD = "rootpw";
    
    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;
    
    public void dbOpen() throws IOException {
        try {
            Class.forName(strDriver);
            DB_con = DriverManager.getConnection(strURL, strUser, strPWD);
            DB_stmt = DB_con.createStatement();
        } catch (Exception e) {
            System.err.println("SQLOpenException : " + e.getMessage());
        }
    }
    
    public void dbClose() throws IOException {
        try {
            DB_stmt.close();
            DB_con.close();
        } catch (SQLException e) {
            System.err.println("SQLException : " + e.getMessage());
        }
    }
}