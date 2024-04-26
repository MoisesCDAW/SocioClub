
package Principal;

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
     * Con el objetivo de eliminar un socio del club
     * @param dni del socio a modificar
     */
    public void darBaja(String dni){
        Iterator<Socio> it = this.plantilla.iterator();
        
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
    public void darAlta(Socio socio){
        this.plantilla.add(socio);
    }
    
    
    /**
     * Busca el dni dentro de la colección y si hay coincidencia aplica la modificación del nombre
     * @param dni del socio a modificar
     * @param nuevoNombre principal del socio
     */
    public void modificarNombre(String dni, String nuevoNombre){

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
    public void modificarFechaAlta(String dni, String nuevaFecha){

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
