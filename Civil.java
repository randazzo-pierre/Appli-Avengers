import java.util.*;

public class Civil {

    private String nom;
    private String prenom;
    private String civilite;
    private String adresse;
    private String ville;
    private String zip;
    private String pays;
    private String email;
    private int tel;
    private Date dateNais;
    private String nationnalite;
    private ArrayList<String> organisation;
    private Date dateMort;
    private String commentaire;
    private Date dateAjout;
    private Date dateDerniereModif;
    private int nbIncident;
    private int nbMission;

    /**
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
     * @param commentaire
     * @param dateAjout
     * @param dateDerniereModif
     * @param nbIncident
     * @param nbMission
     */
    public Civil(String nom, String prenom, String civilite, String adresse, String ville, String zip, String pays,
                 String email, int tel, Date dateNais, String nationnalite, ArrayList<String> organisation, Date dateMort,
                 String commentaire, Date dateAjout, Date dateDerniereModif, int nbIncident, int nbMission) {
        this.nom = nom;
        this.prenom = prenom;
        this.civilite = civilite;
        this.adresse = adresse;
        this.ville = ville;
        this.zip = zip;
        this.pays = pays;
        this.email = email;
        this.tel = tel;
        this.dateNais = dateNais;
        this.nationnalite = nationnalite;
        this.organisation = organisation;
        this.dateMort = dateMort;
        this.commentaire = commentaire;
        this.dateAjout = dateAjout;
        this.dateDerniereModif = dateDerniereModif;
        this.nbIncident = nbIncident;
        this.nbMission = nbMission;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getCivilite() {
        return civilite;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getVille() {
        return ville;
    }

    public String getZip() {
        return zip;
    }

    public String getPays() {
        return pays;
    }

    public String getEmail() {
        return email;
    }

    public int getTel() {
        return tel;
    }

    public Date getDateNais() {
        return dateNais;
    }

    public String getNationnalite() {
        return nationnalite;
    }

    public ArrayList<String> getOrganisation() {
        return organisation;
    }

    public Date getDateMort() {
        return dateMort;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public Date getDateDerniereModif() {
        return dateDerniereModif;
    }

    public int getNbIncident() {
        return nbIncident;
    }

    public int getNbMission() {
        return nbMission;
    }

}
