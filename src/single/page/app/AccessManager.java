package single.page.app;

import java.sql.Connection;
import java.util.ArrayList;


public class AccessManager {
public ArrayList<User> getUsers() throws Exception {
    ArrayList<User> userList = new ArrayList<User>();
    Database db = new Database();
    Connection con = db.getConnection();
    Access access = new Access();
    userList = access.getUsers(con);
    return userList;
}



}