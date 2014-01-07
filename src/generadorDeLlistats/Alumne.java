package generadorDeLlistats;

public class Alumne {

    private String nom, cognoms, grup;

    public Alumne(String nom, String cognoms, String grup) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.grup = grup;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    @Override
    public String toString() {
        return "Alumne{" + "nom_cognoms=" + nom + cognoms + ", grup=" + grup + '}';
    }
}
