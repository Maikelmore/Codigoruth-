/*
 * --------------------------------- Mutabilidad e Inmutabilidad en Java------------------------------------
* -Mutable significa que el contenido de un objeto se puede cambiar sin crear un nuevo objeto en memoria. 
* La clase StringBuilder es mutable.

* -Inmutable significa que una vez que se ha creado un objeto, su contenido no se puede cambiar. La clase String es inmutable
* Si intentas modificar un String, Java crea un nuevo objeto en memoria en lugar de cambiar el original.
 * 
 */
package strings;
public class MutableInmutable {
    /*
     * Para mostrar que String es inmutable, puedes crear un ejemplo que asigne nuevas cadenas
     *  a una variable String y luego observar la cantidad de objetos creados.
     *  Usa el operador == para verificar si la referencia de los objetos sigue siendo la misma o no.
     *  Recuerda: el operador == comprueba las referencias el método equals el contenido o valor que almacenan
     */
    public static void main(String[] args) {
        String texto = "Hola";
        System.out.println("Texto original: " + texto + " Código de identidad: " + System.identityHashCode(texto));

        // Modificación 1 - añadir " Mundo" , creará un nuevo objeto en memoria (aunque nosotros no lo veamos)
        texto = texto + " Mundo";
        System.out.println("Después de concatenar ' Mundo': " + texto + " Código de identidad: " + System.identityHashCode(texto)); //el codigo que muestra es distinto al anterior

        // Modificación 2 - crea otro nuevo objeto en memoria
        texto = texto.toUpperCase();
        System.out.println("Después de convertir a mayúsculas: " + texto + " Código de identidad: " + System.identityHashCode(texto)); //el codigo que muestra es distinto al anterior
    }
}
