package arrays;

import java.util.Arrays;

public class Ejer2Arrays2 {
    public static void main(String[] args) {
        int a[] = {3,2,4,4,5,6,7,9};
        int b[] = new int [a.length/2];
        int c[] = new int [a.length/2];

        //rellenamos el vector b con los 4 primeros elementos
        for (int i=0; i<a.length/2;i++){
            b[i] = a[i];
        }
        int contador=0; //necesitamos otra variable contador para el vector c 
        for (int i=a.length/2; i<a.length;i++){
            c[contador]= a[i];
            contador++;
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        
    }
}
