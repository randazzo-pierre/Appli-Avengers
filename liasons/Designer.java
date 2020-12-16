package liasons;
import java.util.*;

public class Designer {
    private int idV;
    private int idCI;


    /**
     * @param idV
     * @param idCI
     */
    public Designer(int idV, int idI) {
        this.idV = idV;
        this.idCI = idCI;
    }
    /**
     * @return int
     */
    public String getidV() {
        return idV;
    }

    /**
     * @return int
     */
    public String getidCI() {
        return idCI;
    }


    /**
     * @param idV
     */
    public void setIdC(int idV) {
        this.idV = idV;
    }

    /**
     * @param idO
     */
    public void setidCI(int idCI) {
        this.idCI = idCI;
    }


}