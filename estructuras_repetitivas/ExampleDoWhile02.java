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

import java.util.Scanner;

public class ExampleDoWhile02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int suma = 0;

        do {
            System.out.print("Ingresa un número positivo (o un número negativo para detenerse): ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                suma += numero;
            }
        } while (numero >= 0);

        System.out.println("La suma de los números ingresados es: " + suma);

        scanner.close();
        
    }
}
