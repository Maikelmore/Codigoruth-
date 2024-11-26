
/**
 * Ejemplo de uso de arrays multidimensionales en Java
 * 
 * Objetivo:
 * Este archivo demuestra cómo declarar, inicializar, acceder e iterar 
 * a través de arrays multidimensionales, así como realizar algunas operaciones básicas.
 * 
 * Un array multidimensional en Java es un array de arrays. El más común es
 * el array bidimensional.
 */
package arrays_multidimensionales;

public class EjemploArraysMultidimensionales {

    public static void main(String[] args) {
        // Declaración e inicialización de un array bidimensional
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Acceso a elementos del array
        System.out.println("Elemento en la primera fila, segunda columna: " + matriz[0][1]);

        // Iteración sobre los elementos del array
        System.out.println("Recorriendo el array bidimensional:");
        for (int i = 0; i < matriz.length; i++) { // Recorrer filas
            for (int j = 0; j < matriz[i].length; j++) { // Recorrer columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Salto de línea para cada fila
        }

        // Declaración de un array tridimensional
        int[][][] cubo = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };

        // Acceso a elementos del array tridimensional
        System.out.println("Elemento en la primera matriz, segunda fila, tercera columna: " + cubo[0][1][2]);

        // Iteración sobre los elementos del array tridimensional
        System.out.println("Recorriendo el array tridimensional:");
        for (int i = 0; i < cubo.length; i++) { // Recorrer matrices
            for (int j = 0; j < cubo[i].length; j++) { // Recorrer filas
                for (int k = 0; k < cubo[i][j].length; k++) { // Recorrer columnas
                    System.out.print(cubo[i][j][k] + " ");
                }
                System.out.println(); // Salto de línea para cada fila
            }
            System.out.println(); // Salto de línea para cada matriz
        }
    }
}
