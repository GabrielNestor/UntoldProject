import java.util.Random;
public class Nevaccinat extends Fan{
    public final boolean vaccin = false;
    public Random virus = new Random();
    public boolean covid = virus.nextBoolean();
    
    public Nevaccinat(String numeComplet, String CNP, int varsta,
                    boolean bilet, boolean parinte){
        this.numeComplet = numeComplet;
        this.CNP = CNP;
        this.varsta = varsta;
        this.bilet = bilet;
        this.parinte = parinte;
    }
}
