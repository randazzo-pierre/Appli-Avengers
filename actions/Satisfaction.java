package actions;

import java.sql.*;

import util.dbUtil;

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

     public Satisfaction(String titre, String auteur, String agent, String score, String inputCommentaire)
             throws SQLException {
         System.out.println("Création d'un formulaire de satisfaction avec les paramètres : "+titre+" créé par : "+auteur+" qui concerne l'agent : "+agent+" qui a eu le score de :"+score+" et le commentaire suivant :"+inputCommentaire);
         /**
          * connexion bdd
          */
         dbUtil utl = new dbUtil();
         Connection cnx = utl.dbConnect();
         try {
             String request = "INSERT INTO SATISFACTION VALUES(ID_S, ID_C, '"+titre+"', '"+auteur+"', '"+agent+"', '"+inputCommentaire+"', '"+score+"', '')";
            System.out.println(request);
            int insert = utl.dbCreate(cnx, request);
            this.setIdS(insert);
            utl.dbKill(cnx);
            System.out.println("insertion ok");
            } catch (SQLException e) {
                System.out.println(e);

            }
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
