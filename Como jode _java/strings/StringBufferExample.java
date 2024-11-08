package strings;
/*
 * Clase StringBuffer
 * https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/StringBuffer.html 
 * 
 * StringBuffer es similar a StringBuilder en cuanto a funcionalidad, pero tiene una diferencia 
 * clave: es sincronizado y, por lo tanto, seguro para el acceso concurrente. 
 * Esto significa que StringBuffer está diseñado para situaciones donde múltiples hilos 
 * podrían estar accediendo y modificando la misma cadena de texto al mismo tiempo.
 * 
 * NOTAS:
 *  Un hilo es como un “subproceso” o camino separado dentro de un programa que ejecuta una serie de instrucciones.
 * 
 *  En Java, puedes crear hilos utilizando la clase Thread o la interfaz Runnable.
 * 
 *  La concurrencia es la capacidad de ejecutar varias tareas al mismo tiempo en un programa.
 *  No significa necesariamente que las tareas se ejecuten exactamente al mismo tiempo, 
 *  sino que pueden iniciarse, detenerse y reanudarse según sea necesario, haciendo que se sientan simultáneas.
 * 
 *  En 2º curso aprenderéis programación concurrente
 * 
 * En este fichero se ven ejemplos de uso de declarar objetos de esta clase y métodos más comunes
 */
public class StringBufferExample {
    public static void main(String[] args) {
        // Crear un objeto StringBuffer con un valor inicial
        StringBuffer mensaje = new StringBuffer("Hola");
        System.out.println("Texto inicial: " + mensaje);
        System.out.println("Código de identidad: " + System.identityHashCode(mensaje));

        // 1. Método append() - Agregar texto al final sin crear un nuevo objeto
        mensaje.append(" Mundo");
        System.out.println("\n\nDespués de append: " + mensaje);
        System.out.println("Código de identidad: " + System.identityHashCode(mensaje));
        // Resultado esperado: "Hola Mundo"

        // 2. Método insert() - Insertar texto en una posición específica
        mensaje.insert(5, " querido");
        System.out.println("\n\nDespués de insert: " + mensaje);
        System.out.println("Código de identidad: " + System.identityHashCode(mensaje));
        // Resultado esperado: "Hola querido Mundo"

        // 3. Método replace() - Reemplazar una parte del texto con otra
        mensaje.replace(5, 13, "amigo");
        System.out.println("\n\nDespués de replace: " + mensaje);
        System.out.println("Código de identidad: " + System.identityHashCode(mensaje));
        // Resultado esperado: "Hola amigo Mundo"

        // 4. Método delete() - Eliminar una parte de la cadena
        mensaje.delete(5, 11);
        System.out.println("\n\nDespués de delete: " + mensaje);
        System.out.println("Código de identidad: " + System.identityHashCode(mensaje));
        // Resultado esperado: "Hola Mundo"

        // 5. Método reverse() - Invertir el contenido del StringBuffer
        mensaje.reverse();
        System.out.println("\n\nDespués de reverse: " + mensaje);
        System.out.println("Código de identidad: " + System.identityHashCode(mensaje));
        // Resultado esperado: "odnuM aloH"

        // 6. Convertir el StringBuffer en un String con toString()
        String resultado = mensaje.toString();
        System.out.println("\n\nResultado final como String: " + resultado);
        System.out.println("Código de identidad: " + System.identityHashCode(mensaje));
        // Resultado esperado: "odnuM aloH"
        
    }
}
