public abstract class Fan extends Untold{
    public boolean bilet;
    public int puncte;
    public boolean parinte;
    public boolean vaccin;
    public boolean covid;
    public String CNP;
    public boolean bratara;
    public List<String> rucsac = new ArrayList<>();
    //atribute mostenite de ambele categorii de fani
    Random r = new Random();
    
    List<String> obiecte = Arrays.asList("tricou", "sticla apa", "baterie externa", "ochelari",
                                        "portofel", "buletin", "ruj", "masca", "dezinfectant", 
                                        "crema", "casti", "bricheta", "tigari", "mancare", "telefon");
    //o lista cu lucrurile pe care le pot avea fiecare fan
                                        
    protected void impachetat(){
        for(int i=0;i<2;i++){
            rucsac.add(obiecte.get(r.nextInt(obiecte.size())));
    //metoda care adauga in rucsac 2 elemente la intamplare din lista
        }
    }
    
    public String toString(){
        return "Nume complet: " + this.numeComplet + ", varsta: " + this.varsta + ", numar de puncte pe bratara:" + this.puncte;
    }
}
