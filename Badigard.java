import java.util.*;
public class Badigard extends Organizare{
    //se creeaza o clasa Badigard pentru perchezitionarea fanilor
    public List<String> ObiecteNepermise = Arrays.asList("sticla apa", "bricheta", "mancare");
    
    public Badigard(String numeComplet, int varsta){
        this.numeComplet = numeComplet;
        this.varsta = varsta;
    }
    
    public void Perchezitie(Fan f) {
        for(String x:ObiecteNepermise){
            if(f.rucsac.contains(x)){
                System.out.println("Nu ai voie cu " + x);
                f.rucsac.remove(x);
    //daca badigardul gaseste in rucsacul fanilor un element care se afla pe lista obiectelor interzise
    //acesta il va scoate din rucsac
            }
        }
    }
}
