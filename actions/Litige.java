package actions;

import java.util.*;

public class Litige {

    private String titre;
    private String description;
    private String cible;
    private Integer cout;
    private ArrayList<String> preuve;
    private ArrayList<String> victime;

    /**
     * @param titre
     * @param description
     * @param cible
     * @param cout
     * @param preuve
     * @param victime
     */
    public Litige(String titre, String description, String cible, Integer cout, ArrayList<String> preuve,
                  ArrayList<String> victime) {
        this.titre = titre;
        this.description = description;
        this.cible = cible;
        this.cout = cout;
        this.preuve = preuve;
        this.victime = victime;
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
    public String getDescription() {
        return description;
    }

    /**
     * @return String
     */
    public String getCible() {
        return cible;
    }

    /**
     * @return Integer
     */
    public Integer getCout() {
        return cout;
    }

    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getPreuve() {
        return preuve;
    }

    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getVictime() {
        return victime;
    }

    /**
     * @param titre
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param cible
     */
    public void setCible(String cible) {
        this.cible = cible;
    }

    /**
     * @param cout
     */
    public void setCout(Integer cout) {
        this.cout = cout;
    }

    /**
     * @param preuve
     */
    public void setPreuve(ArrayList<String> preuve) {
        this.preuve = preuve;
    }

    /**
     * @param victime
     */
    public void setVictime(ArrayList<String> victime) {
        this.victime = victime;
    }
}
