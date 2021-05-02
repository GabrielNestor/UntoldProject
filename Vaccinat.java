import java.util.*;
public class Vaccinat extends Fan{
    public final boolean covid = false;
    public final boolean vaccin = true;
    public List<String> rucsac = new ArrayList<>();
    
    public Vaccinat(String numeComplet, String CNP, int varsta, boolean bilet, boolean parinte){
        this.numeComplet = numeComplet;
        this.CNP = CNP;
        this.varsta = varsta;
        this.bilet = bilet;
        this.parinte = parinte;
    }
}
