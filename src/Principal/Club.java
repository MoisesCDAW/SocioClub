
package Principal;

import java.util.Map;
import java.util.TreeMap;

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
    private Map<String, Socio> plantilla;

    
    /*     
    *
    * <---------------- CONSTRCUTOR ----------------------->
    *
    */
    public Club(String nombre){
        setNombre(nombre);
        this.plantilla = new TreeMap<>();
    }

    
    /*
    *
    * <---------------- MÉTODOS ----------------------->
    *
    */
    
    
    
    /*
    *
    * <---------------- MÉTODOS SOBRESCRITOS ----------------------->
    *
    */
    
    @Override
    public String toString(){ // ---- PENDIENTE ----
        return "";
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

}
