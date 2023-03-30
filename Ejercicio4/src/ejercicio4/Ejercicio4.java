package ejercicio4;
import java.util.Scanner;

public class Ejercicio4 {
    /**EJERCICIO 4 PAG 18
Define una variable que aloje tu nombre 
* y otra que guarde tu edad. Imprime ambas variables por pantalla.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //WE STATEMENT THE  OBJECT t
        Scanner t = new Scanner(System.in);
                
        //WE STATEMENTS TO VARIABLES
        String name;
        int edad;
        
       //CAPTURES
        System.out.println("Escribe tu nombre "); 
        name = t.nextLine();
        System.out.println("Escribe tu edad");
        edad = t.nextInt();
        
        //SALIDAS EN PANTALLA
        System.out.println("Mis datos son: ");
        System.out.println("name: " + name);
        System.out.println("Age: " + edad);
        
        
        
     
        
    }
    
}
