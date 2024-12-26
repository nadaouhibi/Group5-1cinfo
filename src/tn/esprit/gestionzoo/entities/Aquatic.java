package tn.esprit.gestionzoo.entities;

public abstract sealed class Aquatic extends Animal permits Dolphin,Penguin{

    protected String habitat;


    public Aquatic(){
        //super();
    }

    /*
    public Aquatic(String family, String name, int age, boolean isMammal,String habitat){
       super(family,name,age,isMammal);
       this.habitat = habitat;
    }*/

    public Aquatic(String family, String name, int age, boolean isMammal,String habitat){
        super();
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
        this.habitat = habitat;
    }

    public String getHabitat(){
        return habitat;
    }

    public void setHabitat(String habitat){
        this.habitat=habitat;
    }

    public String toString(){
        return super.toString()+" ,habitat: "+habitat;
    }

    public void eat(){
        System.out.println("Aquatic eat");
    }

    public void eat(int x){
        System.out.println("Aquatic eat");
    }

    public void eat(String x){
        System.out.println("Aquatic eat");
    }

    public void eat(int x,String y){
        System.out.println("Aquatic eat");
    }

    public void eat(String y,int x){
        System.out.println("Aquatic eat");
    }

    private void run(){

    }

    public abstract void swim();
}
