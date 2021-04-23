ublic class Artist extends Untold{
    public int faima;
    public String gen;
    public static final vaccin = true;
    
    public Artist(String numeComplet, int varsta, String gen, int faima){
        this.numeComplet = numeComplet;
        this.varsta = varsta;
        this.faima = faima;
        this.gen = gen;
    }
    
    public boolean equals(Object o) {
        if(o == null) {return false;}
        
        if(!(o instanceof Artist)) {return false;}
        
        Artist a = (Artist)o;
        if(this.gen == a.gen && this.faima == a.faima) {return true;}
        return false;
        //Doi artisti sunt cosiderati egali daca nivelul faimei, precum si genul muzical, sunt aceleasi.
    }
        
    


}
