public class intrareFestival extends Organizare {
    
    public intrareFestival(String nume, String prenume, String CNP, int varsta, boolean vaccinat, boolean legitimatie){
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.varsta = varsta;
        this.vaccinat = vaccinat;
        this.legitimatie = legitimatie;
    }
    
    public void verificaBilet(Public p) {
        if(p.accesFestival() == true && p.bilet == true) {
            System.out.println("Distractie placuta");
        }else {System.out.println("Acces nepermis");
    }
    }
}