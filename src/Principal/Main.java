
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
     
        Club cs1 = new Club("Nautico");
        
        Socio s3 = new Socio("14","Campos","01/02/2021");
        Socio s1 = new Socio("12","Moisés","01/02/2023");
        Socio s2 = new Socio("11","Alejandro","01/02/2022");
        Socio s4 = new Socio("10","Moi","01/02/2020"); 
        
        /* NOTAS:
        * Si coloco DNI = 9, al ordenar lo coloca al final
        * Si coloco dos socios iguales solo se agrega uno, pero podré usar cualquier variable de referencia porque apuntan al mismo sitio
        */
        

        System.out.println("---- ALTA DE VARIOS SOCIOS ---");
        cs1.darAlta(s3);
        cs1.darAlta(s1);
        cs1.darAlta(s2);      
        cs1.darAlta(s4);
        System.out.println(cs1+"\n");
        

        System.out.println("---- SOCIO DADO DE BAJA ---");
        cs1.darBaja(s4.getDni());
        System.out.println(cs1+"\n");
        
        
        System.out.println("---- CAMBIO DE NOMBRE ---");
        cs1.modificarNombre(s2.getDni(), "Ale");
        System.out.println(cs1+"\n");
        
             
        System.out.println("---- CAMBIO DE ANTIGÜEDAD ---");
        cs1.modificarFechaAlta(s2.getDni(), "01/01/1995");
        System.out.println(cs1+"\n");
        
   
        System.out.println("---- ORDENADO POR ANTIGÜEDAD ---");
        cs1.ordenarPorAntiguedad();
        System.out.println(cs1+"\n");
        
        System.out.println("---- ORDENADO POR NOMBRE ---");
        cs1.ordenarPorNombre();
        System.out.println(cs1+"\n");
        
        System.out.println(cs1.getPlantilla());
    }
    
}

