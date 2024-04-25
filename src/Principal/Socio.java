
package Principal;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author MoisesC
 */
public class Socio implements Comparable<Socio>, Serializable {
    
    /**
     * DNI: Representa el dni del socio. Es tipo String 
     */
    private String dni;
    /**
     * Nombre: Nombre principal del socio. Es tipo String
     */
    private String nombre;
    /**
     * FechaAlta: Representa la fecha en que se creó el socio. Es tipo LocalDate
     */
    private LocalDate fechaAlta;

    
    /*
    *
    * <---------------- CONSTRUCTORES ----------------------->
    *
    */
    
    
    /**
     * CONSTRUCTOR: Pasando los valores de cada atributo que tendrá el objeto
     * @param dni de tipo String
     * @param nombre de tipo String
     * @param alta de tipo String que recibe "dia-mes-año" luego se hace un cast a tipo "LocalDate"
     */
    public Socio(String dni, String nombre, String alta) {
        cambiarDNI(dni);
        cambiarNombre(nombre);
        cambiarFechaAlta(alta);
    }

    /**
     * CONSTRUCTOR: Para poder crear un objeto solo con el DNI. Utiliza el constructor de arriba
     * @param dni de tipo String
     */
    public Socio(String dni) {
        this.dni = dni;
    }
    
    
    /*
    *
    * <---------------- MÉTODOS ----------------------->
    *
    */
     
    
    /**
     * Según la fecha de alta y la fecha actual, calcula los años de antigüedad del socio
     * @return Devuelve un int de los AÑOS de antigüedad del socio que lo invoca
     */
    public int antiguedad() {
        return (int) getFechaAlta().until(LocalDate.now(), ChronoUnit.YEARS);
    }

    /**
     * Permite cambiar el nombre del socio que lo invoca
     * @param nuevoNombre de tipo String
     */
    public void cambiarNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    
    /**
     * Para cambiar el DNI del socio que lo invoca
     * @param nuevoDNI de tipo String
     */
    public void cambiarDNI(String nuevoDNI){
        this.dni = nuevoDNI;
    }
    
    /**
     * Cambia la fecha de alta del socio que lo invoca
     * @param nuevaFecha de tipo String que recibe "dia-mes-año" luego se hace un cast a tipo "LocalDate"
     */
    public void cambiarFechaAlta(String nuevaFecha){
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.fechaAlta= LocalDate.parse(nuevaFecha, f);
    }
        
    /**
     * Establece el orden natural que deben seguir los objetos al implementar algún método de organización
     * @param o Se establece un tipo genérico "Socio" en la implementación de la interfaz y por eso se le pasa un objeto de tipo "Socio"
     * @return Devuelve -1, 1 o 0 dependiendo de la comparación
     */
    
    /*
    *
    * <---------------- MÉTODOS SOBRESCRITOS ----------------------->
    *
    */
    
    
    @Override
    public int compareTo(Socio o) {
        return getDni().compareTo(o.getDni());
    }

    /**
     * Sobrescritura del método equals 
     * @param o Recibe un objeto del tipo Object que después se le realiza un cast a "Socio"
     * @return true o false si los valores de los atributos de los objetos son iguales
     */
    @Override
    public boolean equals(Object o) {
        Socio otro = (Socio)o;
        return getDni().equals((otro).getDni()) &&
                this.getNombre().equals(otro.getNombre()) &&
                this.getFechaAlta().equals(otro.getFechaAlta());
    }
    
    /**
     * Muestra una descripción de los valores que tienen los atributos de un objeto
     * @return Representación de los valores del objeto en formato String
     */
    @Override
    public String toString() {
        return "DNI: " + getDni() + ", Nombre: " + getNombre()
                + ", Antiguedad: " + antiguedad() + " años\n";
    }
    
    /*
    *
    * <---------------- SOLO GETTERS ----------------------->
    *
    */
    
    
    /**
     * DNI: Representa el dni del socio. Es tipo String
     * @return the dni del socio
     */
    public String getDni() {
        return dni;
    }

    /**
     * Nombre: Nombre principal del socio. Es tipo String
     * @return the nombre del socio
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * FechaAlta: Representa la fecha en que se creó el socio. Es tipo LocalDate
     * @return the fechaAlta del socio
     */
    public LocalDate getFechaAlta() {
        return fechaAlta;
    }
}
