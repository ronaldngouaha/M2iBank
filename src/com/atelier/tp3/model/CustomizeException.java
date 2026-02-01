package com.atelier.tp3.model;

public class CustomizeException {



    public static class SoldeInsuffisantException extends Throwable {
        SoldeInsuffisantException(String message) {
            super(message);
        }
    }


}
