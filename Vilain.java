import java.util.*;

public class Vilain extends Civil {
    private String nomVilain;
    private String pouvoir;
    private String pointFaible;
    private int danger;
    private int nbCrime;
    private String commentaireVilain;

    public Vilain(String nomVilain, String nom, String prenom, String civilite, String adresse, String ville, String zip,
                String pays, String email, int tel, Date dateNais, String nationnalite, ArrayList<String> organisation,
                Date dateMort, String commentaireCivil, Date dateAjout, Date dateDerniereModif, int nbIncident,
                int nbMission, String pouvoir, String pointFaible, int score, int nbCrime, String commentaireVilain) {
        super(nom, prenom, civilite, adresse, ville, zip, pays, email, tel, dateNais, nationnalite, organisation,
                dateMort, commentaireCivil, dateAjout, dateDerniereModif, nbIncident, nbMission);
        this.nomVilain = nomVilain;
        this.pouvoir = pouvoir;
        this.pointFaible = pointFaible;
        this.danger = danger;
        this.nbCrime = nbCrime;
        this.commentaireVilain = commentaireVilain;
    }
}
