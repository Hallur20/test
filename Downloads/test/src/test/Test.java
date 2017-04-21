package test;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) throws SQLException {
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "test");
        String sql = "select * from yo;";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        System.out.println("\u001B[31m" + "test1\t\ttest2\t\ttest3");
        
        String sql2 = "insert into yo()values(3,\"cya\",false)";
        PreparedStatement ps2 = con.prepareStatement(sql2);
        ps2.executeUpdate(sql2);
        
        while(rs.next()){
            System.out.print(rs.getInt("test1") + "\t\t");
            System.out.print(rs.getString("test2") + "\t\t");
            System.out.print(rs.getBoolean("test3") +"\n");
        }
    }
    
}
