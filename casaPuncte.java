public class casaPuncte extends Organizare {
    
    public casaPuncte(String numeComplet, int varsta){
        this.numeComplet = numeComplet;
        this.varsta = varsta;
    }
    
    
    public void incarcaBratara(Fan p){
        if(p.bratara == true){p.puncte += 10;}
        //Metoda va functiona atata timp cat persoanei i s-a permis accesul in festival
        //metoda adaugand cate 10 puncte pentru fiecare apel.
    }
}
