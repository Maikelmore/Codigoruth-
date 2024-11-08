import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Excepciones Ejemplo 3 control de excepciones
 * Captura de una excepción aritmética para evitar la división por cero.
 */
public class ExceptionExample3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduce el primer número: ");
            int numero1 = scanner.nextInt();
            System.out.print("Introduce el segundo número: ");
            int numero2 = scanner.nextInt();
            int resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor, introduce un número válido.");
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        } finally {
            System.out.println("Fin del programa.");
            scanner.close();
        }
    }
}
