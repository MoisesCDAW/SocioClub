
package Principal;

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
        
        Socio s3 = new Socio("14","Campos","01/02/2021");
        Socio s1 = new Socio("12","Moisés","01/02/2023");
        Socio s2 = new Socio("11","Alejandro","01/02/2022");
        Socio s4 = new Socio("10","Moi","01/02/2020"); 
              

        System.out.println("---- ALTA DE SOCIOS ---");    

        System.out.println("---- BAJA DE SOCIOS ---");
        
        System.out.println("---- MODIFICACIÓN ---");
   
        System.out.println("---- ORDENADO POR NOMBRE ---");
        
        System.out.println("---- ORDENADO POR ANTIGÜEDAD ---");
        
        System.out.println("---- SOCIOS CON ALTA ANTERIOR A UN AÑO DETERMINADO ---");



        // Guardar fichero con las modificaciones del Map de socios
    }
    
}

