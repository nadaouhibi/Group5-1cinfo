package tn.esprit.gestionzoo.entities;

public class AgeNegatifException extends Exception {
    public  AgeNegatifException (){

    }
    public AgeNegatifException(String message){
        super(message);
    }
}

