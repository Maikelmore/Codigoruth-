package entrada_salida;
import java.io.Console;

/**
 * console.readPassword(): Utiliza este método para leer la contraseña sin que se muestre en pantalla mientras el usuario escribe.
 */

public class LeerContrasena {
    public static void main(String[] args) {
        Console console = System.console();
        // Leer la contraseña sin mostrarla en pantalla (no se muestran los caracteres)
        String password = new String(console.readPassword("Introduce tu contraseña: "));
        
        // Mostrar un mensaje confirmando que la contraseña ha sido capturada
        System.out.println("Contraseña capturada con éxito. " + password );
        


        
    }
}
