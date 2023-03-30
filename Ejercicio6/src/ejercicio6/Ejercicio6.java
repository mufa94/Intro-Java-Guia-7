/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio6 {

    /**EJERCICIO 6
Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // statements object
        Scanner leer = new Scanner(System.in);     
        //statements  variables
       
        int x;
        int y;
        
        //statements capturas
        System.out.println("Ingrese el primer numero entero: ");
        x = leer.nextInt();
        System.out.println("Ingrese el segundo numero entero: ");
        y = leer.nextInt();
        
        //statements screen output
        if (x  > 25 || y > 25 ) {
        System.out.println("al menos uno de los dos valores ingresados es >25");
          } else {
            System.out.println("Ninguno de los dos valores ingresados es >25");
            }
        
       
        
        
        
    }
    
}
