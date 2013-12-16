/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package generadorDeLlistats;

import java.util.ArrayList;

/**
 *
 * @author Aleix_Jordi
 */
public class GeneradorDeLlistats {
    public static void main(String[] args) {
        
       AlumnesMap aMap = new AlumnesMap();
       aMap.insertarAlumneMateria("1", "Pepitu", "2B");
       aMap.insertarAlumneMateria("2", "Joanet", "2B");
       aMap.insertarAlumneMateria("3", "Phont", "2B");
       
       aMap.insertarAlumneMateria("1", "Alexitu", "2B");
       aMap.insertarAlumneMateria("2", "Alexitu", "2B");
       
       ArrayList<Alumne> a = aMap.obtenirAlumnes("1");
       a.addAll(aMap.obtenirAlumnes("2"));
       
       for(int i = 0; i < a.size(); i++) {
           System.out.println(a.get(i));
       }
    }
    
}
