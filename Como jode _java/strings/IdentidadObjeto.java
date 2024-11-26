/*
 * En Java, no puedes acceder directamente a la dirección de memoria
 *  de un objeto (como podrías en algunos otros lenguajes), pero puedes 
 * usar el método System.identityHashCode(objeto) para obtener un código hash 
 * que representa la identidad del objeto en memoria. 
 * Aunque no es la dirección de memoria real, este código es único para cada instancia
 *  mientras el programa se esté ejecutando y es útil para mostrar la referencia de identidad de cada objeto.
 */
package cadenas;

public class IdentidadObjeto {
    public static void main(String[] args) {
        String mensaje = "Hola mundo!";
        System.out.println("Mensaje: " + mensaje + " - Código de identidad: " + System.identityHashCode(mensaje));

        String otroMensaje = "Java mola!";
        System.out.println("Mensaje: " + otroMensaje + " - Código de identidad: " + System.identityHashCode(otroMensaje));

        otroMensaje = otroMensaje + " aunque Python también";
        System.out.println("Mensaje: " + otroMensaje + " - Código de identidad: " + System.identityHashCode(otroMensaje));

        //¿por qué muestra un código distinto?? -- concepto mutable /inmutable

    }

}
