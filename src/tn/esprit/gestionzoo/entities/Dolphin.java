package tn.esprit.gestionzoo.entities;

public non-sealed class Dolphin extends Aquatic{
    private float swimmingSpeed;

    public Dolphin(){

    }

    public Dolphin(String family, String name, int age, boolean isMammal,String habitat,float swimmingSpeed){
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed){
        this.swimmingSpeed = swimmingSpeed;
    }

    public String toString(){
        return super.toString()+", Swimming speed:"+swimmingSpeed;
    }


    public void swim() {
        System.out.println("Dolphin is swimming");
    }

    public boolean equals(Object obj){
        if(this == obj)
            return true;
          if(obj instanceof Dolphin d)
            return (this.swimmingSpeed == d.swimmingSpeed);
    return  false;
    }

}
