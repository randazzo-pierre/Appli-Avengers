package liasons;
import java.util.*;

public class Lier {
    private int idV;
    private int idCR;


    /**
     * @param idV
     * @param idCR
     */
    public Lier(int idV, int idCR) {
        this.idV = idV;
        this.idCR = idCR;
    }
    /**
     * @return int
     */
    public int getidV() {
        return idV;
    }

    /**
     * @return int
     */
    public int getidCR() {
        return idCR;
    }


    /**
     * @param idV
     */
    public void setIdC(int idV) {
        this.idV = idV;
    }

    /**
     * @param idCR
     */
    public void setidCR(int idCR) {
        this.idCR = idCR;
    }


}