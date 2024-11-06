/************************************* BUCLE FOR *********************+
  Ejemplo del uso del bucle for en Java para calcular la suma de los primeros
  N números naturales, donde N es un número ingresado por el usuario
 */

package estructuras_repetitivas;

import java.util.Scanner;

public class ExampleFor02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo N: ");
        int N = scanner.nextInt();

        int suma = 0;

        for (int i = 1; i <= N; i++) {
            System.out.print(i+" + ");
            suma += i;
        }

        System.out.println(" = " + suma);

        scanner.close();
    }
}

