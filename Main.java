import java.util.*;

import actions.*;
import acteurs.*;

class Main {

    public static void main(String[] args) {
        /* ACTEURS */
        System.out.println("/* ACTEURS */");

        /**
         * Créer un civil
         */
        Civil civil = new Civil("nom", "prenom", "civilite", "adresse", "ville", "zip", "pays", "mail", 0, new Date(),
                "nationnalite", null, new Date(), "commentaireCivil", new Date(), new Date(), 0, 0);
        System.out.println(civil.getNom() + civil.getPrenom());

        /**
         * Créer un héro
         */
        Hero hero = new Hero("nomHero", "nom", "prenom", "civilite", "adresse", "ville", "zip", "pays", "mail", 0,
                new Date(), "nationnalite", null, new Date(), "commentaireCivil", new Date(), new Date(), 0, 0,
                "pouvoir", "pointFaible", 0, 0, "commentaireHero");
        System.out.println(hero.getNom() + hero.getPrenom() + hero.getNomHero());

        /**
         * Créer une organisation
         */
        Organisations organisation = new Organisations("nomOrga", "adresse", "ville", "zip", "pays", 0, null,
                "commentaireOrga", new Date(), new Date(), 0, 0);
        System.out.println(organisation.getNomOrga());

        /**
         * Créer un vilain
         */
        Vilain vilain = new Vilain("nomVilain", "nom", "prenom", "civilite", "adresse", "ville", "zip", "pays", "mail", 0,
                new Date(), "nationnalite", null, new Date(), "commentaireCivil", new Date(), new Date(), 0, 0,
                "pouvoir", "pointFaible", 0, "commentaireVilain");
        System.out.println(vilain.getNom() + vilain.getPrenom() + vilain.getNomVilain());


        /* ACTIONS */
        System.out.println("/* ACTIONS */");

        /**
         * Créer une cible
         */
        Cible cible = new Cible("nom", "type");
        System.out.println(cible.getNom() + cible.getType());

        /**
         * Créer une crise
         */
        Crise crise = new Crise("nomCr", "typeCr", "cibleCr", "descriptionCr");
        System.out.println(crise.getNomCr() + crise.getTypeCr());

        /**
         * Créer un incident
         */
        Incident incident = new Incident("declarantInci", "paysInci", "zipInci", new Date(), new Date(), "descriptionInci");
        System.out.println(incident.getDeclarantInci() + incident.getPaysInci());

        /**
         * Créer un litige
         */
        Litige litige = new Litige("titre", "description", "cible", 0, null, null);
        System.out.println(litige.getTitre() + litige.getDescription());

        /**
         * Créer une mission
         */
        Mission mission = new Mission("nature", "titre", new Date(), new Date(), null, "gravite", "urgence", null,
                "leader");
        System.out.println(mission.getTitre());

        /**
         * Créer une rapport
         */
        Rapport rapport = new Rapport("titre", "auteur", "description", null, "mission", "statut");
        System.out.println(rapport.getTitre() + rapport.getAuteur());

        /**
         * Créer une satisfaction
         */
        Satisfaction satisfaction = new Satisfaction("auteurSat", "agentSat", "titreSat", "commentaireSat",
                "fichierSat", 0);
        System.out.println(satisfaction.getAuteurSat() + satisfaction.getAgentSat() + satisfaction.getTitreSat());
    }
}
