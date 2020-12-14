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

    /**
     * @return String
     */
    public String getNom() {
        return nom;
    }

    /**
     * @return String
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @return String
     */
    public String getCivilite() {
        return civilite;
    }

    /**
     * @return String
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @return String
     */
    public String getVille() {
        return ville;
    }

    /**
     * @return String
     */
    public String getZip() {
        return zip;
    }

    /**
     * @return String
     */
    public String getPays() {
        return pays;
    }

    /**
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return int
     */
    public int getTel() {
        return tel;
    }

    /**
     * @return Date
     */
    public Date getDateNais() {
        return dateNais;
    }

    /**
     * @return String
     */
    public String getNationnalite() {
        return nationnalite;
    }

    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getOrganisation() {
        return organisation;
    }

    /**
     * @return Date
     */
    public Date getDateMort() {
        return dateMort;
    }

    /**
     * @return String
     */
    public String getCommentaire() {
        return commentaire;
    }

    /**
     * @return Date
     */
    public Date getDateAjout() {
        return dateAjout;
    }

    /**
     * @return Date
     */
    public Date getDateDerniereModif() {
        return dateDerniereModif;
    }

    /**
     * @return int
     */
    public int getNbIncident() {
        return nbIncident;
    }

    /**
     * @return int
     */
    public int getNbMission() {
        return nbMission;
    }

    /**
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @param prenom
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @param civilite
     */
    public void setCivilite(String civilite) {
        this.civilite = civilite;
    }

    /**
     * @param adresse
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @param ville
     */
    public void setVille(String ville) {
        this.ville = ville;
    }

    /**
     * @param zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @param pays
     */
    public void setPays(String pays) {
        this.pays = pays;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param tel
     */
    public void setTel(int tel) {
        this.tel = tel;
    }

    /**
     * @param dateNais
     */
    public void setDateNais(Date dateNais) {
        this.dateNais = dateNais;
    }

    /**
     * @param nationnalite
     */
    public void setNationnalite(String nationnalite) {
        this.nationnalite = nationnalite;
    }

    /**
     * @param organisation
     */
    public void setOrganisation(ArrayList<String> organisation) {
        this.organisation = organisation;
    }

    /**
     * @param dateMort
     */
    public void setDateMort(Date dateMort) {
        this.dateMort = dateMort;
    }

    /**
     * @param commentaire
     */
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    /**
     * @param dateAjout
     */
    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }

    /**
     * @param dateDerniereModif
     */
    public void setDateDerniereModif(Date dateDerniereModif) {
        this.dateDerniereModif = dateDerniereModif;
    }

    /**
     * @param nbIncident
     */
    public void setNbIncident(int nbIncident) {
        this.nbIncident = nbIncident;
    }

    /**
     * @param nbMission
     */
    public void setNbMission(int nbMission) {
        this.nbMission = nbMission;
    }
}
