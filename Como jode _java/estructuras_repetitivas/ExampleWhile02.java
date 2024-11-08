/************************************* BUCLE WHILE *********************+
Calcular la suma de los números ingresados por el usuario hasta que el 
usuario ingrese un número negativo
 */

package estructuras_repetitivas;


import java.util.Scanner;

public class ExampleWhile02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int suma = 0;

        System.out.println("Escriba números para sumar (número negativo para finalizar):");

        int numero = scanner.nextInt();
        while (numero >= 0) {
            suma += numero;
            numero = scanner.nextInt();
        }

        System.out.println("La suma de los números ingresados es: " + suma);

        scanner.close();
    }
}
