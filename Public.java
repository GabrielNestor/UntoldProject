public class Public extends Untold {
    boolean bilet;
    int tipBilet;
    int puncte;
    //clasa public prezzinta atribute legate de bilet, dar si un numar de puncte pe baza carora se pot face achizitii in festival
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
        if (varsta > 18 && vaccinat == true) {return true;}
        return false;    //acasta este perspecctiva persoanei de tip public, aceasta crezand ca este apta pentru intrare
    }
    
    public boolean accesZonaVIP() {
        if(tipBilet == 2){return true;}
        return false;
        //in zona vip este permisa numai atunci cand tipul biletului are valoarea 2
    }
    
}
