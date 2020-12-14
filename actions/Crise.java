package actions;

import java.util.*;

public class Crise {
    private String nomCr;
    private String typeCr;
    private String cibleCr;
    private String descriptionCr;

    /**
     * @param nomCr
     * @param typeCr
     * @param cibleCr
     * @param descriptionCr
     */

     public Crise(String nomCr, String typeCr, String cibleCr, String descriptionCr){
         this. nomCr = nomCr;
         this.typeCr = typeCr;
         this.cibleCr = cibleCr;
         this.descriptionCr = descriptionCr;
     }

/**
 * @return String
 */
public String getNomCr(){
    return nomCr;
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
