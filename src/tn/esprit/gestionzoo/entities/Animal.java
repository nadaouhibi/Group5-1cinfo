package tn.esprit.gestionzoo.entities;
public sealed class Animal permits Aquatic,Terrestrial{
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal;

    public Animal() {
        age = 5;
    }

/*
    public Animal(String family, String name, int age, boolean isMammal) {

        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

 */

    public Animal(String familyA, String nameA, int ageA, boolean isMammalA) {

        family = familyA;
        name = nameA;
        if(ageA>0) {
            age = ageA;
        }
        else {
            System.out.println("age invalide");
            this.age = 0;
        }
        isMammal = isMammalA;
    }

    public Animal( String nameA, int ageA, boolean isMammalA) {

        name = nameA;
        age = ageA;
        isMammal = isMammalA;
    }


    public String toString(){
        return "Name: "+name+ ",age:"+age+" , isMamal:"+isMammal;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getFamily(){
        return family;
    }

    public void setFamily(String family){
        this.family = family;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public boolean isMammal(){
        return isMammal;
    }

    public void setMammal(boolean isMammal){
        this.isMammal = isMammal;
    }

    private void run(){
        System.out.println("Animal is running");
    }

}
