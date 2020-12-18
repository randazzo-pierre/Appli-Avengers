import java.sql.*;
import util.dbUtil;
public class MysqlCon {

  /**
   * 
   * @param args
   * @throws SQLException
   */
  public static void main(String[] args) throws SQLException {
  dbUtil con = new dbUtil() ;
  @SuppressWarnings("unused")
  Connection cnx = con.dbConnect() ;
  }
    
}
