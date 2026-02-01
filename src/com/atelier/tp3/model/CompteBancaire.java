package com.atelier.tp3.model;

import java.util.Optional;
import java.util.UUID;

public class CompteBancaire {


    protected String titulaire;
    private double solde;

    public static int nbComptes;

//Créez un constructeur par défaut qui initialise solde à 0
    public CompteBancaire(){
        this.solde=0.00;
    }
//Créez un constructeur avec paramètres pour initialiser titulaire et solde

    public CompteBancaire(String titulaire, double solde){
        this.solde=solde;
        this.titulaire=titulaire;
    }


    public void afficherInfos(){

        StringBuilder ret=new StringBuilder();
        ret.append(String.format("-->> Titulaire %s: Solde Courant: %f", this.titulaire, this.solde));
        System.out.println(ret);
    }

    public  void deposer(double montant){


        Transaction transaction= new Transaction(this);

        transaction.setMontant(Float.parseFloat(""+montant));
        transaction.setType("credit");


        long uniqueNum = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
        transaction.setId(uniqueNum);

        this.solde+=montant;

        transaction.afficherDetails();
    }

    public void retirer(double  montant)throws CustomizeException.SoldeInsuffisantException{


        Transaction transaction= new Transaction(this);

        transaction.setMontant(Float.parseFloat(""+montant));
        transaction.setType("debit");


        long uniqueNum = UUID.randomUUID().getMostSignificantBits() & Long.MAX_VALUE;
        transaction.setId(uniqueNum);


        try {
            if (this.solde<montant){

                throw  new CustomizeException.SoldeInsuffisantException("Solde insuffisant ");
            }


            this.solde-=montant;
        } catch (CustomizeException.SoldeInsuffisantException e) {
            throw new RuntimeException(e);
        }


        transaction.afficherDetails();

    }


    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getTitulaire() {

        Optional<String> titulaire = Optional.ofNullable(this.titulaire);

        return titulaire.get();
    }

    public void setTitulaire(String titulaire) {
        this.titulaire = titulaire;
    }

}
