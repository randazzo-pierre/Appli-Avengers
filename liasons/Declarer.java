package liasons;
import java.util.*;

public class Declarer {
    private int idC;
    private int idI;


    /**
     * @param idV
     * @param idI
     */
    public Declarer(int idC, int idCI) {
        this.idC = idC;
        this.idI = idI;
    }
    /**
     * @return int
     */
    public String getidC() { return idC; }

    /**
     * @return int
     */
    public String getidI() {
        return idI;
    }

    /**
     * @param idC
     */
    public void setidH(int idC) {
        this.idC = idC;
    }

    /**
     * @param idCI
     */
    public void setIdC(int idI) {
        this.idI = idI;
    }


}