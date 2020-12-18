package actions;

import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import util.*;

public class Mission {
    private int idM;
    private String TitreM;
    private String DescriptionM;
    private String AssigneM;
    private String LeaderM;
    private String GraviteM;
    private String UrgenceM;
    private String PaysM;
    private int ZipM;
    public String idIncident;

    /**
     * 
     * @param idM
     * @param TitreM
     * @param DescriptionM
     * @param AssigneM
     * @param LeaderM
     * @param GraviteM
     * @param UrgenceM
     * @param PaysM
     * @param ZipM
     */
    public Mission(int idM, String TitreM, String DescriptionM, String AssigneM, String LeaderM, String GraviteM,
            String UrgenceM, String PaysM, int ZipM) {
        this.idM = idM;
        this.TitreM = TitreM;
        this.DescriptionM = DescriptionM;
        this.AssigneM = AssigneM;
        this.LeaderM = LeaderM;
        this.GraviteM = GraviteM;
        this.UrgenceM = UrgenceM;
        this.PaysM = PaysM;
        this.ZipM = ZipM;
    }

    public Mission(String inputTitre, String inputDescript, String coequipier, String hero, String gravite,
            String urgence, Country selectedCountry, int inputZip) throws SQLException {
        System.out.println("Création d'une mission avec les paramètres suivant Titre : " + inputTitre
                + " Description : " + inputDescript + " début : " + coequipier + " fin:" + hero + " Gravité : "
                + gravite + " Urgence : " + urgence + " Pays : " + selectedCountry + " Zip : " + inputZip);
        /**
         * connection bdd
         */
        dbUtil utl = new dbUtil();
        Connection cnx = utl.dbConnect();
        String statutm = "NEW";
        try {
            String request = "INSERT INTO MISSION(TITREM, DESCRIPTIONM, ASSIGNEM, LEADERM, GRAVITEM, URGENCEM, PAYSM, ZIPM, STATUTM) VALUES('"
                    + inputTitre + "', '" + inputDescript + "', '" + coequipier + "', '" + hero + "', '" + gravite
                    + "', '" + urgence + "', '" + selectedCountry + "', '" + inputZip + "', '" + statutm + "')";
            System.out.println(request);
            int insert = utl.dbCreate(cnx, request);
            this.setIdM(insert);
            utl.dbKill(cnx);
            System.out.println("insertion ok");
        } catch (SQLException e) {
            System.out.println(e);
        }

        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(inputTitre);
        if (m.find()) {
            System.out.println(m.group());
            idIncident = m.group();
        }

        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://rds-mysql-avengersapp.cdx9i8eyllsk.eu-west-3.rds.amazonaws.com:3306/BDD_AVENGERS_DEV",
                    "dbroot", "QeTuZ2LFJfSqtbpe");

            PreparedStatement st = (PreparedStatement) con
                    .prepareStatement("Update INCIDENT set STATUTI=? where ID_I=?");
            st.setString(1, "INPROGRESS");
            st.setString(2, idIncident);
            st.executeUpdate();
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    /**
     * @return int
     */
    public int getIdM() {
        return idM;
    }

    /**
     * @return String
     */
    public String getTitreM() {
        return TitreM;
    }

    /**
     * @return String
     */
    public String getDescriptionM() {
        return DescriptionM;
    }

    /**
     * @return String
     */
    public String getAssigneM() {
        return AssigneM;
    }

    /**
     * @return String
     */
    public String getLeaderM() {
        return LeaderM;
    }

    /**
     * @return String
     */
    public String getGraviteM() {
        return GraviteM;
    }

    /**
     * @return String
     */
    public String getUrgenceM() {
        return UrgenceM;
    }

    /**
     * @return String
     */
    public String getPaysM() {
        return PaysM;
    }

    /**
     * @return String ZipM
     */
    public int getZipM() {
        return ZipM;
    }

    /**
     * @param idM
     */
    public void setIdM(int idM) {
        this.idM = idM;
    }

    /**
     * @param TitreM
     */
    public void setTitreM(String TitreM) {
        this.TitreM = TitreM;
    }

    /**
     * @param Description
     */
    public void setDescriptionM(String DescriptionM) {
        this.DescriptionM = DescriptionM;
    }

    /**
     * @param AssigneM
     */
    public void setAssigneM(String AssigneM) {
        this.AssigneM = AssigneM;
    }

    /**
     * @param LeaderM
     */
    public void setLeaderM(String LeaderM) {
        this.LeaderM = LeaderM;
    }

    /**
     * @param GraviteM
     */
    public void setGraviteM(String GraviteM) {
        this.GraviteM = GraviteM;
    }

    /**
     * @param UrgenceM
     */
    public void setUrgenceM(String UrgenceM) {
        this.UrgenceM = UrgenceM;
    }

    /**
     * @param PaysM
     */
    public void setPaysM(String PaysM) {
        this.PaysM = PaysM;
    }

    /**
     * @param ZipM
     */
    public void setZipM(int ZipM) {
        this.ZipM = ZipM;
    }
}