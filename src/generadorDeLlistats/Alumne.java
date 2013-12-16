package generadorDeLlistats;

public class Alumne {
    
    private String nom_cognoms, grup;

    public Alumne(String nom_cognoms, String grup) {
        this.nom_cognoms = nom_cognoms;
        this.grup = grup;
    }
       
    public String getNom_cognoms() {
        return nom_cognoms;
    }

    public void setNom_cognoms(String nom_cognoms) {
        this.nom_cognoms = nom_cognoms;
    }
   
    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    @Override
    public String toString() {
        return "Alumne{" + "nom_cognoms=" + nom_cognoms + ", grup=" + grup + '}';
    }
}
