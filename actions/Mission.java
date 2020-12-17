package actions;

import java.util.*;
import java.util.Date;

import java.sql.*;
import util.*;

import util.dbUtil;

public class Mission {
    private int idM;
    private String nature;
    private String titreM;
    private Date datedeb;
    private Date datefin;
    private ArrayList<String> itineraire;
    private String gravite;
    private String urgence;
    private ArrayList<String> assignes;
    private String leader;

    /**
     * @param idM
     * @param nature
     * @param titreM
     * @param datedeb
     * @param datfin
     * @param Itineraire
     * @param gravite
     * @param urgence
     * @param assignes
     * @param leader
     */
    public Mission(int idM, String nature, String titreM, Date datedeb, Date datfin, ArrayList<String> Itineraire, String gravite,
                   String urgence, ArrayList<String> assignes, String leader) {
        this.idM = idM;
        this.nature = nature;
        this.titreM =  titreM;
        this.datedeb = datedeb;
        this.datefin = datefin;
        this.itineraire = itineraire;
        this.nature = gravite;
        this.nature = urgence;
        this.assignes = assignes;
        this.leader = leader;
    }


    public  Mission(String nature, String titre, Date debut, Date fin, String Gravite,String Urgence,String Assigne,String Leader) throws SQLException {
        System.out.println("Création d'une mission avec les paramètres suivant Titre : "+titre+" Nature : "+nature+" début : "+debut+" fin:"+fin+" Gravité : "+Gravite+" Urgence : "+Urgence);
        //connexion bdd
       dbUtil utl = new dbUtil() ;
       Connection cnx = utl.dbConnect() ;
       try {
           String request = "INSERT INTO INCIDENT VALUES(ID_M,'"+nature+"', '"+titreM+"', '"+debut+"', '"+fin+"', '', '"+Gravite+"', '"+Urgence+"')" ;
           System.out.println(request);
        int insert = utl.dbCreate(cnx, request) ;
        this.setIdM(insert);
        utl.dbKill(cnx) ;
        System.out.println("insertion ok");
       } catch(SQLException e){
        System.out.println(e);
       }
        //return this.idI ;
        }
     



	/**
     * @return int
     */
    public int getIdM() {
        return idM;
    }

    /**
     * @return String
     */
    public String getNature() {
        return nature;
    }

    /**
     * @return String
     */
    public String getTitreM() {
        return titreM;
    }

    /**
     * @return Date
     */
    public Date getDatedeb() {
        return datedeb;
    }

    /**
     * @return Date
     */
    public Date getDatefin() {
        return datefin;
    }

    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getItineraire() {
        return itineraire;
    }

    /**
     * @return String
     */
    public String getGravite() {
        return gravite;
    }

    /**
     * @return String
     */
    public String getUrgence() {
        return urgence;
    }

    /**
     * @return ArrayList<String>
     */
    public ArrayList<String> getAssignes() {
        return assignes;
    }

    /**
     * @return String
     */
    public String getLeader() {
        return leader;
    }

    /**
     * @param idM
     */
    public void setIdM(int idM) {
        this.idM = idM;
    }

    /**
     * @param nature
     */
    public void setNature(String nature) {
        this.nature = nature;
    }

    /**
     * @param titre
     */
    public void setTitreM(String titre) {
        this.titreM = titre;
    }

    /**
     * @param datedeb
     */
    public void setDatedeb(Date datedeb) {
        this.datedeb = datedeb;
    }

    /**
     * @param datefin
     */
    public void setDatefin(Date datefin) {
        this.datefin = datefin;
    }

    /**
     * @param itineraire
     */
    public void setItineraire(ArrayList<String> itineraire) {
        this.itineraire = itineraire;
    }

    /**
     * @param gravite
     */
    public void setGravite(String gravite) {
        this.gravite = gravite;
    }

    /**
     * @param urgence
     */
    public void setUrgence(String urgence) {
        this.urgence = urgence;
    }

    /**
     * @param assignes
     */
    public void setAssignes(ArrayList<String> assignes) {
        this.assignes = assignes;
    }

    /**
     * @param leader
     */
    public void setLeader(String leader) {
        this.leader = leader;
    }
}
