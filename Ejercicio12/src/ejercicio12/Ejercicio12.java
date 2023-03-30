/*

 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio12 {

    /**EJERCICIO 12 pag 35
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del segundo, sino informe que no lo son.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número: ");
            int num1 = sc.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int num2 = sc.nextInt();
            EsMultiplo(num1, num2);// comentario cualquiera para git
        }
    }

    private static void EsMultiplo(int num1, int num2) {
        if(num1 % num2 == 0) { //devuelve el resto de la división de num1 por num2. Si el resto es cero, significa que num1 es divisible por num2, es decir, que num1 es un múltiplo de num2.
            System.out.println(num1 + " es múltiplo de " + num2);
        } else {
            System.out.println(num1 + " no es múltiplo de " + num2);
        }
        
    }
    
}
