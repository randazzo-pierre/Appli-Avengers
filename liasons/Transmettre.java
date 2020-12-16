package liasons;
import java.util.*;

public class Transmettre {
    private int idO;
    private int idR;


    /**
     * @param idO
     * @param idR
     */
    public Transmettre(int idO, int idH) {
        this.idO = idO;
        this.idR = idR;
    }
    /**
     * @return int
     */
    public String getidO() { return idO; }

    /**
     * @return int
     */
    public String getidR() {
        return idR;
    }


    /**
     * @param idO
     */
    public void setidO(int idO) {
        this.idO = idO;
    }

    /**
     * @param idR
     */
    public void setidR(int idR) {
        this.idR = idR;
    }


}