public class testPublic {
    public static void main(String[] args){
        try{Vaccinat Vali = new Vaccinat("Constantinescu Valentin", "19721039231", 23, true, true);
            Vaccinat AAA = new Vaccinat("AAA", "19721039231", 60, true, true);
            Vaccinat aAA = new Vaccinat("BAA", "19721039231", 23, true, true);
            Intrare Mihai = new Intrare("Mihai Andrei", 20);
            Nevaccinat Ana = new Nevaccinat("Ana Mihai", "123123", 30, true, true);
            Vaccinat Vlad = new Vaccinat("Ghica Vlad", "19721034254", 24, true, true);
            Mihai.permiteAcces(AAA);
            Mihai.permiteAcces(aAA);
            Mihai.permiteAcces(Ana);
            Mihai.permiteAcces(Vali);
            Mihai.permiteAcces(Vlad);
            Mihai.afisareLista();
        }catch(persoanaInfectata p){
            System.out.println(p.getMessage());
        }
    }
}
