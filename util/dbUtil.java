package util;
import java.sql.*;

import javax.swing.JFrame;

public class dbUtil extends JFrame{

	private static final long serialVersionUID = 1L;
  //Paramètres de connexion à la BDD
  private static String dbhost = "rds-mysql-avengersapp.cdx9i8eyllsk.eu-west-3.rds.amazonaws.com" ;
  private static String dbport = "3306" ;
  //private static String dbuser = "dbroot" ;
  //private static String dbpwd = "QeTuZ2LFJfSqtbpe" ;
  private static String dbschema = "BDD_AVENGERS_DEV" ;

  //Database credentials
  static final String USER = "dbroot";
  static final String PASS = "QeTuZ2LFJfSqtbpe" ;

  // JDBC driver name and database URL
  static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
  static final String DB_URL = "jdbc:mysql://"+dbhost+":"+dbport+"/"+dbschema+"?user="+USER+"&password="+PASS;

  //method pour se connecter renvoi un object de session de connexion qui correspond à la connexion
    public Connection dbConnect() throws SQLException {
      Connection conn = null;
     // Statement stmt = null;
      try{
       // Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Connecting to database...");
        //conn = DriverManager.getConnection(DB_URL,USER,PASS);
        conn = DriverManager.getConnection(DB_URL);
       
      } catch(SQLException sqlException){
    	  sqlException.printStackTrace();
    }
	return conn;
  }

  /**
   * Methode Create, doit retourner l'ID BDD de ce qui est créé
   * @param con
   * @param query
   * @return
   * @throws SQLException
   */
  public int dbCreate(Connection con, String query) throws SQLException {
     int ret ;
    //préparation de la requête
    PreparedStatement pstmt=con.prepareStatement(query) ;
    //Execution
    Boolean ex = pstmt.execute() ;
    if(ex) {
      ResultSet rs = pstmt.getResultSet() ;
      //ici on doit lire le resultat et récupérer l'ID
        ret = rs.getInt(1) ;
        return ret ;
    }return 9999;
  } 

  /**
   * Methode Read retour un objet de type ResultSet qui contient la réponse
   * @param con
   * @param query
   * @return
   * @throws SQLException
   */
  public ResultSet dbRead(Connection con, String query) throws SQLException  {
    //préparation de la requête
    PreparedStatement pstmt=con.prepareStatement(query) ;
    //Execution
    pstmt.execute() ;

    ResultSet rs = pstmt.getResultSet() ;
    //ici on doit lire le resultat et récupérer l'ID
    return rs;
  }

    /**
     * Methode Update retourne l'ID de ce qui sera mis à jour
     * @param con
     * @param query
     * @return
     * @throws SQLException
     */
    public int dbUpdate(Connection con, String query) throws SQLException {
    //préparation de la requête
    PreparedStatement pstmt=con.prepareStatement(query) ;
    //Execution
    int ex = pstmt.executeUpdate() ;

    return ex;
}

  /**
   * Methode Delete renvoi le statusCode de la réponse BDD
   * @param con
   * @param query
   * @return
   * @throws SQLException
   */
  public ResultSet dbDelete(Connection con, String query) throws SQLException {
//préparation de la requête
PreparedStatement pstmt=con.prepareStatement(query) ;
//Execution
pstmt.execute() ;

  ResultSet rs = pstmt.getResultSet() ;
  //ici on doit lire le resultat et récupérer l'ID
    return rs;

  }

  /**
   * Methode pour la deconnexion, tue la connexion renvoi un statusCode de la deco
   * @param con
   * @return
   * @throws SQLException
   */
  public boolean dbKill(Connection con) throws SQLException {

    con.close() ;
    if(con.isClosed()) {
      return true ;
    }
    else {return false ;
    }
    
} 
//fermeture de la classe dbUtil
}
