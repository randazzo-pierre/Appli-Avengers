import java.util.*;

public class Incident {
    private String declarantInci;
    private String paysInci;
    private String zipInci;
    private Date dateDebutInci;
    private Date dateFinInci;
    private String descriptionInci;

    /**
     * @param delcarantInci
     * @param paysInci
     * @param zipInci
     * @param dateDebutInci
     * @param dateFinInci
     * @param descriptionInci
     */

public Incident(String declarantInci, String paysInci, String zipInci, Date dateDebutInci,
Date dateFinInci, String descriptionInci){
    this.declarantInci = declarantInci;
    this.paysInci = paysInci;
    this.zipInci = zipInci;
    this.dateDebutInci = dateDebutInci;
    this.dateFinInci = dateFinInci;
    this.descriptionInci = descriptionInci;
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
