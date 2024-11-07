package repetitivos;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombre;
        int numVeces;

        System.out.print("Escriba su nombre, por favor: ");
        nombre = scanner.nextLine();


        System.out.print("Número de veces: ");
        numVeces = scanner.nextInt();

        for (int i=1; i<=numVeces;i++){
            System.out.println("Hola " + nombre);
        }

        




        scanner.close();
    }
}
