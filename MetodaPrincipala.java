public class MetodaPrincipala {
    public static void main(String[] args){
        try{Vaccinat Vali = new Vaccinat("Constantinescu Valentin", "19721039231", 23, true, true, 0, true); 
            Intrare Mihai = new Intrare("Mihai Andrei", 20);
            casaPuncte Alexa = new casaPuncte("Alexa Radu", 25);
            System.out.println(Mihai.permiteAccesFestival(Vali));
            TarabaGoodies Andrei = new TarabaGoodies("Andrei George" , 21);
            Alexa.incarcaBratara(Vali);
            System.out.println(Vali.puncte);
            Andrei.refacereStoc();
            Andrei.afisareProduse();
            Andrei.vinde(Vali, "Tricou Armin");
            Andrei.afisareProduse();
            Andrei.vinde(Vali, "Tricou Armin");
        }catch(persoanaInfectata p){
            System.out.println(p.getMessage());
        }
    }
}
