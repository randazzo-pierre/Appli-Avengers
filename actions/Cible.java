package actions;

public class Cible {
    private String nom;
    private String type;

    /**
     * @param nom
     * @param type
     */
    public Cible(String nom, String type) {
        this.nom = nom;
        this.type = type;
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
