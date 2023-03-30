/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

/**
 *
 * @author usuario
 */
public class Ejercicio3 {

    /**Ejercicio 3 PAG 16
     * Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.
     * @param args the command line arguments
     */
    //1 OPERADORES ARITMETICOS
    public static void main(String[] args) {
       int n1 = 6;
       int n2 = 5;
       int resultado = n1 + n2;
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        System.out.println("Suma de n1 + n2 = "  + resultado );//lo mismo para resta, multiplicación y división
             
        //operador modulo %
        double modulo = n1 % n2;   //OJO ESTO ESTA DANDO UN RESTO QUE NO ES
        System.out.println("El residuo de n1%2 =" + modulo);
        
        //2. OPERADORES UNARIO
                //INCREMENTO: ++: INCREMENTA ANTES DE HACER LA OPERACION ARITMETICA (SUMA)
                System.out.println("Incremento de n1 y suma de n1 + n2 ++: " + (n1 +  ++n2));
                //ASIGNACIÓN EXPLICITA +:
                System.out.println("Asignación explicita +:" + (n1 +  ++n2));           
           
                //3. OPERADORES DE IGUALDAD Y RELACIÓN: Las operaciones relacionales siempre nos devolveran un valor booleano
                //comparan el contenido de una relacion con otra.
                int z1 = 9;
                int z2 = 8;
                boolean r;
                
                System.out.println("z1=" + z1);
                System.out.println("z2=" + z2);
               
                //COMPARAR SI UNA VARIABLE ES IGUAL QUE OTRA, asi aplica para todos los operadores de relación
                r = z1 == z2;
                System.out.println("z1 y z2 son iguales?:" + r);
                
                
                
                
           
    }
    
}
