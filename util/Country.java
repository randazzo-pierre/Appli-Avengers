package util;

public class Country implements Comparable<Country> {
    private String code;
    private String name;

    /**
     * 
     * @param code
     * @param name
     */
    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    /**
     * 
     * @return String
     */
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return String
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Country anotherCountry) {
        return this.name.compareTo(anotherCountry.getName());
    }

}