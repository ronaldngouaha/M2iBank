package com.atelier.tp3.app;

import com.atelier.tp3.model.CompteBancaire;
import com.atelier.tp3.model.CustomizeException;

public class TestBank {


    /*
    Dans une classe Main (package com.m2i.app), créez des objets CompteBancaire, Transaction
    Appelez les méthodes deposer, retirer, afficherInfos, afficherDetails
    Testez les cas limites (ex : retrait supérieur au solde, type invalide)

    * */
    public static void main( String[] args){

        CompteBancaire compteBancaire= new CompteBancaire("John Doe", 0);

        compteBancaire.afficherInfos();
        compteBancaire.deposer(200);

        try {
            compteBancaire.retirer(90);
        } catch (CustomizeException.SoldeInsuffisantException e) {
            System.err.println(e.getMessage());
        }

        compteBancaire.afficherInfos();



    }
}
