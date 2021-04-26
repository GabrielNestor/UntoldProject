import java.util.*;
public class TarabaGoodies extends Organizare{
    
    private Map<String,Integer> stoc = new HashMap<>();
    public void refacereStoc(){
        stoc.put("Tricou Armin",80);
        stoc.put("Tricou TimmyTrumpet",80);
        stoc.put("Cana Untold", 40);
        stoc.put("Borseta Untold", 100);
    }


    public TarabaGoodies(String numeComplet, int varsta){
        this.numeComplet = numeComplet;
        this.varsta = varsta;
    }
    
    public void vinde(Fan f, String goodie){
        f.puncte -=stoc.get(goodie);
        stoc.remove(goodie);
        
    }
}