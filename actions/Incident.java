package actions;

import java.util.*;
import java.util.Date;
import java.sql.*;
import java.text.DateFormat;

import util.*;

public class Incident {
    private int idI;
    private String declarantInci;
    private String paysInci;
    private String zipInci;
    private DateFormat dateDebutInci;
    private DateFormat dateFinInci;
    private String descriptionInci;

    /**
     * param idI
     * @param delcarantInci
     * @param paysInci
     * @param zipInci
     * @param dateDebutInci
     * @param dateFinInci
     * @param descriptionInci
     */

public Incident(int idI, String declarantInci, String paysInci, String zipInci, DateFormat dateDebutInci,
DateFormat dateFinInci, String descriptionInci){
    this.idI = idI;
    this.declarantInci = declarantInci;
    this.paysInci = paysInci;
    this.zipInci = zipInci;
    this.dateDebutInci = dateDebutInci;
    this.dateFinInci = dateFinInci;
    this.descriptionInci = descriptionInci;
}

public  Incident(String declarant, Country selectedCountry, String inputzip, Date debut, String inputquoi) throws SQLException {
    System.out.println("Création d'un incident avec les paramètres suivant quoi : "+inputquoi+" Country : "+selectedCountry+" inputzip : "+inputzip+" créer par :"+declarant);
    //connexion bdd
   dbUtil utl = new dbUtil() ;
   Connection cnx = utl.dbConnect() ;
   try {
       String request = "INSERT INTO INCIDENT VALUES(ID_I,'"+declarant+"', '"+selectedCountry+"', '"+inputzip+"', '"+debut+"', '', '"+inputquoi+"')" ;
       System.out.println(request);
    int insert = utl.dbCreate(cnx, request) ;
    this.setidI(insert);
    utl.dbKill(cnx) ;
    System.out.println("insertion ok");
   } catch(SQLException e){
    System.out.println(e);
   }
    //return this.idI ;
	}
 
//le constructeur de la class
// public int __construct(String declaranInci, String paysInci, String zipInci, DateFormat dateDebutInci, String descriptionInci)
//         throws SQLException {
//             System.out.println("Création d'un incident avec les paramètres suivant quoi : "+descriptionInci+" Country : "+paysInci+" inputzip : "+zipInci+" créer par :"+declaranInci);
//     //connexion bdd
//    dbUtil utl = new dbUtil() ;
//    Connection cnx = utl.dbConnect() ;
//    int insert = utl.dbCreate(cnx, "INSERT INTO INCIDENT VALUES('', '', "+declaranInci+", "+paysInci+", "+zipInci+", "+dateDebutInci+", '', "+descriptionInci+")") ;
//     this.setidI(insert);
//     return this.idI ;
// }

/**
* @return int
*/
public int getIdI(){
        return idI;
    }

/**
 * @return String
 */
public String getDeclarantInci(){
    return declarantInci;
}

/**
 * @return String
 */
public String getPaysInci(){
    return paysInci;
}

/**
 * @return String
 */
public String getZipInci(){
    return zipInci;
}

/**
 * @return Date
 */
public DateFormat getDateDebutInci() {
    return dateDebutInci;
}

/**
 * @return Date
 */
public DateFormat getDateFinInci() {
    return dateFinInci;
}

/**
 * @return String
 */
public String getDescriptionInci(){
    return descriptionInci;
}

/**
* @param idI
*/
public void setidI(int idI){
        this.idI = idI;
    }

/**
 * @param declarantInci
 */
public void setDeclarantInci(String declarantInci){
    this.declarantInci = declarantInci;
}

/**
 * @param paysInci
 */
public void setPaysInci(String paysInci){
    this.paysInci = paysInci;
}

/**
 * @param zipInci
 */
public void setZipInci(String zipInci){
    this.zipInci = zipInci;
}

/**
 * @param dateDebutInci
 */
public void setDateDebutInci(DateFormat dateDebutInci){
    this.dateDebutInci = dateDebutInci;
}

/**
 * @param dateFinInci
 */
public void setDateFinInci(DateFormat dateFinInci){
    this.dateFinInci = dateFinInci;
}


/**
 * @param descriptionInci
 */
public void setDescriptionInci(String descriptionInci){
    this.descriptionInci = descriptionInci;
}
}
