package tn.esprit.gestionzoo.entities;
public class Zoo {
    private String name;
    private String city;
    public final int NB_CAGES=25;

    private Animal [] animals;
    private int nbAnimaux;

    private Aquatic[] aquaticAnimals=new Aquatic[10];
    private int nbAquatics;
    public static int nbTotal;

    public Zoo(){
        this.animals = new Animal[2];
    }
    public Zoo(String name,String city){
        this.name = name;
        this.city = city;
        this.animals = new Animal[2];

    }

    public void displayZoo(){
       System.out.println("Name:"+name+ " ,city:"+city+" ,nbCages:"+NB_CAGES);
        for(int i=0; i< animals.length;i++){
            if(animals[i] != null)
            System.out.println(animals[i]);
        }
    }

    public String toString(){
        String ch1="",ch2="";
        ch1="Name:"+name+ " ,city:"+city+" ,nbCages:"+NB_CAGES+"\n";
        for(int i=0; i< animals.length;i++){
            if(animals[i]!=null)
            ch2 += animals[i].toString()+"\n";
        }
        return ch1+ch2;
    }

    public void addAnimal(Animal animal) throws ZooFullException{

        if(searchAnimal(animal)== -1){
            if(!isZooFull()){

            animals[nbAnimaux] = animal;
            nbAnimaux++;
            nbTotal++;
            System.out.println(animal.getName()+" est ajouté au zoo");

        }
        else throw new ZooFullException("zoo plein");
    }

    public int searchAnimal(Animal animal){
        for(int i=0; i<nbAnimaux;i++){
            if(animals[i].getName().equals(animal.getName())==true)
                return i;
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal){
        int pos = searchAnimal(animal);
        if(pos!= -1){
            for(int i=pos;i<nbAnimaux-1;i++){
                animals[i] = animals[i+1];
            }
            nbAnimaux--;
            animals[nbAnimaux]=null;
            return true;
        }
        return false;
    }

    public boolean isZooFull(){
       /*
        if(nbAnimaux < NB_CAGES)
            return true;
        else return false;
        */

        return (nbAnimaux == NB_CAGES);
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.nbAnimaux > z2.nbAnimaux)
            return z1;
        else if (z1.nbAnimaux < z2.nbAnimaux) {
            return z2;
        }
        else {
            System.out.println("Deux zoo égaux");
            return z1;
        }
    }

    public String getName(){
        return name;
    }


    public void setName(String name){
        if(!name.isEmpty())
        this.name = name;
        else {
            System.out.println("Nom ne doit pas être vide");
            this.name = "NaN";
        }
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public Animal[] getAnimals(){
        return animals;
    }

    public void setAnimals(Animal [] animals){
        this.animals = animals;
    }

    public int getNbAnimaux(){
        return nbAnimaux;
    }

    public void setNbAnimaux(int nbAnimaux){
        this.nbAnimaux = nbAnimaux;
    }


    public void addAquaticAnimal(Aquatic aquatic){
        if(nbAquatics < 10){
            aquaticAnimals[nbAquatics] = aquatic;
            nbAquatics++;
            nbTotal++;
        }
        else
            System.out.println("Tableau Plein!");
    }

    public int getNbAquatics(){
        return nbAquatics;
    }

    public Aquatic[] getAquaticAnimals(){
        return aquaticAnimals;
    }

    public float maxPenguinSwimmingDepth(){
        float max = 0;
        for(int i =0;i< getNbAquatics();i++){
            /*
            if(aquaticAnimals[i] instanceof Penguin)
            if(((Penguin)aquaticAnimals[i]).getSwimmingDepth() >max){
                max = ((Penguin)aquaticAnimals[i]).getSwimmingDepth();
            }
             */
            if(aquaticAnimals[i] instanceof Penguin png){
                if (png.getSwimmingDepth() > max)
                    max = png.getSwimmingDepth();
            }
        }
        return max;
    }

    public void displayNumberOfAquaticsByType(){
        int nbPenguins=0,nbDolphins=0;
        for(int i=0; i<nbAquatics ; i++){
            if(aquaticAnimals[i] instanceof Penguin)
                nbPenguins++;
            else nbDolphins++;
        }

        System.out.println("Le nombre de dolphins est: "+ nbDolphins);
        System.out.println("Le nombre de penguins est: "+ nbPenguins);
    }
}

