/*
 * Ejercicio 5
 * Se requiere determinar cuál de tres cantidades, pedidas al usuario, es la mayor de todas 
 */
package selectivos;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);

        System.out.println("Escribe el primer numero: ");
        int numero1=sc.nextInt();
        System.out.println("Escribe el segundo numero: ");
        int numero2=sc.nextInt();
        System.out.println("Escribe el tercer numero: ");
        int numero3=sc.nextInt();

        int mayor; 

        if (numero1>=numero2 && numero1 >=numero3){ // && AND LOGICO
            mayor = numero1;

        }else if (numero2>=numero1 && numero2>=numero3){
            mayor = numero2;
        }else{
            mayor = numero3;
        }

        System.out.println("El mayor de los numeros " + numero1 + ", "+ numero2 + " y " + numero3 + " es: " + mayor);
        sc.close();

    }
    
}
