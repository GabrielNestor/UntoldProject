public class Artist extends Untold{
    int faima;
    String gen;
    
    public Artist(String nume, String prenume, String CNP, int varsta, boolean vaccin,String gen, int faima){
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.varsta = varsta;
        this.vaccin = vaccin;
        this.faima = faima;
        this.gen = gen;
    }
    
    public boolean equals(Object o) {
        if(o == null) {return false;}
        
        if(!(o instanceof Artist)) {return false;}
        
        Artist a = (Artist)o;
        if(this.gen == a.gen && this.faima == a.faima){
            return true;}
        return false;
    }
    //doi artisti sunt considerati egali atunci cand nivelul faimei si genul lor sunt identice.
}
