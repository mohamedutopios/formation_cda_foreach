package org.example.exercices.TPExceptions.exercie4;

public class SoldeInsuffisantException extends Exception{  // surveille
//public class SoldeInsuffisantException extends RuntimeException{ // non surveille


    public SoldeInsuffisantException(String message) {
        super(message);
    }
}
