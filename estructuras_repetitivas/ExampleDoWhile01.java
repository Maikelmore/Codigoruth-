/************************************* BUCLE DO WHILE *********************+

do {
    // Código a ejecutar al menos una vez
} while (condición);

 -Código a ejecutar al menos una vez: En esta parte, se coloca el bloque de código que
 se ejecutará al menos una vez antes de verificar la condición.

 - condición: La condición se verifica después de ejecutar el código dentro del bucle. 
 Si la condición es verdadera, el bucle continuará ejecutándose; de lo contrario, se detendrá.
 */

package estructuras_repetitivas;

public class ExampleDoWhile01 {
    public static void main(String[] args) {
        int numero = 1;

        do {
            System.out.println(numero);
            numero++;
        } while (numero <= 5);
        
    }
}
