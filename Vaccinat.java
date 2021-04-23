public class Vaccinat extends Fan {
    public final boolean covid = false;
    //Fanii vaccinati vor fi considerati ca fiind negativi
    
    public Vaccinat(String numeComplet, String CNP, int varsta,
                boolean vaccin, boolean bilet, int tipBilet, boolean parinte){
        this.numeComplet = numeComplet;
        this.CNP = CNP;
        this.varsta = varsta;
        this.vaccin = vaccin;
        this.bilet = bilet;
        this.tipBilet = tipBilet;
        this.parinte = parinte;
    }
}
