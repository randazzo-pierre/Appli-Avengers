package util;
import java.sql.*;

//import sun.security.krb5.internal.crypto.RsaMd5CksumType;
public class dbUtil {

  //Paramètres de connexion à la BDD
  private static String dbhost = "rds-mysql-avengersapp.cdx9i8eyllsk.eu-west-3.rds.amazonaws.com" ;
  private static String dbport = "3306" ;
  //private static String dbuser = "dbroot" ;
  //private static String dbpwd = "QeTuZ2LFJfSqtbpe" ;
  private static String dbschema = "BDD_AVENGERS_DEV" ;

  // JDBC driver name and database URL
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://"+dbhost+":"+dbport+"/"+dbschema;

  //Database credentials
  static final String USER = "dbroot";
  static final String PASS = "QeTuZ2LFJfSqtbpe" ;


    //Construction de la chaine de connexion BDD
   // private static String dbDriver = "jdbc:mysql://"+dbhost+":"+dbport+"/"+dbschema ;
   // Class.forName("com.mysql.jdbc.Driver");

  //method pour se connecter renvoi un object de session de connexion qui correspond à la connexion
    public Connection dbConnect() throws SQLException {
      Connection conn = null;
      Statement stmt = null;
      try{
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connecting to database...");
       conn = DriverManager.getConnection(DB_URL,USER,PASS);
       
      //here sonoo is database name, root is username and password
       // Statement stmt=con.createStatement();
       // ResultSet rs=stmt.executeQuery("select * from USER");
       // while(rs.next())
       // System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
       // con.close();
        return conn ;
      }
    }
  }
   
    


  //Methode Create, doit retourner l'ID BDD de ce qui est créé

  public int dbCreate(Connection con, String query) throws SQLException {
     int ret ;
    //préparation de la requête
    PreparedStatement pstmt=con.prepareStatement(query) ;
    //Execution
    Boolean ex = pstmt.execute() ;
    if(ex = true) {
      ResultSet rs = pstmt.getResultSet() ;
      //ici on doit lire le resultat et récupérer l'ID
        ret = rs.getInt(1) ;
        return ret ;
    }
  }

  //Methode Read retour un objet de type ResultSet qui contient la réponse

  public ResultSet dbRead(Connection con, String query) throws SQLException  {
//préparation de la requête
PreparedStatement pstmt=con.prepareStatement(query) ;
//Execution
Boolean ex = pstmt.execute() ;
if(ex = true) {
  ResultSet rs = pstmt.getResultSet() ;
  //ici on doit lire le resultat et récupérer l'ID
    return rs;
}
  }

  //Methode Update retourne l'ID de ce qui sera mis à jour

  public int dbUpdate(Connection con, String query) throws SQLException {
//préparation de la requête
PreparedStatement pstmt=con.prepareStatement(query) ;
//Execution
int ex = pstmt.executeUpdate() ;

    return ex;
}


  //Methode Delete renvoi le statusCode de la réponse BDD

  public ResultSet dbDelete(Connection con, String query) throws SQLException {
//préparation de la requête
PreparedStatement pstmt=con.prepareStatement(query) ;
//Execution
Boolean ex = pstmt.execute() ;
if(ex = true) {
  ResultSet rs = pstmt.getResultSet() ;
  //ici on doit lire le resultat et récupérer l'ID
    return rs;
}
  }


  //Methode pour la deconnexion, tue la connexion renvoi un statusCode de la deco

  public boolean dbKill(Connection con) {

    con.close() ;
    if(con.isClosed()) {
      return true ;
    }
    else {return false ;
    }
    
}
//fermeture de la classe dbUtil
}
