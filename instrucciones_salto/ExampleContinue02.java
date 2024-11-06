/*
 *El programa solicitará al usuario que ingrese números 
  y solo imprimirá los números pares
  OJO ESTO NO ESTARÍA BIEN PROGRAMADO, ES SOLO PARA MOSTRAR QUÉ IMPLICA EL USO
  
 *
 */



import java.util.Scanner;

public class ExampleContinue02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Ingresa un número (0 para salir): ");
            numero = scanner.nextInt();

            if (numero == 0) {
                break; // Sale del bucle si se ingresa 0
            }

            if (numero % 2 != 0) {
                continue; // Salta los números impares y vuelve a la siguiente iteración
            }

            System.out.println("Número par: " + numero);
        } while (true);

        scanner.close();
        
    }
}
