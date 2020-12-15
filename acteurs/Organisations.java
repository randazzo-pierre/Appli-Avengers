package acteurs;
import java.util.*;


public class Organisations {
    private String idO;
    private String nomOrga;
    private String adresse;
    private String ville;
    private String zip;
    private String pays;
    private int dirigeant;
    private ArrayList<Integer> membres;
    private String commentaireOrga;
    private Date dateAjout;
    private Date dateDerniereModif;
    private int nbIncidentDeclare;
    private int nbMissionsImpliques;

    /**
     * @param idO
     * @param nomOrga
     * @param adresse
     * @param ville
     * @param zip
     * @param pays
     * @param dirigeant
     * @param membres
     * @param commentaireOrga
     * @param dateAjout
     * @param dateDerniereModif
     * @param nbIncidentDeclare;
     * @param nbMissionsImpliques
     */

     public Organisations(String idO, String nomOrga, String adresse, String ville ,String zip, String pays, int dirigeant,
     ArrayList<Integer> membres, String commentaireOrga, Date dateAjout, Date dateDerniereModif,
     int nbIncidentDeclare, int nbMissionsImpliques){
         this.idO = idO;
         this.nomOrga = nomOrga;
         this.adresse = adresse;
         this.ville = ville;
         this.zip = zip;
         this.pays = pays;
         this.dirigeant = dirigeant;
         this.membres = membres;
         this.commentaireOrga = commentaireOrga;
         this.dateAjout = dateAjout;
         this.dateDerniereModif = dateDerniereModif;
         this.nbIncidentDeclare = nbIncidentDeclare;
         this.nbMissionsImpliques = nbMissionsImpliques;
         
}
/**
 * @return int
 */
    public String getidO() {
        return idO;
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
 * @return String
 */
public String getPays(){
    return pays;
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
public String getcommentaireOrga(){
    return commentaireOrga;
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
* @param idO
*/
    public void setidO(String idO){
        this.idO = idO;
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
 * @param pays
 */
public void setPays(String pays){
    this.pays = pays;
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
 * @param commentaireOrga
 */
public void setcommentaireOrga(String commentaireOrga){
    this.commentaireOrga = commentaireOrga;
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