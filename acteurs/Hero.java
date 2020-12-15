package acteurs;
import java.util.*;

public class Hero extends Civil {
    private static int idC;
    private int idH;
    private String nomHero;
    private String pouvoir;
    private String pointFaible;
    private int score;
    private int nbMissionEff;
    private String commentaireHero;

    public Hero(int idH, String nomHero, String nom, String prenom, String civilite, String adresse, String ville, String zip,
                String pays, String email, int tel, Date dateNais, String nationnalite, ArrayList<String> organisation,
                Date dateMort, String commentaireCivil, Date dateAjout, Date dateDerniereModif, int nbIncident,
                int nbMission, String pouvoir, String pointFaible, int score, int nbMissionEff, String commentaireHero) {
        super( idC, nom, prenom, civilite, adresse, ville, zip, pays, email, tel, dateNais, nationnalite, organisation,
                dateMort, commentaireCivil, dateAjout, dateDerniereModif, nbIncident, nbMission);

        this.idH = idH;
        this.nomHero = nomHero;
        this.pouvoir = pouvoir;
        this.pointFaible = pointFaible;
        this.score = score;
        this.nbMissionEff = nbMissionEff;
        this.commentaireHero = commentaireHero;
    }
    /**
     * @return int
     */
    public int getidH() {
        return idH;
    }

    /**
     * @return String
     */
    public String getNomHero() {
        return nomHero;
    }

    /**
     * @return String
     */
    public String getPouvoir() {
        return pouvoir;
    }

    /**
     * @return String
     */
    public String getPointFaible() {
        return pointFaible;
    }

    /**
     * @return int
     */
    public int getScore() {
        return score;
    }

    /**
     * @return int
     */
    public int getNbMissionEff() {
        return nbMissionEff;
    }

    /**
     * @return String
     */
    public String getCommentaireHero() {
        return commentaireHero;
    }

    /**
     * @param int
     */
    public void setIdH(int idH) {
        this.idH = idH;
    }

    /**
     * @param nomHero
     */
    public void setNomHero(String nomHero) {
        this.nomHero = nomHero;
    }

    /**
     * @param pouvoir
     */
    public void setPouvoir(String pouvoir) {
        this.pouvoir = pouvoir;
    }

    /**
     * @param pointFaible
     */
    public void setPointFaible(String pointFaible) {
        this.pointFaible = pointFaible;
    }

    /**
     * @param score
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @param nbMissionEff
     */
    public void setNbMissionEff(int nbMissionEff) {
        this.nbMissionEff = nbMissionEff;
    }

    /**
     * @param commentaireHero
     */
    public void setCommentaireHero(String commentaireHero) {
        this.commentaireHero = commentaireHero;
    }
}
