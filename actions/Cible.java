package actions;

public class Cible {
    private int idCI;
    private String nom;
    private String type;

    /**
     * @param idCI
     * @param nom
     * @param type
     */
    public Cible(int idCI,String nom, String type) {
        this.idCI = idCI;
        this.nom = nom;
        this.type = type;
    }
    /**
     * @return int
     */
    public int getidCI() {
        return idCI;
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
    public String getType() {
        return type;
    }

    /**
     * @param idCI
     */
    public void setIdCI(int idCI) {
        this.idCI = idCI;
    }

    /**
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }
}
