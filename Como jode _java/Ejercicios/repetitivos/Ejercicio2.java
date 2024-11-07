package repetitivos;
import java.util.Scanner;
class Ejercicio2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, contador;

        System.out.print("Escriba un numero para mostrar su tabla: ");

        numero = scanner.nextInt();
        System.out.println ("******* LA TABLA DEL " + numero + " es: ************");
        for (contador=0;contador <=10;contador=contador+1){
            //System.out.println(numero*contador);
            System.out.println(numero + " * " + contador + " = " + (numero*contador));
        }
        scanner.close();


    }
}