/*
 * Algoritmo que sume cantidades solicitadas al usuario hasta que este introduzca 
cero o un número negativo (los cuales no se tendrán en cuenta para la suma 
acumulativa). Al final mostrar la suma total de los números introducidos y 
cuántos fueron
*/
package repetitivos;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma =0;
        int contador =0;
        int numero;
        do{
            System.out.println("Escriba número (cero o negativo para terminar): ");
            numero = sc.nextInt();
            if (numero > 0){ //si el num es positivo lo sumo y lo cuento
                suma = suma + numero;
                contador++;
            }
        }while (numero>0); //mientras numero sea positivo pedimos numeros, vuelve a entrar bucle

        System.out.println("La suma total de los números introducidos es: " + suma);
        System.out.println("Cantidad de números introducidos: " + contador);
        sc.close();
    }
    
}
