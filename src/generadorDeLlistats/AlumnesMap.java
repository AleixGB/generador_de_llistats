package generadorDeLlistats;

import java.util.ArrayList;
import java.util.HashMap;

public class AlumnesMap {
    
    private HashMap<String, ArrayList<Alumne>> alumnes;
    private ArrayList<Alumne> current;

    public AlumnesMap(){
        alumnes = new HashMap<String, ArrayList<Alumne>>();
        current = new ArrayList<Alumne>();
    }

    public HashMap<String, ArrayList<Alumne>> getAlumnes() {
        return alumnes;
    }

    public void setAlumnes(HashMap<String, ArrayList<Alumne>> alumnes) {
        this.alumnes = alumnes;
    }
    
    public void insertarAlumneMateria(String materia, String nom_cognoms, String grup){
       if(alumnes.containsKey(materia)){
           current = alumnes.get(materia);
       }else{
           current = new ArrayList<Alumne>();
       }    
       //System.out.println(alumnes.get(materia));
       current.add(new Alumne(nom_cognoms, grup));
       alumnes.put(materia, current);
       System.out.println("Inserto Alumne a la Materia "+ materia);
    }
    
    public ArrayList<Alumne> obtenirAlumnes(String materia){
        System.out.println("Abans d'obtenir");
        return alumnes.get(materia);
    }
}