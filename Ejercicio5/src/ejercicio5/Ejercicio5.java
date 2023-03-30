package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    /**EJERCICIO 5
Define una variable de tipo boolean, double y char. Guarda información en ellas a través del Scanner.
*
* 
* 
* y tambien este ejericico
* 
* DETECCIÓN DE ERRORES
Arreglar la siguiente porción de codigo.
public static void main(String[] args) {
Scanner leer = new Scanner();
System.out.println("Ingresa tu edad");
String nombre = leer.nextInt();
System.out.println("Ingresa tu nombre");
int edad = leer.next();
}
}
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //STATEMENT THE OBJECT
         Scanner leer = new Scanner (System.in);
         
         //STATEMENTS OF VARIABLES
         System.out.println("Ingresa por teclado un valor booleano True or False:");
         boolean bol = leer.nextBoolean();
         
         System.out.println("Ingresa por teclado un numero decimal:");
         double n1 = leer.nextDouble();
         
         System.out.println("Ingresa por teclado solo un caracter");
         char n2 = leer.next().charAt(0); //no se porque va el .charAt(0),
                 
         
         //SCREEN OUTPUT
         System.out.println(" el valor boleano es: " + bol);
         
         
         
         //DETECCION DE ERRORES OTRO EJERCICIO
         Scanner t = new Scanner(System.in); //FALTA EL System.in dentro del parentesis para leer por el screnn cambie leer por t por q ya estaba declarada en el otro ejercicio
         System.out.println("Ingresa tu edad");
         String nombre = t.nextLine();  // para  string cadena se usa t.nextLine(); y no t.nextInt(); que es para entero
         System.out.println("Ingresa tu nombre");
          int edad = t.nextInt();// para un entero se una t.nextInt(); y no t.next(); que es para char
         
         
         
    }
    
}
