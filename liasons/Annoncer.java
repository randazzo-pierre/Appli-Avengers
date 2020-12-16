package liasons;
import java.util.*;

public class Annoncer {
    private int idO;
    private int idI;


    /**
     * @param idO
     * @param idI
     */
    public Annoncer(int idO, int idI) {
        this.idO = idO;
        this.idC = idI;
    }
    /**
     * @return int
     */
    public String getidO() {
        return idO;
    }

    /**
     * @return int
     */
    public String getidI() {
        return idI;
    }


    /**
     * @param idC
     */
    public void setIdC(int idI) {
        this.idC = idI;
    }

    /**
     * @param idO
     */
    public void setIdO(int idO) {
        this.idO = idO;
    }


}
