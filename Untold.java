public abstract class Untold {
    String nume;
    String prenume;
    int varsta;
    boolean vaccinat;
    String CNP;
    // Sunt prezente atributele care vor fi mostenite de toate clasele.
    public abstract boolean accesFestival();
    // Metoda va fi mostenita e catre toate clasele, acestea avand obligatia
    // de a o suprascrie functie de tipul de persoana care patrunde in festival
}
