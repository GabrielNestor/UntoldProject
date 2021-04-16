public abstract class Organizare extends Untold {
    boolean legitimatie;
    //legitimatia este o particularizare a clasei
    
    public boolean accesFestival() {
        if(legitimatie==true && varsta>18) {
            System.out.println("Bine ai venit, hai sa ne ajuti");
            return true;
        }else {System.out.println("Nu stiu cine te-a chemat, dar nu ai voie");}
        return false;
        //accesul in festival pentru persoanele din organizatie sa face atat pe baza varstei,
        //cat si a legitimatiei
    }
    
}
