
/**
 * Ejemplo de uso de arrays tridimensionales en Java
 * 
 * Objetivo:
 * Este archivo demuestra cómo declarar, inicializar, acceder e iterar 
 * a través de arrays tridimensionales, mostrando cómo trabajar con estructuras más complejas.
 */
package arrays_multidimensionales;

public class ArrayTridimensional {

    public static void main(String[] args) {
        // Declaración e inicialización de un array tridimensional de 3x3x3
        int[][][] array3D = {
            {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            },
            {
                {10, 11, 12},
                {13, 14, 15},
                {16, 17, 18}
            },
            {
                {19, 20, 21},
                {22, 23, 24},
                {25, 26, 27}
            }
        };

        // Acceso a un elemento específico del array tridimensional
        System.out.println("Elemento en la primera capa, segunda fila, tercera columna: " + array3D[0][1][2]);

        // Iteración sobre los elementos del array tridimensional
        System.out.println("Recorriendo el array tridimensional:");
        for (int i = 0; i < array3D.length; i++) { // Recorrer capas
            for (int j = 0; j < array3D[i].length; j++) { // Recorrer filas
                for (int k = 0; k < array3D[i][j].length; k++) { // Recorrer columnas
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println(); // Salto de línea para cada fila
            }
            System.out.println(); // Salto de línea para cada capa
        }
    }
}
