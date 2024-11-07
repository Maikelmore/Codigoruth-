package excepciones;

import java.util.Scanner;

/**
 * Excepciones: Ejemplo 01 para ver qué es una excepción
 * Programa en el que se produce una excepción si el usuario teclea un carácter
 */

public class ExceptionExample1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        System.out.println("Has introducido: " + numero);
        scanner.close();

    }
}
