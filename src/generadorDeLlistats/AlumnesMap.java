package generadorDeLlistats;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class AlumnesMap {

    private TreeMap<String, TreeMap<String, Alumne>> alumnes;
    private TreeMap<String, Alumne> currentAlumne;

    public AlumnesMap() {
        alumnes = new TreeMap<String, TreeMap<String, Alumne>>();
        currentAlumne = new TreeMap<String, Alumne>();
    }

    public TreeMap<String, TreeMap<String, Alumne>> getAlumnes() {
        return alumnes;
    }

    public void setAlumnes(TreeMap<String, TreeMap<String, Alumne>> alumnes) {
        this.alumnes = alumnes;
    }

    public void inserir(String materia, String nom, String cognoms, String grup) {
        if (alumnes.containsKey(materia)) {
            currentAlumne = alumnes.get(materia);
        } else {
            currentAlumne = new TreeMap<String, Alumne>();
        }
        //System.out.println(alumnes.get(materia));
        currentAlumne.put(cognoms, new Alumne(nom, cognoms, grup));
        alumnes.put(materia, currentAlumne);
    }

    public TreeMap<String, Alumne> obtenirAlumnesMateries(String[] materia) {
        Iterator<Map.Entry<String, TreeMap<String, Alumne>>> llistatmap = alumnes.entrySet().iterator();
        Map.Entry<String, TreeMap<String, Alumne>> entradamap;
        while (llistatmap.hasNext()) {
            entradamap = llistatmap.next();
            for (int i = 0; i < materia.length; i++) {
                if (entradamap.getKey().equals(materia[i])) {
                    System.out.println(i+" "+ materia[i] + " " + entradamap.getValue());
                    break;
                }
            }
        }
        return currentAlumne;
    }

    public TreeMap<String, Alumne> obtenirAlumnes(String materia) {
        return alumnes.get(materia);
    }
}
