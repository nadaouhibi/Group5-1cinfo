package tn.esprit.gestionzoo.entities;

public final class Penguin extends Aquatic{
    private float swimmingDepth;

    public Penguin(){

    }

    public Penguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth){
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }


    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth){
        this.swimmingDepth = swimmingDepth;
    }

    public String toString(){
        return super.toString()+", Swimming depth:"+swimmingDepth;
    }


    public void swim() {
        System.out.println("Penguin is swimming");
    }

    public boolean equals(Object obj){
        if(obj == null){
            return false;
        }
        if(this.getClass() != obj.getClass()){
            return false;
        }
        Penguin png = (Penguin) obj;
        return (this.swimmingDepth==png.swimmingDepth
                && this.habitat.equals(png.habitat));
    }

}
