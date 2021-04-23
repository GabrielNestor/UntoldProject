public class Intrare extends Organizare {
    
    public Intrare(String numeComplet, int varsta){
        this.numeComplet = numeComplet;
        this.varsta = varsta;
    }
    
    public boolean permiteAccesFestival(Fan p) throws persoanaInfectata{
        if(p instanceof Nevaccinat) {
            Nevaccinat o = (Nevaccinat) p;
            if(o.covid == true){throw new persoanaInfectata();}
            //Prima data se va verifica daca instanta este de tip Nevaccinata
            //Se va verifica valoare aleatoare a lui covid.
            //Daca va fi pozitiva se va arunca o exceptie.
            }
        if(p.bilet == true) {
            if(p.varsta < 18 && p.parinte == false){return false;}
            }
        p.bratara = true;
        return true;
        //Fanii vaccinati, precum si cei nevaccinati care au avut testul negativ
        //trebuie sa prezinte biletul si sa aibe peste 18 ani pentru a li se permite accesul.
        //In cazul in care fanul este minor, acestea trebuie sa se prezinte impreuna cu parintii.
        //Daca toate conditiile sunt ideplinite, acestia vor primi o bratara de acces.
    }
    
    public String repartizareScena(Artist a){
        if(a.faima > 500 && a.faima < 1000) {return "Scena mare";}
        else if(a.faima < 500) {return "Scena mica";}
        return "Stadion";
        //Artistii vor presa, in functie de nivelul faimei, pe scene diferite astfel:
        // - faima sub 500 - Scena mica
        // - faima intre 500 si 1000 - Scena mare
        // - faima peste 1000 - Stadion
    }
    
}
