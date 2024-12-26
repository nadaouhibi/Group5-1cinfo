package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class MainClass {

    public static void main(String [] args){
        Animal lion = new Animal();
        System.out.println(lion.getFamily());
        System.out.println(lion.getAge());

        Animal chat = new Animal("Chat",2,true);
        Animal chien = new Animal("Chien",1,true);
        Animal ours = new Animal("Ours",1,true);

        Zoo myZoo = new Zoo("Belvedere","Tunis");
        //myZoo.animals[0]=chat;
        myZoo.displayZoo();
        System.out.println(" ----------- ");
        System.out.println(chat);
        System.out.println(chat.toString());
        System.out.println(" ----------- ");
        //System.out.println(myZoo);

       try {
           myZoo.addAnimal(chat);
           myZoo.addAnimal(chat);
           myZoo.addAnimal(chien);
           myZoo.addAnimal(ours);
       } catch (ZooFullException e) {
           System.out.println("Zoo full" , e.);
       }
        System.out.println(myZoo);
        System.out.println(chien.toString());
        //System.out.println(myZoo.searchAnimal(chien));
        System.out.println(myZoo.searchAnimal(chat));
        System.out.println("==============");
        System.out.println(myZoo.isZooFull());
        Zoo myZoo3 = new Zoo("Friguia","Bouficha");
        System.out.println(Zoo.comparerZoo(myZoo,myZoo3));
        Zoo myZoo4 = new Zoo("Carthage Land","Hammamet");
        myZoo3.addAnimal(chat);
        myZoo3.addAnimal(chien);
        System.out.println("Le nombre d'animaux dans myZoo3: "+myZoo3.getNbAnimaux());
        System.out.println("Le nombre total d'animaux: "+ Zoo.nbTotal);
        myZoo4.addAnimal(chat);
        System.out.println("Le nombre d'animaux dans myZoo4: "+myZoo4.getNbAnimaux());
        System.out.println("Le nombre total d'animaux: "+Zoo.nbTotal);
        System.out.println("==============");
        System.out.println("===== HERITAGE =====");
        System.out.println("==============");
       // Aquatic aquatic = new Aquatic();
        Dolphin dolphin = new Dolphin();
        Penguin penguin = new Penguin();

        //Aquatic aquatic1 = new Aquatic("Omnivore","Poisson",1,true,"Mer");
        Dolphin dolphin1 = new Dolphin("Carnivore","Dolphin",2,true,"Ocean",15.5f);
        Penguin penguin1 = new Penguin("Carnivore","Penguin",2,false,"Pole sud",10);
        Penguin penguin2 = new Penguin("Carnivore","Penguin2",2,false,"Pole sud",16);
        Penguin penguin3 = new Penguin("Carnivore","Penguin2",2,false,"Pole sud",16);

      //  System.out.println(aquatic1.toString());
        System.out.println(dolphin1);
        System.out.println(penguin1);

    dolphin1.swim();
    penguin1.swim();

    myZoo4.addAquaticAnimal(penguin1);
    myZoo4.addAquaticAnimal(penguin2);
    myZoo4.addAquaticAnimal(dolphin1);
    System.out.println("-- SWIM()--");
    for(int i=0; i< myZoo4.getNbAquatics();i++){
        myZoo4.getAquaticAnimals()[i].swim();
    }
    myZoo4.displayNumberOfAquaticsByType();

    System.out.println(penguin2.equals(penguin3));
    }
}
