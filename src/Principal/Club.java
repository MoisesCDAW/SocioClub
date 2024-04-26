
package Principal;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author moise
 */
public class Club {
    
    /**
     * Nombre del club de tipo String;
     */
    private String nombre;
    /**
     * Colección de tipo set
     */
    private Set<Socio> plantilla;

    
    /*     
    *
    * <---------------- CONSTRCUTOR ----------------------->
    *
    */
    public Club(String nombre){
        setNombre(nombre);
        this.plantilla = new TreeSet<>();
    }

    
    /*
    *
    * <---------------- MÉTODOS ----------------------->
    *
    */
    
    
    /**
     * Crea una nueva colección de forma local, aplica el orden por nombre y luego se establece como "plantilla"
     * Usa Clase anónima que establece un comparador por nombres de socios para poder ordernarlos según ese criterio
     */
    public void ordenarPorNombre(){ // CORRECCIÓN: Es mejor hacer los comparator en otra clase    
        Set<Socio> nuevoOrden = new TreeSet<>( // CORRECCIÓN: Esto va en la clase Socio
           new Comparator<>(){
                @Override
                public int compare(Socio o1, Socio o2) {
                    return o1.getNombre().compareTo(o2.getNombre());
                }            
           } 
        );
        
        nuevoOrden.addAll(plantilla);
        this.plantilla = nuevoOrden;
    }
    
    
    /**
     * Crea una nueva colección de forma local, aplica el orden por nombre y luego se establece como "plantilla"
     * Usa Clase anónima que establece un comparador por antigüedad de socios para poder ordernarlos según ese criterio
     */
    public void ordenarPorAntiguedad(){ // CORRECCIÓN: Es mejor hacer los comparator en otra clase
        Set<Socio> nuevoOrden = new TreeSet<>( // CORRECCIÓN: Se debe hacer la clase anónima por separado, no dentro del constructor de la colección
            new Comparator<>(){
                @Override
                public int compare(Socio o1, Socio o2) {
                    return o1.antiguedad()-o2.antiguedad();
                }
            }
        );
        
        nuevoOrden.addAll(plantilla);
        this.plantilla = nuevoOrden;
    
    }
    
    /**
     * Con el objetivo de eliminar un socio del club
     * @param dni del socio a modificar
     */
    public void darBaja(String dni){
        Iterator<Socio> it = this.plantilla.iterator(); // CORRECIÓN: Se puede hacer sin iterator
        
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
     * Con el objetivo de agregar un nuevo socio al club
     * @param socio objeto para agregar al colección "plantilla"
     */
    public void darAlta(Socio socio){ // CORRECIÓN: Hizo falta un reutrn boolean para saber si se agregó o no
        this.plantilla.add(socio);
    }
    
    
    /**
     * Busca el dni dentro de la colección y si hay coincidencia aplica la modificación del nombre
     * @param dni del socio a modificar
     * @param nuevoNombre principal del socio
     */
    public void modificarNombre(String dni, String nuevoNombre){ // CORRECIÓN: Se puede hacer sin iterator

        Iterator<Socio> it = this.plantilla.iterator();
        
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
     * Busca el dni dentro de la colección y si hay coincidencia aplica la modificación de la fecha de alta
     * @param dni del socio a modificar
     * @param nuevaFecha de alta para el socio
     */
    public void modificarFechaAlta(String dni, String nuevaFecha){ // CORRECIÓN: Se puede hacer sin iterator

        Iterator<Socio> it = this.plantilla.iterator();
        
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
    
    
    /*
    *
    * <---------------- MÉTODOS SOBRESCRITOS ----------------------->
    *
    */
    
    @Override
    public String toString(){
        String detalles="";
        for (Socio socio : plantilla) {
            detalles += socio;
        }
        return detalles;
    }
    
    
    /*
    *
    * <---------------- SETTERS / GETTERS ----------------------->
    *
    */
    
    
    /**
     * Nombre del club de tipo String;
     * @return the nombre del club
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Nombre del club de tipo String;
     * @param nombre the nombre to set 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Colección de tipo set
     * @return the plantilla del club
     */
    public Set<Socio> getPlantilla() {
        return plantilla;
    }
}
