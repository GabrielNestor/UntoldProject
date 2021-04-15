public class Artist extends Untold{
    int faima;
    
    public Artist(String nume, String prenume, String CNP, int varsta, boolean vaccinat, int faima){
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.varsta = varsta;
        this.vaccinat = vaccinat;
        this.faima = faima;
    }
        
    public boolean accesFestival() {
        if(vaccinat==true){
            System.out.println("Bun venit, sa ne distrati");
            return true;}
        else {System.out.print("Acces nepermis");}
        return false;
    }
    
    public String repartizareScena(){
        if(faima>500 && faima<1000) {return "Scena mare";}
        else if(faima<500) {return "Scena mica";}
        return "Stadion";
    }
}