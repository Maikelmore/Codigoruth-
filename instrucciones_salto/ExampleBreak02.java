/*
 * Programa solicitará al usuario que adivine un número 
 * y se detendrá cuando el usuario adivine correctamente 
 * el número secreto (en este caso, el número 7)
 * 
 * OJO ESTE EJEMPLO ES PARA ENTENDER EL FUNCIONAMIENTO PERO NO ESTARÍA BIEN PROGRAMADO
 * ESTO NO SERÍA APTO
 */

import java.util.Scanner;

public class ExampleBreak02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 7;
        int intentos = 0;

        System.out.println("¡Adivina el número secreto!");

        while (true) {
            System.out.print("Ingresa tu intento: ");
            int intento = scanner.nextInt();
            intentos++;

            if (intento == numeroSecreto) {
                System.out.println("¡Correcto! Adivinaste el número secreto en " + intentos + " intentos.");
                break; // Sale del bucle cuando se adivina el número
            } else {
                System.out.println("Intenta de nuevo.");
            }
        }

        scanner.close();
        
    }
}
