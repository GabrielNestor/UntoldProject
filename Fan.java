public abstract class Fan extends Untold implements Comparable<Fan>{
    public boolean bilet;
    public int puncte;
    public boolean parinte;
    public boolean vaccin;
    public boolean covid;
    public String CNP;
    public boolean bratara;
    //atribute mostenite de catre ambele categorii de fani
    
    public int compareTo(Fan f){
        return this.varsta - f.varsta;
    }
    
    public String toString(){
        return "Nume complet: " + this.numeComplet + ", varsta: " + this.varsta + ", numar de puncte pe bratara:" + this.puncte;
    }
}
