package actions;

import java.util.*;

public class Satisfaction {
    private int idS;
    private int idC;
    private String titreSat;
    private String auteurSat;
    private String agentSat;
    private String commentaireSat;
    private int noteSat;
    private String fichierSat;

     public Satisfaction(int idS, int idC, String titreSat, String auteurSat, String agentSat, String commentaireSat, int noteSat, String fichierSat){
         this.idS = idS;
         this.idC = idC;
         this.titreSat = titreSat;
         this.auteurSat = auteurSat;
         this.agentSat = agentSat;
         this.commentaireSat = commentaireSat;
         this.noteSat = noteSat;
         this.fichierSat = fichierSat;
     }

    /**
     * @return int
     */
    public int getIdS(){
        return idS;
    }
/**
 * 
 * @return
 */
    public int getIdC() {
        return idC;
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
 * 
 * @param idC
 */
    public void setIdC(int idC) {
        this.idC = idC;
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
