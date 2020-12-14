import java.util.*;


public class Organisations {
    private String nom;
    private String adresse;
    private String dirigeant;
    private ArrayList<String> membres;
    private String commentaires;
    private Date dateAjout;
    private Date dateDerniereModif;
    private int nbIncidentDeclare;
    private int nbMissionsImpliques;

    /**
     * @param nom
     * @param adresse
     * @param dirigeant
     * @param membres
     * @param commentaires
     * @param dateAjout
     * @param dateDerniereModif
     * @param nbIncidentDeclare;
     * @param nbMissionsImpliques
     */

     public Organisations(String nom, String adresse, String dirigeant, ArrayList<String> membres,
     String commentaires, Date dateAjout, Date dateDerniereModif, int nbIncidentDeclare, int nbMissionsImpliques){
         this.nom = nom;
         this.adresse = adresse;
         this.dirigeant = dirigeant;
         this.membres = membres;
         this.commentaires = commentaires;
         this.dateAjout = dateAjout;
         this.nbIncidentDeclare = nbIncidentDeclare;
         this.nbMissionsImpliques = nbMissionsImpliques;
         
}

/**
 * @return String
 */
public String getNom(){
    return nom;
}

/**
 * @return String
 */
public String getAdresse(){
    return adresse;
}

/**
 * @return String
 */
public String getDirigeant(){
    return dirigeant;
}

/**
 * @return ArrayList<String>
 */
public ArrayList<String> getMembres(){
    return membres;
}

/**
 * @return String
 */
public String getCommentaires(){
    return commentaires;
}

/**
 * @return Date
 */
public Date getDateAjout(){
    return dateAjout;
}


/**
 * @return Date
 */
public Date getDateDernierModif(){
    return dateDerniereModif;
}


/**
 * @return int
 */
public int getNbIncidentDeclare(){
    return nbIncidentDeclare;
}


/**
 * @return int
 */
public int getNbMissionsImpliques(){
    return nbMissionsImpliques;
}

/**
 * @param nom
 */
public void setNom(String nom){
    this.nom = nom;
}

/**
 * @param adresse
 */
public void setAdresse(String adresse){
    this.adresse = adresse;
}

/**
 * @param dirigeant
 */
public void setDirigeant(String dirigeant){
    this.dirigeant = dirigeant;
}

/**
 * @param membres
 */
public void setMembres(ArrayList<String> membres){
    this.membres = membres;
}

/**
 * @param commentaires
 */
public void setCommentaires(String commentaires){
    this.commentaires = commentaires;
}

/**
 * @param dateAjout
 */
public void setDateAjout(Date dateAjout){
    this.dateAjout = dateAjout;
}


/**
 * @param dateDerniereModif
 */
public void setDateDernierModif(Date dateDerniereModif){
    this.dateDerniereModif = dateDerniereModif;
}


/**
 * @param nbIncidentDeclare
 */
public void setNbIncidentDeclare(int nbIncidentDeclare){
    this.nbIncidentDeclare = nbIncidentDeclare;
}


/**
 * @param nbMissionsImpliques
 */
public void setNbMissionsImpliques(int nbMissionsImpliques){
    this.nbMissionsImpliques = nbMissionsImpliques;
}

}