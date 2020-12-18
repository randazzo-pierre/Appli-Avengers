package acteurs;

import java.sql.*;
import util.dbUtil;

public class Vilain {
    private int idV;
    private int idC;
    private String titrev;
    private String pouvoirv;
    private String pointFaiblev;
    private String identiteCivile;
    private int dangerv;
    private int nbCrimev;
    private String commentaireVilain;

    /**
     * 
     * @param idV
     * @param idC
     * @param titrev
     * @param pouvoirv
     * @param pointFaiblev
     * @param identiteCivile
     * @param dangerv
     * @param nbCrimev
     * @param commentaireVilain
     * @throws SQLException
     */
    public Vilain(int idV, int idC, String titrev, String pouvoirv, String pointFaiblev, String identiteCivile,
            int dangerv, int nbCrimev, String commentaireVilain) throws SQLException {
        this.idV = idV;
        this.idC = idC;
        this.titrev = titrev;
        this.pouvoirv = pouvoirv;
        this.pointFaiblev = pointFaiblev;
        this.identiteCivile = identiteCivile;
        this.dangerv = dangerv;
        this.nbCrimev = nbCrimev;
        this.commentaireVilain = commentaireVilain;

        /**
         * connexion bdd
         */
        dbUtil utl = new dbUtil();
        Connection cnx = utl.dbConnect();
        try {
            String request = "INSERT INTO VILAIN( ID_C, TITREV, POUVOIRV, FAIBLESSEV, IDENCIVILV, DANGERV, NBCRIME, DESCRIPTIONV ) VALUES('"
                    + idC + "', '" + titrev + "', '" + pouvoirv + "', '" + pointFaiblev + "', '" + identiteCivile
                    + "', '" + dangerv + "', '" + nbCrimev + "', '" + commentaireVilain + "')";
            System.out.println(request);
            int insert = utl.dbCreate(cnx, request);
            this.setIdC(insert);
            utl.dbKill(cnx);
            System.out.println("insertion ok");
        } catch (SQLException e) {
            System.out.println(e);
        }
        return;
    }

    /**
     * 
     * @return int
     */
    public int getIdV() {
        return idV;
    }

    /**
     * 
     * @return int
     */
    public int getIdC() {
        return idC;
    }

    /**
     * 
     * @return String
     */
    public String getTitrev() {
        return titrev;
    }

    /**
     * 
     * @return String
     */
    public String getPouvoirv() {
        return pouvoirv;
    }

    /**
     * 
     * @return String
     */
    public String getPointFaiblev() {
        return pointFaiblev;
    }

    /**
     * 
     * @return String
     */
    public String getIdentiteCivile() {
        return identiteCivile;
    }

    /**
     * 
     * @return int
     */
    public int getDangerv() {
        return dangerv;
    }

    /**
     * 
     * @return int
     */
    public int getNbCrimev() {
        return nbCrimev;
    }

    /**
     * 
     * @return String
     */
    public String getCommentaireVilain() {
        return commentaireVilain;
    }

    /**
     * 
     * @param idV
     */
    public void setIdV(int idV) {
        this.idV = idV;
    }

    /**
     * 
     * @param idC
     */
    public void setIdC(int idC) {
        this.idC = idC;
    }

    /**
     * 
     * @param titrev
     */
    public void setTitrev(String titrev) {
        this.titrev = titrev;
    }

    /**
     * 
     * @param pouvoirv
     */
    public void setPouvoirv(String pouvoirv) {
        this.pouvoirv = pouvoirv;
    }

    /**
     * 
     * @param pointFaiblev
     */
    public void setPointFaiblev(String pointFaiblev) {
        this.pointFaiblev = pointFaiblev;
    }

    /**
     * 
     * @param identiteCivile
     */
    public void setIdentiteCivile(String identiteCivile) {
        this.identiteCivile = identiteCivile;
    }

    /**
     * 
     * @param dangerv
     */
    public void setDangerv(int dangerv) {
        this.dangerv = dangerv;
    }

    /**
     * 
     * @param nbCrimev
     */
    public void setNbCrimev(int nbCrimev) {
        this.nbCrimev = nbCrimev;
    }

    /**
     * 
     * @param commentaireVilain
     */
    public void setCommentaireVilain(String commentaireVilain) {
        this.commentaireVilain = commentaireVilain;
    }
}
