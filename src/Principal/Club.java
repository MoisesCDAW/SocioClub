
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
    
    
    public void darAlta(String apodo, Socio socio){
        getPlantilla().put(apodo, socio);
    }
    
    public void darBaja(String apodo){
        if (plantilla.containsKey(apodo)) {
            plantilla.remove(apodo); 
        }else {System.out.println("Ese apodo no existe");}
    }
    
    public void modificar(String apodo, Socio socio){
        getPlantilla().put(apodo, socio);
    }
    
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

    /**
     * Colección de tipo set
     * @return the plantilla
     */
    public Map<String, Socio> getPlantilla() {
        return plantilla;
    }

    /**
     * Colección de tipo set
     * @param plantilla the plantilla to set
     */
    public void setPlantilla(Map<String, Socio> plantilla) {
        this.plantilla = plantilla;
    }

}
