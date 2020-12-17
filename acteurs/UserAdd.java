package acteurs;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import util.dbUtil;

public class UserAdd {

    public String username;
    private String password;
    public String role;
    public Date create_time;
    public int id;

    public UserAdd(String username, String password, String role, Date create_time, int id) throws SQLException {

        this.username = username;
        this.password = password;
        this.role = role;
        this.create_time = create_time;
        this.id = id;
        // connexion bdd
        dbUtil utl = new dbUtil();
        Connection cnx = utl.dbConnect();
        try {
            String request = "INSERT INTO USER( username, password, role, create_time) VALUES('" + username + "', '"
                    + password + "', '" + role + "', '" + create_time + "')";
            System.out.println(request);
            int insert = utl.dbCreate(cnx, request);
            this.setidI(insert);
            utl.dbKill(cnx);
            System.out.println("insertion ok");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return;
    }

    private void setidI(int insert) {
    }

    /**
     * @return String
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return String
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return String
     */
    public String getRole() {
        return role;
    }

    /**
     * @return String
     */
    public Date getDate() {
        return create_time;
    }

    /**
     * @return int
     */
    public int getidC() {
        return id;
    }

}
