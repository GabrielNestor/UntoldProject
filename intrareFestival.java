public class intrareFestival extends Organizare {
    
    public intrareFestival(String nume, String prenume, String CNP, int varsta){
        this.nume = nume;
        this.prenume = prenume;
        this.CNP = CNP;
        this.varsta = varsta;
    }
    
    public boolean permiteAccesFestival(Public p) {
        if(p.vaccin == true && p.bilet == true) {
            if(p.varsta < 18 && p.parinte == false)
            return false;}
        return true;
        //Publicul are acces la festival atata timp cat este vaccinat, prezinta biletul si are pest 18 ani.
        //Daca acesta este minor si intruneste restul conditiilor, se va verifica daca aceste etse insotit de parinti.
        //In caz contrar, nu i se va permite accesul.
    }
    
    public String repartizareScena(Artist a){
        if(a.faima > 500 && a.faima < 1000) {return "Scena mare";}
        else if(a.faima < 500) {return "Scena mica";}
        return "Stadion";
        /* In functie de nivelul faimei, artistul va presta pe scene astfel:
         *  -scena mica, daca acesta are sub 500 faima;
         *  -scena mare, daca acesta are intre 500-1000 faima;
         * -stadion, daca acesta are peste 1000 faima;
         */
    }
    public booleanTestCovid(){
        
    }
    
}
