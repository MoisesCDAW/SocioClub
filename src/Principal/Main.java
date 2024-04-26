
package Principal;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;



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
        
        /**
         * Clase anónima que establece un comparador por nombres de socios para poder ordernarlos según ese criterio
         */
        Comparator<Socio> comparaNombre = new Comparator<>(){
            @Override
            public int compare(Socio o1, Socio o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
            
        };
        
        /**
         * Clase anónima que establece un comparador por antigüedad de socios para poder ordernarlos según ese criterio
         */
        Comparator<Socio> comparaAntiguedad = new Comparator<>(){
            @Override
            public int compare(Socio o1, Socio o2) {
                return o1.antiguedad()-o2.antiguedad();
            }
            
        };
        
        Club cs1 = new Club("Nautico");
        
        Socio s1 = new Socio("12","Moisés","01/02/2023");
        Socio s2 = new Socio("11","Alejandro","01/02/2022");
        Socio s3 = new Socio("14","Campos","01/02/2021");
        Socio s4 = new Socio("12","Moisés","01/02/2023"); // NO lo está agregando porque está repetido
  
        cs1.darAlta(s1);
        cs1.darAlta(s2);
        cs1.darAlta(s3);
        cs1.darAlta(s4);
        
        System.out.println(cs1);
        System.out.println();
        
        cs1.darBaja(s4.getDni()); // Funcionará tanto con s1 como con s4
        
        System.out.println(cs1);
        System.out.println();
        
        cs1.modificarNombre(s2.getDni(), "Ale");
        
        System.out.println(cs1);
        System.out.println();
        
        cs1.modificarFechaAlta(s2.getDni(), "01/01/1995");
        
        System.out.println(cs1);
        System.out.println();
    }
    
}

