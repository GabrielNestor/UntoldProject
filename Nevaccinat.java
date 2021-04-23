import java.util.Random;
public class Nevaccinat extends Fan{
    public final boolean vaccin = false;
    public Random virus = new Random(); 
    public boolean covid = virus.nextBoolean();
    //Se va importa clasa Random in scopul utilizarii metodei nextBoolean()
    //pentru a genera o valoare aleatoare de tip boolean in cazul in care fanul este nevaccinat.
    
    public Nevaccinat(String numeComplet, String CNP, int varsta,
                    boolean bilet, int tipBilet, boolean parinte){
        this.numeComplet = numeComplet;
        this.CNP = CNP;
        this.varsta = varsta;
        this.bilet = bilet;
        this.tipBilet = tipBilet;
        this.parinte = parinte;
    }
}
