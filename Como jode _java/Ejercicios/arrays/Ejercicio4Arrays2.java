package arrays;

import java.util.Arrays;

public class Ejercicio4Arrays2 {
    public static void main(String[] args) {
        int[] numerosEnteros={7,5,6,14,2,4,89,9,55};
        int longitud = (numerosEnteros.length -1) / 2; //tam de los nuevos arrays
        int[] array1 = new int[longitud];
        int[] array2= new int[longitud];
        for (int i=0; i<longitud;i++){
            array1[i] = numerosEnteros[i];
            array2[i]=numerosEnteros[i+longitud+1];
        }
        
        //mostramos los arrays, el valor 2 ya no aparece en ninguno de los dos arrays
        System.out.println("\nArray original = " + Arrays.toString(numerosEnteros));
        System.out.println("\narray1= " + Arrays.toString(array1));
        System.out.println("\narray1= " + Arrays.toString(array2));

        //multiplicamos
        for (int i=0; i<longitud;i++){
            array1[i] = array1[i]*numerosEnteros[longitud];
            array2[i] =array2[i]*numerosEnteros[longitud];

        }

        //mostramos los arrays
        System.out.println("\n--- Despues de multiplicar ----");
        System.out.println("\nArray original = " + Arrays.toString(numerosEnteros));
        System.out.println("\narray1= " + Arrays.toString(array1));
        System.out.println("\narray1= " + Arrays.toString(array2));

    }
}
