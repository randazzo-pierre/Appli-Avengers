import java.util.*;


public class Organisations {
    private String nomOrga;
    private String adresse;
    private String ville;
    private String zip;
    private int dirigeant;
    private ArrayList<Integer> membres;
    private String commentaires;
    private Date dateAjout;
    private Date dateDerniereModif;
    private int nbIncidentDeclare;
    private int nbMissionsImpliques;

    /**
     * @param nomOrga
     * @param adresse
     * @param dirigeant
     * @param membres
     * @param commentaires
     * @param dateAjout
     * @param dateDerniereModif
     * @param nbIncidentDeclare;
     * @param nbMissionsImpliques
     */

     public Organisations(String nomOrga, String adresse, String ville ,String zip, int dirigeant,
     ArrayList<Integer> membres, String commentaires, Date dateAjout, Date dateDerniereModif,
     int nbIncidentDeclare, int nbMissionsImpliques){
         this.nomOrga = nomOrga;
         this.adresse = adresse;
         this.ville = ville;
         this.zip = zip;
         this.dirigeant = dirigeant;
         this.membres = membres;
         this.commentaires = commentaires;
         this.dateAjout = dateAjout;
         this.dateDerniereModif = dateDerniereModif;
         this.nbIncidentDeclare = nbIncidentDeclare;
         this.nbMissionsImpliques = nbMissionsImpliques;
         
}

/**
 * @return String
 */
public String getNomOrga(){
    return nomOrga;
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
public String getVille(){
    return ville;
}

/**
 * @return String
 */
public String getZip(){
    return zip;
}

/**
 * @return int
 */
public int getDirigeant(){
    return dirigeant;
}

/**
 * @return ArrayList<Integer>
 */
public ArrayList<Integer> getMembres(){
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
public Date getDateDerniereModif(){
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
 * @param nomOrga
 */
public void setNomOrga(String nomOrga){
    this.nomOrga = nomOrga;
}

/**
 * @param adresse
 */
public void setAdresse(String adresse){
    this.adresse = adresse;
}

/**
 * @param ville
 */
public void setVille(String ville){
    this.ville = ville;
}

/**
 * @param zip
 */
public void setZip(String zip){
    this.zip = zip;
}

/**
 * @param dirigeant
 */
public void setDirigeant(int dirigeant){
    this.dirigeant = dirigeant;
}

/**
 * @param membres
 */
public void setMembres(ArrayList<Integer> membres){
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
public void setDateDerniereModif(Date dateDerniereModif){
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