import java.util.*;
public class TarabaGoodies extends Organizare{
    public Map<String,Integer> stoc = new HashMap<>();
    
    public void refacereStoc(){
        System.out.println("Se reface stocul");
        stoc.put("Tricou Armin",80);
        stoc.put("Tricou TimmyTrumpet",80);
        stoc.put("Cana Untold", 40);
        stoc.put("Borseta Untold", 100);
        System.out.println("Stoc Refacut");
    }
    
    public void afisareProduse(){
        stoc.forEach((k,v)->System.out.println(k+ " " + v));
        //metoda pentru afisarea tuturor produselor ramase in stoc
    }
    
    public TarabaGoodies(String numeComplet, int varsta){
        this.numeComplet = numeComplet;
        this.varsta = varsta;
    }
    
    public void vinde(Fan f, String goodie){
        if(stoc.containsKey(goodie)){
            f.puncte-=stoc.get(goodie);
            stoc.remove(goodie);
        }else{System.out.println("Produsul ales nu este in stoc");}
        //Metoda este folosita pe personalul care lucreaza la taraba pentru a vinde fanilor produse. 
        //Aceasta scade numarul de puncte de pe bratara fanului in functie de valoarea specificata in HashMap.
    }

