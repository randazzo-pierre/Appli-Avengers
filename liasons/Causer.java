package liasons;
import java.util.*;

public class Causer {
    private int idV;
    private int idCI;


    /**
     * @param idV
     * @param idCI
     */
    public Causer(int idV, int idCI) {
        this.idV = idV;
        this.idCI = idCI;
    }
    /**
     * @return int
     */
    public int getidV() { return idV; }

    /**
     * @return int
     */
    public int getidCI() {
        return idCI;
    }

    /**
     * @param idV
     */
    public void setidH(int idV) {
        this.idV = idV;
    }

    /**
     * @param idCI
     */
    public void setIdC(int idCI) {
        this.idCI = idCI;
    }


}