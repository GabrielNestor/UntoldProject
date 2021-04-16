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
        if (varsta > 18 && vaccinat == true && bilet == true){
            Systemm.out.println("Bine ai venit, distractie placuta");
            return true;}
        System.out.println("Acces nepermis");
        return false;
        //Accesul publicului se permite atata timp cat varsta este peeste 18 ani, iar persoana prezinta biletul, impreuna cu adeverinta de vaccinare
    }
    
    public boolean accesZonaVIP() {
        if(tipBilet == 2){return true;}
        return false;
        //in zona vip este permisa numai atunci cand tipul biletului are valoarea 2
    }
    
}
