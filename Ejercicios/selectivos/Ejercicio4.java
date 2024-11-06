/*
 * Ejercicio 4
 * Almacenes “Perico de los palotes” tiene una promoción: a todos los trajes que tienen un precio 
superior a 1500€ se les aplicará un descuento de 15 %, a todos los demás se les aplicará sólo 8 %. 
Realice un algoritmo para determinar el precio final que debe pagar una persona por comprar un 
traje y de cuánto es el descuento que obtendrá  
 */
package selectivos;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba el precio del traje: ");
        double precio = sc.nextDouble();
        double descuento = (precio>1500) ? 0.15:0.08;
        double precioFinal = precio - (precio * descuento);
        System.out.println("El precio final de su traje es: " + precioFinal + " euros");
        System.out.println("Se le descontado: " + (precio*descuento) + " euros");
        sc.close();
    }
}
