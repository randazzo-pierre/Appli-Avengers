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
        this.idI = idI;
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
    public int getidI() {
        return idI;
    }


    /**
     * @param idC
     */
    public void setIdC(int idI) {
        this.idI = idI;
    }

    /**
     * @param idO
     */
    public void setIdO(int idO) {
        this.idO = idO;
    }


}
