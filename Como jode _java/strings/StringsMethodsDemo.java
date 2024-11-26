/*
 * Ejemplo de uso de los métodos más comunes de la clase String
 * Para conocer todos los métodos disponibles consultar la ayuda
 * https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html
 * 
 * Recordamos que una clase es una plantilla que define unas características y comportamientos (métodos) comunes.
 * En este caso la clase String incorpora un conjunto de métodos para trabajar con cadenas que 
 * van a facilitar al programador muchas tareas. Ejemplos: convertir una cadena a mayúsculas, minusculas, obtener
 * de una cadena una subcadena, saber si contiene alguna secuencia de caracteres, etc.
 * 
 * Sintaxis: nombre_objeto.nombre_metodo (parametros_entrada)
 * 
 * En este fichero veremos algunos ejemplos
 * 
 */
package strings;

import java.net.Socket;

public class StringsMethodsDemo {
    public static void main(String[] args) {
        //Declaración e inciialización de un objeto String
        String frase = "Hola, bienvenidos a la programación en Java. Java es poderoso.  ";

        //----------------- EJEMPLOS DE USO DE LOS MÉTODOS MÁS COMUNES -----------------------

        //1. Obtener la longitud de una cadena
        int longitud = frase.length();
        System.out.println("El objeto frase tiene " + longitud + " caracteres");

        //2. Convertir a mayúsculas una cadena
        String mayusculas = frase.toUpperCase();
        System.out.println("En mayúsculas: " + mayusculas);

        //3. Convertir a minúsculas una cadena
        String minusculas = frase.toLowerCase();
        System.out.println("En minúsculas: " + minusculas);

        //4. Eliminar espacios al inicio y final de la cadena
        String sinEspacios = frase.trim();
        System.out.println("Sin espacios al principio / final: " + sinEspacios);

        //5. Obtener el carácter de una posición concreta
        char caracterEnPosicion = frase.charAt(7); //empienza en posicion 0
        System.out.println("Caracter en posicion 7 es: " + caracterEnPosicion);

        //6. Obtener una subcadena de una cadena
        String subcadena = frase.substring(6, 17);
        System.out.println("Subcadena formada del caracter 6 a 17:  " + subcadena);

        String subcadena2 = frase.substring(6); //llega al final
        System.out.println("Subcadena formada del caracter 6 hasta el final:  " + subcadena2);

        //7. Reemplazar por un nuevo valor
        String reemplazo = frase.replace ("Java", "Python");
        System.out.println("La nueva frase después de reemplazar es: " + reemplazo);

        //8. Si contiene una palabra
        boolean contiene = frase.contains("bienvenido");
        System.out.println("Contiene la palabra bienvenido?: " + contiene);

        //9. Comprobar si comienza por alguna palabra
        boolean comienzaCon = frase.startsWith("Hola");
        System.out.println("Comienza por Hola?: " + comienzaCon);

        //10. Comprobar si finaliza por alguna palabra
        boolean terminaEn = frase.endsWith("."); //comprueba si la frase termina en punto
        System.out.println("Termina con punto?: " + terminaEn);

        boolean terminaEn2 = frase.trim().endsWith(".");//primero eliimina espacios y esa frase es la que comprueba si termina en .
        System.out.println("Termina con punto?: " + terminaEn2);
      //  System.out.println("Termina con punto?: " + frase.trim().endsWith("."));

        //Comparar dos cadenas ignorgando mayus/minus
        //Comparamos si frase y otraFrase tienen el mismo contenido
        String otraFrase = "  HOLA, BIENVENIDOS A LA PROGRAMACIÓN EN JAVA. JAVA ES PODEROSO.    ";
        // frase = "Hola, bienvenidos a la programación en Java. Java es poderoso.  ";
        boolean igualesIgnorandoCase = frase.trim().equalsIgnoreCase(otraFrase.trim());
        System.out.println("¿Son iguales ignorando may/min?: " + igualesIgnorandoCase);


        //¡¡ojo para comprobar si dos cadenas tienen el mismo valor!!!
        // usamos método equals NO USAMOS ==
        String mensajeBienvenida ="Hola";
        String mensajeEntrada ="Hola";
        //si queremos saber si mensajeBienvenida tiene lo mismo que mensajeEntrada
        System.out.println("Tienen lo mismo mensajeBienvenida y mensajeEntrada?: " + mensajeBienvenida.equals(mensajeEntrada));


        //Encontrar la primera aparición de una palabra en una frase
        int primeraPosicion = frase.indexOf("Java");
        System.out.println("La primera posición en la que aparece Java es: " + primeraPosicion);

        //Encontrar la última aparició de una palabra
        int ultimaPosicion = frase.lastIndexOf("Java");
        System.out.println("La primera posición en la que aparece Java es: " + ultimaPosicion);

        //Dividir. En siguiente ejemplo divide la cadena por los espacios en blanco creando un array en la que
        //en cada posición guarda una palabra
        System.out.println ("Vamos a dividir la frase en palabras: ");
        String[] palabrasFrase = frase.split(" "); //creamos un array de Strings llamado palabrasFrase
        //recorremos con un for el array creado para mostrar el contenido. 
        for (String palabra: palabrasFrase){
            System.out.println(palabra);
        }



        
    }
    
}
