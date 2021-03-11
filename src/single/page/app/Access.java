package single.page.app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Access {
public ArrayList<User> getUsers(Connection con) throws SQLException {
    ArrayList<User> userList = new ArrayList<User>();
    PreparedStatement stmt = con.prepareStatement("SELECT * FROM USER, ADDRESS WHERE USER.id = ADDRESS.user_id");
    ResultSet rs = stmt.executeQuery();
    try {
        while(rs.next()) {
            
            int id = rs.getInt("id");
            String name = rs.getString("name");
            String surname = rs.getString("surname");
            String gender = rs.getString("gender");
            String birthday = rs.getString("birthday");
            String workaddress = rs.getString("work_address");
            String homeaddress = rs.getString("home_address");
             
            User newuser = new User(id, name, surname, gender, birthday, workaddress, homeaddress);
            userList.add(newuser);
        }
        
    } catch (SQLException e) {
        e.printStackTrace();
        }
    return userList;
}

}
