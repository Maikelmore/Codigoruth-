import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Excepciones: Ejemplo 02
 * Programa que pide un número al usuario. Para ello utiliza la clase Scanner.
 * En el caso de que el usuario teclee un valor que no sea un número, se lanzará la excepción InputMismatchException
 * Esta excepción se capturará dentro del bloque try{ }catch
 * En el bloque catch, si ocurre una excepción debido a una entrada no válida
 *  (como un texto en lugar de un número), muestra el mensaje: "Error: Por favor, introduce un número válido."
 * Finalmente, el bloque finally se ejecuta siempre, cerrando el objeto scanner para liberar recursos.
 * 
  Explicación del bloque try{}catch:
        try{
            // código sensible que puede generar excepciones
            // en este ejemplo las TipoExcepcion1 y TipoExcepcion2
            // se pondrán tantos bloques catch como tipo excepciones queramos tratar


        }catch (TipoExcepcion1 nombre_objeto){
            // los pasos que queremos hacer cuando se produce
            // la excepción TipoExcepcion1

        }catch(TipoExecpcion2 nombre_objeto){
            // los pasos que queremos hacer cuando se produce
            // la excepción TipoExcepcion2

        }finally{
            // código que siempre queremos ejecutar al finalizar
            
        }

 */
public class ExceptionExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            System.out.println("Has introducido: " + numero);
        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor, introduce un número válido.");
        } finally {
            System.out.println("Fin del programa.");
            scanner.close();
        }
    }
}
