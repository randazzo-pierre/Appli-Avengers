package acteurs;
import java.util.*;

public class Vilain extends Civil {
    private static int idC;
    private int idV;
    private String nomVilain;
    private String pouvoir;
    private String pointFaible;
    private int danger;
    private int nbCrime;
    private String commentaireVilain;

    /**
     * @param idV
     * @param nomVilain
     * @param nom
     * @param prenom
     * @param civilite
     * @param adresse
     * @param ville
     * @param zip
     * @param pays
     * @param email
     * @param tel
     * @param dateNais
     * @param nationnalite
     * @param organisation
     * @param dateMort
     * @param commentaireCivil
     * @param dateAjout
     * @param dateDerniereModif
     * @param nbIncident
     * @param nbMission
     * @param pouvoir
     * @param pointFaible
     * @param danger
     * @param score
     * @param nbCrime
     * @param commentaireVilain
     * @param danger 
     */
    public Vilain(int idV, String nomVilain, String nom, String prenom, String civilite, String adresse, String ville, String zip,
                  String pays, String email, int tel, Date dateNais, String nationnalite, ArrayList<String> organisation,
                  Date dateMort, String commentaireCivil, Date dateAjout, Date dateDerniereModif, int nbIncident,
<<<<<<< HEAD
                  int nbMission, String pouvoir, String pointFaible, int score, int nbCrime, String commentaireVilain, int danger) {
        super(nbCrime, nom, prenom, civilite, adresse, ville, zip, pays, email, tel, dateNais, nationnalite, organisation,
=======
                  int nbMission, String pouvoir, String pointFaible,int danger, int score, int nbCrime, String commentaireVilain) {
        super(idC,nom, prenom, civilite, adresse, ville, zip, pays, email, tel, dateNais, nationnalite, organisation,
>>>>>>> 0cbb66c1c17f2c5dbbde04c6c461640747b07722
                dateMort, commentaireCivil, dateAjout, dateDerniereModif, nbIncident, nbMission);
        this.idV = idV;
        this.nomVilain = nomVilain;
        this.pouvoir = pouvoir;
        this.pointFaible = pointFaible;
        this.danger = danger;
        this.nbCrime = nbCrime;
        this.commentaireVilain = commentaireVilain;
    }
    /**
     * @return int
     */
    public int getidV() {
        return idV;
    }

    /**
     * @return String
     */
    public String getNomVilain() {
        return nomVilain;
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
    public int getDanger() {
        return danger;
    }

    /**
     * @return int
     */
    public int getNbCrime() {
        return nbCrime;
    }

    /**
     * @return String
     */
    public String getCommentaireVilain() {
        return commentaireVilain;
    }

    /**
     * @param idV
     */
    public void setIdV(int idV) {
        this.idV = idV;
    }

    /**
     * @param nomVilain
     */
    public void setNomVilain(String nomVilain) {
        this.nomVilain = nomVilain;
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
     * @param danger
     */
    public void setDanger(int danger) {
        this.danger = danger;
    }

    /**
     * @param nbCrime
     */
    public void setNbCrime(int nbCrime) {
        this.nbCrime = nbCrime;
    }

    /**
     * @param commentaireVilain
     */
    public void setCommentaireVilain(String commentaireVilain) {
        this.commentaireVilain = commentaireVilain;
    }
}
