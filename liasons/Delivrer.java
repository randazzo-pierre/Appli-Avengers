package liasons;
import java.util.*;

public class Delivrer {
    private int idC;
    private int idI;


    /**
     * @param idV
     * @param idI
     */
    public Delivrer(int idC, int idCI) {
        this.idC = idC;
        this.idI = idI;
    }
    /**
     * @return int
     */
    public int getidC() { return idC; }

    /**
     * @return int
     */
    public int getidI() {
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