/*
 * ejemplo de estructuras de control anidadas, en este caso, 
 * utilizaremos un bucle for anidado dentro de un bucle for 
 * para imprimir un patrón de asteriscos
 */
package anidar_estruc_control;

public class ExampleAnidamiento02 {

    public static void main(String[] args) {
        
        int filas = 5;
        int columnas = 5;

        for (int i = 1; i <= filas; i++) {
            for (int j = 1; j <= columnas; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
    }
}
