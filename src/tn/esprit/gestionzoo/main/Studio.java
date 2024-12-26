package tn.esprit.gestionzoo.main;

public class Studio {

    public static void main(String [] args){
        Machine m = new Machine();
        Camera c = new Camera();
        m.start();
        c.start();

        System.out.println("--- UP ----");
        //UPCASTING
        Machine m1 = new Machine();
        Camera c1 = new Camera();
        m1 = c1; // m1 = new Camera();
        m1.start();

        System.out.println("--- DOWN ----");
        //DOWNCASTING PERMIS
        Machine m2 = new Camera();
        Camera c2 = new Camera();
        c2 = (Camera) m2;
        c2.start();

        //DOWNCASTING NON-PERMIS
        Machine m3 = new Machine();
        Camera c3 = new Camera();
        //c3 = (Camera)m3;
        //c3.start();


        //SURCLASSEMENT & SUBSTITUTION
        Machine m4 = new Camera();
        ((Camera)m4).snap();
    }
}
