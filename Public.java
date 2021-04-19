public class Public extends Untold {
    boolean bilet;
    int tipBilet;
    int puncte;
    boolean parinte;
    
    public Public(String nume, String prenume, String CNP, int varsta,
                boolean vaccin, boolean bilet, int tipBilet, boolean parinte){
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.varsta = varsta;
        this.vaccin = vaccin;
        this.bilet = bilet;
        this.tipBilet = tipBilet;
        this.parinte = parinte;
    }
    
    public class nevaccinat {
        final boolean vaccin = false;
        
        public nevaccinat(String nume, String prenume, String CNP, int varsta,
                 boolean bilet, int tipBilet, boolean parinte){
        }
        //persoanele nevaccinate vor folosi aceasta clasa inner
    }
}
