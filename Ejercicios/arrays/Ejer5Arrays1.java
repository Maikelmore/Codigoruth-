package arrays;
/*
 * El enunciado no indica qué sucede con el 6
 * En esta solución lo guardamos en el arrayMenores
 */
import java.util.Arrays;
class Ejer5Arrays2 {
    public static void main(String[] args) {

        final int NUMERO = 6;
        int[] array1 = {2,3,4,7,8,10,11};
        int[] arrayMenores = new int [array1.length];
        int[] arrayMayores = new int [array1.length];
        int i, posicionMenores, posicionMayores; //i la usamos para recorrer el vector array1

        //posicionMenores es vble que guarda la posicion del vector arrayMenores, inicalmente se guarda en la pos 0
        posicionMenores =0;
        //posicionMayores es vble que guarda la posicion del vector posicionMayores, inicalmente se guarda en la pos 0
        posicionMayores =0;
  
        for (i=0; i<array1.length;i++){ //recorremos desde inicio hasta final el vector de numeros
            //comprobamos si el elemento en el que estamos es <= que NUMERO
            if (array1[i]<= NUMERO ){ //<= NUMERO lo guardamos arrayMenores

                arrayMenores[posicionMenores] = array1[i];
                posicionMenores++;

            }else{ //sino va a arrayMayores
                arrayMayores[posicionMayores] = array1[i];
                posicionMayores++;

            }

         
        }

        System.out.println(Arrays.toString(arrayMenores));
        System.out.println(Arrays.toString(arrayMayores));


    }
}  