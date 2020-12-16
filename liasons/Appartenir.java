package liasons;
import java.util.*;

public class Appartenir {
    private int idO;
    private int idC;


    /**
     * @param idO
     * @param idI
     */
    public Appartenir(int idO, int idC) {
        this.idO = idO;
        this.idC = idC;
    }
    /**
     * @return int
     */
    public int getidO() {
        return idO;
    }

    /**
     * @return int
     */
    public int getidC() {
        return idC;
    }


    /**
     * @param idC
     */
    public void setIdC(int idC) {
        this.idC = idC;
    }

    /**
     * @param idO
     */
    public void setIdO(int idO) {
        this.idO = idO;
    }


}
