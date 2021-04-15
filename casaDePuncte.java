public class casaDePuncte extends Organizare {
    
    public casaDePuncte(String nume, String prenume, String CNP, int varsta, boolean vaccinat, boolean legitimatie){
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.varsta = varsta;
        this.vaccinat = vaccinat;
        this.legitimatie = legitimatie;
    }
    
    
    public void incarcaBratara(Public p){
        p.puncte += 10;
    }
}