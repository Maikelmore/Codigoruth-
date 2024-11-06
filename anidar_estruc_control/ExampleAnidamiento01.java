/*
 * En este ejemplo, se utiliza un bucle for para contar hasta n. 
 * Dentro del bucle, se anida una estructura condicional que 
 * verifica si el número actual i es par o impar y muestra el mensaje correspondiente.
 */
package anidar_estruc_control;

public class ExampleAnidamiento01 {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("El número " + i + " es par.");
            } else {
                System.out.println("El número " + i + " es impar.");
            }
        }
    }
}
