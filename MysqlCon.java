import java.sql.*;
import util.dbUtil;
public class MysqlCon {

  public static void main(String[] args) throws SQLException {
  dbUtil con = new dbUtil() ;
  Connection cnx = con.dbConnect() ;
    /* ResultSet rs = con.dbRead(cnx, "SELECT * FROM USER") ;
    System.out.println(rs.getInt(1)) ;
    con.dbKill(cnx) ; */

  }
    
}
