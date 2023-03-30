/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio10 {

    /**EJERCICIO 10 pag 31
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // statements object
        Scanner leer = new Scanner(System.in);
        // statements variables
        
         //statements  repetitive structure
         for (int i = 0; i <= 4; i++) {
             System.out.println("Ingrese un numero entre el 1  y el 20");
             int numero = leer.nextInt();
             
                    if (numero < 1 || numero > 20 ){
                        System.out.println("El numero ingresado no esta dentro del rango valido ");
                         i--;
                        continue;
                    }
             
                               System.out.println(numero + " ");
                                for (int j = 0; j < numero; j++) {
                                    System.out.println("*");
                         }
                                
                        System.out.println();  
        }
        
    }
    
}
