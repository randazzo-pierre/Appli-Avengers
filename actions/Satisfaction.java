package actions;

import java.util.*;

public class Satisfaction {
    private String auteurSat;
    private String agentSat;
    private String titreSat;
    private String commentaireSat;
    private String fichierSat;
    private int noteSat;

    /**
     * @param auteurSat
     * @param agentSat
     * @param titreSat
     * @param commentaireSat
     * @param fichierSat
     * @param noteSat
     */

     public Satisfaction(String auteurSat, String agentSat, String titreSat, String commentaireSat,
     String fichierSat, int noteSat){
         this.auteurSat = auteurSat;
         this.agentSat = agentSat;
         this.titreSat = titreSat;
         this.commentaireSat = commentaireSat;
         this.fichierSat = fichierSat;
         this.noteSat = noteSat;
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
