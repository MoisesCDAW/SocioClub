
package Principal;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author MoisesC
 */
public class Main {     
    
    
    /**
     * Método Main donde se implementan las pruebas del programa con los diferentes métodos
     * @param args Array de tipo String
     */
    public static void main(String[] args) {
        
        // Leer fichero con un Map de socios
        
        Club cs1 = new Club("Nautico");
        
        Socio s3 = new Socio("ACB","Campos","01/02/2021");
        Socio s1 = new Socio("DEF","Moisés","01/02/2023");
        Socio s2 = new Socio("GHI","Alejandro","01/02/2022");
        Socio s4 = new Socio("JKM","Moi","01/02/2020"); 
              

        System.out.println("---- ALTA DE SOCIOS ---");    
        cs1.darAlta("ACB", s3);
        cs1.darAlta("DEF", s1);
        cs1.darAlta("GHI", s2);
        cs1.darAlta("JKM", s4);
        System.out.println(cs1.getPlantilla());
        
        
        System.out.println("\n---- BAJA DE SOCIOS ---");
        cs1.darBaja("GHI");
        System.out.println(cs1.getPlantilla());
        
        
        System.out.println("\n---- MODIFICACIÓN ---");
        s4 = new Socio("ACB", "Campos", "01/02/2024");
        cs1.modificar("ACB", s4);
        System.out.println(cs1.getPlantilla());
        
        
        System.out.println("\n---- ORDENADO POR NOMBRE ---");

        Comparator<Socio> aux = new Comparator<>(){
                @Override
                public int compare(Socio o1, Socio o2) {
                    return o1.getNombre().compareTo(o2.getNombre());
                }
            };
        
        Map<String, Socio> porNombre = new TreeMap<>(aux);
        
        System.out.println("\n---- ORDENADO POR ANTIGÜEDAD ---");
        
        
        System.out.println("\n---- SOCIOS CON ALTA ANTERIOR A UN AÑO DETERMINADO ---");


        
        // Guardar fichero con las modificaciones del Map de socios
    }
    
}

