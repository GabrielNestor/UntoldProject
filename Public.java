public class Public extends Untold {
    boolean bilet;
    int tipBilet;
    int puncte;
    
    public Public(String nume, String prenume, String CNP, int varsta, boolean vaccinat, boolean bilet, int tipBilet){
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.varsta = varsta;
        this.vaccinat = vaccinat;
        this.bilet = bilet;
        this.tipBilet = tipBilet;
    }
    
    public boolean accesFestival(){
        if (varsta>18 && vaccinat==true){return true;}
        return false;
    }
    
    public boolean accesZonaVIP() {
        if(tipBilet == 2){return true;}
        return false;
    }
    
}