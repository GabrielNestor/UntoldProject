public abstract class Organizare extends Untold {
    boolean legitimatie;
    
    public boolean accesFestival() {
        if(legitimatie==true && varsta>18) {
            System.out.println("Bine ai venit, hai sa ne ajuti");
            return true;
        }else {System.out.println("Nu stiu cine te-a chemat, dar nu ai voie");}
        return false;
    }
    
}
