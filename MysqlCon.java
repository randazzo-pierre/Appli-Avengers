import java.sql.*;
public class MysqlCon {

 private static String dbhost = "rds-mysql-avengersapp.cdx9i8eyllsk.eu-west-3.rds.amazonaws.com" ;
 private static String dbuser = "dbroot" ;
 private static String dbpwd = "QeTuZ2LFJfSqtbpe" ;

    public static void main(String args[]){
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(
            "jdbc:mysql://"+dbhost+":3306/BDD_AVENGERS_DEV",dbuser,dbpwd);
      //here sonoo is database name, root is username and password
        Statement stmt=con.createStatement();
        ResultSet rs=stmt.executeQuery("select * from USER");
        while(rs.next())
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        con.close();
      }catch(Exception e){ System.out.println(e);}
      }
    
}
