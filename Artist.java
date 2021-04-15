public class Artist extends Untold{
    int faima;
    
    public Artist(String nume, String prenume, String CNP, int varsta, boolean vaccinat, int faima){
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.varsta = varsta;
        this.vaccinat = vaccinat;
        this.faima = faima;
        //Constructorului default i se ofera parametrii, cel din clasa artistilor
        //avand un parametru aditional(faima), care va fi folosit in metoda de repartizare pe scene.
    }
    
        
    public boolean accesFestival() {
        if(vaccinat==true){
            System.out.println("Bun venit, sa ne distrati");
            return true;}
        else {System.out.print("Acces nepermis");}
        return false;
        //Conditia de acces a artistilor este ca acestia sa fie vaccinati.
    }
    
    public String repartizareScena(){
        if(faima>500 && faima<1000) {return "Scena mare";}
        else if(faima<500) {return "Scena mica";}
        return "Stadion";
        // In functie de nivelul faimei, artistul va presta pe:
        //  -scena mica, daca acesta are sub 500 faima;
        //  -scena mare, daca acesta are intre 500-1000 faima;
        //  -stadion, daca acesta are peste 1000 faima;
         
    }
}
