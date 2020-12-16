package liasons;
import java.util.*;

public class Resulter {
    private int idL;
    private int idH;


    /**
     * @param idL
     * @param idH
     */
    public Resulter(int idL, int idH) {
        this.idL = idL;
        this.idH = idH;
    }
    /**
     * @return int
     */
    public int getidL() { return idL; }

    /**
     * @return int
     */
    public int getidH() {
        return idH;
    }


    /**
     * @param idL
     */
    public void setIdC(int idL) {
        this.idL = idL;
    }

    /**
     * @param idH
     */
    public void setidH(int idH) {
        this.idH = idH;
    }


}