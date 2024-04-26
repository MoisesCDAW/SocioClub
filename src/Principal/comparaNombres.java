/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.Comparator;

/**
 *
 * @author 1daw05
 */
public class comparaNombres implements Comparator<Socio>{

    @Override
    public int compare(Socio o1, Socio o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
   
    
}
