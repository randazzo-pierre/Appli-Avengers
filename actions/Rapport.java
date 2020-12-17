package actions;

import java.util.*;
import java.util.Date;

import java.sql.*;
import util.*;

public class Rapport {
    private int idR;
    private String titreR;
    private String auteurR;
    private String descriptionR;
    private ArrayList<String> criseR;
    private String missionR;
    private String statutR;

    /**
     * @param idR
     * @param titreR
     * @param auteurR
     * @param descriptionR
     * @param criseR
     * @param missionR
     * @param statutR
     */
    public Rapport(int idR, String titreR, String auteurR, String descriptionR, ArrayList<String> criseR, String missionR,
                   String statutR) {
        this.idR = idR;
        this.titreR = titreR;
        this.auteurR = auteurR;
        this.descriptionR = descriptionR;
        this.criseR = criseR;
        this.missionR = missionR;
        this.statutR = statutR;
    }


    public  Rapport( String titreR, Date descriptionR, ArrayList<String> criseR, String MissionR,String StatutR) throws SQLException {
        System.out.println("Création d'un rapport de mission avec les paramètres suivant Titre : "+titreR+" Nature : "+descriptionR+" début : "+criseR+" Urgence : "+missionR);
        //connexion bdd
       dbUtil utl = new dbUtil() ;
       Connection cnx = utl.dbConnect() ;
       try {
           String request = "INSERT INTO INCIDENT VALUES(ID_R,'"+titreR+"', '"+descriptionR+"', '"+criseR+"', '"+missionR+"', '"+statutR+"')" ;
           System.out.println(request);
        int insert = utl.dbCreate(cnx, request) ;
        this.setIdR(insert);
        utl.dbKill(cnx) ;
        System.out.println("insertion ok");
       } catch(SQLException e){
        System.out.println(e);
       }
        //return this.idI ;
        }

    /**
     * @return int
     */
    public int getIdR() {
        return idR;
    }

    /**
     * @return String
     */
    public String getTitreR() {
        return titreR;
    }

    /**
     * @return String
     */
    public String getAuteurR() {
        return auteurR;
    }

    /**
     * @return String
     */
    public String getDescriptionR() {
        return descriptionR;
    }

    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getCriseR() {
        return criseR;
    }

    /**
     * @return String
     */
    public String getMissionR() {
        return missionR;
    }

    /**
     * @return String
     */
    public String getStatutR() {
        return statutR;
    }

    /**
     * @param idR
     */
    public void setIdR(int idR) {
        this.idR = idR;
    }

    /**
     * @param titre
     */
    public void setTitreR(String titreR) {
        this.titreR = titreR;
    }

    /**
     * @param auteur
     */
    public void setAuteurR(String auteurR) {
        this.auteurR = auteurR;
    }

    /**
     * @param description
     */
    public void setDescriptionR(String descriptionR) {
        this.descriptionR = descriptionR;
    }

    /**
     * @param criseR
     */
    public void setCrise(ArrayList<String> criseR) {
        this.criseR = criseR;
    }

    /**
     * @param missionR
     */
    public void setMission(String missionR) {
        this.missionR = missionR;
    }

    /**
     * @param statutR
     */
    public void setStatut(String statutR) {
        this.statutR = statutR;
    }
}
