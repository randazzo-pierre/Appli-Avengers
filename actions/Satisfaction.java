package actions;

import java.util.*;

public class Satisfaction {
    private int idS;
    private String auteurSat;
    private String agentSat;
    private String titreSat;
    private String commentaireSat;
    private String fichierSat;
    private int noteSat;

    /**
     * @param idS
     * @param auteurSat
     * @param agentSat
     * @param titreSat
     * @param commentaireSat
     * @param fichierSat
     * @param noteSat
     */

     public Satisfaction(int idS, String auteurSat, String agentSat, String titreSat, String commentaireSat,
     String fichierSat, int noteSat){
         this.idS = idS;
         this.auteurSat = auteurSat;
         this.agentSat = agentSat;
         this.titreSat = titreSat;
         this.commentaireSat = commentaireSat;
         this.fichierSat = fichierSat;
         this.noteSat = noteSat;
     }

    /**
     * @return int
     */
    public int getIdS(){
        return idS;
    }

/**
 * @return String
 */
public String getAuteurSat(){
    return auteurSat;
}

/**
 * @return String
 */
public String getAgentSat(){
    return agentSat;
}
/**
 * @return String
 */
public String getTitreSat(){
    return titreSat;
}
/**
 * @return String
 */
public String getCommentaireSat(){
    return commentaireSat;
}
/**
 * @return String
 */
public String getFichierSat(){
    return fichierSat;
}
/**
 * @return int
 */
public int getNoteSat(){
    return noteSat;
}

/**
* @param idS
 */
public void setIdS(int idS){
        this.idS = idS;
    }

/**
 * @param auteurSat
 */
public void setAuteurSat(String auteurSat){
    this.auteurSat = auteurSat;
}

/**
 * @param agentSat
 */
public void setAgentSat(String agentSat){
    this.agentSat = agentSat;
}

/**
 * @param titreSat
 */
public void setTitreSat(String titreSat){
    this.titreSat = titreSat;
}

/**
 * @param commentaireSat
 */
public void setCommentaireSat(String commentaireSat){
    this.commentaireSat = commentaireSat;
}

/**
 * @param fichierSat
 */
public void setFichierSat(String fichierSat){
    this.fichierSat = fichierSat;
}

/**
 * @param noteSat
 */
public void setNoteSat(int noteSat){
    this.noteSat = noteSat;
}

}
