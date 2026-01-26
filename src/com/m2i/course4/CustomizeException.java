package com.m2i.course4;

public class CustomizeException {

    public static class SoldeInsuffisantException extends Exception {
         SoldeInsuffisantException(String message) {
            super(message);
        }
    }

      public    static class DonneeInvalideException extends RuntimeException {
             DonneeInvalideException(String message) {
                super(message);
            }
        }

 public    static class CodeErreurException extends Exception {
        private int code;

        public CodeErreurException(String message, int code) {
            super(message);
            this.code = code;
        }

        public int getCode() {
            return code;
        }
    }

}
