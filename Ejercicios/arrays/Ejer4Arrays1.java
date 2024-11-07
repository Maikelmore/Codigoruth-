package arrays;
class Ejer4Arrays2 {
    public static void main(String[] args) {

        int[] array1 = {2,3,4,7,8,10,11};
        int i;

   
        for (i=0; i<array1.length;i++){ //recorremos desde inicio hasta final el vector de numeros
          System.out.print(array1[i] + " ");
          if (array1[i]%2==0){ //si es par
            System.out.println("par");
          }else{ //impar
            System.out.println("impar");
          }
        }


    }
} 