import java.util.Random;
public class PublicNevaccinat extends Oameni{
    public final boolean vaccin = false;
    public Random virus = new Random();
    public boolean covid = virus.nextBoolean();
    public PublicNevaccinat(String nume, String prenume, String CNP, int varsta,
                    boolean bilet, int tipBilet, boolean parinte){
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.varsta = varsta;
        this.bilet = bilet;
        this.tipBilet = tipBilet;
        this.parinte = parinte;
    }
}