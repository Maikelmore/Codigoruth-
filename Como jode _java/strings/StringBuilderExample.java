/* 
 * Ejemplo de uso de la Clase StringBuilder
 * https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/StringBuilder.html
 * 
 * La clase StringBuilder en Java es una herramienta útil para construir y modificar 
 * cadenas de texto de manera eficiente. A diferencia de la clase String, que es inmutable.
 *  StringBuilder permite la modificación directa de su contenido, lo cual lo hace ideal para 
 *  situaciones donde se realizan múltiples operaciones de concatenación o manipulación de texto.
 */
package strings;
public class StringBuilderExample {
    public static void main(String[] args) {
        // Crear un objeto StringBuilder con un valor inicial
        StringBuilder mensaje = new StringBuilder("Hola");
        System.out.println("Texto inicial: " + mensaje);
        System.out.println("Código de identidad: " + System.identityHashCode(mensaje));

        // 1. Método append() - Agregar texto al final sin crear un nuevo objeto
        mensaje.append(" Mundo");
        System.out.println("\n\nDespués de append: " + mensaje);
        System.out.println("Código de identidad: " + System.identityHashCode(mensaje)); //mostrará el mismo código de identidad
        // Ventaja: StringBuilder permite agregar texto sin crear un nuevo objeto, a diferencia de String.

        // 2. Método insert() - Insertar texto en una posición específica
        mensaje.insert(5, " querido");
        System.out.println("\n\nDespués de insert: " + mensaje);
        System.out.println("Código de identidad: " + System.identityHashCode(mensaje));
        // Ventaja: Este método permite insertar texto en cualquier posición sin crear un nuevo objeto.

        // 3. Método replace() - Reemplazar una parte del texto por otro
        mensaje.replace(5, 13, "amigo");
        System.out.println("\n\nDespués de replace: " + mensaje);
        System.out.println("Código de identidad: " + System.identityHashCode(mensaje));
        // Ventaja: Con StringBuilder podemos reemplazar directamente una parte del texto, mientras que en String tendríamos que crear un nuevo objeto.

        // 4. Método delete() - Eliminar una parte de la cadena
        mensaje.delete(5, 10);
        System.out.println("\n\nDespués de delete: " + mensaje);
        System.out.println("Código de identidad: " + System.identityHashCode(mensaje));
        // Ventaja: StringBuilder permite eliminar texto sin crear un nuevo objeto en memoria.

        // 5. Método reverse() - Invertir el contenido del StringBuilder
        mensaje.reverse();
        System.out.println("\n\nDespués de reverse: " + mensaje);
        System.out.println("Código de identidad: " + System.identityHashCode(mensaje));
        // Ventaja: StringBuilder tiene un método directo para invertir el texto, algo que String no ofrece.

        // 6. Restablecer el texto al estado original y convertirlo a mayúsculas como ejemplo adicional
        mensaje.reverse().replace(0, mensaje.length(), "Hola Mundo");
        System.out.println("\n\nTexto restablecido: " + mensaje);
        System.out.println("Código de identidad: " + System.identityHashCode(mensaje));

        // 7. Convertir el StringBuilder en un String usando toString()
        String resultado = mensaje.toString();
        System.out.println("\n\nResultado final como String: " + resultado);
        System.out.println("Código de identidad: " + System.identityHashCode(mensaje));
        // Ventaja: StringBuilder puede convertirse en un String estándar cuando se necesita.
    
    }
}
