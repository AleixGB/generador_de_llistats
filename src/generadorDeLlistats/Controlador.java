/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorDeLlistats;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JList;

/**
 *
 * @author Aleix and Jordi
 */
public class Controlador {

    private static CSV csv;
    private static AlumnesMap alumnesMap;
    private static JList listMateries;
    private static XML_DOM xml;

    public Controlador(File fitxer, JList list) {
        alumnesMap = new AlumnesMap();
        csv = new CSV(fitxer, alumnesMap);
        listMateries = list;
    }

    public void llegirCSV() {
        csv.llegir();
    }

    public ArrayList<String> obtenirMateries() {
        return alumnesMap.obtenirMateries();
    }
    
    public boolean crearXML(List llistaMateries){
        xml = new XML_DOM(llistaMateries, alumnesMap);    
        xml.crearXML();
        return xml.getCreat();
    }
}
