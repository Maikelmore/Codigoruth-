/*
 * La clase Console pertenece al paquete java.io y 
 * está diseñada para leer y escribir en la consola del sistema. 
 * A diferencia de Scanner, Console permite leer datos como texto, 
 * enteros y contraseñas, y gestionar estas últimas de forma más segura.
 * 
 * NOTA: No siempre es compatible con entornos como IDEs, por lo que es 
 * recomendable ejecutar los programas que usan Console directamente 
 * desde una terminal del sistema.
 * 
 * En este ejemplo veremos algunas de las funcionalidades más utilizadas
 * 
 */
package entrada_salida;
import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
          // Obtener el objeto Console
        Console console = System.console();

        // Verificar si la consola está disponible
        if (console == null) {
            System.out.println("No hay consola disponible.");
            return;
        }

        //readLine (mensaje) -->   //Lee una línea de texto de la consola.x
        String nombre = console.readLine("Introduce tu nombre: ");
        System.out.println("Hola, " + nombre);

        //printf(): Imprime texto formateado en la consola, similar a System.out.printf().
        console.printf("Hola, %s%n", nombre);

        //flush(): Este método limpia el buffer de la consola,
        // asegurándose de que cualquier contenido que esté en cola 
        // para ser impreso se muestre inmediatamente.
        console.flush();
    }
    
}
