package actions;

import java.util.*;

public class Crise {
    private int idCr;
    private String nomCr;
    private String typeCr;
    private String cibleCr;
    private String descriptionCr;

    /**
     * @param idCR
     * @param nomCr
     * @param typeCr
     * @param cibleCr
     * @param descriptionCr
     */

     public Crise(int idCr, String nomCr, String typeCr, String cibleCr, String descriptionCr){
         this. idCr = idCr;
         this. nomCr = nomCr;
         this.typeCr = typeCr;
         this.cibleCr = cibleCr;
         this.descriptionCr = descriptionCr;
     }

/**
* @return int
*/
public int getidCr(){
        return idCr;
    }

/**
 * @return String
 */
public String getTypeCr(){
    return typeCr;
}

/**
 * @return String
 */
public String getCibleCr(){
    return cibleCr;
}

/**
 * @return String
 */
public String getDescriptionCr(){
    return descriptionCr;
}

/**
* @param idCR
*/
public void setIdCr (int idCR){
        this.idCr = idCR;
    }

/**
 * @param nomCr
 */
public void setNomCr(String nomCr){
    this.nomCr = nomCr;
}

/**
 * @param typeCr
 */
public void setTypeCr(String typeCr){
    this.typeCr = typeCr;
}
/**
 * @param cibleCr
 */
public void setCibleCr(String cibleCr){
    this.cibleCr = cibleCr;
}
/**
 * @param descriptionCr
 */
public void setDesccritpionCr(String descriptionCr){
    this.descriptionCr = descriptionCr;
}

}
