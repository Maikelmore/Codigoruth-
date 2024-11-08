/* Ejercicio6
 * “El rincón de la abuela” es una empresa dedicada a ofrecer banquetes; sus tarifas son las 
siguientes: el precio del menú por persona es de 95,00€, pero si el número de personas es mayor a 
200 pero menor o igual a 300, el precio es de 85.00€. Para más de 300 personas el coste por 
persona es de 75.00€. Se requiere un algoritmo que ayude a determinar el presupuesto que se 
debe presentar a los clientes que deseen realizar un evento.   
 * 
 */
package selectivos;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        final double PRECIO_MENU_MAX = 95.00;
        final double PRECIO_MENU_MEDIUM = 85.00;
        final double PRECIO_MENU_MIN = 75.00;

        final int INTERVALO_MIN = 200;
        final int INTERVALO_MAX= 300;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba nº personas que asisten al banquete: ");
        int numPersonas = sc.nextInt();
        double precioPersona;

        if (numPersonas> INTERVALO_MAX){
            precioPersona = PRECIO_MENU_MIN;
        }else if (numPersonas > INTERVALO_MIN){
            precioPersona = PRECIO_MENU_MEDIUM;
        }else{
            precioPersona=PRECIO_MENU_MAX;
        }
        System.out.println("El presupuesto total del banquete es " + numPersonas * precioPersona + " euros. El precio por persona aplicado es " + precioPersona);
        sc.close();


    }
    
}
