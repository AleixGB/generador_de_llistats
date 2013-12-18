/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorDeLlistats;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 *
 * @author Aleix_Jordi sadfdsafa
 */
public class GeneradorDeLlistats {

    public static void main(String[] args) {

        AlumnesMap aMap = new AlumnesMap();
        aMap.inserir("1", "Pepitu", "asd", "2B");
        aMap.inserir("2", "Joanet", "dwefasd", "2B");
        aMap.inserir("3", "Phont", "dewsa", "2B");
        aMap.inserir("4", "Alexitu", "svewda", "2B");
        aMap.inserir("2", "Alexitu", "sdeta", "2B");
        aMap.inserir("5", "Alexitasdfsdafsu", "svweda", "2B");
        aMap.inserir("4", "Alexitasdfsdafsu", "sda", "2B");

        TreeMap<String, TreeMap<String, Alumne>> aa = aMap.getAlumnes();

        Iterator<Entry<String, TreeMap<String, Alumne>>> llistatmap = aa.entrySet().iterator();
        Entry<String, TreeMap<String, Alumne>> entradamap;
        while (llistatmap.hasNext()) {
            entradamap = llistatmap.next();
            System.out.println(" " + entradamap.getKey() + " " + entradamap.getValue());
        }
        
        
        
        System.out.println("-------------------------");
        String[] smaps = {"1", "3", "4"};
        aMap.obtenirAlumnesMateries(smaps);

    }

}
