package arrays;

import java.util.Arrays;

class Ejer3Arrays2 {
    public static void main(String[] args) {

        int[] array1 = {1,4,6,10,-3,4,6,-5};
        int i, suma;

        suma=0;
        for (i=0; i<array1.length;i++){
            suma = suma + array1[i];
        }

        //Mostrar el resultado. 
        System.out.println("La suma total de " + Arrays.toString(array1) + " es " + suma);


    }
} 