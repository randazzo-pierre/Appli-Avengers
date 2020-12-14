import java.util.*;

public class Hero extends Civil {
    private String nomHero;
    private String pouvoir;
    private String pointFaible;
    private int score;
    private String commentaireHero;

    public Hero(String nomHero, String nom, String prenom, String civilite, String adresse, String ville, String zip,
                String pays, String email, int tel, Date dateNais, String nationnalite, ArrayList<String> organisation,
                Date dateMort, String commentaireCivil, Date dateAjout, Date dateDerniereModif, int nbIncident,
                int nbMission, String pouvoir, String pointFaible, int score, String commentaireHero) {
        super(nom, prenom, civilite, adresse, ville, zip, pays, email, tel, dateNais, nationnalite, organisation,
                dateMort, commentaireCivil, dateAjout, dateDerniereModif, nbIncident, nbMission);
        this.nomHero = nomHero;
        this.pouvoir = pouvoir;
        this.pointFaible = pointFaible;
        this.score = score;
        this.commentaireHero = commentaireHero;
    }
}
