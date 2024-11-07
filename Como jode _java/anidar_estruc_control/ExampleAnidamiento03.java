/*
 * ejemplo de estructuras de control anidadas que involucra un bucle for 
 * anidado dentro de un bucle while para imprimir una tabla de multiplicar
 */
package anidar_estruc_control;

public class ExampleAnidamiento03 {

    public static void main(String[] args) {
        
        int numero = 5;
        int limite = 10;

        while (numero <= limite) {
            int multiplicador = 1;
            while (multiplicador <= 10) {
                int resultado = numero * multiplicador;
                System.out.println(numero + " x " + multiplicador + " = " + resultado);
                multiplicador++;
            }
            numero++;
        }
    }
}
