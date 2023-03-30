/* * Revisemos lo aprendido hasta aquí
• Diseñar funciones
• Nombrarlas correctamente
• Determinar y definir retornos
• Comprender el funcionamiento de los parámetros
• Poder mostrar el retorno de la función, alojar su retorno y llamarlo desde el Algoritmo principal
• Saber elegir cuándo debe utilizarse una función*/
package ejercicio11;
import java.util.Scanner;
public class Ejercicio11 {

    /**EJERCICIO 11 ver pag para leer completo pag 33
        Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto
        * , y luego codifique la palabra o frase  ingresada de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) 
    * se mantienen sin cambios.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Statements object
         Scanner leer =new Scanner(System.in);//creo mi objeto leer
      
                //statement variable and statement to output screen
                System.out.println("Ingrese una secuencia de caracteres por teclado para codificar");
                String input = leer.nextLine().toLowerCase().trim();  //el tolowercase devuelve todo en minisculas y el trim elimina los espacios antes y despues de la frase
                //Statement to show for screen
                
                //statement to codificated
                    String output = Codificar(input);// al escribir codificar te sale el bombillito para llamar este metodo codificar es un subprograma
                                                                  //que recibe como argumento una cadena de texto (String input) y devuelve una cadena de texto codificada del subprograma que realizamos.  
                    System.out.println("El resultado de la codificación es: " + output);
                    leer.close();/*La línea sc.close(); se utiliza para cerrar el objeto Scanner que se ha creado para leer la entrada del usuario a través del teclado. 
                                      Cuando se crea un objeto Scanner, este objeto mantiene una conexión abierta con el flujo de entrada del usuario. Si no cerramos explícitamente 
                                      el objeto Scanner, se mantendrá abierta esta conexión, lo que podría causar problemas de memoria o de recursos.

                                      Al cerrar el objeto Scanner, se libera la conexión con el flujo de entrada y se liberan los recursos asociados con el objeto Scanner. Por lo tanto, es una 
                                      buena práctica cerrar explícitamente el objeto Scanner después de usarlo.*/               
    }

    public static String Codificar(String input) {
           String output = " ";/*La línea String output = ""; antes del ciclo for se utiliza para inicializar la variable output con una cadena vacía. 
                                        Esto se hace para asegurarse de que la variable output tenga un valor inicial antes de comenzar a concatenar los caracteres codificados.
                                        Si no se inicializa la variable output antes del ciclo for, podría generarse un error de compilación o un error en tiempo de ejecución, 
                                        porque la variable output podría no estar definida o podría tener un valor nulo. Por lo tanto, es importante inicializar la variable output antes 
                                        del ciclo for para evitar este tipo de problemas.*/
           
           for (int i = 0; i < input.length(); i++) {// length devuelve la longitud de la cadena, es decir, el número de caracteres que contiene.
            char c = input.charAt(i); //.charAt(i) es un método de la clase String en Java que devuelve el carácter en la posición i de la cadena de texto.
             switch (c) {
                 case 'a':
                    output += "@";
                    break;
                case 'e':
                    output += "#";
                    break;
                case 'i':
                    output += "$";
                    break;
                case 'o':
                    output += "%";
                    break;
                case 'u':
                    output += "*";
                    break;
                default: //para proporcionar una acción por defecto en caso de que ninguna de las condiciones anteriores se cumpla.
                    output += c;// recuerda que en char c se va a a guardar la letra en la posicion que te la tire, este va a guardar la letra sin codificar en caso de que no escribas bocales
                    break;                       
             }  
        }
                return output;
    }
    
}
