package liasons;
import java.util.*;

public class Attacher {
    private int idH;
    private int idCI;


    /**
     * @param idH
     * @param idCI
     */
    public Attacher(int idH, int idCI) {
        this.idH = idH;
        this.idCI = idCI;
    }
    /**
     * @return int
     */
    public String getidH() {
        return idH;
    }

    /**
     * @return int
     */
    public String getidCI() {
        return idCI;
    }


    /**
     * @param idCI
     */
    public void setIdC(int idCI) {
        this.idCI = idCI;
    }

    /**
     * @param idO
     */
    public void setidH(int idH) {
        this.idH = idH;
    }


}