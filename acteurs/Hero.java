package acteurs;

import java.sql.Connection;
import java.sql.SQLException;

import util.dbUtil;

public class Hero {
    private int idH;
    private int idC;
    private String titreh;
    private String pouvoirh;
    private String pointFaibleh;
    private String identiteC;
    private int scoreh;
    private int nbMissionEff;
    private String commentaireHero;

    /**
     * 
     * @param idH
     * @param idC
     * @param titreh
     * @param pouvoirh
     * @param pointFaibleh
     * @param identiteC
     * @param scoreh
     * @param nbMissionEff
     * @param commentaireHero
     */
    public Hero(int idH, int idC, String titreh, String pouvoirh, String pointFaibleh, String identiteC, int scoreh,
            int nbMissionEff, String commentaireHero) throws SQLException {
        this.idH = idH;
        this.idC = idC;
        this.titreh = titreh;
        this.pouvoirh = pouvoirh;
        this.pointFaibleh = pointFaibleh;
        this.identiteC = identiteC;
        this.scoreh = scoreh;
        this.nbMissionEff = nbMissionEff;
        this.commentaireHero = commentaireHero;

        // connexion bdd
        dbUtil utl = new dbUtil();
        Connection cnx = utl.dbConnect();
        try {
            String request = "INSERT INTO HEROS( ID_C, TITREH, POUVOIRH, FAIBLESSEH, IDENCIVILH, SCOREH, NBMISSION, DESCRIPTIONH ) VALUES('"
                    + idC + "', '" + titreh + "', '" + pouvoirh + "', '" + pointFaibleh + "', '" + identiteC + "', '"
                    + scoreh + "', '" + nbMissionEff + "', '" + commentaireHero + "')";
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

    public int getIdH() {
        return idH;
    }

    public int getIdC() {
        return idC;
    }

    public String getTitreh() {
        return titreh;
    }

    public String getPouvoirh() {
        return pouvoirh;
    }

    public String getPointFaibleh() {
        return pointFaibleh;
    }

    public String getIdentiteC() {
        return identiteC;
    }

    public int getScoreh() {
        return scoreh;
    }

    public int getNbMissionEff() {
        return nbMissionEff;
    }

    public String getCommentaireHero() {
        return commentaireHero;
    }

    /**
     * 
     * @param idH
     */
    public void setIdH(int idH) {
        this.idH = idH;
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
     * @param titreh
     */
    public void setTitreh(String titreh) {
        this.titreh = titreh;
    }

    /**
     * 
     * @param pouvoirh
     */
    public void setPouvoirh(String pouvoirh) {
        this.pouvoirh = pouvoirh;
    }

    /**
     * 
     * @param pointFaibleh
     */
    public void setPointFaibleh(String pointFaibleh) {
        this.pointFaibleh = pointFaibleh;
    }

    /**
     * 
     * @param identiteC
     */
    public void setIdentiteC(String identiteC) {
        this.identiteC = identiteC;
    }

    /**
     * 
     * @param scoreh
     */
    public void setScoreh(int scoreh) {
        this.scoreh = scoreh;
    }

    /**
     * 
     * @param nbMissionEff
     */
    public void setNbMissionEff(int nbMissionEff) {
        this.nbMissionEff = nbMissionEff;
    }

    /**
     * 
     * @param commentaireHero
     */
    public void setCommentaireHero(String commentaireHero) {
        this.commentaireHero = commentaireHero;
    }
}
