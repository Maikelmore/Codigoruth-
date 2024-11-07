package arrays;

import java.util.Arrays;

class Ejer1Arrays2 {
    public static void main(String[] args) {

        int[] array1 = {1,3,5,7,8};
        int[] array2 = {1,2,3,4,5};
        int[] arrayResultado = new int [array1.length]; //array1 o array2
        int i;

        for (i=1; i<array1.length;i=i+2){
            arrayResultado[i]=array1[i]+array2[i];
        }

        //Mostrar el resultado. Lo vamos hacer de dos formas:

        //1ª
        System.out.println(Arrays.toString(array1) + " + " + Arrays.toString(array2) + " = " + Arrays.toString(arrayResultado));
        
        //2ª usar bucle for

        for (i=0; i<array1.length;i++){
            System.out.println("La suma de " + array1[i] + " + " + array2[i] + " = " + arrayResultado[i]);
        }

        //3ª bucle for each
        for (int elemento : arrayResultado){
            System.out.println("La suma es: " + elemento);
        }



    }
}