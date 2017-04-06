
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DataMapper {

    public ArrayList getUsers() throws SQLException {
        ArrayList<String> Password = new ArrayList<>();
        String sql = "select password from users where userId > ?;";
        try {
            PreparedStatement ps = DBConnector.getConnection().prepareStatement(sql);
            ps.setInt(1, 0);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String password = rs.getString("password");

                Password.add(password);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DataMapper.class.getName()).log(Level.SEVERE, null, ex);

        }
        return Password;

    }

    public void getUser(String name, String password) throws SQLException {
        //geting the userts and password from the database
        String sql = "SELECT name and password from users where name =? and password = ?;";

        try {
            PreparedStatement ps = DBConnector.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, password);
            ps.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(DataMapper.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList checkmails() throws SQLException {
        //checking users if they are in the database
        ArrayList<String> mail = new ArrayList<>();

        String sql = "select mail from users where userId > ?;";
        try {
            PreparedStatement ps = DBConnector.getConnection().prepareStatement(sql);
            ps.setInt(1, 0);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String Mail = rs.getString("mail");

                mail.add(Mail);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DataMapper.class.getName()).log(Level.SEVERE, null, ex);

        }
        return mail;

    }

    public void createUser(String name, String email, String phone, String password) throws SQLException {
        String sql = "INSERT INTO users(name, email, phone, password) values(?, ?, ?, ?);";
        try {
            PreparedStatement ps = DBConnector.getConnection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, phone);
            ps.setString(4, password);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DataMapper.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public ArrayList checkUsernames() throws SQLException {
        ArrayList<String> userNames = new ArrayList<>();
        String sql = "select name from users where userId > ?;";
        try {
            PreparedStatement ps = DBConnector.getConnection().prepareStatement(sql);
            ps.setInt(1, 0);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                userNames.add(name);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DataMapper.class.getName()).log(Level.SEVERE, null, ex);

        }
        return userNames;

    }
}
