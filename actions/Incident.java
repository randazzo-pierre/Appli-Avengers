package actions;

import java.util.*;
import java.sql.*;
import util.*;

public class Incident {
    private int idI;
    private String declarantInci;
    private String paysInci;
    private String zipInci;
    private Date dateDebutInci;
    private Date dateFinInci;
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

public Incident(int idI, String declarantInci, String paysInci, String zipInci, Date dateDebutInci,
Date dateFinInci, String descriptionInci){
    this.idI = idI;
    this.declarantInci = declarantInci;
    this.paysInci = paysInci;
    this.zipInci = zipInci;
    this.dateDebutInci = dateDebutInci;
    this.dateFinInci = dateFinInci;
    this.descriptionInci = descriptionInci;
}

//le constructeur de la class
public void __construct(String declaranInci, String paysInci, String zipInci, Date dateDebutInci, String descriptionInci) {

    //connexion bdd
   dbUtil utl = new dbUtil() ;
   Connection cnx = utl.dbConnect() ;
   int insert = utl.dbCreate(cnx, "INSERT INTO INCIDENT VALUES('', '', "+declaranInci+", "+paysInci+", "+zipInci+", "+dateDebutInci+", '', "+descriptionInci+")") ;
    this.setidI(insert);
    return this.idI ;
}

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
public Date getDateDebutInci(){
    return dateDebutInci;
}

/**
 * @return Date
 */
public Date getDateFinInci(){
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
public void setDateDebutInci(Date dateDebutInci){
    this.dateDebutInci = dateDebutInci;
}

/**
 * @param dateFinInci
 */
public void setDateFinInci(Date dateFinInci){
    this.dateFinInci = dateFinInci;
}


/**
 * @param descriptionInci
 */
public void setDescriptionInci(String descriptionInci){
    this.descriptionInci = descriptionInci;
}
}
