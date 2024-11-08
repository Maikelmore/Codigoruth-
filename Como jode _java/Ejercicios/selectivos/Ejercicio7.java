/*
 * Ejercicio 7
 * La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
clasifica en tipos A y B, y además en tamaños 1 y 2. Cuando se realiza la venta del producto, ésta es 
de un solo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
entrega en un embarque, considerando lo siguiente: si es de tipo A, se le cargan 0,20 al precio 
inicial cuando es de tamaño 1; y 0,30 si es de tamaño 2. Si es de tipo B, se rebajan 0,30 cuando es 
de tamaño 1, y 0,50 cuando es de tamaño 2. Realice un algoritmo para determinar la ganancia 
obtenida y represéntelo mediante diagrama de flujo  
 */
package selectivos;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precioInicial, precioFinal;
        char tipoUva;
        byte tamanioUva;
        double ajuste;

        System.out.print("Escriba el precio inicial por kilo de uva: ");
        precioInicial = sc.nextDouble();


        System.out.print("Escriba el tipo de uva (A o B): ");
        tipoUva = sc.next().charAt(0); //solo leemos el primer carácter escrito

        System.out.print ("Tamaño de la uva (1 ó 2): ");
        tamanioUva = sc.nextByte();

        if (tipoUva == 'A'){
            ajuste = (tamanioUva == 1) ? 0.20 : 0.30;
        }else{
            ajuste = (tamanioUva == 1) ? -0.30 : -0.50;
        }

        precioFinal = precioInicial + ajuste;

        System.out.println(" El precio final por kilo de uva es " + precioFinal + " euros" );

        sc.close();
    }
    
}
