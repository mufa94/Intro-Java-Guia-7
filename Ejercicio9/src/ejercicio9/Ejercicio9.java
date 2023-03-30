/*
 * Ayuda chat gpt
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio9 {

    /**EJERCICIO 9
-Escriba un programa que lea 20 números. 
* -Si el número leído es igual a cero se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
* -El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
* Nota: recordar el uso de la sentencia break.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // satetments object
        Scanner leer =new Scanner(System.in);
                
                //statement variables
                int suma = 0;
                int contador = 0;
                int n;
             
                
                //statemente capture for screen
                 do{
                            System.out.println("Ingrese un numero entero ");
                             while(!leer.hasNextInt()){//El while se ejecuta si la expresion dentro del parentesis es verdadera
                                System.out.println("Ingrese un numero entero; ");             
                             }
                     
                                 n = leer.nextInt();
                     
                                if (n == 0) {
                                    System.out.println("Se capturo el numero cero.");
                                    break;
                                 }
                                
                                if (n > 0){
                                    suma = n + suma;
                                    contador++;
                                }        
                      }while (contador < 20);   
                 System.out.println("La suma de los números ingresados es= " + suma);
    }
    
}
