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
     * @param inputCommentaire
     * @param score
     * @param auteur
     * @param titre
     * @param idR
     * @param titreR
     * @param auteurR
     * @param descriptionR
     * @param criseR
     * @param missionR
     * @param statutR
     * @throws SQLException
     */
    public Rapport(int idR, String titre, String heros, String status, String inputCommentaire) throws SQLException {
        this.idR = idR;
        this.titreR = titre;
        this.auteurR = heros;
        this.descriptionR = inputCommentaire;
        this.statutR = status;

        String mot = "mot";
        String idInc = mot.charAt(mot.length() - 1);

        // connexion bdd
        dbUtil utl = new dbUtil();
        Connection cnx = utl.dbConnect();
        try {
            String request = "INSERT INTO RAPPORT(TITRE_R, AUTEURR, DESCRIPTIONR, STATUTR) VALUES('" + titreR + "', '"
                    + auteurR + "', '" + descriptionR + "', '" + statutR + "')";
            System.out.println(request);
            int insert = utl.dbCreate(cnx, request);
            this.setIdR(insert);
            utl.dbKill(cnx);
            System.out.println("insertion ok");
        } catch (SQLException e) {
            System.out.println(e);
        }
        // changement du status MISSION
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://rds-mysql-avengersapp.cdx9i8eyllsk.eu-west-3.rds.amazonaws.com:3306/BDD_AVENGERS_DEV",
                    "dbroot", "QeTuZ2LFJfSqtbpe");

            PreparedStatement st = (PreparedStatement) con
                    .prepareStatement("Update MISSION set STATUS=? where TITREM=" + titreR + "");
            st.setString(1, statutR);
            st.setString(2, titreR);
            st.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        // changement du status INCIDENT
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://rds-mysql-avengersapp.cdx9i8eyllsk.eu-west-3.rds.amazonaws.com:3306/BDD_AVENGERS_DEV",
                    "dbroot", "QeTuZ2LFJfSqtbpe");

            PreparedStatement st = (PreparedStatement) con
                    .prepareStatement("Update INCIDENT set STATUS=? where ID_I=" + titreR + "");
            st.setString(1, statutR);
            st.setString(2, titreR);
            st.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }

        // return this.idI ;
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
