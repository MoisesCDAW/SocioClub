
package Principal;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;



/**
 *
 * @author MoisesC
 */
public class Main {     
    
    /**
     * Método estático. Con el objetivo de eliminar un socio del club
     * @param nombreClub Colección TreeSet de tipo genérico Socio
     * @param dni del socio a modificar
     */
    static void darBaja(TreeSet<Socio> nombreClub, String dni){
        Iterator<Socio> it = nombreClub.iterator();
        
        boolean encontrado=false;
        
        while (it.hasNext()) {
            Socio socio = it.next();
            if (socio.getDni().equals(dni)) {
                it.remove();               
                encontrado = true;
                break;
            }
        }
        
        if (encontrado==false) {
            System.out.println("Objeto no encontrado");
        }
    }
    
    
    /**
     * Método estático. Con el objetivo de agregar un nuevo socio al club
     * @param nombreClub Colección TreeSet de tipo genérico Socio
     * @param socio objeto para agregar al colección "nombreClub"
     */
    static void darAlta(TreeSet<Socio> nombreClub, Socio socio){
        nombreClub.add(socio);
    }
    
    
    /**
     * Método estático. Busca el dni dentro de la colección y si hay coincidencia aplica la modificación del nombre
     * @param nombreClub Colección TreeSet de tipo genérico Socio
     * @param dni del socio a modificar
     * @param nuevoNombre principal del socio
     */
    static void modificarNombre(TreeSet<Socio> nombreClub, String dni, String nuevoNombre){

        Iterator<Socio> it = nombreClub.iterator();
        
        boolean encontrado=false;
        
        while (it.hasNext()) {
            Socio socio = it.next();
            if (socio.getDni().equals(dni)) {
                socio.cambiarNombre(nuevoNombre);
                encontrado = true;
                break;
            }
        }
        
        if (encontrado==false) {
            System.out.println("Objeto no encontrado");
        }
    }
    
    
    /**
     * Método estático. Busca el dni dentro de la colección y si hay coincidencia aplica la modificación de la fecha de alta
     * @param nombreClub Colección TreeSet de tipo genérico Socio
     * @param dni del socio a modificar
     * @param nuevaFecha de alta para el socio
     */
    static void modificarFechaAlta(TreeSet<Socio> nombreClub, String dni, String nuevaFecha){

        Iterator<Socio> it = nombreClub.iterator();
        
        boolean encontrado=false;
        
        while (it.hasNext()) {
            Socio socio = it.next();
            if (socio.getDni().equals(dni)) {
                socio.cambiarFechaAlta(nuevaFecha);
                encontrado = true;
                break;
            }
        }
        
        if (encontrado==false) {
            System.out.println("Objeto no encontrado");
        }
    }
    
    
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
        
        TreeSet<Socio> cs1 = new TreeSet<>(comparaNombre);
        
        Socio s1 = new Socio("12","Moisés","01/02/2023");
        Socio s2 = new Socio("11","Alejandro","01/02/2022");
        Socio s3 = new Socio("14","Campos","01/02/2021");
        Socio s4 = new Socio("9","Moisés","01/02/2020"); // NO lo está agregando porque está repetido

        darAlta(cs1, s1);
        darAlta(cs1, s2);
        darAlta(cs1, s3);
        darAlta(cs1, s4);
        
        System.out.println(cs1);
        System.out.println();
        
        darBaja(cs1, s1.getDni());
        
        System.out.println(cs1);
        System.out.println();
        
        modificarNombre(cs1, s2.getDni(), "Ale");
        
        System.out.println(cs1);
        System.out.println();
        
        modificarFechaAlta(cs1, s2.getDni(), "01/01/1995");
        
        System.out.println(cs1);
        System.out.println();
    }
    
}

