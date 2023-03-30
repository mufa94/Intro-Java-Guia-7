/*
Ayuda de chat gpt
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio8 {

    /**EJERCICIO 8 pag 27
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
     * @param args the command line arguments
     * 
     * En este programa, se utiliza un bucle while para pedirle al usuario que introduzca una nota hasta que se introduce una nota válida (entre 0 y 10, ambos incluidos). Si la nota
     * no es válida, el programa vuelve a pedir la nota. Cuando se introduce una nota válida, 
     * el programa muestra la nota introducida.
     */
    public static void main(String[] args) {
        // Statements object
        Scanner leer = new Scanner(System.in);
        
        //Statement variables
        int nota = -1; 
         
        //statements  captures by keyboard
     
        
        //repetitive structure
      while (nota < 0 || nota > 10){
           System.out.println("Introduce una nota entre 0 y 10: ");
           nota = leer.nextInt();
      }
      
        System.out.println("La nota introducida es: " + nota);
        
    }
    
    /*En el ejemplo que proporcioné, la variable nota se inicializa con el valor 0. Esto se hace para que la condición del bucle while (nota < 1 || nota > 10) se cumpla 
    al principio, ya que 0 no está en el rango de notas válidas (entre 1 y 10, ambos incluidos).

De esta manera, el programa entra en el bucle while y le pide al usuario que introduzca una nota. Si la nota introducida es válida, es decir, está entre 1 y 10, el programa 
    sale del bucle y continúa con el resto del código. Pero si la nota introducida no es válida, el programa sigue pidiendo una nueva nota hasta que se introduzca una nota válida.

En resumen, se inicializa nota con 0 para que la condición del bucle while se cumpla y el programa pueda pedir una nota válida al usuario. Si nota se inicializara con cualquier 
    otro valor en el rango de notas válidas, el programa no entraría en el bucle while y la validación de la nota no funcionaría correctamente.*/
}
