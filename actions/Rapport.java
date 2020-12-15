package actions;

import java.util.*;

public class Rapport {
    private int idR;
    private String titre;
    private String auteur;
    private String description;
    private ArrayList<String> crise;
    private String mission;
    private String statut;

    /**
     * @param idR
     * @param titre
     * @param auteur
     * @param description
     * @param crise
     * @param mission
     * @param statut
     */
    public Rapport(int idR, String titre, String auteur, String description, ArrayList<String> crise, String mission,
                   String statut) {
        this.idR = idR;
        this.titre = titre;
        this.auteur = auteur;
        this.description = description;
        this.crise = crise;
        this.mission = mission;
        this.statut = statut;
    }

    /**
     * @return int
     */
    public int getIdR() {
        return idR;
    }

    /**
     * @return String
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @return String
     */
    public String getAuteur() {
        return auteur;
    }

    /**
     * @return String
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getCrise() {
        return crise;
    }

    /**
     * @return String
     */
    public String getMission() {
        return mission;
    }

    /**
     * @return String
     */
    public String getStatut() {
        return statut;
    }

    /**
     * @param idR
     */
    public void setIdR(int idR) {
        this.idR = idR;
    }

    /**
     * @param titre
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @param auteur
     */
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param crise
     */
    public void setCrise(ArrayList<String> crise) {
        this.crise = crise;
    }

    /**
     * @param mission
     */
    public void setMission(String mission) {
        this.mission = mission;
    }

    /**
     * @param statut
     */
    public void setStatut(String statut) {
        this.statut = statut;
    }
}
